package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.EventLocators;
import pages.utils.SeleniumDriver;

public class EventActions {
    private EventLocators eventLocators;

    public EventActions() {
        this.eventLocators = new EventLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), eventLocators);
    }

    public void clickEvent() {
        eventLocators.eventInUpcomingEvents.click();
    }

    public void clickEventInfoLink() {
        eventLocators.eventInfoLink.click();
    }

    public void verifyEventInfo() {
        Assert.assertEquals(eventLocators.dayOfTheWeek.getText().length(),3);
        Assert.assertEquals(eventLocators.month.getText().length(),3);
        Assert.assertTrue(eventLocators.monthDay.getText().length() > 0);
        Assert.assertEquals(eventLocators.year.getText().length(),4);
        Assert.assertEquals(eventLocators.time.getText().length(),8);
        Assert.assertTrue(eventLocators.eventName.getText().length() > 0);
        Assert.assertTrue(eventLocators.venue.getText().length() > 0);
    }

    public void clickAllButton() {
        eventLocators.allButton.click();
    }

    public void verifyOldOffer() {
        Assert.assertTrue(eventLocators.soldOut.isDisplayed());
    }

    public void clickAvailableButton(){
        eventLocators.availableButton.click();
    }

    public void verifyOfferIsActive(){
        Assert.assertTrue(eventLocators.secondBestAvailableButton.isEnabled());
    }

    public void scrollThroughOffers(){
            eventLocators.offersRightArrow.click();
            eventLocators.offersLeftArrow.click();
    }

    public void clickBestAvailableButton() {
        new WebDriverWait(SeleniumDriver.getDriver(),10).until(ExpectedConditions.visibilityOf(eventLocators.secondBestAvailableButton));
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("scroll(0, 250);");
        eventLocators.secondBestAvailableButton.click();
    }

    public void clickSelectOnMapButton(){
//        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(eventPageLocators.firstSelectOnMapButton));
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("scroll(0, 250);");
        eventLocators.firstSelectOnMapButton.click();
    }
}
