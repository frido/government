package frido.samosprava.core.collection;

import java.util.List;

import frido.samosprava.core.entity.Person;

public class InMemoryPersonCollection extends InMemoryBaseCollection<Person> {

  public InMemoryPersonCollection(List<Person> list) {
    super(list);
  }

}
