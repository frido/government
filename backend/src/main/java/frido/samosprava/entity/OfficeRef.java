package frido.samosprava.entity;

public class OfficeRef extends Record {
  protected String period;
  protected String from;
  protected String to;
  protected Integer roleId;
  protected Integer electionId;

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
