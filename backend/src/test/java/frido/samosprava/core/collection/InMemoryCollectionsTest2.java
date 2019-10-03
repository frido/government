package frido.samosprava.core.collection;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

class InMemoryCollectionsTest2 {

  private static InMemoryCollections2 collections;

  @BeforeAll
  static void init() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    collections = new InMemoryCollections2(store);
  }

  @Test
  void getIndexItems() {
    assertEquals(9, collections.getIndexItems().size());
  }

  @Test
  void resolutions() {
    assertTrue(collections.resolutions().getAll().size() > 0);
  }
  @Test
  void persons() {
    assertTrue(collections.persons().getAll().size() > 0);
  }
  @Test
  void meetings() {
    assertTrue(collections.meetings().getAll().size() > 0);
  }
  @Test
  void councils() {
    assertTrue(collections.councils().getAll().size() > 0);
  }
}
