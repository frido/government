package frido.samosprava.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

class ResolutionControllerTest extends ControllerTest {

  @Test
  void testResolution() {
    ResolutionController controller = new ResolutionController(collections);
    assertEquals(1001, controller.resolution(1001).getData().get("id").asInt());
  }

  @Test
  void testResolutions() {
    ResolutionController controller = new ResolutionController(collections);
    List<JsonNode> resultList = controller.resolutions(2).getData();
    assertNotEquals(0, resultList.size());
    for (JsonNode jsonNode : resultList) {
      assertEquals(2, jsonNode.get("council").asInt());
    }
  }

}
