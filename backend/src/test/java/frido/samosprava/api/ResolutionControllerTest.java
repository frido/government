package frido.samosprava.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class ResolutionControllerTest {
	
	private static InMemoryCollections collections;

	@BeforeAll
	public static void init(){
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
	}

	@Test
	public void testResolution() throws Exception {
		ResolutionController controller = new ResolutionController(collections);
		assertEquals(1001, controller.resolution(1001).getData().get().get("id").asInt());
	}

	@Test
	public void testResolutions() throws Exception {
		ResolutionController controller = new ResolutionController(collections);
		controller.resolutions(2).getData().forEach(x -> assertEquals(2, x.get("council").asInt()));
	}

}
