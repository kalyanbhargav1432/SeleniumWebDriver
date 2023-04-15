package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

public class SeleniumReadAndWrite {
	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		// To call the methods
		// setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}

//To create a method for setting browser
	public static void setBrowser() {
		browser = "Chrome";
	}

	// To create a method for setting browser configuration
	public static void setBrowserConfig() {
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO T470\\eclipse-workspace\\Selenium\\SeleniumWebDriver\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	// To create a method for Run the test
	public static void runTest() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();

	}

}