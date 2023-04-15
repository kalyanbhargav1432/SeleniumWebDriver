package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();

	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}

	//Read the file through properties file

	public static void readPropertiesFile() {

		try {
			InputStream input = new FileInputStream(
					"C:\\Users\\LENOVO T470\\eclipse-workspace\\Selenium\\SeleniumWebDriver\\src\\main\\java\\config\\config.properties");
			prop.load(input);

			// Call the selenium read and write class

			SeleniumReadAndWrite.browser = prop.getProperty("browser");
			System.out.println(SeleniumReadAndWrite.browser);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Write the file through properties file

	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream(
					"C:\\Users\\LENOVO T470\\eclipse-workspace\\Selenium\\SeleniumWebDriver\\src\\main\\java\\config\\config.properties");

			// write properties after run the code it should visible in config file

			prop.setProperty("name", "kalyan");
			prop.store(output, null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
