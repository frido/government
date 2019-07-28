package frido.samosprava.api;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.ResponseObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ManagementController {

	private final InMemoryCollections collections;
	private final static Logger log = LoggerFactory.getLogger(ManagementController.class);
	
	public ManagementController(InMemoryCollections collections) {
		this.collections = collections;
	}

    @GetMapping("/api/reload")
    public ResponseObject budget() {
		log.info("FRIDO: /api/reload");
    	collections.reload();
    	return null;
    }

}