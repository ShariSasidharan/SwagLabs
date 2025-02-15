package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverContext;


public class CommonMethods {
	
	protected WebDriverWait wait;
	
	public CommonMethods()
	{
		this.wait = new WebDriverWait(DriverContext.Driver, Duration.ofSeconds(Long.parseLong(Constant.TIME_OUT)));
	}
	
	public void staticWait(long time)
	{
		try {
			Thread.sleep(time);
		} catch(Exception e) {
			System.out.println("exception is: "+e);
		}
	}

}
