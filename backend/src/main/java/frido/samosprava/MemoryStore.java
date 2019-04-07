package frido.samosprava;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.*;

// TODO: invalidate cache after some time
public class MemoryStore implements Store {

    private Store store;

    private Map<Integer, ObjectNode> cache;

    MemoryStore(Store store) {
        this.store = store;
    }

    @Override
    public ObjectNode getById(int id) {
        if (cache == null) {
            initializeCache();
        }
        return cache.get(id);
    }

    @Override
    public List<ObjectNode> getAll() {
        if (cache == null) {
            initializeCache();
        }
        return Collections.unmodifiableList(new ArrayList<>(cache.values()));
    }

    private void initializeCache() {
        this.cache = new HashMap<>();
        store.getAll().forEach(e -> this.cache.put(e.get("id").asInt(), e));
    }
}
