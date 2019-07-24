package frido.samosprava.store;

import java.io.IOException;

import frido.samosprava.client.WebClient;

public class HttpStore implements DataStore {

	WebClient client;
	
	public HttpStore(WebClient client) {
		this.client = client;
	}
	
	@Override
	public String load(String name) {
		try {
			return client.call(name);
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
