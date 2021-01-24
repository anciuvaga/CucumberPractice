@All
Feature: User Registration

  Scenario: User registration with different data

    Given user is on registration page
    When user enters following user details
      | naveen | automation | nav_gmail.com   | 12525 | Bangalore |
      | john   | manual     | john_gmail.com  | 12524 | Mumbai    |
      | vanea  | tester     | vanea_gmail.com | 12523 | New Delly |
    Then user registration is successful

  Scenario: User registration with different data with columns

    Given user is on registration page
    When user enters following user details with columns
      | firstName | lastName   | email           | phone | city      |
      | naveen    | automation | nav_gmail.com   | 12525 | Bangalore |
      | john      | manual     | john_gmail.com  | 12524 | Mumbai    |
      | vanea     | tester     | vanea_gmail.com | 12523 | New Delly |
    Then user registration is successful

