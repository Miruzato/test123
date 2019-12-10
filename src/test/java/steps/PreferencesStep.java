package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.PreferencesActions;

public class PreferencesStep {
private PreferencesActions preferencesActions = new PreferencesActions();

    @When("^I select current outlet$")
    public void i_select_current_oulet() throws Throwable {
    preferencesActions.enterCurrentOutlet();
    }

    @And("^I select current selling location$")
    public void i_select_current_selling_location() throws Throwable {
    preferencesActions.selectCurrentSellingLocation();
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnterEventID(String eventID) throws Throwable {
        preferencesActions.enterEventID(eventID);
    }

    @And("^I click next button$")
    public void i_click_next_button() throws Throwable {
        preferencesActions.clickNextButton();
    }

    @Then("^I verify I'm on the printing preferences page$")
    public void i_verify_I_m_on_the_printing_preferences_page() throws Throwable {
        preferencesActions.verifyPrintingPreferencesPage();
    }

    @And("^I select printer$")
    public void iSelectPrinter() {
        preferencesActions.selectPrinter();
    }

    @And("^I select ticket printing$")
    public void iSelectTicketPrinting() {
        preferencesActions.selectTicketPrinting();
    }

    @And("^I select printing stock$")
    public void iSelectPrintingStock() {
        preferencesActions.selectPrintingStock();
    }

    @And("^I select printer type$")
    public void iSelectPrinterType() {
        preferencesActions.selectPrinterType();
    }

    @And("^I click the done button$")
    public void iClickTheDoneButton() {
        preferencesActions.clickDoneButton();
    }

    @And("^I verify the Upcoming Events appear$")
    public void iVerifyTheUpcomingEventsAppear() {
        preferencesActions.verifyUpcomingEvents();
    }

    @And("^I verify the event is in Upcoming Events$")
    public void iVerifyTheEventIsInUpcomingEvents() {
        preferencesActions.verifyEventInUpcomingEvents();
    }

    @And("^I scroll through the Upcoming Events carousel$")
    public void iScrollThroughTheUpcomingEventsCarousel() {
        preferencesActions.scrollThroughUpcomingEvents();
    }
}
