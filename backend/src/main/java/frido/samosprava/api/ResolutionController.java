package frido.samosprava.api;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.Resolution;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.view.ResponseWrapper;

@RestController
class ResolutionController {

  private final InMemoryCollections collections;

  // NOTE: Since version ~4.3 parameters in constructor are injected automatically
  public ResolutionController(InMemoryCollections collections) {
    this.collections = collections;
  }

  @GetMapping("/api/resolutions")
  public ResponseWrapper<Resolution> resolutions(@RequestParam(required = false) Integer councilId,
      @RequestParam(required = false) Integer meetingId, @RequestParam(required = false) Integer creatorId) {
    if (councilId != null) {
      return collections.resolutions().findByCouncilId(councilId).collect(new ResponseWrapper<>());
    }
    if (meetingId != null) {
      return collections.resolutions().findByMeetingId(meetingId).collect(new ResponseWrapper<>());
    }
    if (creatorId != null) {
      return collections.resolutions().findByCreatorIdAsDeputy(collections, creatorId).collect(new ResponseWrapper<>());
    }

    return new ResponseWrapper<>();
  }

  @GetMapping("/api/resolution/{id}")
  public Optional<ResponseObject2> resolution(@PathVariable int id) {
    return collections.resolutions().findById(id).map(ResponseObject2::new);
  }

}
