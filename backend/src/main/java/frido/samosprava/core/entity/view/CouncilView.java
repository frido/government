package frido.samosprava.core.entity.view;

import frido.samosprava.core.entity.Council;

public class CouncilView {

  private Integer id;
  private String key;
  private String name;
  private String title;
  private String mayorTitle;
//  private Plat plat;
//  private List<String> menu;
//  private List<Commission> commissions;
//  private List<Office> offices;
//  private List<Department> departments;
//  private Facebook fb;

  public CouncilView(Council c) {
    id = c.getId();
    key = c.getKey();
    name = c.getName();
    title = c.getTitle();
    mayorTitle = c.getMayorTitle();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

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

}
