package frido.samosprava.core.entity.view;

import java.util.List;
import java.util.stream.Stream;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.Meeting;

public class MeetingListView {

  private Stream<Meeting> data;

  public MeetingListView(InMemoryCollections collections, Stream<Meeting> list) {
    data = list;
  }

  public Stream<Meeting> getData() {
    return data;
  }

  public void setData(Stream<Meeting> data) {
    this.data = data;
  }

}
