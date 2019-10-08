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
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.UseKv;
import frido.samosprava.core.entity.Vydavky;
import frido.samosprava.core.entity.view.BudgetView;

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
  }

}
