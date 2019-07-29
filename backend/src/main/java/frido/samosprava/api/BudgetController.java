package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BudgetController {

  private final InMemoryCollections collections;

  public BudgetController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/budget/{council}")
  public ResponseObject budget(@PathVariable int council) {
    return new ResponseObject(collections.collection("budget").council(council));
  }

}
