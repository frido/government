package frido.samosprava;

import org.junit.Assert;
import org.junit.Test;

import frido.samosprava.deprecated.FileStore;
import frido.samosprava.deprecated.StoreManager;

public class StoreManagerTest {

    @Test
    public void register() {
        StoreManager sm = new StoreManager();
        FileStore fs = new FileStore();
        sm.register("xxx", fs);
        Assert.assertEquals(fs, sm.get("xxx"));
    }
}