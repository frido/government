package frido.samosprava.entity;

import java.time.LocalDate;

public class OfficeRef extends Record {
  protected String period;
  protected LocalDate from;
  protected LocalDate to;
  protected Integer roleId;
  protected Integer electionId;

  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }
  public LocalDate getFrom() {
    return from;
  }
  public void setFrom(LocalDate from) {
    this.from = from;
  }
  public LocalDate getTo() {
    return to;
  }
  public void setTo(LocalDate to) {
    this.to = to;
  }
  public Integer getRoleId() {
    return roleId;
  }
  public void setRole(Integer roleId) {
    this.roleId = roleId;
  }
  public Integer getElectionId() {
    return electionId;
  }
  public void setElectionId(Integer electionId) {
    this.electionId = electionId;
  }
}
