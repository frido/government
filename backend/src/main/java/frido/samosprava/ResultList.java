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
import java.util.stream.Stream;

public class ResultList<T> {
    private ObjectMapper mapper = new ObjectMapper();
    private Stream<T> list;
    private int count = 0;
    private Predicate<T> filter;
    private Integer skip;
    private Integer limit;

    public ResultList(Store store, Class<T> clazz) throws IOException {
        list = store.getAll().stream().map(x -> apply(x, clazz));
    }

    public ResultList filter(Predicate<T> filter) {
        this.filter = filter;
        return this;
    }

    public ResultList skip(int skip) {
        this.skip = skip;
        return this;
    }

    public ResultList limit(int limit) {
        this.limit = limit;
        return this;
    }

    public List<T> build() {
        if (filter != null) {
            list = list.filter(filter).peek(x -> count++);
        }
        if (skip != null) {
            list = list.skip(skip);
        }
        if (limit != null) {
            list = list.limit(limit);
        }
        return list.collect(Collectors.toUnmodifiableList());
    }

    private T apply(ObjectNode o, Class<T> clazz) {
        try {
            return mapper.readValue(o.traverse(), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
