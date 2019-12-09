package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInLocators {

    @FindBy(how = How.XPATH,using = "//input[@class='sc-jnlKLf gysxrJ']")
    public WebElement search;

    @FindBy(how = How.XPATH,using = "//div[text()='QLA']")
    public WebElement clickQLA;

    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    public WebElement usernameField;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(how = How.XPATH,using = "//button[text()='Sign in']")
    public WebElement signInBtn;

    @FindBy(how = How.XPATH,using = "//h1[text()='Your preferences']")
    public WebElement preferencesPage;

    @FindBy(how = How.XPATH,using = "//div[text()='wrong credentials']")
    public WebElement wrongCredentialsMessage;

}
