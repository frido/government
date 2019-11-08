package frido.samosprava.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import frido.samosprava.entity.Meeting;
import frido.samosprava.entity.Person;
import frido.samosprava.entity.Resolution;

public class InMemoryResolutionCollection extends InMemoryBaseCollection<Resolution> {

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
      Meeting meeting = collections.meetings().findById(x.getMeetingId()).get();
      return x.getCreatorIds().stream().filter(c -> c.equals(creatorId)).map(c -> collections.persons().findById(c))
          .filter(p -> responsibilityType(p.get(), x.getCouncilId(), meeting.getDate()) == 2).count() > 0;
    });
  }

  // TODO: responsibility Enumberation
  private int responsibilityType(Person person, int councilId, LocalDate inDate) {
    if (person.getDeputies().stream()
        .anyMatch(d -> d.getCouncilId() == councilId && dateWithin(inDate, d.getFrom(), d.getTo()))) {
      return 2;
    }
    return 1;
  }

  private boolean dateWithin(LocalDate date, LocalDate from, LocalDate to) {
      if (((from == null) || (from.isBefore(date))) && ((to == null) || (to.isAfter(date)))) {
        return true;
      }
      return false;
  }

}
