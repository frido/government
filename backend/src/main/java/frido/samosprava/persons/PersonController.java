package frido.samosprava.persons;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;

@RestController
class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/api/persons/{council}")
    public ResponseList<Osoba> test(@PathVariable int council) throws IOException, URISyntaxException {
        return new ResponseList<Osoba>(this.service.findByCouncil(council));
    }

    @GetMapping("/api/person/{id}")
    public ResponseObject<Osoba> test2(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResponseObject<Osoba>(this.service.findById(Integer.valueOf(id)));
    }

}