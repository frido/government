package frido.samosprava;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import frido.samosprava.persons.Osoba;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ResultList<T> {
    private ObjectMapper mapper = new ObjectMapper();

    private List<T> list;
    private int count = 0;

    public ResultList(Store store, Class<T> clazz, Predicate<T> filter) throws IOException {
        list = store.getAll().stream()
                .map(x -> apply(x, clazz))
                .filter(filter)
                .peek(x -> count++)
                .skip(0)
                .limit(1000)
                .collect(Collectors.toUnmodifiableList());
    }

    public T apply(ObjectNode o, Class<T> clazz) {
        try {
            return mapper.readValue(o.traverse(), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<T> getData() {
        return list;
    }
}
