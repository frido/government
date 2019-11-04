package frido.samosprava.entity;

import java.util.List;

public class Department {
  private Integer id;
  private String name;
  private List<DepartmentRole> roles;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<DepartmentRole> getRoles() {
    return roles;
  }
  public void setRoles(List<DepartmentRole> roles) {
    this.roles = roles;
  }
}
