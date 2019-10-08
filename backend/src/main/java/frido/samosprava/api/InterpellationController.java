package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;

@RestController
class InterpellationController {

  private InMemoryCollections2 collections;

  public InterpellationController(InMemoryCollections2 collections) {
//    this.collections = collections;
  }

  @GetMapping("/api/interpellations/{council}")
  public ResponseList interpellations(@PathVariable int council) {
//    return new ResponseList(collections.collection("interpellations").council(council));
    return null;
  }

  @GetMapping("/api/interpellation/{id}")
  public ResponseObject interpellation(@PathVariable int id) {
//    return new ResponseObject(collections.collection("interpellations").id(id));
    return null;
  }

}
