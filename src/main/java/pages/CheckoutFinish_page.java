package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.CommonMethods;

public class CheckoutFinish_page {
	
	public CheckoutFinish_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}

	private @FindBy(xpath="//h2[normalize-space()='Thank you for your order!']")
	WebElement success_txt;
		
	public String verifyCheckoutFinish()
	{
		return success_txt.getText();
	}

}
