package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MemoryStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getById() throws IOException {
        MemoryStore ms = new MemoryStore(new FileStore(testFile));
        JsonNode result = ms.getById(1);
        Assert.assertEquals(1, result.get("id").asInt());
    }

    @Test
    public void getAll() throws IOException {
        MemoryStore ms = new MemoryStore(new FileStore(testFile));
        Assert.assertEquals(8, ms.getAll().size());
    }
}