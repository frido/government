package frido.samosprava.core.client;

import java.io.IOException;

public interface WebClient {
	String call(String link) throws IOException, InterruptedException;
}
