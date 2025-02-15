package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CheckoutFinish_page;

public class CheckoutFinishPageSteps {
	
	CheckoutFinish_page cp = new CheckoutFinish_page();
	
	@And("I verify the final page")
	public void verifyCheckoutFinish()
	{
		//verify the success message
	}

}
