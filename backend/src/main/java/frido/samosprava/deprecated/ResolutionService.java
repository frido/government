package frido.samosprava.deprecated;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class ResolutionService extends BaseService<Uznesenie> {

    public ResolutionService() {
        super("detva/dt-detva-uznesenia.json", "petrzalka/ba-petrzalka-uznesenia.json");
    }

    @Override
    public List<Uznesenie> parse(String content) throws JsonParseException, JsonMappingException, IOException {
        ResponseUznesenia object = mapper.readValue(content, ResponseUznesenia.class);
        return object.getData();
    }

    public List<Uznesenie> findByCouncil(Integer council) {
        return new ArrayList<Uznesenie>(
            this.data.values()
                .stream()
                .filter(x -> x.getSpolok() == council)
                .collect(Collectors.toList())
            );
    }
//
}