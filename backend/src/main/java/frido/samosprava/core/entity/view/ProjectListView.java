package frido.samosprava.core.entity.view;

import java.util.List;

import frido.samosprava.core.collection.InMemoryCollections2;

public class ProjectListView {

  private List<ProjectView> data;

  public ProjectListView(InMemoryCollections2 collections, List<ProjectView> list) {
    data = list;
  }

  public List<ProjectView> getData() {
    return data;
  }

  public void setData(List<ProjectView> data) {
    this.data = data;
  }

}
