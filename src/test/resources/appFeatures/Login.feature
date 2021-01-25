@All
Feature: Login Feature

  Scenario Outline: Login Fail - posible combinations
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks on Sign in button
    Then user gets login failed error message

    Examples:
      | UserName          | Password          |
      | incorrectusername | 1230455           |
      | naveenautomation  | incorrectpassvord |
      | incorrectusername | incorrectpassword |
