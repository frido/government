package frido.samosprava.store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class InMemoryCollections {

	private Map<String, InMemoryCollection> data;
	protected ObjectMapper mapper;
	
	public InMemoryCollections() {
		this.data = new HashMap<>();
		this.mapper = new ObjectMapper();
	}

	public void addContent(String content) throws IOException {
		JsonNode tree = mapper.readTree(content);
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
	
	public InMemoryCollection collection(String collectionName) {
		return this.data.get(collectionName);
	}
	
}
