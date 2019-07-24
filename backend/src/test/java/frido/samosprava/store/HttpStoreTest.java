package frido.samosprava.store;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.client.WebClient;

public class HttpStoreTest {

	@Test
	public void testLoad() throws Exception {
		WebClient client = new JdkHttpClient();
		DataStore store = new HttpStore(client);
		String response = store.load("https://frido.github.io/government/db/detva/dt-detva-osoby.json");
		assertFalse(response.isEmpty());
	}

}
