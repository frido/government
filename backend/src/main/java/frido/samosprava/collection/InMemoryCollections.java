package frido.samosprava.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import frido.samosprava.entity.BudgetList;
import frido.samosprava.entity.CouncilList;
import frido.samosprava.entity.MeetingList;
import frido.samosprava.entity.PersonList;
import frido.samosprava.entity.ResolutionList;
import frido.samosprava.store.DataStore;

public class InMemoryCollections {

  private static final Logger log = LoggerFactory.getLogger(InMemoryCollections.class);

  private final ObjectMapper mapper;
  private final DataStore store;
  private String[] indexItems;

  private InMemoryResolutionCollection resolutionCollection;
  private InMemoryPersonCollection personCollection;
  private InMemoryMeetingCollection meetingCollection;
  private InMemoryCouncilCollection councilCollection;
  private InMemoryBudgetCollection budgetCollection;


  public InMemoryCollections(DataStore store) {
    this.mapper = new ObjectMapper();
    mapper.registerModule(new JSR310Module());
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
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
      if("resolutions".equals(collectionName)){
        initResolutions(store.load(indexItem));
      }
      if("persons".equals(collectionName)){
        initPersons(store.load(indexItem));
      }
      if("meetings".equals(collectionName)){
        initMeetings(store.load(indexItem));
      }
      if("councils".equals(collectionName)){
        initCouncils(store.load(indexItem));
      }
      if("budget".equals(collectionName)){
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
      log.error("initResolutions", e);
    }
  }

  private void initPersons(String content) {
    PersonList list;
    try {
      list = mapper.readValue(content, PersonList.class);
      personCollection.addAll(list.getPersons());
    } catch (IOException e) {
      log.error("initPersons", e);
    }
  }

  private void initMeetings(String content) {
    MeetingList list;
    try {
      list = mapper.readValue(content, MeetingList.class);
      meetingCollection.addAll(list.getMeetings());
    } catch (IOException e) {
      log.error("initMeetings", e);
    }
  }

  private void initCouncils(String content) {
    CouncilList list;
    try {
      list = mapper.readValue(content, CouncilList.class);
      councilCollection.addAll(list.getCouncils());
    } catch (IOException e) {
      log.error("initCouncils", e);
    }
  }

  private void initBudget(String content) {
    BudgetList list;
    try {
      list = mapper.readValue(content, BudgetList.class);
      budgetCollection.addAll(list.getBudget());
    } catch (IOException e) {
      log.error("initBudget", e);
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
