package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.CommonMethods;

public class Cart_page {
	
	public Cart_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	CommonMethods commonmethods = new CommonMethods();

	//private @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	//WebElement Checkout_btn;
	// verify the product selected in the cart WebElement ;
	
	private @FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout_btn;
	
	
	//public void verifyProductInCheckOutPage()
	//{
		
	//}
	
	public void clickOnCheckout()
	{
		Checkout_btn.click();
	}
	
}
