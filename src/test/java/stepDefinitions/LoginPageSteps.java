package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import base.DriverContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login_page;

public class LoginPageSteps {
	
	Login_page lp = new Login_page();
	
	@Given("I am in the login page of Swag Labs demo page")
	public void iAmInTheLoginPage()
	{
		Assert.assertEquals(DriverContext.Driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}
	
	@When("I give the login details of Standard User with user id {string}")
	public void iLoginToTheApplicationStandardUser(String username) throws IOException, InterruptedException
	{
		lp.performLogin(username);
	}

	@When("I give the login details of Visual User with user id {string}")
	public void iLoginToTheApplicationVisualUser(String username) throws IOException, InterruptedException
	{
		lp.performLogin(username);
	}
	
	@Then("I logged in successfully")
	public void loginSuccessful()
	{
		Assert.assertEquals(DriverContext.Driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}

	@Then("I get a login error with an error message containing {string}")
	public void loginError(String error)
	{
		Assert.assertTrue((error.contains("Username and password do not match")),
				"Error message does not contain expected text");
		//Assert.assertEquals(DriverContext.Driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
}
