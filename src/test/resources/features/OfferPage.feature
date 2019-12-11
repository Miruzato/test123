@OfferPage
Feature: Verify event information

    Scenario Outline: User changes number of tickets

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
        And I click the Best Available button
        And I click the "+" icon 2 times
        And I click the "-" icon 2 times
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User moves price slider
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
        And I click the Best Available button
        And I click Show Price Slider
        And I slide the minimum price dot to $ 5000
        And I slide the minimum price dot to $ 1
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |