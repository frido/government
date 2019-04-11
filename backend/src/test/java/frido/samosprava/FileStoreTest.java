package frido.samosprava;

import frido.samosprava.store.FileStore;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getAll() throws IOException {
        FileStore fs = new FileStore(testFile);
        Assert.assertEquals(8, fs.getAll().size());
    }
}