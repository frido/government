package frido.samosprava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import frido.samosprava.entity.Idable;
import frido.samosprava.store.DataStore;

public abstract class BaseService<T extends Idable> {
    protected Map<Integer, T> data;
    private String[] fileNames;
    protected ObjectMapper mapper = new ObjectMapper();
    
    @Autowired
    DataStore store;

    public BaseService(String... fileNames){
        this.fileNames = fileNames;    
        this.data = new HashMap<>();
    }

    public void load() throws IOException {
        //ClassLoader classLoader = getClass().getClassLoader();
        for (String fileName : fileNames) {
            String content = store.load(fileName);
            for (T u : parse(content)) {
                this.data.put(u.getId(), u);
            }    
        }
    }

    public abstract List<T> parse(String content) throws JsonParseException, JsonMappingException, IOException;

    public List<T> findAll() {
        return new ArrayList<>(this.data.values());
    }

    public T findById(int id) {
        return this.data.get(id);
    }
}