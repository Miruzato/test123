@SignIn
Feature: User able to Sign in successfully (positive)

    Scenario Outline: User sign in to wbo

        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        Then I verify I'm on the preferences page
        Examples:
            | username  | password   |
            | mmuerzati | october123 |

    Scenario Outline: User enters wrong credentials

        When I search my Login context
        And I enter the username "<username>"
        And I enter the password "<password>"
        And I click sign in button
        Then I verify the wrong credentials message appears
        Examples:
            | username  | password   |
            | badusername | badpassword |

