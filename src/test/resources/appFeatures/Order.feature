Feature: Amazon Order Feature
  In order to check my order details
  As a registered user
  I want to specify the feature of order details page

  Background:
    Given a registered user exists
    And user is on Amazon login page
    When user enters username
    And user enters password
    And user click on login button
    Then user navigates to Order page

  Scenario: Check previous Order Details
    When user clicks on Order Link
    Then user checks the previous order details

  Scenario: Check open Order details
    When user clicks on Order Link
    Then user checks the open order details

  Scenario: Check cancelled Order details
    When user clicks on Order Link
    Then user checks the cancelled order details



