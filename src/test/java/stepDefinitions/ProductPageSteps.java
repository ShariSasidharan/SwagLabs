package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.Products_page;


public class ProductPageSteps {
	
	Products_page pp = new Products_page();
	private static String selectedProductName;
	
	
	@Then("I select a single product and add to Cart")
	public void addProductToCart()
	{
		selectedProductName = pp.getProductName();
		pp.addToCart();
	}
	
	@Then("I click on the Cart icon")
	public void clickOnTheCartIcon()
	{
		pp.clickOnCartIcon();
	}

	public static String getSelectedProductName()
	{
		return selectedProductName;
	}

}
