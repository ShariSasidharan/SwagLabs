package pages;

import base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class Logout_page {

    public Logout_page()
    {
        PageFactory.initElements(DriverContext.Driver, this);
    }

    CommonMethods commonmethods = new CommonMethods();

    private @FindBy(xpath="//button[@id='react-burger-menu-btn']")
    WebElement Burger_btn;
    private @FindBy(xpath="//a[@id='logout_sidebar_link']")
    WebElement Logout_btn;


    public void clickBurgerButton(){
        Burger_btn.click();
    }

    public void clickLogout(){
        commonmethods.staticWait(2000);
        Logout_btn.click();
    }
}
