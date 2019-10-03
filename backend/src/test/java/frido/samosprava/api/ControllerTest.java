package frido.samosprava.api;

import org.junit.jupiter.api.BeforeAll;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

public class ControllerTest {

  static InMemoryCollections2 collections;

  @BeforeAll
  static void init() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    collections = new InMemoryCollections2(store);
  }
}
