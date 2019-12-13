package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.CheckoutLocators;
import pages.utils.SeleniumDriver;

import java.math.BigDecimal;

public class CheckoutActions {
    private CheckoutLocators checkoutLocators;

    public CheckoutActions(){
        this.checkoutLocators = new CheckoutLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), checkoutLocators);
    }

    public void clickEventInfoLink() {
        checkoutLocators.eventInfoLink.click();
    }

    public void verifyOrderSummary(){
        String subtotalString = checkoutLocators.subtotal.getText().substring(1);
        String totalString = checkoutLocators.orderTotal.getText().substring(1);
        BigDecimal subtotal = new BigDecimal(subtotalString);
        BigDecimal total = new BigDecimal(totalString);
        Assert.assertTrue(checkoutLocators.feeTotal.getText().length() >= 5);
        Assert.assertTrue(subtotal.compareTo(total) != 1); // verify that subtotal is less than or equal to total
    }
}
