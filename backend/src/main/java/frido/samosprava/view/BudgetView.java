package frido.samosprava.view;

import java.math.BigDecimal;

public class BudgetView {
  private Integer year;
  private String title;
  private BigDecimal value;
  private String comment;
  private String program;
  private String number;

  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }
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
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public String getProgram() {
    return program;
  }
  public void setProgram(String program) {
    this.program = program;
  }
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
}
