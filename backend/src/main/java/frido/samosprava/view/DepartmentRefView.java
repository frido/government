package frido.samosprava.view;

import java.util.Optional;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Council;
import frido.samosprava.entity.Department;
import frido.samosprava.entity.DepartmentRef;
import frido.samosprava.entity.DepartmentRole;

public class DepartmentRefView extends DepartmentRef {

  // protected String period;
  // protected String from;
  // protected String to;
  // protected Integer fk;
  // protected Integer role;

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

    Optional<Council> councilTmp = collections.councils().findById(councilId);
    councilTmp.map(c -> new CouncilView(c)).ifPresent(c -> council = c);

    Optional<Department> departmentTmp = councilTmp.stream().flatMap(c -> c.getDepartments().stream()).filter(c -> c.getId().equals(fk)).findFirst();
    departmentTmp.ifPresent(d -> department = d);
    
    departmentTmp.stream().flatMap(d -> d.getRoles().stream()).filter(r -> r.getId().equals(roleId)).findFirst().ifPresent(r -> role = r);
    
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
