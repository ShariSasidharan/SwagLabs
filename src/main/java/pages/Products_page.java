package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.DriverContext;
import utilities.CommonMethods;

public class Products_page {
	
	public Products_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	CommonMethods commonmethods = new CommonMethods();

	private @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement AddToCart_btn;
	private @FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement Cart_icon;
	private @FindBy(xpath="//div[normalize-space()='Sauce Labs Onesie']")
	WebElement ProductName_txt;

	private String selectedProductName;

    public String getProductName() {
        selectedProductName = ProductName_txt.getText();
		return selectedProductName;
	}

	public void addToCart()
	{
		commonmethods.staticWait(2000);
		selectedProductName = ProductName_txt.getText();
		AddToCart_btn.click();
	}
	
	public void clickOnCartIcon()
	{
		Cart_icon.click();
	}

}
