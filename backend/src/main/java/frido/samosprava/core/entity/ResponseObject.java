package frido.samosprava.core.entity;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Optional;

public class ResponseObject {
  private final JsonNode data;

  public ResponseObject(Optional<JsonNode> data) {
    this.data = data.orElse(null);
  }

  public ResponseObject(List<JsonNode> data) {
    this.data = data.get(0);
  }

  public JsonNode getData() {
    return data;
  }
}
