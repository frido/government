package frido.samosprava.view;

import java.util.List;
import java.util.stream.Collectors;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Person;

public class PersonView extends Person {

  private List<OfficeRefView> officesView;
  private List<DepartmentRefView> departmentsView;
  private List<DeputyRefView> deputiesView;
  private List<CommissionRefView> commissionsView;

//  protected String name;
//  protected String firstname;
//  protected String surname;
//  protected String prefix;
//  protected List<Election> elections;
//  protected List<OfficeRef> offices;
//  protected List<DepartmentRef> departments;
//  protected List<DeputyRef> deputies;
//  protected List<CommissionRef> commissions;
//  protected String club;
//  protected String fb;
//  protected String role;

// TODO: premysliet kam premiestnit mapovanie entit do view
  public PersonView(InMemoryCollections collections, Person person) {
    this.id = person.getId();
    this.councilId = person.getCouncilId();
    this.name = person.getName();
    this.firstname = person.getFirstname();
    this.surname = person.getSurname();
    this.prefix = person.getPrefix();
    this.elections = person.getElections();
    this.offices = person.getOffices();
    this.departments = person.getDepartments();
    this.deputies = person.getDeputies();
    this.commissions = person.getCommissions();
    this.club = person.getClub();
    this.fb = person.getFb();
    this.role = person.getRole();

    if (offices != null) {
      officesView = offices.stream().map(x -> new OfficeRefView(collections, x, person)).collect(Collectors.toList());
    }

    if (departments != null) {
      departmentsView = departments.stream().map(x -> new DepartmentRefView(collections, x)).collect(Collectors.toList());
    }

    if (deputies != null) {
      deputiesView = deputies.stream().map(x -> new DeputyRefView(collections, x, person)).collect(Collectors.toList());
    }

    if (commissions != null) {
      commissionsView = commissions.stream().map(x -> new CommissionRefView(collections, x)).collect(Collectors.toList());
    }
  }

  public List<OfficeRefView> getOfficesView() {
    return officesView;
  }

  public void setOfficesView(List<OfficeRefView> officesView) {
    this.officesView = officesView;
  }

  public List<DepartmentRefView> getDepartmentsView() {
    return departmentsView;
  }

  public void setDepartmentsView(List<DepartmentRefView> departmentsView) {
    this.departmentsView = departmentsView;
  }

  public List<DeputyRefView> getDeputiesView() {
    return deputiesView;
  }

  public void setDeputiesView(List<DeputyRefView> deputiesView) {
    this.deputiesView = deputiesView;
  }

  public List<CommissionRefView> getCommissionsView() {
    return commissionsView;
  }

  public void setCommissionsView(List<CommissionRefView> commissionsView) {
    this.commissionsView = commissionsView;
  }

}
