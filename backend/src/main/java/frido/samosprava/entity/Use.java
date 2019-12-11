package frido.samosprava.entity;

import java.math.BigDecimal;

public class Use {
  private String title;
  private BigDecimal suma;

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public BigDecimal getSuma() {
    return suma;
  }
  public void setSuma(BigDecimal suma) {
    this.suma = suma;
  }
}
