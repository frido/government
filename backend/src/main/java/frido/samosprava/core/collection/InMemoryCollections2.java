package frido.samosprava.core.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import frido.samosprava.core.entity.BudgetList;
import frido.samosprava.core.entity.CouncilList;
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
  private InMemoryCouncilCollection councilCollection;
  private InMemoryBudgetCollection budgetCollection;


  public InMemoryCollections2(DataStore store) {
    this.mapper = new ObjectMapper();
    this.store = store;
    init();
  }

  private void init() {
    String indexDb = this.store.load("index2.db");
    indexItems = indexDb.split("\n");
    resolutionCollection = new InMemoryResolutionCollection();
    personCollection = new InMemoryPersonCollection();
    meetingCollection = new InMemoryMeetingCollection();
    councilCollection = new InMemoryCouncilCollection();
    budgetCollection = new InMemoryBudgetCollection();
    for (String indexItem : indexItems) {
      String collectionName = indexItem.substring(0, indexItem.indexOf(".json")).split("-")[0];
      System.out.println(collectionName);
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
      if("councils".equals(collectionName)){
        System.out.println(indexItem);
        initCouncils(store.load(indexItem));
      }
      if("budget".equals(collectionName)){
        System.out.println(indexItem);
        initBudget(store.load(indexItem));
      }

    }
  }

  private void initResolutions(String content) {
    ResolutionList list;
    try {
      list = mapper.readValue(content, ResolutionList.class);
      resolutionCollection.addAll(list.getResolutions());;
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initPersons(String content) {
    PersonList list;
    try {
      list = mapper.readValue(content, PersonList.class);
      personCollection.addAll(list.getPersons());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initMeetings(String content) {
    MeetingList list;
    try {
      list = mapper.readValue(content, MeetingList.class);
      meetingCollection.addAll(list.getMeetings());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initCouncils(String content) {
    CouncilList list;
    try {
      list = mapper.readValue(content, CouncilList.class);
      councilCollection.addAll(list.getCouncils());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void initBudget(String content) {
    BudgetList list;
    try {
      list = mapper.readValue(content, BudgetList.class);
      budgetCollection.addAll(list.getBudget());
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

  public InMemoryCouncilCollection councils() {
    return councilCollection;
  }

  public InMemoryBudgetCollection budgets() {
    return budgetCollection;
  }

  public void reload() {
    init();
  }

}
