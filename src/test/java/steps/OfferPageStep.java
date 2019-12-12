package steps;

import cucumber.api.java.en.And;
import pages.actions.OfferPageActions;

public class OfferPageStep {
    private OfferPageActions offerPageActions = new OfferPageActions();

    @And("^I click the \"([^\"]*)\" icon (\\d+) times$")
    public void iClickTheIconTimes(String operation, int times) {
        for (int i = 0; i < times; i++) {
            if (operation.equals("+"))
                offerPageActions.clickPlus();
            else
                offerPageActions.clickMinus();
        }
    }

    @And("^I click Show Price Slider$")
    public void iClickShowPriceSlider() {
        offerPageActions.clickShowPriceSlider();
    }

    @And("^I slide the minimum price dot to \\$ (\\d+)$")
    public void iSlideTheMinimumPriceDotTo$(int price) {
        offerPageActions.slideMinPriceDot(price);
    }

    @And("^I click the Find Tickets button$")
    public void iClickTheFindTicketsButton() {
        offerPageActions.clickFindTicketsButton();
    }

    @And("^I verify a ticket appears$")
    public void iVerifyATicketAppears() {
        offerPageActions.verifyTicket();
    }

    @And("^I click Add Tickets$")
    public void iClickAddTickets() {
        offerPageActions.addTickets();
    }

    @And("^I click Items Reserved$")
    public void iClickItemsReserved() {
        offerPageActions.clickItemsReserved();
    }

    @And("^I verify there are three tickets$")
    public void iVerifyThereAreThreeTickets() {
        offerPageActions.verifyThreeTickets();
    }

    @And("^I click the Map Filters down arrow$")
    public void iClickTheMapFiltersDownArrow() {
        offerPageActions.clickMapFiltersDownArrow();
    }

    @And("^I click the zoom in icon (\\d+) times$")
    public void iClickTheZoomInIconTimes(int times) {
        offerPageActions.zoomIn(times);
    }
}
