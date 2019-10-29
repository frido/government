package frido.samosprava.core.entity.view;

import java.math.BigDecimal;

public class ProjectView {
  private String title;
  private BigDecimal value;
  private Integer resolutionId;
  private String resolutionTitle;
  private Integer resolutionNumber;
  private Integer year;

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
  public String getResolutionTitle() {
    return resolutionTitle;
  }
  public void setResolutionTitle(String resolutionTitle) {
    this.resolutionTitle = resolutionTitle;
  }
  public Integer getResolutionNumber() {
    return resolutionNumber;
  }
  public void setResolutionNumber(Integer resolutionNumber) {
    this.resolutionNumber = resolutionNumber;
  }
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }
}
