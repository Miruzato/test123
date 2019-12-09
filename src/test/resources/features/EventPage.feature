@EventPage
Feature: Verify event information

    Scenario Outline: User goes to event page

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
        And I click the event in Upcoming Events
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |
