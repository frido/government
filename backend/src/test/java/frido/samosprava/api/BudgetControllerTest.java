package frido.samosprava.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BudgetControllerTest extends ControllerTest {

  @Test
  void testBudget() {
    BudgetController controller = new BudgetController(collections);
    assertEquals(1, controller.budget(1).getData().get("council").asInt());
  }

}
