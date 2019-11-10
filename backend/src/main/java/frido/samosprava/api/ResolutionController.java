package frido.samosprava.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Resolution;
import frido.samosprava.view.ResponseObjectView;
import frido.samosprava.view.ResolutionView;
import frido.samosprava.view.ResponseListView;

@RestController
class ResolutionController {

  private final InMemoryCollections collections;

  // NOTE: Since version ~4.3 parameters in constructor are injected automatically
  public ResolutionController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/resolutions")
  public ResponseListView<Resolution> resolutions(@RequestParam(required = false) Integer councilId,
      @RequestParam(required = false) Integer meetingId, @RequestParam(required = false) Integer creatorId) {
    if (councilId != null) {
      return collections.resolutions().findByCouncilId(councilId).sorted().map(x -> new ResolutionView(collections, x)).collect(new ResponseListView<>());
    }
    if (meetingId != null) {
      return collections.resolutions().findByMeetingId(meetingId).sorted().map(x -> new ResolutionView(collections, x)).collect(new ResponseListView<>());
    }
    if (creatorId != null) {
      return collections.resolutions().findByCreatorIdAsDeputy(collections, creatorId).sorted().map(x -> new ResolutionView(collections, x)).collect(new ResponseListView<>());
    }

    return new ResponseListView<>();
  }

  @GetMapping("/api/resolution/{id}")
  public ResponseObjectView resolution(@PathVariable int id) {
    return collections.resolutions().findById(id).map(x -> new ResolutionView(collections, x)).map(ResponseObjectView::new).orElseThrow();
  }

}
