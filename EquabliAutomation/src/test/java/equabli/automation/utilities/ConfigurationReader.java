package equabli.automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	private static final Properties properties = new Properties();

	static {
		try {
			// LOAD GENERAL PROPERTIES
			String path = "configuration.properties";
			FileInputStream file = new FileInputStream(path);

			properties.load(file);

			// LOAD ENVIRONMENT SPECIFIC PROPERTIES
			if (System.getProperty("env") != null) {
				path = "src/test/resources/env/" + System.getProperty("env") + ".properties";
			} else {
				path = "src/test/resources/env/" + properties.getProperty("env") + ".properties";
			}
			file = new FileInputStream(path);
			properties.load(file);

			file.close();
		} catch (IOException e) {
			System.out.println("Properties File not found");
		}
	}

	public static String getProperty(String keyWord) {
		return properties.getProperty(keyWord);
	}

}
