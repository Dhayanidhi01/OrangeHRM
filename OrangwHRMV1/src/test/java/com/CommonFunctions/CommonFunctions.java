package com.CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
public static WebDriver driver=null;
public static Properties properties=null;
	public Properties loadProperty() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fileInputStream);
		return properties;
		//property file load. return
		
	}
	

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperty();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverLocation=properties.getProperty("DriverLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver=new ChromeDriver();
		} else if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to(url);
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		
	}
	
}
