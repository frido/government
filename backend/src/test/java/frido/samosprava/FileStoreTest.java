package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getById() throws IOException {
        FileStore fs = new FileStore(testFile);
        JsonNode result = fs.getById(1);
        Assert.assertEquals(1, result.get("id").asInt());
    }

    @Test
    public void getAll() throws IOException {
        FileStore fs = new FileStore(testFile);
        Assert.assertEquals(8, fs.getAll().size());
    }
}