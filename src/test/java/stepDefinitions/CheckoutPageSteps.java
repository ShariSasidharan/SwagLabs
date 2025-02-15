package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Checkout_page;

public class CheckoutPageSteps {
	
	Checkout_page cfp = new Checkout_page();
	
	@And("I enter the checkout Information")
	public void iEnterCheckoutInformation()
	{
		cfp.iEnterCheckoutInfo();
	}
	

}
