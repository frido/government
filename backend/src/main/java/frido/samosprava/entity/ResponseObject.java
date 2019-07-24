package frido.samosprava.entity;

import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

public class ResponseObject {
    private Optional<JsonNode> data;

    public ResponseObject() {
    }

    public ResponseObject(Optional<JsonNode> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public Optional<JsonNode> getData() {
        return data;
    }
}