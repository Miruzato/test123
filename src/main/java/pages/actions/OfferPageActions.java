package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.OfferPageLocators;
import pages.utils.SeleniumDriver;

public class OfferPageActions {
    private OfferPageLocators offerPageLocators;

    public OfferPageActions(){
        this.offerPageLocators = new OfferPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),offerPageLocators);
    }

    public void clickPlus(){
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(offerPageLocators.plusIcon));
        offerPageLocators.plusIcon.click();
    }

    public void clickMinus(){
        offerPageLocators.minusIcon.click();
    }

    public void clickShowPriceSlider(){
        offerPageLocators.showPriceSlider.click();
    }

    public void slideMinPriceDot(int price){
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",offerPageLocators.minPriceDot, "aria-valuenow",price);
    }

    public void clickFindTicketsButton(){
        new WebDriverWait(SeleniumDriver.getDriver(),30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'level-selector')])[1]")));
        offerPageLocators.findTicketsButton.click();
    }

    public void verifyTicket(){
        Assert.assertTrue(offerPageLocators.firstTicket.isDisplayed());
    }

    public void addTickets(){
        offerPageLocators.addTickets.click();
    }

    public void clickItemsReserved(){
        offerPageLocators.itemsReserved.click();
    }

    public void verifyThreeTickets(){
        Assert.assertEquals(offerPageLocators.itemCounter.getText(),"3");
        Assert.assertEquals(offerPageLocators.yourCartCount.getText(),"(3 Items Reserved)");
        Assert.assertTrue(offerPageLocators.firstTicketSection.getText().length() > 0);
        Assert.assertTrue(offerPageLocators.secondTicketSection.getText().length() > 0);
        Assert.assertTrue(offerPageLocators.thirdTicketSection.getText().length() > 0);
    }

    public void clickMapFiltersDownArrow(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        offerPageLocators.mapFiltersDownArrow.click();
    }

    public void zoomIn(int times){
//        new WebDriverWait(SeleniumDriver.getDriver(),50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Loading')]")));
        for(int i = 0; i < times; i++)
            offerPageLocators.zoomInIcon.click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
