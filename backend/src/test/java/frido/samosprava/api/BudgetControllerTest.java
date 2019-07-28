package frido.samosprava.api;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BudgetControllerTest extends ControllerTest {

	@Test
	void testBudget() {
		BudgetController controller = new BudgetController(collections);
		assertEquals(1, controller.budget(1).getData().get("council").asInt());
	}

}
