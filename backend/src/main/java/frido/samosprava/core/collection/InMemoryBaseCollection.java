package frido.samosprava.core.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import frido.samosprava.core.entity.Record;

public class InMemoryBaseCollection <T extends Record> {


  private final Map<Integer, T> data = new TreeMap<>();

  public InMemoryBaseCollection(List<T> list) {
    addAll(list);
  }

  private void addAll(List<T> item) {
    item.forEach(x -> data.put(x.getId(), x));
  }

  public List<T> council(Integer councilId) {
    return data.values().stream().filter(x -> x.getCouncilId().equals(councilId)).collect(Collectors.toList());
  }

  public Optional<T> id(Integer id) {
    return Optional.ofNullable(data.get(id));
  }

  public Collection<T> getAll(){
    return Collections.unmodifiableCollection(data.values());
  }
}
