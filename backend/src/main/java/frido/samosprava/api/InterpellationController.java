package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.view.ResponseListView;
import frido.samosprava.view.ResponseObjectView;

@RestController
class InterpellationController {

  private InMemoryCollections collections;

  public InterpellationController(InMemoryCollections collections) {
//    this.collections = collections;
  }

  @GetMapping("/api/interpellations/{council}")
  public ResponseListView<String> interpellations(@PathVariable int council) {
//    return new ResponseList(collections.collection("interpellations").council(council));
    return null;
  }

  @GetMapping("/api/interpellation/{id}")
  public ResponseObjectView interpellation(@PathVariable int id) {
//    return new ResponseObject(collections.collection("interpellations").id(id));
    return null;
  }

}
