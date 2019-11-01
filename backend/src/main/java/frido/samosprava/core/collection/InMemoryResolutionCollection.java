package frido.samosprava.core.collection;

import java.util.List;
import java.util.stream.Collectors;

import frido.samosprava.core.entity.Meeting;
import frido.samosprava.core.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

  public List<Resolution> findByMeetingId(Integer meetingId) {
    return data.values().stream().filter(x -> x.getMeetingId().equals(meetingId)).collect(Collectors.toList());
  }

  public List<Resolution> findByMeetingIds(List<Integer> meetings) {
    return data.values().stream().filter(x -> meetings.contains(x.getMeetingId())).collect(Collectors.toList());
  }

  public List<Resolution> findByCreatorId(Integer creatorId) {
    return data.values().stream().filter(x -> x.getCreatorIds() != null && x.getCreatorIds().contains(creatorId)).collect(Collectors.toList());
  }

  public List<Resolution> findByTypeAndCouncilId(String type, Integer councilId) {
    return findByCouncilId(councilId).stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
  }

}
