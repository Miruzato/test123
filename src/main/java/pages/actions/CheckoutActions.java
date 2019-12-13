package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.CheckoutLocators;
import pages.utils.SeleniumDriver;

import java.math.BigDecimal;

public class CheckoutActions {
    private CheckoutLocators checkoutLocators;

    JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();

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

    public void clickMoreCustomerInformation(){
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(checkoutLocators.moreCustomerInformation));
        js.executeScript("scroll(0, 750);");
        checkoutLocators.moreCustomerInformation.click();
    }

    public void enterCustomerInformation(){
        checkoutLocators.email.sendKeys("mmuerzati@axs.com");
        checkoutLocators.firstName.sendKeys("Musha");
        checkoutLocators.lastName.sendKeys("Muerzati");
        checkoutLocators.phoneNumber.sendKeys("2222222222");
        checkoutLocators.address1.sendKeys("1 Aa St");
        checkoutLocators.address2.sendKeys("1");
        checkoutLocators.country.click();
        checkoutLocators.unitedStates.click();
        checkoutLocators.state.click();
        checkoutLocators.california.click();
        checkoutLocators.city.sendKeys("Culver City");
        checkoutLocators.zipCode.sendKeys("90230");
    }

    public void selectPaymentMethod(String method){
        js.executeScript("scroll(0, 1250);");
        if(method.equalsIgnoreCase("credit card"))
            checkoutLocators.creditCardButton.click();
    }

    public void clickCompleteSaleButton(){
        checkoutLocators.completeSaleButton.click();
    }

    public void clickManualEntryButton(){
        checkoutLocators.manualEntryButton.click();
    }

    public void enterCreditCardInformation(){
        checkoutLocators.creditCardNumber.sendKeys("4929256070811664");
        checkoutLocators.creditCardName.sendKeys("Aa A");
        checkoutLocators.expirationDate.sendKeys("12/2020");
    }

    public void clickChargeButton(){
        checkoutLocators.chargeButton.click();
    }

    public void verifyCompletedOrder(){
        new WebDriverWait(SeleniumDriver.getDriver(),45).until(ExpectedConditions.visibilityOf(checkoutLocators.orderComplete));
        Assert.assertTrue(checkoutLocators.orderComplete.isDisplayed());
        Assert.assertTrue(checkoutLocators.orderNumber.isDisplayed());
        Assert.assertTrue(checkoutLocators.confirmationOrderTotal.isDisplayed());
        Assert.assertTrue(checkoutLocators.customerName.getText().length() > 0);
    }
}
