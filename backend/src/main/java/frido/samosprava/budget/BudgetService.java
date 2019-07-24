package frido.samosprava.budget;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import frido.samosprava.BaseService;
import frido.samosprava.entities.Rozpocet;

public class BudgetService extends BaseService<Rozpocet> {

    public BudgetService() {
        super("detva/dt-detva-rozpocet.json", "petrzalka/ba-petrzalka-rozpocet.json");
    }

    @Override
    public List<Rozpocet> parse(String content) throws JsonParseException, JsonMappingException, IOException {
        ResponseBudgets object = mapper.readValue(content, ResponseBudgets.class);
        return object.getData();
    }

    public List<Rozpocet> findByCouncil(Integer council) {
        return new ArrayList<Rozpocet>(
            this.data.values()
                .stream()
                .filter(x -> x.getCouncil() == council)
                .collect(Collectors.toList())
            );
    }
//
}