package frido.samosprava.meeting;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import frido.samosprava.BaseService;
import frido.samosprava.deprecated.ResponseOsoba;
import frido.samosprava.entities.Osoba;
import frido.samosprava.entities.Rozpocet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeetingService extends BaseService<Meeting> {

    public MeetingService() {
        super("detva/dt-detva-zasadnutia.json", "petrzalka/ba-petrzalka-zasadnutia.json");
    }

    @Override
    public List<Meeting> parse(String content) throws JsonParseException, JsonMappingException, IOException {
        ResponseMeeting object = mapper.readValue(content, ResponseMeeting.class);
        return object.getData();
    }

    public List<Meeting> findByCouncil(Integer council) {
        return new ArrayList<Meeting>(
                this.data.values()
                        .stream()
                        .filter(x -> x.getSpolok() == council)
                        .collect(Collectors.toList())
        );
    }
//
}