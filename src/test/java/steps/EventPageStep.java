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

    @And("^I verify that the event info is displayed$")
    public void iVerifyThatTheEventInfoIsDisplayed() {
        eventPageActions.verifyEventInfo();
    }

    @And("^I click the All button$")
    public void iClickTheAllButton() {
        eventPageActions.clickAllButton();
    }

    @And("^I verify that an old offer appears$")
    public void iVerifyThatAnOldOfferAppears() {
        eventPageActions.verifyOldOffer();
    }

    @And("^I click the Available button$")
    public void iClickTheAvailableButton() {
        eventPageActions.clickAvailableButton();
    }

    @And("^I verify that the first offer is active$")
    public void iVerifyThatTheFirstOfferIsActive() {
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
}
