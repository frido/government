package frido.samosprava.core.collection;

import java.util.Optional;

import frido.samosprava.core.entity.Council;
import frido.samosprava.core.entity.Office;

public class InMemoryCouncilCollection extends InMemoryBaseCollection<Council> {

  public Optional<Office> findOfficeById(Integer councilId, Integer roleId) {
    return findById(councilId).stream()
      .flatMap(c -> c.getOffices().stream())
      .filter(o -> o.getId() == roleId)
      .findFirst();
  }
}
