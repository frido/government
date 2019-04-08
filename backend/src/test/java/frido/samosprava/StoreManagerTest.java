package frido.samosprava;

import frido.samosprava.store.FileStore;
import frido.samosprava.store.StoreManager;
import org.junit.Assert;
import org.junit.Test;

public class StoreManagerTest {

    @Test
    public void register() {
        StoreManager sm = new StoreManager();
        FileStore fs = new FileStore();
        sm.register("xxx", fs);
        Assert.assertEquals(fs, sm.get("xxx"));
    }
}