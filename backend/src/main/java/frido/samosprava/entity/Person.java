package frido.samosprava.entity;

import java.util.List;

public class Person  extends Record{
  protected String name;
  protected String firstname;
  protected String surname;
  protected String prefix;
  protected String suffix;
  protected List<Election> elections;
  protected List<OfficeRef> offices;
  protected List<DepartmentRef> departments;
  protected List<DeputyRef> deputies;
  protected List<CommissionRef> commissions;
  protected String club;
  protected String fb;
  protected String role;

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
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }
}
