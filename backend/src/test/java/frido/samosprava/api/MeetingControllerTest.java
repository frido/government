package frido.samosprava.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class MeetingControllerTest extends ControllerTest {
	
	@Test
	void testMeeting() {
		MeetingController controller = new MeetingController(collections);
		assertEquals(1, controller.meeting(1).getData().get("id").asInt());
	}

	@Test
	void testMeetings() {
		MeetingController controller = new MeetingController(collections);
		List<JsonNode> resultList = controller.meetings(2).getData();
		assertNotEquals(0, resultList.size());
		for (JsonNode jsonNode : resultList) {
			assertEquals(2, jsonNode.get("council").asInt());
		}
	}

}
