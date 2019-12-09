package pages.actions;

import org.openqa.selenium.support.PageFactory;
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
}
