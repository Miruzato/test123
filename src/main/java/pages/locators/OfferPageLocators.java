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

    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Find')]")
    public WebElement findTicketsButton;

    @FindBy(how = How.XPATH,using = "(//div[contains(text(),'Sec')])[1]")
    public WebElement firstTicket;

    @FindBy(how = How.XPATH,using = "//button[text()='Add Tickets']")
    public WebElement addTickets;

    @FindBy(how = How.XPATH,using = "//div[text()='Items Reserved']")
    public WebElement itemsReserved;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'bL')]")
    public WebElement itemCounter;

    @FindBy(how = How.XPATH,using = "//div[contains(@class,'jt')]")
    public WebElement yourCartCount;

    @FindBy(how = How.XPATH,using = "(//tr[1]//div[@color='axsui.components.table.color'])[2]")
    public WebElement firstTicketSection;

    @FindBy(how = How.XPATH,using = "(//tr[2]//div[@color='axsui.components.table.color'])[1]")
    public WebElement secondTicketSection;

    @FindBy(how = How.XPATH,using = "(//tr[3]//div[@color='axsui.components.table.color'])[1]")
    public WebElement thirdTicketSection;

    @FindBy(how = How.XPATH,using = "//div[@class='col-12']")
    public WebElement mapFiltersDownArrow;

    @FindBy(how = How.XPATH,using = "//div[@class='zoom-in']")
    public WebElement zoomInIcon;
}