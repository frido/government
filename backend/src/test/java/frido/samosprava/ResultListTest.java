package frido.samosprava;

import frido.samosprava.interpellation.Interpellation;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ResultListTest {

    private String testFile = "ba-petrzalka-interpelacie.json";

    @Test
    public void buildAll() throws IOException {
        MemoryStore fs = new MemoryStore(new FileStore(testFile));
        List<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class).build();
        Assert.assertEquals(8, result.size());
    }

    @Test
    public void buildFilter() throws IOException {
        MemoryStore fs = new MemoryStore(new FileStore(testFile));
        List<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class)
                .filter(x -> x.getSpolok() == 1)
                .skip(3)
                .limit(3)
                .build();
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(4, result.get(0).getId());
        Assert.assertEquals(5, result.get(1).getId());
        Assert.assertEquals(6, result.get(2).getId());

    }
}