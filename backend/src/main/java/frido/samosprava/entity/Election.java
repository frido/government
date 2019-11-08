package frido.samosprava.entity;

import java.time.LocalDate;

public class Election extends Record {
  private String period;
  private LocalDate from;
  private LocalDate to;
  private String party;
  private Integer votes;
  private Boolean mayor;

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
