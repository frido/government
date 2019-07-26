package frido.samosprava.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class BudgetControllerTest {
	
	private static InMemoryCollections collections;

	@BeforeAll
	public static void init(){
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
	}

	@Test
	public void testBudget() throws Exception {
		BudgetController controller = new BudgetController(collections);
		assertEquals(1, controller.budget(1).getData().get().get("council").asInt());
	}

}
