package frido.samosprava.deprecated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

@Deprecated
public class PersonService extends BaseService<Osoba> {

    public PersonService() {
        super("detva/dt-detva-osoby.json", "petrzalka/ba-petrzalka-osoby.json");
    }

    @Override
    public List<Osoba> parse(String content) throws JsonParseException, JsonMappingException, IOException {
        ResponseOsoba object = mapper.readValue(content, ResponseOsoba.class);
        return object.getData();
    }

    public List<Osoba> findByCouncil(Integer council) {
        List<Osoba> output = new ArrayList<Osoba>();
        for (Osoba o : data.values()) {
            if (o.getElection().stream().anyMatch(x -> x.getCouncil() == council && "2018/2022".equals(x.getPeriod()))) {
                output.add(o);                
            }
            else if (o.getDepartments().stream().anyMatch(x -> x.getCouncil() == council && "2018/2022".equals(x.getPeriod()))) {
                output.add(o);                
            }
            else if (o.getCommission().stream().anyMatch(x -> x.getCouncil() == council && "2018/2022".equals(x.getPeriod()))) {
                output.add(o);                
            }
        }
        return output;
    }
//
}