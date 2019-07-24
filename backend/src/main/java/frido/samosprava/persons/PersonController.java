package frido.samosprava.persons;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;

@RestController
class PersonController {

	@Autowired
	InMemoryCollections collections;

	// TODO: Filtering by council
    @GetMapping("/api/persons/{council}")
    public ResponseList test(@PathVariable int council) throws IOException, URISyntaxException {
    	return new ResponseList(collections.collection("data").council(council));
    }

    @GetMapping("/api/person/{id}")
    public ResponseObject test2(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject(collections.collection("data").id(id));
    }

}