package frido.samosprava.core.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import frido.samosprava.api.ApplicationException;
import frido.samosprava.core.store.DataStore;

public class InMemoryCollections {

  private Map<String, InMemoryCollection> data;
  private final ObjectMapper mapper;
  private final DataStore store;
  private String[] indexItems;

  public InMemoryCollections(DataStore store) {
    this.data = new HashMap<>();
    this.mapper = new ObjectMapper();
    this.store = store;
//    init();
  }

  private void init() {
    String indexDb = this.store.load("index2.db");
    indexItems = indexDb.split("\n");
    for (String indexItem : indexItems) {
      addContent(store.load(indexItem));
    }
  }

  private void addContent(String content) {
    JsonNode tree = null;
    try {
      tree = mapper.readTree(content);
    } catch (IOException e) {
      throw new ApplicationException(e);
    }
    String collectionName = tree.fieldNames().next();
    ArrayNode list = (ArrayNode) tree.get(collectionName);
    Iterator<JsonNode> item = list.iterator();
    while (item.hasNext()) {
      JsonNode node = item.next();
      InMemoryCollection collection = data.get(collectionName);
      if (collection == null) {
        collection = new InMemoryCollection();
        data.put(collectionName, collection);
      }
      collection.add(node);
    }
  }

  public List<String> getIndexItems() {
    return Arrays.asList(indexItems);
  }

  public Set<String> collections() {
    return this.data.keySet();
  }

  public InMemoryCollection collection(String collectionName) {
    return this.data.get(collectionName);
  }

  public void reload() {
    this.data = new HashMap<>();
    init();
  }

}
