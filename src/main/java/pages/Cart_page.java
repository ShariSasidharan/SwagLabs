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

	private @FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement CartItem_txt;
	private @FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout_btn;
	
	
	public String getCartItemName()
	{
		return CartItem_txt.getText();
	}
	
	public void clickOnCheckout()
	{
		Checkout_btn.click();
	}
	
}
