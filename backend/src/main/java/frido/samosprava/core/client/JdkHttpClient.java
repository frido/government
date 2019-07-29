package frido.samosprava.core.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JdkHttpClient implements WebClient {

  @Override
  public String call(String link) throws IOException, InterruptedException {
    HttpClient client = HttpClient.newBuilder().build();

    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).GET().build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    return response.body();

  }

}
