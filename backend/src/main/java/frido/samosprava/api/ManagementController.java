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
class ManagementController {

	InMemoryCollections collections;
	
	public ManagementController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/reload")
    public ResponseObject budget() throws IOException, URISyntaxException {
    	collections.reload();
    	return  null;
    }

}