package frido.samosprava.entity;

import java.util.List;

public class Budget extends Record {
  private List<Sumar> sumar;
  private List<Prijmy> prijmy;
  private List<Vydavky> vydavky;

  public List<Sumar> getSumar() {
    return sumar;
  }
  public void setSumar(List<Sumar> sumar) {
    this.sumar = sumar;
  }
  public List<Prijmy> getPrijmy() {
    return prijmy;
  }
  public void setPrijmy(List<Prijmy> prijmy) {
    this.prijmy = prijmy;
  }
  public List<Vydavky> getVydavky() {
    return vydavky;
  }
  public void setVydavky(List<Vydavky> vydavky) {
    this.vydavky = vydavky;
  }
}
