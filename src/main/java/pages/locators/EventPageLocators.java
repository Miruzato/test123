package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EventPageLocators {

    @FindBy(how = How.XPATH,using = "//div[@id='5079']")
    public WebElement eventInUpcomingEvents;


}
