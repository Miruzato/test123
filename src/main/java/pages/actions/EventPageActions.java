package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.EventPageLocators;
import pages.utils.SeleniumDriver;

public class EventPageActions {
    private EventPageLocators eventPageLocators;

    public EventPageActions() {
        this.eventPageLocators = new EventPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),eventPageLocators);
    }

    public void clickEvent() {
        eventPageLocators.eventInUpcomingEvents.click();
    }

    public void clickEventInfoLink() {
        eventPageLocators.eventInfoLink.click();
    }

    public void verifyEventInfo() {
        Assert.assertEquals(eventPageLocators.dayOfTheWeek.getText().length(),3);
        Assert.assertEquals(eventPageLocators.month.getText().length(),3);
        Assert.assertTrue(eventPageLocators.monthDay.getText().length() > 0);
        Assert.assertEquals(eventPageLocators.year.getText().length(),4);
        Assert.assertEquals(eventPageLocators.time.getText().length(),8);
        Assert.assertTrue(eventPageLocators.eventName.getText().length() > 0);
        Assert.assertTrue(eventPageLocators.venue.getText().length() > 0);
    }

    public void clickAllButton() {
        eventPageLocators.allButton.click();
    }

    public void verifyOldOffer() {
        Assert.assertTrue(eventPageLocators.soldOut.isDisplayed());
    }

    public void clickAvailableButton(){
        eventPageLocators.availableButton.click();
    }

    public void verifyOfferIsActive(){
        Assert.assertTrue(eventPageLocators.firstBestAvailableButton.isEnabled());
    }

    public void scrollThroughOffers(){
            eventPageLocators.offersRightArrow.click();
            eventPageLocators.offersLeftArrow.click();
    }

    public void clickBestAvailableButton() {
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(eventPageLocators.firstBestAvailableButton));
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("scroll(0, 250);");
        eventPageLocators.firstBestAvailableButton.click();
    }
}
