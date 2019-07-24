package frido.samosprava.core.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class ResponseList {

    private List<JsonNode> data;

    public ResponseList() {
        this.data = new ArrayList<>();
    }

    public ResponseList(List<JsonNode> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public List<JsonNode> getData() {
        return data;
    }
}