package frido.samosprava.core.entity;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

public class ResponseObject {
    private final JsonNode data;

    public ResponseObject(Optional<JsonNode> data) {
        this.data = data.orElse(null);
    }
    
    public ResponseObject(List<JsonNode> data) {
        this.data = data.get(0);
    }

    /**
     * @return the data
     */
    public JsonNode getData() {
        return data;
    }
}