package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.PreferencesLocators;
import pages.utils.SeleniumDriver;

import java.util.List;

public class PreferencesActions {
    private PreferencesLocators preferencesLocators;
    String boxOffice= "Box Office";


    public PreferencesActions(){
        this.preferencesLocators = new PreferencesLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),preferencesLocators);
    }

    public void enterCurrentOutlet() throws InterruptedException {
        preferencesLocators.currentOutlet.sendKeys(boxOffice);
        preferencesLocators.boxOffice.click();
    }

    public void selectCurrentSellingLocation() throws InterruptedException {
        preferencesLocators.currentSellingLocation.click();
        preferencesLocators.selectWindow.click();
    }

    public void enterEventID(String eventID) throws InterruptedException {
        preferencesLocators.enterEventID.sendKeys(eventID);
    }
    public void clickNextButton() throws InterruptedException {
        preferencesLocators.clickNextBtn.click();
    }

    public void verifyPrintingPreferencesPage() {
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(preferencesLocators.printingPreferencesTitle));
        Assert.assertTrue(preferencesLocators.printingPreferencesTitle.isDisplayed());
    }

    public void selectPrinter() {
        preferencesLocators.selectPrinter.click();
        preferencesLocators.bocaPrinter.click();
    }

    public void selectTicketPrinting() {
        preferencesLocators.ticketPrinting.click();
        preferencesLocators.auto.click();
    }

    public void selectPrintingStock() {
        preferencesLocators.printingStock.click();
        preferencesLocators.boca2X5.click();
    }

    public void selectPrinterType() {
        preferencesLocators.printerType.click();
        preferencesLocators.boca.click();
    }

    public void clickDoneButton() {
        preferencesLocators.doneButton.click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyUpcomingEvents() {
        Assert.assertTrue(preferencesLocators.upcomingEventsHeader.isDisplayed());
    }

    public void verifyEventInUpcomingEvents() {
        Assert.assertTrue(preferencesLocators.eventInUpcomingEvents.isDisplayed());
    }

    public void scrollThroughUpcomingEvents() {
        while(!preferencesLocators.lastUpcomingEvent.isDisplayed())
            preferencesLocators.upcomingEventsRightArrow.click();

        while(!preferencesLocators.secondUpcomingEvent.isDisplayed())
            preferencesLocators.upcomingEventsLeftArrow.click();
    }
}
