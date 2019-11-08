package frido.samosprava.entity;

import java.time.LocalDate;

public class DepartmentRef extends Record {
  protected String period;
  protected LocalDate from;
  protected LocalDate to;
  protected Integer fk;
  protected Integer roleId;

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
  public Integer getFk() {
    return fk;
  }
  public void setFk(Integer fk) {
    this.fk = fk;
  }
  public Integer getRoleId() {
    return roleId;
  }
  public void setRole(Integer roleId) {
    this.roleId = roleId;
  }
}
