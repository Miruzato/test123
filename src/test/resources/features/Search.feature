@Search
Feature: Verify search function

    Scenario Outline: User enters a search term
        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "<eventID>"
        And I click next button
        And I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        And I click the done button
        And I enter the search term "<term>"
        Then I verify an event matching the term "<term>" appears in the results
        Examples:
            | username  | password   | eventID | term |
            | mmuerzati | october123 | 5079    | box office |

    Scenario Outline: User enters a search term that is not found
        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "<eventID>"
        And I click next button
        And I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        And I click the done button
        And I enter the search term "<term>"
        Then I verify there are no results
        Examples:
            | username  | password   | eventID | term |
            | mmuerzati | october123 | 5079    | fake |

    Scenario Outline: User clicks tabs
        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "<eventID>"
        And I click next button
        And I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        And I click the done button
        And I enter the search term "<term>"
        And I click the "Events" search tab
        And I click the "Customers" search tab
        And I click the "Orders" search tab
        And I click the "Tickets" search tab
        And I click the "All" search tab
        Examples:
            | username  | password   | eventID | term |
            | mmuerzati | october123 | 5079    | box office |

    Scenario Outline: User clicks a search result
        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "<eventID>"
        And I click next button
        And I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        And I click the done button
        And I enter the search term "<term>"
        And I click and verify a search result
        Examples:
            | username  | password   | eventID | term |
            | mmuerzati | october123 | 5079    | box office |