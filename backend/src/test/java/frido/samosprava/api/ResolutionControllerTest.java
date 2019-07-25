package frido.samosprava.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class ResolutionControllerTest {

	@Test
	public void testResolution() throws Exception {
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		InMemoryCollections collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
		ResolutionController controller = new ResolutionController(collections);
		assertEquals(1001, controller.resolution(1001).getData().get().get("id").asInt());
	}

}
