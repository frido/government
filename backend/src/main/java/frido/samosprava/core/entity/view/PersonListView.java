package frido.samosprava.core.entity.view;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Person;

public class PersonListView {

  private List<PersonView> data;

  public PersonListView(InMemoryCollections2 collections, Stream<Person> list) {
    data = list.map(p -> new PersonView(collections, p)).collect(Collectors.toList());
  }

  public List<PersonView> getData() {
    return data;
  }

  public void setData(List<PersonView> data) {
    this.data = data;
  }

}
