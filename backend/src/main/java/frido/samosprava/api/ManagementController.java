package frido.samosprava.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.ResponseObject;

@RestController
class ManagementController {

  private static final Logger log = LoggerFactory.getLogger(ManagementController.class);
//  private final InMemoryCollections collections;
  private final InMemoryCollections2 collections;

  public ManagementController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

  @GetMapping("/api/reload")
  public ResponseObject budget() {
    log.info("FRIDO: /api/reload");
    collections.reload();
    return null;
  }

}
