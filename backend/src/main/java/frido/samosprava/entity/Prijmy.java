package frido.samosprava.entity;

import java.util.List;

public class Prijmy {
  private String title;
  private List<Money> money;
  private List<Prijmy> sub;

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public List<Money> getMoney() {
    return money;
  }
  public void setMoney(List<Money> money) {
    this.money = money;
  }
  public List<Prijmy> getSub() {
    return sub;
  }
  public void setSub(List<Prijmy> sub) {
    this.sub = sub;
  }
}
