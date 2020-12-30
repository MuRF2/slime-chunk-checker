package code;

import java.io.InputStream;

final public class ResourceLoader {
	
	public static InputStream load(String path) {
		InputStream input = new ResourceLoader.class.getResourceAsStream(path);
	}
}
