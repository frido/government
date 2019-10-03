package frido.samosprava.core.collection;

import java.util.List;

import frido.samosprava.core.entity.Council;
import frido.samosprava.core.entity.Office;

public class InMemoryCouncilCollection extends InMemoryBaseCollection<Council> {

  public InMemoryCouncilCollection(List<Council> list) {
    super(list);
  }

  public Office findOfficeById(Integer councilId, Integer roleId) {
    return findById(councilId).flatMap(c -> c.getOffices().stream().filter(o -> o.getId() == roleId).findFirst()).get();
  }

}
