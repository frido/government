package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.ResponseObject2;

@RestController
class BudgetController {

  private final InMemoryCollections2 collections;

  public BudgetController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

  @GetMapping("/api/budget/{councilId}")
  public ResponseObject2 budget(@PathVariable int councilId) {
    return new ResponseObject2(collections.councils().findById(councilId));
  }

}
