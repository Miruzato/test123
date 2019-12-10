package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardLocators {

    @FindBy(how = How.XPATH,using = "//button[text()='All venues']")
    public WebElement allVenuesDropdown;

    @FindBy(how = How.XPATH,using = "(//ul)[4]")
    public WebElement venueList;

    @FindBy(how = How.XPATH,using = "//div[@label='All venues']")
    public WebElement allVenuesCheckbox;

    @FindBy(how = How.XPATH,using = "(//div[text()='Box Office 1'])[2]")
    public WebElement eventInVenues;

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
