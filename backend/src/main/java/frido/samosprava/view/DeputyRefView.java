package frido.samosprava.view;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Council;
import frido.samosprava.entity.DeputyRef;
import frido.samosprava.entity.Election;
import frido.samosprava.entity.Person;

public class DeputyRefView extends DeputyRef {

  protected CouncilView council;
  protected Election election;

  public DeputyRefView(InMemoryCollections collections, DeputyRef ref, Person person) {
    id = ref.getId();
    councilId = ref.getCouncilId();
    period = ref.getPeriod();
    from = ref.getFrom();
    to = ref.getTo();
    electionId = ref.getElectionId();

    Council councilTmp = collections.councils().findById(councilId).get();
    council = new CouncilView(councilTmp);
    election = person.getElections().stream().filter(x -> x.getId() == electionId).findFirst().get();
  }
//  private String period;
//  private String from;
//  private String to;
//  private Integer electionId;

  public CouncilView getCouncil() {
    return council;
  }

  public void setCouncil(CouncilView council) {
    this.council = council;
  }

  public Election getElection() {
    return election;
  }

  public void setElection(Election election) {
    this.election = election;
  }


}
