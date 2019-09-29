package frido.samosprava.core.entity.view;

import java.util.List;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Resolution;

public class ResolutionListView {

  private List<Resolution> data;

  public ResolutionListView(InMemoryCollections2 collections, List<Resolution> list) {
    data = list;
  }

  public List<Resolution> getData() {
    return data;
  }

  public void setData(List<Resolution> data) {
    this.data = data;
  }

}
