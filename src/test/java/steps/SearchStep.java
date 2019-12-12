package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.SearchActions;

public class SearchStep {
    private SearchActions searchActions = new SearchActions();

    @And("^I enter the search term \"([^\"]*)\"$")
    public void iEnterTheSearchTerm(String term) {
        searchActions.enterSearchTerm(term);
    }

    @Then("^I verify an event matching the term \"([^\"]*)\" appears in the results$")
    public void iVerifyAnEventMatchingTheTermAppearsInTheResults(String term) {
        searchActions.verifyMatchingEvent(term);
    }

    @Then("^I verify there are no results$")
    public void iVerifyThereAreNoResults() {
        searchActions.verifyNoResults();
    }

    @And("^I click the \"([^\"]*)\" search tab$")
    public void iClickTheSearchTab(String tab) throws Throwable {
        searchActions.clickSearchTab(tab);
    }

    @And("^I click and verify a search result$")
    public void iClickAndVerifyASearchResult() {
        searchActions.clickAndVerifySearchResult();
    }
}
