package frido.samosprava.core.entity;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

public class ResponseObject {
    private Optional<JsonNode> data;

    public ResponseObject() {
    }

    public ResponseObject(Optional<JsonNode> data) {
        this.data = data;
    }
    
    public ResponseObject(List<JsonNode> data) {
        this.data = Optional.ofNullable(data.get(0));
    }

    /**
     * @return the data
     */
    public Optional<JsonNode> getData() {
        return data;
    }
}