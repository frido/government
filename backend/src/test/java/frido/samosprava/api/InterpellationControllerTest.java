package frido.samosprava.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class InterpellationControllerTest extends ControllerTest {

	@Test
	void testInterpellation() {
		InterpellationController controller = new InterpellationController(collections);
		assertEquals(1, controller.interpellation(1).getData().get("id").asInt());
	}

	@Test
	void testInterpellations() {
		InterpellationController controller = new InterpellationController(collections);
		List<JsonNode> resultList = controller.interpellations(1).getData();
		assertNotEquals(0, resultList.size());
		for (JsonNode jsonNode : resultList) {
			assertEquals(1, jsonNode.get("council").asInt());
		}
	}

}
