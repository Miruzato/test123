@Preferences
Feature: Verify location preferences

    Scenario Outline: User setting up location preferences

        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        And I select current outlet
        And  I select current selling location
        And  I enter "<eventID>"
        And  I click next button
        Then I verify I'm on the printing preferences page
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User setting up printing preferences

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
        And I verify the Upcoming Events appear
        And I verify the event is in Upcoming Events
        And I scroll through the Upcoming Events carousel
        Then I verify the event is in the venues calendar
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User filtering by venue

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
        And I click All Venues
        And I uncheck all the venue boxes
        And I verify there are no venues
        And I check the All Venues checkbox
        Then I verify the event is in the venues calendar
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User filtering by category

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
        And I click All Categories
        And I uncheck all the category boxes
        And I verify there are no venues
        And I check the All Categories checkbox
        Then I verify the event is in the venues calendar
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |

    Scenario Outline: User scrolls through Venues carousel

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
        And I scroll through the Venues carousel
        Examples:
            | username  | password   | eventID |
            | mmuerzati | october123 | 5079    |