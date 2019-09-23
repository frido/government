package frido.samosprava.core.collection;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

class InMemoryCollectionsTest2 {

  @Test
  void resolutions() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    InMemoryCollections2 collections = new InMemoryCollections2(store);
    assertEquals(8, collections.getIndexItems().size());
    assertTrue(collections.resolutions().getAll().size() > 0);
  }
  @Test
  void persons() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    InMemoryCollections2 collections = new InMemoryCollections2(store);
    assertEquals(8, collections.getIndexItems().size());
    assertTrue(collections.persons().getAll().size() > 0);
  }
  @Test
  void meetings() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    InMemoryCollections2 collections = new InMemoryCollections2(store);
    assertEquals(8, collections.getIndexItems().size());
    assertTrue(collections.meetings().getAll().size() > 0);
  }
}
