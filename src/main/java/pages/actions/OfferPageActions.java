package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.locators.OfferPageLocators;
import pages.utils.SeleniumDriver;

public class OfferPageActions {
    private OfferPageLocators offerPageLocators;

    public OfferPageActions(){
        this.offerPageLocators = new OfferPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),offerPageLocators);
    }

    public void clickPlus(){
        offerPageLocators.plusIcon.click();
    }

    public void clickMinus(){
        offerPageLocators.minusIcon.click();
    }

    public void clickShowPriceSlider(){
        offerPageLocators.showPriceSlider.click();
    }

    public void slideMinPriceDot(int price){
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",offerPageLocators.minPriceDot, "aria-valuenow",price);
    }
}
