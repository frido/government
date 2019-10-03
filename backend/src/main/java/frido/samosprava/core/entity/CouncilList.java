package frido.samosprava.core.entity;

import java.util.List;

public class CouncilList {
  private List<Council> councils;

  public List<Council> getCouncils() {
    return councils;
  }

  public void setResolutions(List<Council> councils) {
    this.councils = councils;
  }
}
