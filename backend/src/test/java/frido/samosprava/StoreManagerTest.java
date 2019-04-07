package frido.samosprava;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreManagerTest {

    @Test
    public void register() {
        StoreManager sm = new StoreManager();
        FileStore fs = new FileStore();
        sm.register("xxx", fs);
        Assert.assertEquals(fs, sm.get("xxx"));
    }
}