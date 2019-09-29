package frido.samosprava.core.collection;

import java.util.List;
import java.util.stream.Collectors;

import frido.samosprava.core.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

  public InMemoryResolutionCollection(List<Resolution> list) {
    super(list);
  }

  public List<Resolution> findByMeetingId(Integer meetingId) {
    return data.values().stream().filter(x -> x.getMeetingId().equals(meetingId)).collect(Collectors.toList());
  }

}
