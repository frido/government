package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MeetingController {

	private final InMemoryCollections collections;
	
	public MeetingController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/meetings/{council}") 
    public ResponseList meetings(@PathVariable int council) {
    	return new ResponseList(collections.collection("meetings").council(council));
    }

    @GetMapping("/api/meeting/{id}")
    public ResponseObject meeting(@PathVariable int id) {
        return new ResponseObject(collections.collection("meetings").id(id));
    }

}