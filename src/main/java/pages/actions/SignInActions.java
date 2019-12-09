package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.SignInLocators;
import pages.utils.SeleniumDriver;

public class SignInActions {
    private SignInLocators signInLocators;
    String loginContext= "QLA";


    public SignInActions(){
        this.signInLocators = new SignInLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),signInLocators);
    }

    public void enterSearchBox() throws InterruptedException {
        signInLocators.search.sendKeys(loginContext);
        signInLocators.clickQLA.click();
    }

    public void enterUsername(String username) throws InterruptedException {
        signInLocators.usernameField.sendKeys(username);
    }

    public void enterPassword(String password) throws InterruptedException {
        signInLocators.passwordField.sendKeys(password);
    }
    public void clickSignInButton() throws InterruptedException {
        signInLocators.signInBtn.click();
        Thread.sleep(3000);
    }

    public void verifyPreferencesPage() throws InterruptedException {
         Assert.assertEquals(signInLocators.preferencesPage, signInLocators.preferencesPage );
    }

    public void verifyWrongCredentialsMessage() {
        Assert.assertTrue(signInLocators.wrongCredentialsMessage.isDisplayed());
    }

    }

