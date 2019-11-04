package frido.samosprava.core.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import frido.samosprava.core.entity.Person;

import frido.samosprava.core.entity.Meeting;
import frido.samosprava.core.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

  // TODO: the same used on more places
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // 25.09.2018
  private static final String Person = null;

  public Stream<Resolution> findByMeetingId(Integer meetingId) {
    return data.values().stream().filter(x -> x.getMeetingId().equals(meetingId));
  }

  public Stream<Resolution> findByMeetingIds(List<Integer> meetings) {
    return data.values().stream().filter(x -> meetings.contains(x.getMeetingId()));
  }

  public Stream<Resolution> findByCreatorId(Integer creatorId) {
    return data.values().stream().filter(x -> x.getCreatorIds() != null && x.getCreatorIds().contains(creatorId));
  }

  public Stream<Resolution> findByTypeAndCouncilId(String type, Integer councilId) {
    return findByCouncilId(councilId).filter(x -> x.getType().equals(type));
  }

  // uznesenia kde creator je poslanec
  public Stream<Resolution> findByCreatorIdAsDeputy(InMemoryCollections2 collections, Integer creatorId) {
    return data.values().stream().filter(x -> {
      try {
        Meeting meeting = collections.meetings().findById(x.getMeetingId()).get();
        Date meetingDate = sdf.parse(meeting.getDate());
        if (x.getCreatorIds() != null) {
          return x.getCreatorIds().stream()
            .filter(c -> c.equals(creatorId))
            .map(c -> collections.persons().findById(c))
            .filter(p -> responsibilityType(p.get(), x.getCouncilId(), meetingDate) == 2)
            .count() > 0;
        }
        return false;
      } catch (ParseException e) {
        e.printStackTrace();
      }
      return false;
    });
  }

  // TODO: responsibility Enumberation
  private int responsibilityType(Person person, int councilId, Date inDate) {
    if (person.getDeputies() != null) {
      if (person.getDeputies().stream()
          .anyMatch(d -> d.getCouncilId() == councilId && dateWithin(inDate, d.getFrom(), d.getTo()))) {
        return 2;
      }
    }
    return 1;
  }

  private boolean dateWithin(Date date, String from, String to) {
    try {
        if (((from == null) || (sdf.parse(from).before(date))) && ((to == null) || (sdf.parse(to).after(date)))) {
            return true;
        }
        return false;
    } catch (ParseException e) {
        return false;
    }
}

}
