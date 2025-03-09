package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.CheckoutOverview_page;

public class CheckoutOverviewPageSteps {
	
	CheckoutOverview_page cop = new CheckoutOverview_page();
	
	@And("I verify the Checkout Overview")
	public void verifyCheckoutOverview()
	{
		String totalAmount = cop.getTotalAmount();
		Assert.assertNotNull(totalAmount, "Total amount is null");
		Assert.assertFalse(totalAmount.isEmpty(),"Total amount is empty");
	}

	@And("I click on the Finish button")
	public void clickFinishButton()
	{
		cop.clickFinishButton();
	}

}
