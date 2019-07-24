package frido.samosprava.client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JdkHttpClientTest {

	@Test
	public void testCall() throws Exception {
		WebClient client = new JdkHttpClient();
		String response = client.call("https://frido.github.io/government/db/detva/dt-detva-osoby.json");
		assertFalse(response.isEmpty());
	}

}
