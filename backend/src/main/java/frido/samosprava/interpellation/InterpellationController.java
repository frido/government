package frido.samosprava.interpellation;

import frido.samosprava.*;
import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;
import frido.samosprava.persons.Osoba;
import frido.samosprava.store.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
class InterpellationController {

    @Autowired
    private StoreManager manager;

    @GetMapping("/api/interpellations/{council}")
    public ResponseList<Interpellation> test(@PathVariable int council) throws IOException, URISyntaxException {
        return new ResultList<>(manager.get("interpellation"), Interpellation.class)
                .filter(x -> x.getSpolok() == council)
                .buildList();
    }

    @GetMapping("/api/interpellation/{id}")
    public ResponseObject<Osoba> test2(@PathVariable int id) throws IOException, URISyntaxException {
        return new ResultList<>(manager.get("interpellation"), Interpellation.class)
                .filter(x -> x.getId() == id)
                .buildObject();
    }

}