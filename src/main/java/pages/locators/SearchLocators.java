package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchLocators {

    @FindBy(how = How.XPATH,using = "//input")
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'title')])[1]")
    public WebElement firstEventTitle;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'sc-bdVaJa jZvYll c-axs-block sc-bwzfXH fjBKrn c-axs-flex sc-')])[1]")
    public WebElement firstEvent;

    @FindBy(how = How.XPATH,using = "//div[text()='No Results']")
    public WebElement noResults;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Events')]")
    public WebElement eventsTab;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Customers')]")
    public WebElement customersTab;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Orders')]")
    public WebElement ordersTab;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Tickets')]")
    public WebElement ticketsTab;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'All')]")
    public WebElement allTab;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'title')]")
    public WebElement eventTitle;
}
