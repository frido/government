package frido.samosprava.core.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import frido.samosprava.core.store.DataStore;

public class InMemoryCollections {

	private Map<String, InMemoryCollection> data;
	protected ObjectMapper mapper;
	private DataStore store;
	// TODO: link should be parameter of DataStore
	private String link;
	private String[] indexItems;
	
	public InMemoryCollections(DataStore store, String link) {
		this.data = new HashMap<>();
		this.mapper = new ObjectMapper();
		this.store = store;
		this.link = link;
		init();
	}

	private void init() {
		String indexDb = this.store.load(this.link + "index.db");
		indexItems = indexDb.split("\n");
		for (String indexItem : indexItems) {
			addContent(store.load(link + indexItem));
		}
	}
	
	private void addContent(String content) {
		JsonNode tree = null;
		try {
			tree = mapper.readTree(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String collectionName = tree.fieldNames().next();
		ArrayNode list = (ArrayNode) tree.get(collectionName);
		Iterator<JsonNode> i = list.iterator();
		while(i.hasNext()) {
			JsonNode node = i.next();
			InMemoryCollection collection = data.get(collectionName);
			if (collection == null) {
				collection = new InMemoryCollection();
				data.put(collectionName, collection);
			}
			collection.add(node);
		}
	}
	
	public List<String> getIndexItems(){
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
