package frido.samosprava.core.entity.view;

import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.entity.Council;
import frido.samosprava.core.entity.DeputyRef;
import frido.samosprava.core.entity.Election;
import frido.samosprava.core.entity.Person;

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
