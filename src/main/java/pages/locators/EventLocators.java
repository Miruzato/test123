package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EventLocators {

    @FindBy(how = How.XPATH,using = "//div[@id='5079']")
    public WebElement eventInUpcomingEvents;

    @FindBy(how = How.XPATH,using = "//button[text()='Event info']")
    public WebElement eventInfoLink;

    @FindBy(how = How.XPATH,using = "(//span[contains(@class,'weekday')])[1]")
    public WebElement dayOfTheWeek;

    @FindBy(how = How.XPATH,using = "(//span[contains(@class,'month')])[1]")
    public WebElement month;

    @FindBy(how = How.XPATH,using = "(//span[contains(@class,'_day')])[1]")
    public WebElement monthDay;

    @FindBy(how = How.XPATH,using = "(//span[contains(@class,'VT')])[1]")
    public WebElement year;

    @FindBy(how = How.XPATH,using = "(//span[contains(@class,'time')])[1]")
    public WebElement time;

    @FindBy(how = How.XPATH,using = "//h2[contains(@class,'ip')]")
    public WebElement eventName;

    @FindBy(how = How.XPATH,using = "//h2[contains(@class,'hm')]")
    public WebElement venue;

    @FindBy(how = How.XPATH,using = "//div[text()='All']")
    public WebElement allButton;

    @FindBy(how = How.XPATH,using = "//div[text()='Sold Out']")
    public WebElement soldOut;

    @FindBy(how = How.XPATH,using = "//div[text()='Available']")
    public WebElement availableButton;

    @FindBy(how = How.XPATH,using = "(//button[text()='Best Available'])[2]")
    public WebElement secondBestAvailableButton;

    @FindBy(how = How.XPATH,using = "//span[@name='keyboard-arrow-right']")
    public WebElement offersRightArrow;

    @FindBy(how = How.XPATH,using = "//span[@name='keyboard-arrow-left']")
    public WebElement offersLeftArrow;

    @FindBy(how = How.XPATH,using = "(//button[text()='Select on Map'])[2]")
    public WebElement firstSelectOnMapButton;
}
