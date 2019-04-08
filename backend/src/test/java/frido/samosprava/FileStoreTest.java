package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getAll() throws IOException {
        FileStore fs = new FileStore(testFile);
        Assert.assertEquals(8, fs.getAll().size());
    }
}