package equabli.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaders {

	public static String readFile(String filePath, String key) throws IOException {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);

		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);

	}
}
