package frido.samosprava.core.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class InMemoryCollectionsTest {

	@Test
	public void testGetIndexItems() throws Exception {
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		InMemoryCollections collections = new InMemoryCollections(store, "https://frido.github.io/government/db/");
		assertEquals(9, collections.getIndexItems().size());
		System.out.println(collections.collections());
		assertEquals(5, collections.collections().size());
	}

}
