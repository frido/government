package frido.samosprava.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import frido.samosprava.entity.Meeting;
import frido.samosprava.entity.Person;
import frido.samosprava.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

  // TODO: the same used on more places
  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy"); // 25.09.2018

  public Stream<Resolution> findByMeetingId(Integer meetingId) {
    return getAll().filter(x -> x.getMeetingId().equals(meetingId));
  }

  public Stream<Resolution> findByMeetingIds(List<Integer> meetings) {
    return getAll().filter(x -> meetings.contains(x.getMeetingId()));
  }

  public Stream<Resolution> findByCreatorId(Integer creatorId) {
    return getAll().filter(x -> x.getCreatorIds().contains(creatorId));
  }

  public Stream<Resolution> findByTypeAndCouncilId(String type, Integer councilId) {
    return findByCouncilId(councilId).filter(x -> x.getType().equals(type));
  }

  // uznesenia kde creator je poslanec
  public Stream<Resolution> findByCreatorIdAsDeputy(InMemoryCollections collections, Integer creatorId) {
    return getAll().filter(x -> {
      try {
        Meeting meeting = collections.meetings().findById(x.getMeetingId()).get();
        Date meetingDate = sdf.parse(meeting.getDate());
        return x.getCreatorIds().stream()
          .filter(c -> c.equals(creatorId))
          .map(c -> collections.persons().findById(c))
          .filter(p -> responsibilityType(p.get(), x.getCouncilId(), meetingDate) == 2)
          .count() > 0;
      } catch (ParseException e) {
        e.printStackTrace();
      }
      return false;
    });
  }

  // TODO: responsibility Enumberation
  private int responsibilityType(Person person, int councilId, Date inDate) {
    if (person.getDeputies() != null) { // TODO: != null nechcem vidiet
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
