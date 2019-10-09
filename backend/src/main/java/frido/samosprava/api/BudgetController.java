package frido.samosprava.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Budget;
import frido.samosprava.core.entity.Money;
import frido.samosprava.core.entity.Project;
import frido.samosprava.core.entity.Resolution;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.UseKv;
import frido.samosprava.core.entity.Vydavky;
import frido.samosprava.core.entity.view.BudgetView;
import frido.samosprava.core.entity.view.ProjectListView;
import frido.samosprava.core.entity.view.ProjectView;

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
    views = views.stream().filter(v -> YEAR.equals(v.getYear())).sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
    return new ResponseObject2(views);
  }

  @GetMapping("/api/projects/{councilId}")
  public ProjectListView projects(@PathVariable int councilId) {
    List<Resolution> resolutions = collections.resolutions().findByType("projekt");
    return new ProjectListView(collections, collectProjects(resolutions));
  }

  @GetMapping("/api/grants/{councilId}")
  public ProjectListView grants(@PathVariable int councilId) {
    List<Resolution> resolutions = collections.resolutions().findByType("grants");
    return new ProjectListView(collections, collectProjects(resolutions));
  }

  private List<ProjectView> collectProjects(List<Resolution> resolutions) {
    List<ProjectView> projects = new ArrayList<>();
    for (Resolution r : resolutions) {
      if (r.getProjects() != null) {
        for(Project p : r.getProjects() ) {
          ProjectView pv = new ProjectView();
          pv.setTitle(p.getTitle());
          pv.setValue(p.getValue());
          pv.setResolutionId(r.getId());
          projects.add(pv);
        }
      }
    }
    return projects;
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
      for (Vydavky sub : vydavky.getSub() ) {
        collectBudgetView(views, sub);
      }
    }
  }

}
