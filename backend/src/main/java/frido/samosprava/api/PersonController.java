package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonController {

	private final InMemoryCollections collections;
	
	public PersonController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/persons/{council}")
    public ResponseList persons(@PathVariable int council) {
    	return new ResponseList(collections.collection("persons").councilNested(council));
    }

    @GetMapping("/api/person/{id}")
    public ResponseObject person(@PathVariable int id) {
        return new ResponseObject(collections.collection("persons").id(id));
    }

}