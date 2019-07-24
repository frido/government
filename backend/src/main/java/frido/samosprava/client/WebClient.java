package frido.samosprava.store;

import java.io.IOException;

public interface WebClient {
	public String call(String link) throws IOException, InterruptedException;
}
