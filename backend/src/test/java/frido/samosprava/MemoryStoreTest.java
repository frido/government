package frido.samosprava;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class MemoryStoreTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getAll() throws IOException {
        MemoryStore ms = new MemoryStore(new FileStore(testFile));
        Assert.assertEquals(8, ms.getAll().size());
    }
}