package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.CommonMethods;

public class CheckoutOverview_page {
	
	public CheckoutOverview_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	CommonMethods commonmethods = new CommonMethods();

	private @FindBy(xpath="//button[@id='finish']")
	WebElement Finish_btn;
	//private @FindBy(xpath="//div[normalize-space()='Payment Information:']")
	//WebElement pymntinfo_txt;

	
	public void verifyCheckoutOverview()
	{
		Finish_btn.click();
	}

}
