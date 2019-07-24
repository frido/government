package frido.samosprava;

import org.junit.Assert;
import org.junit.Test;

import frido.samosprava.deprecated.FileStore;

import java.io.IOException;

public class FileStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getAll() throws IOException {
        FileStore fs = new FileStore(testFile);
        Assert.assertEquals(8, fs.getAll().size());
    }
}