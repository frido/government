package frido.samosprava.core.entity;

import java.math.BigDecimal;

public class Project {
  private String title;
  private BigDecimal value;

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
}
