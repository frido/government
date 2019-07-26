package frido.samosprava.api;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseList;
import frido.samosprava.core.entity.ResponseObject;

@RestController
class BudgetController {

	InMemoryCollections collections;
	
	public BudgetController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/budget/{council}")
    public ResponseObject budget(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseObject(collections.collection("budget").council(council));
    }

}