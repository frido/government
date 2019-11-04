package frido.samosprava.view;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Council;
import frido.samosprava.entity.Department;
import frido.samosprava.entity.DepartmentRef;
import frido.samosprava.entity.DepartmentRole;

public class DepartmentRefView extends DepartmentRef{

//protected String period;
//protected String from;
//protected String to;
//protected Integer fk;
//protected Integer role;

  protected CouncilView council;
  protected Department department;
  protected DepartmentRole role;

  public DepartmentRefView(InMemoryCollections collections, DepartmentRef ref) {
    id = ref.getId();
    councilId = ref.getCouncilId();
    period = ref.getPeriod();
    from = ref.getFrom();
    to = ref.getTo();
    fk = ref.getFk();
    roleId = ref.getRoleId();

    Council councilTmp = collections.councils().findById(councilId).get();
    council = new CouncilView(councilTmp);
    department = councilTmp.getDepartments().stream().filter(d -> d.getId() == fk).findFirst().get();
    role = department.getRoles().stream().filter(x -> x.getId() == roleId).findFirst().get();
  }

  public CouncilView getCouncil() {
    return council;
  }

  public void setCouncil(CouncilView council) {
    this.council = council;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public DepartmentRole getRole() {
    return role;
  }

  public void setRole(DepartmentRole role) {
    this.role = role;
  }

}
