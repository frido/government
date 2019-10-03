package frido.samosprava.core.entity.view;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Commission;
import frido.samosprava.core.entity.CommissionRef;
import frido.samosprava.core.entity.Council;

public class CommissionRefView extends CommissionRef{
//  private String period;
//  private String from;
//  private String to;
//  private Integer fk;
//  private Boolean chairman;

  protected CouncilView council;
  protected Commission commission;

  public CommissionRefView(InMemoryCollections2 collections, CommissionRef x) {
    id = x.getId();
    councilId = x.getCouncilId();
    period = x.getPeriod();
    from = x.getFrom();
    to = x.getTo();
    fk = x.getFk();
    chairman = x.getChairman();
    Council councilTmp = collections.councils().findById(councilId).get();
    council = new CouncilView(councilTmp);
    commission = councilTmp.getCommissions().stream().filter(d -> d.getId() == fk).findFirst().get();
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
