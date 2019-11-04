package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Meeting;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.view.ResponseWrapper;

@RestController
class MeetingController {

  private final InMemoryCollections2 collections;

  public MeetingController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

  @GetMapping("/api/meetings/{councilId}")
  public ResponseWrapper<Meeting> meetings(@PathVariable int councilId) {
    return collections.meetings().findByCouncilId(councilId).collect(new ResponseWrapper<>());
  }

  @GetMapping("/api/meeting/{id}")
  public ResponseObject2 meeting(@PathVariable int id) {
    return new ResponseObject2(collections.meetings().findById(id));
  }

}
