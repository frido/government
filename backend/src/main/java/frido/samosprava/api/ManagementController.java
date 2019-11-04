package frido.samosprava.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.view.ResponseObjectView;

@RestController
class ManagementController {

  private static final Logger log = LoggerFactory.getLogger(ManagementController.class);
  private final InMemoryCollections collections;

  public ManagementController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/reload")
  public ResponseObjectView budget() {
    log.info("FRIDO: /api/reload");
    collections.reload();
    return null;
  }

}
