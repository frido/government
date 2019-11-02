package frido.samosprava.core.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

class InMemoryCollectionsTest {

  @Test
  void testGetIndexItems() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    InMemoryCollections collections = new InMemoryCollections(store);
    assertEquals(9, collections.getIndexItems().size());
    assertEquals(5, collections.collections().size());
  }

}
