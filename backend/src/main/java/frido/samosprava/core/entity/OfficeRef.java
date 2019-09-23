package frido.samosprava.core.entity;

public class OfficeRef extends Record {
  private String period;
  private String from;
  private String to;
  private Integer role;
  private Integer electionId;

  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }
  public Integer getRole() {
    return role;
  }
  public void setRole(Integer role) {
    this.role = role;
  }
  public Integer getElectionId() {
    return electionId;
  }
  public void setElectionId(Integer electionId) {
    this.electionId = electionId;
  }
}
