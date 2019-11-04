package frido.samosprava.api;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.view.PersonView;
import frido.samosprava.core.entity.view.ResponseWrapper;

@RestController
class PersonController {

  private final InMemoryCollections collections;

  public PersonController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/persons/{councilId}")
  public ResponseWrapper<PersonView> persons(@PathVariable int councilId) {
    return collections.persons().findInCouncilId(councilId).map(p -> new PersonView(collections, p)).collect(new ResponseWrapper<>());
  }

  @GetMapping("/api/person/{id}")
  public Optional<ResponseObject2> person(@PathVariable int id) {
    return collections.persons().findById(id).map(x -> new PersonView(collections, x)).map(ResponseObject2::new);
  }

}
