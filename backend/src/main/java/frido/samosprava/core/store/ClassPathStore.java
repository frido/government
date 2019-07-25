package frido.samosprava.core.store;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

@Deprecated
public class ClassPathStore implements DataStore{

	public String load(String name) {
		ClassPathResource cpr = new ClassPathResource(name);
		byte[] bdata;
		try {
			bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
			return new String(bdata, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
