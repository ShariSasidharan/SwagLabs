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
		Assert.assertEquals("https://www.saucedemo.com/", DriverContext.Driver.getCurrentUrl());
	}
	
	@When("I give the login details of Standard User with user id {string}")
	public void iLoginToTheApplication(String username) throws IOException, InterruptedException
	{
		lp.performLogin(username);
	}
	
	@Then("I logged in successfully")
	public void loginSuccessful()
	{
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", DriverContext.Driver.getCurrentUrl());
	}
}
