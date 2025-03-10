package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.CheckoutFinish_page;

public class CheckoutFinishPageSteps {
	
	CheckoutFinish_page cp = new CheckoutFinish_page();
	
	@And("I verify the final page")
	public void verifyCheckoutFinish()
	{
		String successText = cp.verifyCheckoutFinish();
		Assert.assertEquals(successText, "Thank you for your order!");
	}

}
