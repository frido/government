package frido.samosprava.core.entity.view;

import java.util.List;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Meeting;

public class MeetingListView {

  private List<Meeting> data;

  public MeetingListView(InMemoryCollections2 collections, List<Meeting> list) {
    data = list;
  }

  public List<Meeting> getData() {
    return data;
  }

  public void setData(List<Meeting> data) {
    this.data = data;
  }

}
