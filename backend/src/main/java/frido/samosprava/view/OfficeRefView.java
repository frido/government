package frido.samosprava.view;

import java.util.Optional;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Council;
import frido.samosprava.entity.Election;
import frido.samosprava.entity.Office;
import frido.samosprava.entity.OfficeRef;
import frido.samosprava.entity.Person;

public class OfficeRefView extends OfficeRef{

//  id
//  councilId
//  period;
//  from;
//  to;
//  roleId;
//  electionId;

  protected CouncilView council;
  protected Office office;
  protected Election election;

  public OfficeRefView(InMemoryCollections collections, OfficeRef officeRef, Person person) {
    id = officeRef.getId();
    councilId = officeRef.getCouncilId();
    period = officeRef.getPeriod();
    from = officeRef.getFrom();
    to = officeRef.getTo();
    roleId = officeRef.getRoleId();
    electionId = officeRef.getElectionId();

    collections.councils().findById(councilId).map(c -> new CouncilView(c)).ifPresent(c -> council = c);

    collections.councils().findOfficeById(councilId, roleId).ifPresent(o -> office = o);

    person.getElections().stream().filter(e -> e.getId().equals(electionId)).findFirst().ifPresent(e -> election = e);
  }

  public CouncilView getCouncil() {
    return council;
  }

  public void setCouncil(CouncilView council) {
    this.council = council;
  }

  public Office getOffice() {
    return office;
  }

  public void setOffice(Office office) {
    this.office = office;
  }

  public Election getElection() {
    return election;
  }

  public void setElection(Election election) {
    this.election = election;
  }

}
