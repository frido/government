package frido.samosprava.core.entity;

public class DeputyRef extends Record {
  private String period;
  private String from;
  private String to;
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
  public Integer getElectionId() {
    return electionId;
  }
  public void setElectionId(Integer electionId) {
    this.electionId = electionId;
  }
}