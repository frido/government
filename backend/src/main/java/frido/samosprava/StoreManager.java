package frido.samosprava;

import java.util.HashMap;
import java.util.Map;

public class StoreManager {
    private Map<String, Store> map;

    StoreManager() {
        map = new HashMap<>();
    }

    public void register(String name, Store store){
        map.put(name, store);
    }

    public Store get(String name) {
        return map.get(name);
    }
}
