package frido.samosprava.resolutions;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;

@RestController
class ResolutionController {

//    @Autowired
//    private ResolutionService service;
//
//    @GetMapping("/api/resolutions/{council}")
//    public ResponseList<Uznesenie> test(@PathVariable int council) throws IOException, URISyntaxException {
//        return new ResponseList<Uznesenie>(this.service.findByCouncil(council));
//    }
//
//    @GetMapping("/api/resolution/{id}")
//    public ResponseObject<Uznesenie> test2(@PathVariable int id) throws IOException, URISyntaxException {
//        return new ResponseObject<Uznesenie>(this.service.findById(Integer.valueOf(id)));
//    }

}