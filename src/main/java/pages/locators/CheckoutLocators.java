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

    @FindBy(how = How.XPATH,using = "//button[@label='More customer information']")
    public WebElement moreCustomerInformation;

    @FindBy(how = How.XPATH,using = "//input[@name='email']")
    public WebElement email;

    @FindBy(how = How.XPATH,using = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(how = How.XPATH,using = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(how = How.XPATH,using = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(how = How.XPATH,using = "//input[@name='address1']")
    public WebElement address1;

    @FindBy(how = How.XPATH,using = "//input[@name='address2']")
    public WebElement address2;

    @FindBy(how = How.XPATH,using = "//div[text()='Country']")
    public WebElement country;

    @FindBy(how = How.XPATH,using = "//div[text()='United States']")
    public WebElement unitedStates;

    @FindBy(how = How.XPATH,using = "//div[text()='State']")
    public WebElement state;

    @FindBy(how = How.XPATH,using = "//div[text()='California']")
    public WebElement california;

    @FindBy(how = How.XPATH,using = "//input[@name='city']")
    public WebElement city;

    @FindBy(how = How.XPATH,using = "//input[@name='zipCode']")
    public WebElement zipCode;

    @FindBy(how = How.XPATH,using = "//div[text()='Credit Card']")
    public WebElement creditCardButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Complete Sale']")
    public WebElement completeSaleButton;

    @FindBy(how = How.XPATH,using = "//button[text()='Manual Entry']")
    public WebElement manualEntryButton;

    @FindBy(how = How.XPATH,using = "//input[@name='cardNumber']")
    public WebElement creditCardNumber;

    @FindBy(how = How.XPATH,using = "//input[@name='nameOnCard']")
    public WebElement creditCardName;

    @FindBy(how = How.XPATH,using = "//input[@name='expireDate']")
    public WebElement expirationDate;

    @FindBy(how = How.XPATH,using = "//button[text()='Charge']")
    public WebElement chargeButton;

    @FindBy(how = How.XPATH,using = "//div[text()='Order Complete!']")
    public WebElement orderComplete;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Order #')]")
    public WebElement orderNumber;

    @FindBy(how = How.XPATH,using = "//div[contains(text(),'Order Total')]")
    public WebElement confirmationOrderTotal;

    @FindBy(how = How.XPATH,using = "(//div[contains(@class,'ec')])[1]")
    public WebElement customerName;
}
