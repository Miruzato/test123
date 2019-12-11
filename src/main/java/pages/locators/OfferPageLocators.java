package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OfferPageLocators {

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'up')]")
    public WebElement plusIcon;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'down')]")
    public WebElement minusIcon;

    @FindBy(how = How.XPATH,using = "//button[@label='Show Price Slider']")
    public WebElement showPriceSlider;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'handle-1')]")
    public WebElement minPriceDot;
}