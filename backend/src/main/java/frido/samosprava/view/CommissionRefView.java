package frido.samosprava.view;

import java.util.Optional;

import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.entity.Commission;
import frido.samosprava.entity.CommissionRef;
import frido.samosprava.entity.Council;

public class CommissionRefView extends CommissionRef {
  // private String period;
  // private String from;
  // private String to;
  // private Integer fk;
  // private Boolean chairman;

  protected CouncilView council;
  protected Commission commission;

  public CommissionRefView(InMemoryCollections collections, CommissionRef x) {
    id = x.getId();
    councilId = x.getCouncilId();
    period = x.getPeriod();
    from = x.getFrom();
    to = x.getTo();
    fk = x.getFk();
    chairman = x.getChairman();
    Optional<Council> councilTmp = collections.councils().findById(councilId);
    councilTmp.map(c -> new CouncilView(c)).ifPresent(c -> council = c);
    councilTmp.stream().flatMap(c -> c.getCommissions().stream()).filter(c -> c.getId().equals(fk)).findFirst().ifPresent(c -> commission = c);
  }

  public CouncilView getCouncil() {
    return council;
  }

  public void setCouncil(CouncilView council) {
    this.council = council;
  }

  public Commission getCommission() {
    return commission;
  }

  public void setCommission(Commission commission) {
    this.commission = commission;
  }

}
