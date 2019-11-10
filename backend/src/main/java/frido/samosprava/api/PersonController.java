package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.view.PersonView;
import frido.samosprava.view.ResponseObjectView;
import frido.samosprava.view.ResponseListView;

@RestController
class PersonController {

  private final InMemoryCollections collections;

  public PersonController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/persons/{councilId}")
  public ResponseListView<PersonView> persons(@PathVariable int councilId) {
    return collections.persons().findInCouncilId(councilId).map(p -> new PersonView(collections, p)).collect(new ResponseListView<>());
  }

  @GetMapping("/api/person/{id}")
  public ResponseObjectView person(@PathVariable int id) {
    return collections.persons().findById(id).map(x -> new PersonView(collections, x)).map(ResponseObjectView::new).orElseThrow();
  }

}
