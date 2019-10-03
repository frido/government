package frido.samosprava.core.entity;

public class DepartmentRef extends Record {
  protected String period;
  protected String from;
  protected String to;
  protected Integer fk;
  protected Integer roleId;

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
  public Integer getRoleId() {
    return roleId;
  }
  public void setRole(Integer roleId) {
    this.roleId = roleId;
  }
}
