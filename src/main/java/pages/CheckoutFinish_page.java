package pages;

import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.CommonMethods;

public class CheckoutFinish_page {
	
	public CheckoutFinish_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	CommonMethods commonmethods = new CommonMethods();

		
	public void verifyCheckoutFinish()
	{
		
	}

}
