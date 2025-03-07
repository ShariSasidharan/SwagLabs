package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import base.DriverContext;

public class Home_page {
	
	public Home_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}

	private @FindBy(xpath="//span[@class='title']")
	WebElement homepage_txt;

	String products;
	
	public String homePage()
	{
		return homepage_txt.getText();
	}
}
