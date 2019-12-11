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
}
