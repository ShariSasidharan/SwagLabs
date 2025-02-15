package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CheckoutOverview_page;

public class CheckoutOverviewPageSteps {
	
	CheckoutOverview_page cop = new CheckoutOverview_page();
	
	@And("I verify the Checkout Overview")
	public void verifyCheckoutOverview()
	{
		cop.verifyCheckoutOverview();
	}

}
