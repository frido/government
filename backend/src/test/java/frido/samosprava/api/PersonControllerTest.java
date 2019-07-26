package frido.samosprava.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class PersonControllerTest {
	
	private static InMemoryCollections collections;

	@BeforeAll
	public static void init(){
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
	}

	@Test
	public void testPerson() throws Exception {
		PersonController controller = new PersonController(collections);
		assertEquals(1, controller.person(1).getData().get().get("id").asInt());
	}

	@Test
	public void testPersons() throws Exception {
		PersonController controller = new PersonController(collections);
		List<JsonNode> resultList = controller.persons(2).getData();
		assertNotEquals(0, resultList.size());
		for (JsonNode jsonNode : resultList) {
			assertTrue(jsonNode.findValues("council").stream().map(x -> x.asInt()).anyMatch(x -> x == 2));
		}
	}

}
