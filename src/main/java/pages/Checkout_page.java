package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.CommonMethods;

public class Checkout_page {
	
	public Checkout_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	CommonMethods commonmethods = new CommonMethods();

	private @FindBy(xpath="//input[@id='first-name']")
	WebElement firstname_txt;
	private @FindBy(xpath="//input[@id='last-name']")
	WebElement lastname_txt;
	private @FindBy(xpath="//input[@id='postal-code']")
	WebElement postcode_txt;
	private @FindBy(xpath="//input[@id='continue']")
	WebElement continue_btn;
	
	
	
	public void iEnterCheckoutInfo()
	{
		firstname_txt.sendKeys("testfirstname");
		lastname_txt.sendKeys("testlastname");
		postcode_txt.sendKeys("12345");
		continue_btn.click();
	}
	

}
