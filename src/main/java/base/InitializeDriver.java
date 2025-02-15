package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.UtilityFetchProperty;

public class InitializeDriver {
	
	@Before	
		
	public static void InitDriver() throws IOException {
		
		WebDriver driver = null;
		
		String browserName = UtilityFetchProperty.fetchPropertyValue("browser");
		
		switch(browserName) {
		
		case "chrome":
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--password-store-basic");
		    driver=new ChromeDriver(options);
		    break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
			driver=new ChromeDriver();
			break;		    
		
		}
		
		DriverContext.setDriver(driver);
		DriverContext.Driver.get(UtilityFetchProperty.fetchPropertyValue("url"));
		DriverContext.Driver.manage().window().maximize();
		
	}
	
	@After
	
	public static void quitDriver()
	{
		DriverContext.Driver.quit();
	}
		

}
