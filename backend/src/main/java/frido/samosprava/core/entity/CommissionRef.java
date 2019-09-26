package frido.samosprava.core.entity;

public class CommissionRef extends Record {
  private String period;
  private String from;
  private String to;
  private Integer fk;
  private Boolean chairman;

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
  public Integer getFk() {
    return fk;
  }
  public void setFk(Integer fk) {
    this.fk = fk;
  }
  public Boolean getChairman() {
    return chairman;
  }
  public void setChairman(Boolean chairman) {
    this.chairman = chairman;
  }
}