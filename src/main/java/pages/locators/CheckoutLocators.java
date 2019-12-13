package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutLocators {

    @FindBy(how = How.XPATH, using = "//button[text()='Event info']")
    public WebElement eventInfoLink;

    @FindBy(how = How.XPATH,using = "(//tr[@class='sub-total']//div)[2]")
    public WebElement subtotal;

    @FindBy(how = How.XPATH,using = "(//tr[@class='sub-total']//div)[4]")
    public WebElement feeTotal;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'WU')]")
    public WebElement orderTotal;
}
