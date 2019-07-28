package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InterpellationController { 

	private final InMemoryCollections collections;
	
	public InterpellationController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/interpellations/{council}")
    public ResponseList interpellations(@PathVariable int council) {
    	return new ResponseList(collections.collection("interpellations").council(council));
    }

    @GetMapping("/api/interpellation/{id}")
    public ResponseObject interpellation(@PathVariable int id) {
        return new ResponseObject(collections.collection("interpellations").id(id));
    }

}