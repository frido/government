package frido.samosprava.core.entity;

public class Record {
  private Integer id;
  private Integer councilId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCouncilId() {
    return councilId;
  }

  public void setCouncilId(Integer councilId) {
    this.councilId = councilId;
  }
}
