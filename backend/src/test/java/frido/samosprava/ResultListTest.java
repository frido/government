package frido.samosprava;

import frido.samosprava.entity.ResponseList;
import frido.samosprava.entity.ResponseObject;
import frido.samosprava.interpellation.Interpellation;
import frido.samosprava.store.old.FileStore;
import frido.samosprava.store.old.MemoryStore;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class ResultListTest {
//
//    private static String testFile = "ba-petrzalka-interpelacie.json";
//
//    private static MemoryStore fs;
//
//    @BeforeClass
//    public static void initialize(){
//        fs = new MemoryStore(new FileStore(testFile));
//    }
//
//    @Test
//    public void buildList() throws IOException {
//        ResponseList<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class).buildList();
//        Assert.assertEquals(8, result.getData().size());
//    }
//
//    @Test
//    public void buildFilter() throws IOException {
//        ResponseList<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class)
//                .filter(x -> x.getSpolok() == 1)
//                .skip(3)
//                .limit(3)
//                .buildList();
//        Assert.assertEquals(3, result.getData().size());
//        Assert.assertEquals(4, result.getData().get(0).getId());
//        Assert.assertEquals(5, result.getData().get(1).getId());
//        Assert.assertEquals(6, result.getData().get(2).getId());
//
//    }
//
//    @Test
//    public void buildObject() throws IOException {
//        ResponseObject<Interpellation> result = new ResultList<Interpellation>(fs, Interpellation.class)
//                .filter(x -> x.getId() == 3)
//                .buildObject();
//        Assert.assertEquals(3, result.getData().getId());
//    }
}