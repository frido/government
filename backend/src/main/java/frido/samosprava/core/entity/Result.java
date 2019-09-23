package frido.samosprava.core.entity;

import java.util.List;

public class Result {
  private String title;
  private List<String> descriptions;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<String> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }
}
