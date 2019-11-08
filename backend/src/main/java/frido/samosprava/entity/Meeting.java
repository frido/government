package frido.samosprava.entity;

import java.time.LocalDate;

public class Meeting extends Record {
  private String time;
  private String place;
  private LocalDate date;

  public String getTime() {
    return time;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public void setTime(String time) {
    this.time = time;
  }
  public String getPlace() {
    return place;
  }
  public void setPlace(String place) {
    this.place = place;
  }
}
