package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

// TODO: make wrapper MemoryStore
public class FileStore implements Store {

    private String[] fileNames;
    protected ObjectMapper mapper;

    public FileStore(String... fileNames){
        this.fileNames = fileNames;
        this.mapper = new ObjectMapper();
    }

    public Map<Integer, ObjectNode> load() {
        Map<Integer, ObjectNode> data = new HashMap<>();
        for (String fileName : fileNames) {
            try {
                ClassPathResource cpr = new ClassPathResource(fileName);
                InputStream stream = cpr.getInputStream();
                JsonNode root = mapper.readTree(stream);
                for (Iterator<JsonNode> it = root.get("data").elements(); it.hasNext(); ) {
                    ObjectNode element = (ObjectNode) it.next();
                    data.put(element.get("id").asInt(), element);
                }
                stream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Override
    public ObjectNode getById(int id) {
        return load().get(id);
    }

    @Override
    public List<ObjectNode> getAll() {
        return Collections.unmodifiableList(new ArrayList<>(load().values()));
    }
}
