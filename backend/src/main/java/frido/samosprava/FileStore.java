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

    public List<ObjectNode> load() {
        List<ObjectNode> data = new ArrayList<>();
        for (String fileName : fileNames) {
            try {
                ClassPathResource cpr = new ClassPathResource(fileName);
                InputStream stream = cpr.getInputStream();
                JsonNode root = mapper.readTree(stream);
                for (Iterator<JsonNode> it = root.get("data").elements(); it.hasNext(); ) {
                    data.add((ObjectNode) it.next());
                }
                stream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Override
    public List<ObjectNode> getAll() {
        return Collections.unmodifiableList(load());
    }
}
