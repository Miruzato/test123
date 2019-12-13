@Event
Feature: Verify event information

    Scenario Outline: User looks at event info

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
        And I click Event Info
        And I verify the event info is displayed
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User toggles offers

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
        And I click the All button
        And I verify an old offer appears
        And I click the Available button
        And I verify the first offer is active
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User scrolls through offers

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
        And I scroll through the Offers carousel
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |