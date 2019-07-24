package frido.samosprava.store.old;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.*;

// TODO: invalidate cache after some time
public class MemoryStore implements Store {

    private Store store;

    private List<ObjectNode> cache;

    public MemoryStore(Store store) {
        this.store = store;
    }


    @Override
    public List<ObjectNode> getAll() {
        if (cache == null) {
            initializeCache();
        }
        return Collections.unmodifiableList(cache);
    }

    private void initializeCache() {
        this.cache = new ArrayList<>();
        store.getAll().forEach(e -> this.cache.add(e));
    }
}
