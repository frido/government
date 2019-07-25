package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;
import frido.samosprava.deprecated.Osoba;
import frido.samosprava.deprecated.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
class MeetingController {

	InMemoryCollections collections;
	
	public MeetingController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/meetings/{council}")
    public ResponseList test(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseList(collections.collection("meetings").council(council));
    }

    @GetMapping("/api/meeting/{id}")
    public ResponseObject test2(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject(collections.collection("meetings").id(id));
    }

}