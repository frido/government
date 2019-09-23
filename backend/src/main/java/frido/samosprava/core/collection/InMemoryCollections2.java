package frido.samosprava.core.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import frido.samosprava.core.entity.MeetingList;
import frido.samosprava.core.entity.PersonList;
import frido.samosprava.core.entity.ResolutionList;
import frido.samosprava.core.store.DataStore;

public class InMemoryCollections2 {

  private final ObjectMapper mapper;
  private final DataStore store;
  private String[] indexItems;

  private InMemoryResolutionCollection resolutionCollection;
  private InMemoryPersonCollection personCollection;
  private InMemoryMeetingCollection meetingCollection;


  public InMemoryCollections2(DataStore store) {
    this.mapper = new ObjectMapper();
    this.store = store;
    init();
  }

  private void init() {
    String indexDb = this.store.load("index2.db");
    indexItems = indexDb.split("\n");
    for (String indexItem : indexItems) {
      String collectionName = indexItem.split("-")[0];
      if("resolutions".equals(collectionName)){
        System.out.println(indexItem);
        initResolutions(store.load(indexItem));
      }
      if("persons".equals(collectionName)){
        System.out.println(indexItem);
        initPersons(store.load(indexItem));
      }
      if("meetings".equals(collectionName)){
        System.out.println(indexItem);
        initMeetings(store.load(indexItem));
      }

    }
  }

  private void initResolutions(String content) {
    ResolutionList list;
    System.out.println(content);
    try {
      list = mapper.readValue(content, ResolutionList.class);
      resolutionCollection = new InMemoryResolutionCollection(list.getResolutions());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initPersons(String content) {
    PersonList list;
    System.out.println(content);
    try {
      list = mapper.readValue(content, PersonList.class);
      personCollection = new InMemoryPersonCollection(list.getPersons());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initMeetings(String content) {
    MeetingList list;
    System.out.println(content);
    try {
      list = mapper.readValue(content, MeetingList.class);
      meetingCollection = new InMemoryMeetingCollection(list.getMeetings());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<String> getIndexItems() {
    return Arrays.asList(indexItems);
  }

  public InMemoryResolutionCollection resolutions() {
    return resolutionCollection;
  }

  public InMemoryPersonCollection persons() {
    return personCollection;
  }

  public InMemoryMeetingCollection meetings() {
    return meetingCollection;
  }

  public void reload() {
    init();
  }

}
