@Preferences
Feature: Verify location preferences

    Background: Flow until next button
        When I search my Login context
        And I enter the username "mmuerzati"
        And I enter the password "october123"
        And I click sign in button
        And I select current outlet
        And I select current selling location
        And I enter "5079"
        Then I click next button

    Scenario: User setting up location preferences
        Then I verify I'm on the printing preferences page

    Scenario: User setting up printing preferences
        When I select printer
        And I select ticket printing
        And I select printing stock
        And I select printer type
        And I click the done button
        And I verify the Upcoming Events appear
        And I verify the event is in Upcoming Events
        And I scroll through the Upcoming Events carousel
        Then I verify the event is in the venues calendar