package frido.samosprava.core.entity.view;

import java.math.BigDecimal;

public class ProjectView {
  private String title;
  private BigDecimal value;
  private Integer resolutionId;

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }
  public Integer getResolutionId() {
    return resolutionId;
  }
  public void setResolutionId(Integer resolutionId) {
    this.resolutionId = resolutionId;
  }
}
