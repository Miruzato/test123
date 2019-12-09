package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PreferencesLocators {

    @FindBy(how = How.XPATH,using = "//input[@placeholder='']")
    public WebElement currentOutlet;

    @FindBy(how = How.XPATH,using = "//div[text()='Box Office']")
    public WebElement boxOffice;

    @FindBy(how = How.XPATH,using = "//div[text()='Please select']")
    public WebElement currentSellingLocation;

    @FindBy(how = How.XPATH,using = "//div[text()='Window 2']")
    public WebElement selectWindow;

    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter Event ID']")
    public WebElement enterEventID;

    @FindBy(how = How.XPATH,using = "//button[text()='Next']")
    public WebElement clickNextBtn;

    @FindBy(how = How.XPATH,using = "//div[text()='Printing Preferences']")
    public WebElement printingPreferencesTitle;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'bqaHOE')])[3]")
    public WebElement selectPrinter;

    @FindBy(how = How.XPATH,using = "//div[text()='BOCA Printer']")
    public WebElement bocaPrinter;

    @FindBy(how = How.XPATH,using = "(//div[text()='Auto'])[2]")
    public WebElement ticketPrinting;

    @FindBy(how = How.XPATH,using = "(//div[text()='Auto'])[3]")
    public WebElement auto;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'bqaHOE')])[4]")
    public WebElement printingStock;

    @FindBy(how = How.XPATH,using = "//div[text()='BOCA 2x5']")
    public WebElement boca2X5;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'bqaHOE')])[5]")
    public WebElement printerType;

    @FindBy(how = How.XPATH,using = "//div[text()='BOCA']")
    public WebElement boca;

    @FindBy(how = How.XPATH,using = "//button[text()='Done']")
    public WebElement doneButton;

    @FindBy(how = How.XPATH,using = "//h1[text()='Upcoming Events']")
    public WebElement upcomingEventsHeader;

    @FindBy(how = How.XPATH,using = "(//div[text()='Box Office 1'])[1]")
    public WebElement eventInUpcomingEvents;

    @FindBy(how = How.XPATH,using = "(//span[@name='keyboard-arrow-right'])[1]")
    public WebElement upcomingEventsRightArrow;

    @FindBy(how = How.XPATH,using = "(//ul)[2]/li[last()-2]")
    public WebElement lastUpcomingEvent;

    @FindBy(how = How.XPATH,using = "(//ul)[2]/li[2]")
    public WebElement secondUpcomingEvent;

    @FindBy(how = How.XPATH,using = "(//span[@name='keyboard-arrow-left'])[1]")
    public WebElement upcomingEventsLeftArrow;

    @FindBy(how = How.XPATH,using = "(//div[text()='Box Office 1'])[2]")
    public WebElement eventInVenues;

    @FindBy(how = How.XPATH,using = "//button[text()='All venues']")
    public WebElement allVenuesDropdown;

    @FindBy(how = How.XPATH,using = "(//ul)[4]")
    public WebElement venueList;

    @FindBy(how = How.XPATH,using = "//div[@label='All venues']")
    public WebElement allVenuesCheckbox;

    @FindBy(how = How.XPATH,using = "//button[text()='All categories']")
    public WebElement allCategoriesDropdown;

    @FindBy(how = How.XPATH,using = "//div[@label='All categories']")
    public WebElement allCategoriesCheckbox;

    @FindBy(how = How.XPATH,using = "(//span[@name='keyboard-arrow-right'])[2]")
    public WebElement venuesRightArrow;

    @FindBy(how = How.XPATH,using = "(//div[@data-test='calendar-card'])[last()-3]")
    public WebElement lastVenue;

    @FindBy(how = How.XPATH,using = "(//div[@data-test='calendar-card'])[3]")
    public WebElement thirdVenue;

    @FindBy(how = How.XPATH,using = "//span[@name='keyboard-arrow-left']")
    public WebElement venuesLeftArrow;
}
