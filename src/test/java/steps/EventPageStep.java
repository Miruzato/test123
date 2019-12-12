package steps;

import cucumber.api.java.en.And;
import pages.actions.EventPageActions;

public class EventPageStep {
    private EventPageActions eventPageActions = new EventPageActions();

    @And("^I click the event in Upcoming Events$")
    public void iClickTheEventInUpcomingEvents() {
        eventPageActions.clickEvent();
    }

    @And("^I click Event Info$")
    public void iClickEventInfo() {
        eventPageActions.clickEventInfoLink();
    }

    @And("^I verify the event info is displayed$")
    public void iVerifyTheEventInfoIsDisplayed() {
        eventPageActions.verifyEventInfo();
    }

    @And("^I click the All button$")
    public void iClickTheAllButton() {
        eventPageActions.clickAllButton();
    }

    @And("^I verify an old offer appears$")
    public void iVerifyAnOldOfferAppears() {
        eventPageActions.verifyOldOffer();
    }

    @And("^I click the Available button$")
    public void iClickTheAvailableButton() {
        eventPageActions.clickAvailableButton();
    }

    @And("^I verify the first offer is active$")
    public void iVerifyTheFirstOfferIsActive() {
        eventPageActions.verifyOfferIsActive();
    }

    @And("^I scroll through the Offers carousel$")
    public void iScrollThroughTheOffersCarousel() {
        eventPageActions.scrollThroughOffers();
    }

    @And("^I click the Best Available button$")
    public void iClickTheBestAvailableButton() {
        eventPageActions.clickBestAvailableButton();
    }

    @And("^I click the Select on Map button$")
    public void iClickTheSelectOnMapButton() {
        eventPageActions.clickSelectOnMapButton();
    }
}
