package frido.samosprava.entity;

import java.util.List;

public class MeetingList {
  private List<Meeting> meetings;

  public List<Meeting> getMeetings() {
    return meetings;
  }

  public void setResolutions(List<Meeting> meetings) {
    this.meetings = meetings;
  }
}
