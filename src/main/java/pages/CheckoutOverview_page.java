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
	private @FindBy(xpath="//div[@class='summary_total_label']")
	WebElement TotalAmnt_txt;

	public String getTotalAmount()
	{
		return TotalAmnt_txt.getText().replaceAll("[^0-9.]","").trim();
	}

	public void clickFinishButton()
	{
		Finish_btn.click();
	}



}
