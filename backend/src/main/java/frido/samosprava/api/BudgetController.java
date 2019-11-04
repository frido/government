package frido.samosprava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Money;
import frido.samosprava.entity.Resolution;
import frido.samosprava.entity.UseKv;
import frido.samosprava.entity.Vydavky;
import frido.samosprava.view.BudgetView;
import frido.samosprava.view.ProjectView;
import frido.samosprava.view.ResponseListView;
import frido.samosprava.view.ResponseObjectView;

@RestController
class BudgetController {

  private final InMemoryCollections collections;
  private static final Integer YEAR = 2019;

  public BudgetController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/budget/{councilId}")
  public ResponseListView<BudgetView> budget(@PathVariable int councilId) {
    final List<BudgetView> views = new ArrayList<>();
    collections.budgets().findByCouncilId(councilId).flatMap(x -> x.getVydavky().stream())
        .forEach(v -> collectBudgetView(views, v)); // TODO: implement recursive streams
    return views.stream().filter(v -> YEAR.equals(v.getYear()))
        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(new ResponseListView<>());
  }

  @GetMapping("/api/council/{councilId}")
  public Optional<ResponseObjectView> council(@PathVariable int councilId) { // TODO: nepaci sa mi vracat optional, musim to lepsie vymysliet
    return collections.councils().findById(councilId).map(ResponseObjectView::new);
  }

  @GetMapping("/api/projects/{councilId}")
  public ResponseListView<ProjectView> projects(@PathVariable int councilId) {
    return collections.resolutions().findByTypeAndCouncilId("projekt", councilId)
      .flatMap(r -> collectProjectView(r))
      .sorted(HasValue.comparator)
      .collect(new ResponseListView<>());
  }

  @GetMapping("/api/grants/{councilId}")
  public ResponseListView<ProjectView> grants(@PathVariable int councilId) {
    return collections.resolutions().findByTypeAndCouncilId("grants", councilId)
      .flatMap(r -> collectProjectView(r))
      .sorted(HasValue.comparator)
      .collect(new ResponseListView<>());
  }

  // TODO: je lepsie miesto kam ulozit taketo pomocne metodky?
  private Stream<ProjectView> collectProjectView(Resolution resolution) {
    return resolution.getProjects().stream().map(p -> new ProjectView(collections, resolution, p));
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

  /**
   * 
   * #meetingov #uzneseni #poslancov #resolutionByType #resolutionByPredkladatel
   * #budgetPrijmy #sumBudget #sumProjekty #sumGranty
   */

   // TODO: uncomment
  // @GetMapping("/api/stats/{councilId}/{year}")
  // public StatView stats(@PathVariable int councilId, @PathVariable int year,
  //     @RequestParam(defaultValue = "0") int type) {
  //   List<Meeting> meetings = collections.meetings().findByYear(councilId, year).collect(Collectors.toList());
  //   int meetingsNo = meetings.size();

  //   List<Resolution> resolutions = collections.resolutions()
  //       .findByMeetingIds(meetings.stream().map(m -> m.getId()).collect(Collectors.toList()));
  //   int resolutionsNo = resolutions.size();

  //   // int personNo = collections.persons().findInCouncilId(councilId).size();

  //   Map<String, Integer> resolutionsByType = new HashMap<>();
  //   Map<Integer, Integer> resolutionsByCreator = new HashMap<>();
  //   resolutions.forEach(r -> {
  //     Integer countType = Optional.ofNullable(resolutionsByType.get(r.getType())).orElse(0);
  //     resolutionsByType.put(r.getType(), countType + 1);
  //     if (r.getCreatorIds() != null) {
  //       r.getCreatorIds().forEach(c -> {
  //         Integer countCreator = Optional.ofNullable(resolutionsByCreator.get(c)).orElse(0);
  //         resolutionsByCreator.put(c, countCreator + 1);
  //       });
  //     }
  //   });
  //   List<StatTypeView> statType = resolutionsByType.entrySet().stream()
  //       .map(e -> new StatTypeView(e.getKey(), e.getValue())).sorted((s2, s1) -> s1.getValue().compareTo(s2.getValue()))
  //       .collect(Collectors.toList());

  //   List<StatPersonView> statCreator = resolutionsByCreator.entrySet().stream().map(e -> {
  //     StatPersonView stat = new StatPersonView(collections.persons().findById(e.getKey()).get(), e.getValue());
  //     stat.calcType(councilId, year);
  //     return stat;
  //   }).filter(s -> s.getType() != null).filter(s -> type == 0 || s.getType() == type)
  //       .sorted((s2, s1) -> s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList());

  //   List<BudgetView> budgetCalculation = (List<BudgetView>) budget(councilId).getData();
  //   double budgetsSum = budgetCalculation.stream().mapToDouble(r -> r.getValue().doubleValue()).sum();
  //   double projectsSum = projects(councilId).getData().stream().mapToDouble(p -> p.getValue().doubleValue()).sum();
  //   double grantsSum = grants(councilId).getData().stream().mapToDouble(g -> g.getValue().doubleValue()).sum();

  //   StatView response = new StatView();
  //   response.setMeetingsNo(meetingsNo);
  //   response.setResolutionsNo(resolutionsNo);
  //   // response.setPersonNo(personNo);
  //   response.setCreatorsMap(statCreator);
  //   response.setTypesMap(statType);
  //   response.setBudgetsSum(new BigDecimal(budgetsSum));
  //   response.setProjectsSum(new BigDecimal(projectsSum));
  //   response.setGrantsSum(new BigDecimal(grantsSum));

  //   return response;
  // }

  

  // private List<ProjectView> collectProjects(List<Resolution> resolutions) {
  //   List<ProjectView> projects = new ArrayList<>();
  //   for (Resolution r : resolutions) {
  //     if (r.getProjects() != null) {
  //       for (Project p : r.getProjects()) {
  //         ProjectView pv = new ProjectView();
  //         Meeting meeting = collections.meetings().findById(r.getMeetingId()).get();
  //         pv.setYear(DateFormat.toYear(meeting.getDate()));
  //         pv.setTitle(p.getTitle());
  //         pv.setValue(p.getValue());
  //         pv.setResolutionId(r.getId());
  //         pv.setResolutionNumber(r.getNumber());
  //         pv.setResolutionTitle(r.getTitle());
  //         projects.add(pv);
  //       }
  //     }
  //   }
  //   return projects.stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
  // }

  

}
