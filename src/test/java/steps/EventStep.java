package steps;

import cucumber.api.java.en.And;
import pages.actions.EventActions;

public class EventStep {
    private EventActions eventActions = new EventActions();

    @And("^I click the event in Upcoming Events$")
    public void iClickTheEventInUpcomingEvents() {
        eventActions.clickEvent();
    }

    @And("^I click Event Info$")
    public void iClickEventInfo() {
        eventActions.clickEventInfoLink();
    }

    @And("^I verify the event info is displayed$")
    public void iVerifyTheEventInfoIsDisplayed() {
        eventActions.verifyEventInfo();
    }

    @And("^I click the All button$")
    public void iClickTheAllButton() {
        eventActions.clickAllButton();
    }

    @And("^I verify an old offer appears$")
    public void iVerifyAnOldOfferAppears() {
        eventActions.verifyOldOffer();
    }

    @And("^I click the Available button$")
    public void iClickTheAvailableButton() {
        eventActions.clickAvailableButton();
    }

    @And("^I verify the first offer is active$")
    public void iVerifyTheFirstOfferIsActive() {
        eventActions.verifyOfferIsActive();
    }

    @And("^I scroll through the Offers carousel$")
    public void iScrollThroughTheOffersCarousel() {
        eventActions.scrollThroughOffers();
    }

    @And("^I click the Best Available button$")
    public void iClickTheBestAvailableButton() {
        eventActions.clickBestAvailableButton();
    }

    @And("^I click the Select on Map button$")
    public void iClickTheSelectOnMapButton() {
        eventActions.clickSelectOnMapButton();
    }
}
