package frido.samosprava.core.entity;

import java.util.List;

public class Vydavky {
  private String program;
  private String title;
  private String comment;
  private List<String> use;
  private List<Money> money;
  private List<Vydavky> sub;

  public String getProgram() {
    return program;
  }
  public void setProgram(String program) {
    this.program = program;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public List<Money> getMoney() {
    return money;
  }
  public void setMoney(List<Money> money) {
    this.money = money;
  }
  public List<Vydavky> getSub() {
    return sub;
  }
  public void setSub(List<Vydavky> sub) {
    this.sub = sub;
  }
  public List<String> getUse() {
    return use;
  }
  public void setUse(List<String> use) {
    this.use = use;
  }
}
