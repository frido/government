package frido.samosprava.core.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import frido.samosprava.core.entity.Person;
import frido.samosprava.core.entity.Record;

public class InMemoryPersonCollection extends InMemoryBaseCollection<Person> {

  public Stream<Person> findInCouncilId(Integer councilId) {
    return getAll().filter(p -> isInCouncilId(p, councilId));
  }

  private Boolean isInCouncilId(Person p, Integer councilId) {
    List<Record> allRels = new LinkedList<Record>();
    add(allRels, p.getOffices());
    add(allRels, p.getDepartments());
    add(allRels, p.getDeputies());
    add(allRels, p.getCommissions());

    return allRels.stream().anyMatch(rel -> councilId.equals(rel.getCouncilId()));
  }

  private void add(List<Record> source, List<? extends Record> addon) {
    if(addon != null) {
      source.addAll(addon);
    }
  }

}
