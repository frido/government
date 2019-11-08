package frido.samosprava.view;

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

    Council councilTmp = collections.councils().findById(councilId).get();
    council = new CouncilView(councilTmp);
    office = collections.councils().findOfficeById(councilId, roleId).get();
    if (electionId != null)  {
      election = person.getElections().stream().filter(x -> x.getId() == electionId).findFirst().get();
    }
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