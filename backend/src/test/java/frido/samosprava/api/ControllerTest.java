package frido.samosprava.api;

import org.junit.jupiter.api.BeforeAll;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.client.WebClient;
import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.store.DataStore;
import frido.samosprava.store.HttpStore;

public class ControllerTest {

  static InMemoryCollections collections;

  @BeforeAll
  static void init() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    collections = new InMemoryCollections(store);
  }
}
