package frido.samosprava.budget;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.entity.ResponseList;

@RestController
class BudgetController {

    @Autowired
    private BudgetService service;

    @GetMapping("/api/budget/{council}")
    public ResponseList<Rozpocet> test(@PathVariable int council) throws IOException, URISyntaxException {
        return new ResponseList<Rozpocet>(this.service.findByCouncil(council));
    }
}