package frido.samosprava;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.store.ClassPathStore;
import frido.samosprava.store.DataStore;
import frido.samosprava.store.HttpStore;

public class NewDesign {
	
	protected ObjectMapper mapper = new ObjectMapper();

//	@Test
//	public void test() throws IOException {
//		InMemoryCollections collections = new InMemoryCollections();
//		DataStore store = new HttpStore(new JdkHttpClient());
//		String content = store.load("https://frido.github.io/government/db/petrzalka/ba-petrzalka-osoby.json");
//		collections.addContent(content);
//		//List<JsonNode> out = collections.collection("data");
//	}

}
