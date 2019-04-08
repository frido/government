package frido.samosprava.interpellation;

import frido.samosprava.*;
import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;
import frido.samosprava.persons.Osoba;
import frido.samosprava.persons.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@RestController
class InterpellationController {

    @Autowired
    private StoreManager manager;

    @GetMapping("/api/interpellations/{council}")
    public List<Interpellation> test(@PathVariable int council) throws IOException, URISyntaxException {
        //return new ResponseList<Osoba>(this.service.findByCouncil(council));
        return new ResultList<>(manager.get("interpellation"), Interpellation.class).filter(x -> x.getSpolok() == council).build();
    }

    @GetMapping("/api/interpellation/{id}")
    public ResponseObject<Osoba> test2(@PathVariable int id) throws IOException, URISyntaxException {
        //return new ResponseObject<Osoba>(this.service.findById(Integer.valueOf(id)));
        return null;
    }

}