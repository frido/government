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
class InterpellationController { 

	InMemoryCollections collections;
	
	public InterpellationController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/interpellations/{council}")
    public ResponseList interpellations(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseList(collections.collection("interpellations").council(council));
    }

    @GetMapping("/api/interpellation/{id}")
    public ResponseObject interpellation(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject(collections.collection("interpellations").id(id));
    }

}