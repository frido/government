package frido.samosprava.store;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import frido.samosprava.ApplicationException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Deprecated
public class ClassPathStore implements DataStore {

  public String load(String name) {
    ClassPathResource cpr = new ClassPathResource(name);
    byte[] bdata;
    try {
      bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
      return new String(bdata, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new ApplicationException(e);
    }
  }

}
