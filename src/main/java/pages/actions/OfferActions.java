package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.locators.OfferLocators;
import pages.utils.SeleniumDriver;

public class OfferActions {
    private OfferLocators offerLocators;

    public OfferActions(){
        this.offerLocators = new OfferLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), offerLocators);
    }

    public void clickPlus(){
        new WebDriverWait(SeleniumDriver.getDriver(),5).until(ExpectedConditions.visibilityOf(offerLocators.plusIcon));
        offerLocators.plusIcon.click();
    }

    public void clickMinus(){
        offerLocators.minusIcon.click();
    }

    public void clickShowPriceSlider(){
        offerLocators.showPriceSlider.click();
    }

    public void slideMinPriceDot(int price){
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", offerLocators.minPriceDot, "aria-valuenow",price);
    }

    public void clickFindTicketsButton(){
        new WebDriverWait(SeleniumDriver.getDriver(),45).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'level-selector')])[1]")));
        offerLocators.findTicketsButton.click();
    }

    public void verifyTicket(){
        Assert.assertTrue(offerLocators.firstTicket.isDisplayed());
    }

    public void addTickets(){
        offerLocators.addTickets.click();
    }

    public void clickItemsReserved(){
        offerLocators.itemsReserved.click();
    }

    public void verifyThreeTickets(){
        Assert.assertEquals(offerLocators.itemCounter.getText(),"3");
        Assert.assertEquals(offerLocators.yourCartCount.getText(),"(3 Items Reserved)");
        Assert.assertTrue(offerLocators.firstTicketSection.getText().length() > 0);
        Assert.assertTrue(offerLocators.secondTicketSection.getText().length() > 0);
        Assert.assertTrue(offerLocators.thirdTicketSection.getText().length() > 0);
    }

    public void clickMapFiltersDownArrow(){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        offerLocators.mapFiltersDownArrow.click();
    }

    public void zoomIn(int times){
//        new WebDriverWait(SeleniumDriver.getDriver(),50).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Loading')]")));
        for(int i = 0; i < times; i++)
            offerLocators.zoomInIcon.click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickMap(){
        WebElement svgObject = SeleniumDriver.getDriver().findElement(By.xpath("//*[name()='svg']"));
        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.click(svgObject);
    }

    public void clickCheckoutButton(){
        offerLocators.checkoutButton.click();
    }
}
