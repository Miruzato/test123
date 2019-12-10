@Dashboard
Feature: Verify dashboard features

    Background: Flow until next button
        When I search my Login context
        And I enter the username "mmuerzati"
        And I enter the password "october123"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "5079"
        And I click next button
        And I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        Then I click the done button

    Scenario: User filtering by venue
        When I click All Venues
        And I uncheck all the venue boxes
        And I verify there are no venues
        And I check the All Venues checkbox
        Then I verify the event is in the venues calendar

    Scenario: User filtering by category
        When I click All Categories
        And I uncheck all the category boxes
        And I verify there are no venues
        And I check the All Categories checkbox
        Then I verify the event is in the venues calendar

    Scenario: User scrolls through Venues carousel
        Then I scroll through the Venues carousel