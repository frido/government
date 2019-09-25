package frido.samosprava.core.entity.view;

import java.util.List;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.CommissionRef;
import frido.samosprava.core.entity.DepartmentRef;
import frido.samosprava.core.entity.DeputyRef;
import frido.samosprava.core.entity.Election;
import frido.samosprava.core.entity.OfficeRef;
import frido.samosprava.core.entity.Person;

public class PersonView {

  private Integer id;
  private String name;
  private String firstname;
  private String surname;
  private String prefix;
  private List<Election> elections;
  private List<OfficeRef> offices;
  private List<DepartmentRef> departments;
  private List<DeputyRef> deputies;
  private List<CommissionRef> commissions;
  private String club;
  private String fb;
  private String role;

  public PersonView(InMemoryCollections2 collections, Person person) {
    this.id = person.getId();
    this.name = person.getName();
    // TODO: TO BE CONTINUE ...

  }

}
