package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverContext;
import utilities.UtilityFetchProperty;

public class Login_page {
	
	public Login_page() 
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}
	
	private @FindBy(xpath="//input[@id='user-name']")
	WebElement username_fld;
	private @FindBy(xpath="//input[@id='password']")
	WebElement password_fld;
	private @FindBy(xpath="//input[@id='login-button']")
	WebElement login_btn;
	private @FindBy(xpath="//button[@class='error-button']")
	WebElement loginerrormsg_txt;
	
	public void performLogin(String username) throws IOException, InterruptedException
	{
		username_fld.sendKeys(username);
		password_fld.sendKeys(UtilityFetchProperty.fetchPropertyValue(username));
		login_btn.click();
	}

	public String loginError(){
		String errorLoginMessage;
        errorLoginMessage = loginerrormsg_txt.getText();
        return errorLoginMessage;
	}

}
