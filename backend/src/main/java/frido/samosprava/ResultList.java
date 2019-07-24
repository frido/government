package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;
import frido.samosprava.store.old.Store;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultList {
    private ObjectMapper mapper = new ObjectMapper();
    private Stream<JsonNode> list;
    private int count = 0;
    private Predicate<JsonNode> filter;
    private Integer skip;
    private Integer limit;

    public ResultList(Store store) throws IOException {
        list = store.getAll().stream().map(x -> apply(x));
    }

    public ResultList filter(Predicate filter) {
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

    public ResponseList buildList() {
        if (filter != null) {
            list = list.filter(filter).peek(x -> count++);
        }
        if (skip != null) {
            list = list.skip(skip);
        }
        if (limit != null) {
            list = list.limit(limit);
        }
        return new ResponseList(list.collect(Collectors.toUnmodifiableList()));
    }

    public ResponseObject buildObject() {
        if (filter != null) {
            list = list.filter(filter);
        }
        return new ResponseObject(list.findFirst());
    }

    private JsonNode apply(ObjectNode o) {
        try {
            return mapper.readTree(o.traverse());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
