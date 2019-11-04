package frido.samosprava.core.collection;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

import frido.samosprava.core.entity.Record;

public class InMemoryBaseCollection <T extends Record> {


  protected final Map<Integer, T> data = new TreeMap<>();


  public void addAll(List<T> item) {
    item.forEach(x -> data.put(x.getId(), x));
  }

  public Stream<T> findByCouncilId(Integer councilId) {
    return getAll().filter(x -> x.getCouncilId().equals(councilId));
  }

  public Optional<T> findById(Integer id) {
    return Optional.ofNullable(data.get(id));
  }

  public Stream<T> getAll(){
    return data.values().stream();
  }
}
