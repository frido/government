package frido.samosprava.api;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Resolution;
import frido.samosprava.core.entity.ResponseObject2;
import frido.samosprava.core.entity.view.ResolutionListView;

@RestController
class ResolutionController {

  private final InMemoryCollections2 collections;

  // NOTE: Since version ~4.3 parameters in constructor are injected automatically
  public ResolutionController(InMemoryCollections2 collections) {
    this.collections = collections;
  }

 @GetMapping("/api/resolutions")
 public ResolutionListView resolutions(
     @RequestParam(required = false) Integer councilId,
     @RequestParam(required = false) Integer meetingId,
     @RequestParam(required = false) Integer creatorId
 ) {
   if(councilId != null) {
     return new ResolutionListView(collections, collections.resolutions().findByCouncilId(councilId));
   }
   if(meetingId != null) {
     return new ResolutionListView(collections, collections.resolutions().findByMeetingId(meetingId));
   }
   if(creatorId != null) {
     return new ResolutionListView(collections, collections.resolutions().findByCreatorIdAsDeputy(collections, creatorId));
   }


   return new ResolutionListView(collections, null);
 }

  @GetMapping("/api/resolution/{id}")
  public ResponseObject2 resolution(@PathVariable int id) {
    return new ResponseObject2(collections.resolutions().findById(id));
  }

}
