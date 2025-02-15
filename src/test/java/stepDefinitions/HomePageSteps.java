package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import pages.Home_page;

public class HomePageSteps {
	
	Home_page hp = new Home_page();
	
	@Given("I am in the product detail page")
	public void iAmInTheHomePage()
	{
		String actualText = hp.homePage();
		Assert.assertEquals(actualText, "Products");
	}

}
