package frido.samosprava.meeting;

import frido.samosprava.deprecated.PersonService;
import frido.samosprava.entities.Osoba;
import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
class MeetingController {

//    @Autowired
//    private MeetingService service;
//
//    @GetMapping("/api/meetings/{council}")
//    public ResponseList<Meeting> test(@PathVariable int council) throws IOException, URISyntaxException {
//        return new ResponseList<Meeting>(this.service.findByCouncil(council));
//    }
//
//    @GetMapping("/api/meeting/{id}")
//    public ResponseObject<Meeting> test2(@PathVariable int id) throws IOException, URISyntaxException {
//        return new ResponseObject<Meeting>(this.service.findById(Integer.valueOf(id)));
//    }

}