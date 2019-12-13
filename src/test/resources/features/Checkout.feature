@CheckoutPage
Feature: Checkout tickets

    Scenario Outline: User clicks event info

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
        And I click the Find Tickets button
        And I click Add Tickets
        And I click the "+" icon 1 times
        And I click the Find Tickets button
        And I click the Checkout button
        And I click Event Info on the checkout page
        And I verify the event info is displayed
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User verifies order
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
        And I click the Find Tickets button
        And I click Add Tickets
        And I click the "+" icon 1 times
        And I click the Find Tickets button
        And I click the Checkout button
        And I verify the order summary
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User orders tickets
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
        And I click the Find Tickets button
        And I click Add Tickets
        And I click the "+" icon 1 times
        And I click the Find Tickets button
        And I click the Checkout button
        And I click More Customer Information
        And I enter my customer information
        And I select the "Credit Card" payment method
        And I click the Complete Sale button
        And I click the Manual Entry button
        And I enter my credit card information
        And I click the Charge button
        And I verify the order is complete
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |