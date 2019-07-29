package frido.samosprava.api;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

class PersonControllerTest extends ControllerTest {

  @Test
  void testPerson() {
    PersonController controller = new PersonController(collections);
    assertEquals(1, controller.person(1).getData().get("id").asInt());
  }

  @Test
  void testPersons() {
    PersonController controller = new PersonController(collections);
    List<JsonNode> resultList = controller.persons(2).getData();
    assertNotEquals(0, resultList.size());
    for (JsonNode jsonNode : resultList) {
      assertTrue(jsonNode.findValues("council").stream().map(x -> x.asInt()).anyMatch(x -> x == 2));
    }
  }

}
