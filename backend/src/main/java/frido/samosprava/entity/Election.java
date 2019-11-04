package frido.samosprava.entity;

public class Election extends Record {
  private String period;
  private String from;
  private String to;
  private String party;
  private Integer votes;
  private Boolean mayor;

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
  public String getParty() {
    return party;
  }
  public void setParty(String party) {
    this.party = party;
  }
  public Integer getVotes() {
    return votes;
  }
  public void setVotes(Integer votes) {
    this.votes = votes;
  }
  public Boolean getMayor() {
    return mayor;
  }
  public void setMayor(Boolean mayor) {
    this.mayor = mayor;
  }
}
