package steps;

import cucumber.api.java.en.And;
import pages.actions.EventPageActions;

public class EventPageStep {
    private EventPageActions eventPageActions = new EventPageActions();

    @And("^I click the event in Upcoming Events$")
    public void iClickTheEventInUpcomingEvents() {
        eventPageActions.clickEvent();
    }
}
