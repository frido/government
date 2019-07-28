package frido.samosprava.api;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;
import org.junit.jupiter.api.BeforeAll;

public class ControllerTest {

    static InMemoryCollections collections;

    @BeforeAll
    static void init(){
        WebClient client = new JdkHttpClient();
        DataStore store = new HttpStore(client, "https://frido.github.io/government/db/");
        collections = new InMemoryCollections(store);
    }
}
