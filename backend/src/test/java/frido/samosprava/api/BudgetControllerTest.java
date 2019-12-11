package frido.samosprava.api;

import org.junit.Test;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Budget;
import frido.samosprava.store.ClassPathStore;
import frido.samosprava.view.BudgetView;
import frido.samosprava.view.ResponseListView;

class BudgetControllerTest  {

    @org.junit.jupiter.api.Test
    void testBudget() {
        ClassPathStore store = new ClassPathStore();
        store.load("budget-ba.json");
        InMemoryCollections collections = new InMemoryCollections(store);
        BudgetController controller = new BudgetController(collections);
        ResponseListView<BudgetView> response = controller.budget(1);
        BudgetView budget = response.getData().get(0);
        System.out.println(budget);
    }

}
