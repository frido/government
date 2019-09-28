package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.view.PersonListView;
import frido.samosprava.core.entity.view.PersonView;

@RestController
class PersonController {

  private final InMemoryCollections2 collections;

  public PersonController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

  @GetMapping("/api/persons/{councilId}")
  public PersonListView persons(@PathVariable int councilId) {
    return new PersonListView(collections, collections.persons().findInCouncilId(councilId));
  }

  @GetMapping("/api/person/{id}")
  public ResponseObject2 person(@PathVariable int id) {
    return new ResponseObject2(new PersonView(collections, collections.persons().findById(id).get()));
  }

}
