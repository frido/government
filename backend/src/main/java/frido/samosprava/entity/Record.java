package frido.samosprava.entity;

public class Record {
  protected Integer id;
  protected Integer councilId;

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
