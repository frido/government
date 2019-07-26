package frido.samosprava.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class MeetingControllerTest {
	
	private static InMemoryCollections collections;

	@BeforeAll
	public static void init(){
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
	}

	@Test
	public void testMeeting() throws Exception {
		MeetingController controller = new MeetingController(collections);
		assertEquals(1, controller.meeting(1).getData().get().get("id").asInt());
	}

	@Test
	public void testMeetings() throws Exception {
		MeetingController controller = new MeetingController(collections);
		List<JsonNode> resultList = controller.meetings(2).getData();
		assertNotEquals(0, resultList.size());
		for (JsonNode jsonNode : resultList) {
			assertEquals(2, jsonNode.get("council").asInt());
		}
	}

}
