package frido.samosprava.core.entity;

import java.util.List;

public class Person  extends Record{
  private String name;
  private String firstname;
  private String surname;
  private String prefix;
  private List<Election> elections;
  private List<CommissionRef> commissions;
  private List<DepartmentRef> departments;
  private List<OfficeRef> offices;
  private List<DeputyRef> deputies;
  private String club;
  private String fb;
  private String role;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }
  public List<Election> getElections() {
    return elections;
  }
  public void setElections(List<Election> elections) {
    this.elections = elections;
  }
  public List<CommissionRef> getCommissions() {
    return commissions;
  }
  public void setCommissions(List<CommissionRef> commissions) {
    this.commissions = commissions;
  }
  public List<DepartmentRef> getDepartments() {
    return departments;
  }
  public void setDepartments(List<DepartmentRef> departments) {
    this.departments = departments;
  }
  public List<OfficeRef> getOffices() {
    return offices;
  }
  public void setOffices(List<OfficeRef> offices) {
    this.offices = offices;
  }
  public String getClub() {
    return club;
  }
  public void setClub(String club) {
    this.club = club;
  }
  public String getFb() {
    return fb;
  }
  public void setFb(String fb) {
    this.fb = fb;
  }
  public List<DeputyRef> getDeputies() {
    return deputies;
  }
  public void setDeputies(List<DeputyRef> deputies) {
    this.deputies = deputies;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
}
