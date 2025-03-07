package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Cart_page;

public class CartPageSteps {
	
	Cart_page cp = new Cart_page();
	
	//@Then("I verify the product in the checkout page")
	//public void verifyProductInCheckOutPage()
	//{
		//cp.verifyProductInCheckOutPage();
	//}
	
	@And("I click on checkout")
	public void clickOnCheckout()
	{
		cp.clickOnCheckout();
	}

}
