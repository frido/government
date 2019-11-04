package frido.samosprava.core.entity.view;

import java.util.List;
import java.util.stream.Stream;

import frido.samosprava.core.collection.InMemoryCollections2;
import frido.samosprava.core.entity.Resolution;

public class ResolutionListView {

  private Stream<Resolution> data;

  public ResolutionListView(InMemoryCollections2 collections, Stream<Resolution> list) {
    data = list;
  }

  public Stream<Resolution> getData() {
    return data;
  }

  public void setData(Stream<Resolution> data) {
    this.data = data;
  }

}
