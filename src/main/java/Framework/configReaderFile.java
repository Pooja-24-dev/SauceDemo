package Framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configReaderFile {
	
	private Properties properties;
	
	String propertyFilePath = "\\src\\test\\resources\\config\\";

	public configReaderFile(String actualFileName) {
		String filePath = System.getProperty("user.dir") +propertyFilePath + actualFileName + ".properties";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration property file not found at "+filePath);
		}
	}
	
	public String getPropertyFileConfig(String propertyName) {
		return properties.getProperty(propertyName);
	}
}
