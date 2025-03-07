package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutOverview_page;
import pages.Logout_page;

public class LogoutPageSteps {

    Logout_page lop = new Logout_page();

    @Then("I click on the burger button")
    public void clickOnTheBurgerButton()
    {
        lop.clickBurgerButton();
    }

    @And("I click on logout")
    public void clickOnLogout()
    {
        lop.clickLogout();
    }
}
