package frido.samosprava.client;

import java.io.IOException;

public interface WebClient {
  String call(String link) throws IOException, InterruptedException;
}
