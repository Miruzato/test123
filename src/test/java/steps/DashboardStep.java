package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.DashboardActions;

public class DashboardStep {
    private DashboardActions dashboardActions = new DashboardActions();

    @And("^I click All Venues$")
    public void iClickAllVenues() {
        dashboardActions.clickAllVenuesDropdown();
    }

    @And("^I uncheck all the venue boxes$")
    public void iUncheckAllTheVenueBoxes() {
        dashboardActions.uncheckVenueCheckboxes();
    }

    @And("^I verify there are no venues$")
    public void iVerifyThereAreNoVenues() {
        dashboardActions.verifyNoVenues();
    }

    @And("^I check the All Venues checkbox$")
    public void iCheckTheAllVenuesCheckbox() {
        dashboardActions.checkAllVenuesCheckbox();
    }

    @Then("^I verify the event is in the venues calendar$")
    public void iVerifyTheEventIsInTheVenuesCalendar() {
        dashboardActions.verifyEventInVenues();
    }

    @And("^I click All Categories$")
    public void iClickAllCategories() {
        dashboardActions.clickAllCategoriesDropdown();
    }

    @And("^I uncheck all the category boxes$")
    public void iUncheckAllTheCategoryBoxes() {
        dashboardActions.uncheckCategoryCheckboxes();
    }

    @And("^I check the All Categories checkbox$")
    public void iCheckTheAllCategoriesCheckbox() {
        dashboardActions.checkAllCategoriesCheckbox();
    }

    @Then("^I scroll through the Venues carousel$")
    public void iScrollThroughTheVenuesCarousel() {
        dashboardActions.scrollThroughVenues();
    }
}
