package frido.samosprava.api;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Meeting;
import frido.samosprava.view.ResponseObjectView;
import frido.samosprava.view.ResponseListView;

@RestController
class MeetingController {

  private final InMemoryCollections collections;

  public MeetingController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/meetings/{councilId}")
  public ResponseListView<Meeting> meetings(@PathVariable int councilId) {
    return collections.meetings().findByCouncilId(councilId).collect(new ResponseListView<>());
  }

  @GetMapping("/api/meeting/{id}")
  public ResponseObjectView meeting(@PathVariable int id) {
    return collections.meetings().findById(id).map(ResponseObjectView::new).orElseThrow();
  }

}
