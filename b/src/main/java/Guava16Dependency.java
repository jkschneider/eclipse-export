import java.nio.file.AccessMode;

import com.google.common.base.Converter;
import com.google.common.base.Enums;

public class Guava16Dependency {
	public static void main(String[] args) {
		// the converter class is introduced guava 16
		Converter<String, AccessMode> converter = Enums.stringConverter(AccessMode.class);
	}
}