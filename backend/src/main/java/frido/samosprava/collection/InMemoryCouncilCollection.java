package frido.samosprava.collection;

import java.util.Optional;

import frido.samosprava.entity.Council;
import frido.samosprava.entity.Office;

public class InMemoryCouncilCollection extends InMemoryBaseCollection<Council> {

  public Optional<Office> findOfficeById(Integer councilId, Integer roleId) {
    return findById(councilId).stream()
      .flatMap(c -> c.getOffices().stream())
      .filter(o -> o.getId().equals(roleId))
      .findFirst();
  }
}
