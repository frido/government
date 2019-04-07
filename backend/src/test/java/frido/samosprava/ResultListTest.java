package frido.samosprava;

import frido.samosprava.interpellation.Interpellation;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ResultListTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void getList() throws IOException {
        MemoryStore fs = new MemoryStore(new FileStore(testFile));
        ResultList<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class, x -> x.getSpolok() == 1);
        Assert.assertEquals(8, result.getData().size());
    }
}