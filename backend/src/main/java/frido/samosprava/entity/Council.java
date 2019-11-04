package frido.samosprava.entity;

import java.util.ArrayList;
import java.util.List;

public class Council extends Record {
  private String key;
  private String name;
  private String title;
  private String mayorTitle;
  private Plat plat;
  private List<String> menu;
  private List<Commission> commissions;
  private List<Office> offices;
  private List<Department> departments;
  private Facebook fb;

  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getMayorTitle() {
    return mayorTitle;
  }
  public void setMayorTitle(String mayorTitle) {
    this.mayorTitle = mayorTitle;
  }
  public Plat getPlat() {
    return plat;
  }
  public void setPlat(Plat plat) {
    this.plat = plat;
  }
  public List<String> getMenu() {
    return menu;
  }
  public void setMenu(List<String> menu) {
    this.menu = menu;
  }
  public List<Commission> getCommissions() {
    return commissions;
  }
  public void setCommissions(List<Commission> commissions) {
    this.commissions = commissions;
  }
  public List<Office> getOffices() {
    if (offices == null) {
      return new ArrayList<>();
    }
    return offices;
  }
  public void setOffices(List<Office> offices) {
    this.offices = offices;
  }
  public List<Department> getDepartments() {
    return departments;
  }
  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }
  public Facebook getFb() {
    return fb;
  }
  public void setFb(Facebook fb) {
    this.fb = fb;
  }
}
