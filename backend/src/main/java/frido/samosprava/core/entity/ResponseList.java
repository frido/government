package frido.samosprava.core.entity;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class ResponseList {

  private final List<JsonNode> data;

  public ResponseList(List<JsonNode> data) {
    this.data = data;
  }

  public List<JsonNode> getData() {
    return data;
  }
}
