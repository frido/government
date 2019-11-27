package frido.samosprava.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.integration.rss.RssItem;
import frido.samosprava.integration.rss.RssResource;
import frido.samosprava.view.ResponseListView;
import frido.samosprava.view.RssListView;

@RestController
class IntegrationController {

  private final InMemoryCollections collections;

  public IntegrationController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/integration/rss/{councilId}")
  public ResponseListView<RssListView> meetings(@PathVariable int councilId) {
    return collections.councils().findById(councilId).stream().flatMap(c -> c.getRss().stream())
        .map(rssLink -> createRssList(rssLink)).collect(new ResponseListView<>());
  }

  private RssListView createRssList(String rssLink) {
    RssResource rssResource = new RssResource(rssLink, new JdkHttpClient());
    List<RssItem> rssItems = rssResource.getItems().stream()
        .filter(i -> !"Oznámenie o uložení zásielok".equals(i.getTitle()))
        .collect(Collectors.toList());
    return new RssListView(rssLink, rssItems);
  }
}
