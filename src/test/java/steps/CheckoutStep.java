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

    @And("^I click More Customer Information$")
    public void iClickMoreCustomerInformation() {
        checkoutActions.clickMoreCustomerInformation();
    }

    @And("^I enter my customer information$")
    public void iEnterMyCustomerInformation() {
        checkoutActions.enterCustomerInformation();
    }

    @And("^I select the \"([^\"]*)\" payment method$")
    public void iSelectThePaymentMethod(String method) {
        checkoutActions.selectPaymentMethod(method);
    }

    @And("^I click the Complete Sale button$")
    public void iClickTheCompleteSaleButton() {
        checkoutActions.clickCompleteSaleButton();
    }

    @And("^I click the Manual Entry button$")
    public void iClickTheManualEntryButton() {
        checkoutActions.clickManualEntryButton();
    }

    @And("^I enter my credit card information$")
    public void iEnterMyCreditCardInformation() {
        checkoutActions.enterCreditCardInformation();
    }

    @And("^I click the Charge button$")
    public void iClickTheChargeButton() {
        checkoutActions.clickChargeButton();
    }

    @And("^I verify the order is complete$")
    public void iVerifyTheOrderIsComplete() {
        checkoutActions.verifyCompletedOrder();
    }
}
