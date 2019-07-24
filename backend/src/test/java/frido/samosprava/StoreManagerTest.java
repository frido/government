package frido.samosprava;

import frido.samosprava.store.old.FileStore;
import frido.samosprava.store.old.StoreManager;

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