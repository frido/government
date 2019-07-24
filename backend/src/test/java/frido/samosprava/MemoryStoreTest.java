package frido.samosprava;

import org.junit.Assert;
import org.junit.Test;

import frido.samosprava.deprecated.FileStore;
import frido.samosprava.deprecated.MemoryStore;

import java.io.IOException;

public class MemoryStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getAll() throws IOException {
        MemoryStore ms = new MemoryStore(new FileStore(testFile));
        Assert.assertEquals(8, ms.getAll().size());
    }
}