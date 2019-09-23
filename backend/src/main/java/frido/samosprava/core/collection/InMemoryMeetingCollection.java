package frido.samosprava.core.collection;

import java.util.List;

import frido.samosprava.core.entity.Meeting;

public class InMemoryMeetingCollection extends InMemoryBaseCollection<Meeting> {

  public InMemoryMeetingCollection(List<Meeting> list) {
    super(list);
  }

}
