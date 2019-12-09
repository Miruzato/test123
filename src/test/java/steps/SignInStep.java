package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.SignInActions;

public class SignInStep {
    private SignInActions signInActions = new SignInActions();

    @When("^I search my Login context$")
    public void i_search_my_Login_context() throws Throwable {
        signInActions.enterSearchBox();

    }

    @And("^I enter the username \"([^\"]*)\"$")
    public void iEnterMyUsername(String username) throws InterruptedException {
        signInActions.enterUsername(username);
    }

    @And("^I enter the password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        signInActions.enterPassword(password);
    }

    @And("^I click sign in button$")
    public void i_click_sign_in_button() throws InterruptedException {
        signInActions.clickSignInButton();
    }

    @Then("^I verify I'm on the preferences page$")
    public void iVerifyIMOnThePreferencesPage() throws InterruptedException {
        signInActions.verifyPreferencesPage();

    }

    @Then("^I verify the wrong credentials message appears$")
    public void iVerifyTheWrongCredentialsMessageAppears() {
        signInActions.verifyWrongCredentialsMessage();
    }
}
