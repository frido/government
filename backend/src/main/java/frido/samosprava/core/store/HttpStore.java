package frido.samosprava.core.store;

import java.io.IOException;

import frido.samosprava.api.ApplicationException;
import frido.samosprava.core.client.WebClient;

public class HttpStore implements DataStore {

	private final WebClient client;
	private final String link;
	
	public HttpStore(WebClient client, String link) {
		this.client = client;
		this.link = link;
	}
	
	@Override
	public String load(String name) {
		try {
			return client.call(link + name);
		} catch (InterruptedException e) {
			throw new ApplicationException(e);
		} catch (IOException e) {
			Thread.currentThread().interrupt();
			throw new ApplicationException(e);
		}
	}

}
