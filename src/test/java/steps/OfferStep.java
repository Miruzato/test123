package steps;

import cucumber.api.java.en.And;
import pages.actions.OfferActions;

public class OfferStep {
    private OfferActions offerActions = new OfferActions();

    @And("^I click the \"([^\"]*)\" icon (\\d+) times$")
    public void iClickTheIconTimes(String operation, int times) {
        for (int i = 0; i < times; i++) {
            if (operation.equals("+"))
                offerActions.clickPlus();
            else
                offerActions.clickMinus();
        }
    }

    @And("^I click Show Price Slider$")
    public void iClickShowPriceSlider() {
        offerActions.clickShowPriceSlider();
    }

    @And("^I slide the minimum price dot to \\$ (\\d+)$")
    public void iSlideTheMinimumPriceDotTo$(int price) {
        offerActions.slideMinPriceDot(price);
    }

    @And("^I click the Find Tickets button$")
    public void iClickTheFindTicketsButton() {
        offerActions.clickFindTicketsButton();
    }

    @And("^I verify a ticket appears$")
    public void iVerifyATicketAppears() {
        offerActions.verifyTicket();
    }

    @And("^I click Add Tickets$")
    public void iClickAddTickets() {
        offerActions.addTickets();
    }

    @And("^I click Items Reserved$")
    public void iClickItemsReserved() {
        offerActions.clickItemsReserved();
    }

    @And("^I verify there are three tickets$")
    public void iVerifyThereAreThreeTickets() {
        offerActions.verifyThreeTickets();
    }

    @And("^I click the Map Filters down arrow$")
    public void iClickTheMapFiltersDownArrow() {
        offerActions.clickMapFiltersDownArrow();
    }

    @And("^I click the zoom in icon (\\d+) times$")
    public void iClickTheZoomInIconTimes(int times) {
        offerActions.zoomIn(times);
    }

    @And("^I click the map$")
    public void iClickTheMap() {
        offerActions.clickMap();
    }

    @And("^I click the Checkout button$")
    public void iClickTheCheckoutButton() {
        offerActions.clickCheckoutButton();
    }
}
