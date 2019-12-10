package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.DashboardLocators;
import pages.utils.SeleniumDriver;

import java.util.List;

public class DashboardActions {
    private DashboardLocators dashboardLocators;

    public DashboardActions(){
        this.dashboardLocators = new DashboardLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),dashboardLocators);
    }

    public void clickAllVenuesDropdown() {
        dashboardLocators.allVenuesDropdown.click();
    }

    public void uncheckVenueCheckboxes() {
        List<WebElement> checkboxes = SeleniumDriver.getDriver().findElements(By.xpath("//div[text()='Venues']/..//div[@type='check']"));
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("scroll(0, 250);");
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected())
                checkbox.click();
        }
    }

    public void verifyNoVenues() {
        List<WebElement> venues = dashboardLocators.venueList.findElements(By.xpath(".//*"));
        Assert.assertEquals(venues.size(), 0);
    }

    public void checkAllVenuesCheckbox() {
        dashboardLocators.allVenuesCheckbox.click();
    }

    public void verifyEventInVenues() {
        Assert.assertTrue(dashboardLocators.eventInVenues.isDisplayed());
    }

    public void clickAllCategoriesDropdown() {
        dashboardLocators.allCategoriesDropdown.click();
    }

    public void uncheckCategoryCheckboxes() {
        List<WebElement> checkboxes = SeleniumDriver.getDriver().findElements(By.xpath("//div[text()='Categories']/..//div[@type='check']"));
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("scroll(0, 750);");
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected())
                checkbox.click();
        }
    }

    public void checkAllCategoriesCheckbox() { dashboardLocators.allCategoriesCheckbox.click();
    }

    public void scrollThroughVenues() {
        while(!dashboardLocators.lastVenue.isDisplayed())
            dashboardLocators.venuesRightArrow.click();

        while(!dashboardLocators.thirdVenue.isDisplayed())
            dashboardLocators.venuesLeftArrow.click();
    }
}
