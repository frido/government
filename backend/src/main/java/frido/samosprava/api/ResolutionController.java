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
class ResolutionController {
	
	InMemoryCollections collections;
	
	// NOTE: Since version ~4.3 parameters in constructor are injected automatically
	public ResolutionController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/resolutions/{council}")
    public ResponseList resolutions(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseList(collections.collection("resolutions").council(council));
    }

    @GetMapping("/api/resolution/{id}")
    public ResponseObject resolution(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject(collections.collection("resolutions").id(id));
    }

}