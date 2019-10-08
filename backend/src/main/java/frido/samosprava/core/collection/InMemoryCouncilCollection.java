package frido.samosprava.core.collection;

import frido.samosprava.core.entity.Council;
import frido.samosprava.core.entity.Office;

public class InMemoryCouncilCollection extends InMemoryBaseCollection<Council> {


  public Office findOfficeById(Integer councilId, Integer roleId) {
    return findById(councilId).flatMap(c -> c.getOffices().stream().filter(o -> o.getId() == roleId).findFirst()).get();
  }

}
