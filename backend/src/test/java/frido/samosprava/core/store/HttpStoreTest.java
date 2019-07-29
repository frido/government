package frido.samosprava.core.store;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;

class HttpStoreTest {

  @Test
  void testLoad() {
    WebClient client = new JdkHttpClient();
    DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
    String response = store.load("detva/dt-detva-osoby.json");
    assertFalse(response.isEmpty());
  }

}
