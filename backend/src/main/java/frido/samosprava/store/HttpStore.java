package frido.samosprava.store;

import frido.samosprava.ApplicationException;
import frido.samosprava.client.WebClient;

import java.io.IOException;

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
      Thread.currentThread().interrupt();
      throw new ApplicationException(e);
    } catch (IOException e) {
      Thread.currentThread().interrupt();
      throw new ApplicationException(e);
    }
  }

}
