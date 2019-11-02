package frido.samosprava.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Budget;
import frido.samosprava.core.entity.Meeting;
import frido.samosprava.core.entity.Money;
import frido.samosprava.core.entity.Project;
import frido.samosprava.core.entity.Resolution;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.UseKv;
import frido.samosprava.core.entity.Vydavky;
import frido.samosprava.core.entity.view.BudgetView;
import frido.samosprava.core.entity.view.ProjectListView;
import frido.samosprava.core.entity.view.ProjectView;
import frido.samosprava.core.entity.view.StatPersonView;
import frido.samosprava.core.entity.view.StatTypeView;
import frido.samosprava.core.entity.view.StatView;

@RestController
class BudgetController {

  private final InMemoryCollections2 collections;
  private static final Integer YEAR = 2019;

  public BudgetController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

  @GetMapping("/api/budget/{councilId}")
  public ResponseObject2 budget(@PathVariable int councilId) {
    List<Budget> budgets = collections.budgets().findByCouncilId(councilId);
    Budget budget = budgets.get(0);
    List<BudgetView> views = new ArrayList<>();
    for (Vydavky vydavky : budget.getVydavky()) {
      collectBudgetView(views, vydavky);
    }
    views = views.stream().filter(v -> YEAR.equals(v.getYear()))
        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
    return new ResponseObject2(views);
  }

  @GetMapping("/api/council/{councilId}")
  public ResponseObject2 council(@PathVariable int councilId) {
    return new ResponseObject2(collections.councils().findById(councilId));
  }

  /**
   * 
   * #meetingov #uzneseni #poslancov #resolutionByType #resolutionByPredkladatel
   * #budgetPrijmy #sumBudget #sumProjekty #sumGranty
   */

  @GetMapping("/api/stats/{councilId}/{year}")
  public StatView stats(@PathVariable int councilId, @PathVariable int year, @RequestParam(defaultValue = "0") int type) {
    List<Meeting> meetings = collections.meetings().findByYear(councilId, year);
    int meetingsNo = meetings.size();

    List<Resolution> resolutions = collections.resolutions().findByMeetingIds(meetings.stream().map(m -> m.getId()).collect(Collectors.toList()));
    int resolutionsNo = resolutions.size();
    
    //int personNo = collections.persons().findInCouncilId(councilId).size();

    Map<String, Integer> resolutionsByType = new HashMap<>();
    Map<Integer, Integer> resolutionsByCreator = new HashMap<>();
    resolutions.forEach(r -> {
      Integer countType = Optional.ofNullable(resolutionsByType.get(r.getType())).orElse(0);
      resolutionsByType.put(r.getType(), countType + 1);
      if (r.getCreatorIds() != null) {
        r.getCreatorIds().forEach(c -> {
          Integer countCreator = Optional.ofNullable(resolutionsByCreator.get(c)).orElse(0);
          resolutionsByCreator.put(c, countCreator + 1);
        });
      }
    });
    List<StatTypeView> statType = resolutionsByType.entrySet().stream()
        .map(e -> new StatTypeView(e.getKey(), e.getValue()))
        .sorted((s2, s1) -> s1.getValue().compareTo(s2.getValue()))
        .collect(Collectors.toList());

    List<StatPersonView> statCreator = resolutionsByCreator.entrySet().stream()
        .map(e -> {
          StatPersonView stat = new StatPersonView(collections.persons().findById(e.getKey()).get(), e.getValue());
          stat.calcType(councilId, year);
          return stat;
        })
        .filter(s -> s.getType() != null)
        .filter(s -> type == 0 || s.getType() == type)
        .sorted((s2, s1) -> s1.getValue().compareTo(s2.getValue()))
        .collect(Collectors.toList());

    List<BudgetView> budgetCalculation = (List<BudgetView>) budget(councilId).getData();
    double budgetsSum = budgetCalculation.stream().mapToDouble(r -> r.getValue().doubleValue()).sum();
    double projectsSum = projects(councilId).getData().stream().mapToDouble(p -> p.getValue().doubleValue()).sum();
    double grantsSum = grants(councilId).getData().stream().mapToDouble(g -> g.getValue().doubleValue()).sum();

    StatView response = new StatView();
    response.setMeetingsNo(meetingsNo);
    response.setResolutionsNo(resolutionsNo);
    // response.setPersonNo(personNo);
    response.setCreatorsMap(statCreator);
    response.setTypesMap(statType);
    response.setBudgetsSum(new BigDecimal(budgetsSum));
    response.setProjectsSum(new BigDecimal(projectsSum));
    response.setGrantsSum(new BigDecimal(grantsSum));

    return response;
  }

  @GetMapping("/api/projects/{councilId}")
  public ProjectListView projects(@PathVariable int councilId) {
    List<Resolution> resolutions = collections.resolutions().findByTypeAndCouncilId("projekt", councilId);
    return new ProjectListView(collections, collectProjects(resolutions));
  }

  @GetMapping("/api/grants/{councilId}")
  public ProjectListView grants(@PathVariable int councilId) {
    List<Resolution> resolutions = collections.resolutions().findByTypeAndCouncilId("grants", councilId);
    return new ProjectListView(collections, collectProjects(resolutions));
  }

  private List<ProjectView> collectProjects(List<Resolution> resolutions) {
    List<ProjectView> projects = new ArrayList<>();
    for (Resolution r : resolutions) {
      if (r.getProjects() != null) {
        for (Project p : r.getProjects()) {
          ProjectView pv = new ProjectView();
          Meeting meeting = collections.meetings().findById(r.getMeetingId()).get();
          pv.setYear(DateFormat.toYear(meeting.getDate()));
          pv.setTitle(p.getTitle());
          pv.setValue(p.getValue());
          pv.setResolutionId(r.getId());
          pv.setResolutionNumber(r.getNumber());
          pv.setResolutionTitle(r.getTitle());
          projects.add(pv);
        }
      }
    }
    return projects.stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
  }

  private void collectBudgetView(List<BudgetView> views, Vydavky vydavky) {
    if (vydavky.getMoney() != null) {
      for (Money money : vydavky.getMoney()) {
        if (money.getUseKv() != null) {
          for (UseKv kv : money.getUseKv()) {
            BudgetView view = new BudgetView();
            view.setTitle(kv.getTitle());
            view.setValue(kv.getSuma());
            view.setYear(money.getYear());
            view.setNumber(vydavky.getProgram());
            view.setProgram(vydavky.getTitle());
            view.setComment(vydavky.getComment());
            views.add(view);
          }
        }
      }
    }

    if (vydavky.getSub() != null) {
      for (Vydavky sub : vydavky.getSub()) {
        collectBudgetView(views, sub);
      }
    }
  }

}
