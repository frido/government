package frido.samosprava.api;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;

@RestController
class MeetingController {

	InMemoryCollections collections;
	
	public MeetingController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/meetings/{council}") 
    public ResponseList meetings(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseList(collections.collection("meetings").council(council));
    }

    @GetMapping("/api/meeting/{id}")
    public ResponseObject meeting(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject(collections.collection("meetings").id(id));
    }

}