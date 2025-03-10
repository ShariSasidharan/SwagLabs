package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Cart_page;

public class CartPageSteps {
	
	Cart_page cp = new Cart_page();
	
	@Then("I verify the product in the checkout page")
	public void verifyProductInCheckOutPage()
	{
		String CartItemName = cp.getCartItemName();
		String ProductName = ProductPageSteps.getSelectedProductName();
		Assert.assertEquals(CartItemName,ProductName,"Item selected and item in the cart are not the same");
	}
	
	@And("I click on checkout")
	public void clickOnCheckout()
	{
		cp.clickOnCheckout();
	}

}
