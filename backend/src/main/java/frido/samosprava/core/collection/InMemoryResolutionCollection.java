package frido.samosprava.core.collection;

import java.util.List;

import frido.samosprava.core.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

  public InMemoryResolutionCollection(List<Resolution> list) {
    super(list);
  }

}
