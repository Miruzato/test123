package steps;

import cucumber.api.java.en.And;
import pages.actions.CheckoutActions;

public class CheckoutStep {
    private CheckoutActions checkoutActions = new CheckoutActions();

    @And("^I click Event Info on the checkout page$")
    public void iClickEventInfoOnTheCheckoutPage() {
        checkoutActions.clickEventInfoLink();
    }

    @And("^I verify the order summary$")
    public void iVerifyTheOrderSummary() {
        checkoutActions.verifyOrderSummary();
    }
}
