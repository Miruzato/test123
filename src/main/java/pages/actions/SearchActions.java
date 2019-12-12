package pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.SearchLocators;
import pages.utils.SeleniumDriver;

public class SearchActions {
    private SearchLocators searchLocators;

    public SearchActions(){
        this.searchLocators = new SearchLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),searchLocators);
    }

    public void enterSearchTerm(String term){
        searchLocators.searchBox.sendKeys(term+ Keys.ENTER);
    }

    public void verifyMatchingEvent(String term){
        String firstEventTitle = searchLocators.firstEventTitle.getText().toLowerCase();
        Assert.assertTrue(firstEventTitle.contains(term.toLowerCase()));
    }

    public void verifyNoResults(){
        Assert.assertTrue(searchLocators.noResults.isDisplayed());
    }

    public void clickSearchTab(String tab){
        switch (tab){
            case "Events":
                searchLocators.eventsTab.click();
                break;
            case "Customers":
                searchLocators.customersTab.click();
                break;
            case "Orders":
                searchLocators.ordersTab.click();
                break;
            case "Tickets":
                searchLocators.ticketsTab.click();
                break;
            case "All":
                searchLocators.allTab.click();
                break;
        }
    }

    public void clickAndVerifySearchResult(){
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(searchLocators.firstEventTitle));
        String eventTitle = searchLocators.firstEventTitle.getText();
        searchLocators.firstEvent.click();
        Assert.assertEquals(searchLocators.eventTitle.getText(),eventTitle);
    }
}
