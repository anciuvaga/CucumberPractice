Feature: Calculate billing amount
  Scenario Outline: Billing Amount
    Given user is on Billing page
    When user enters billing amount "<billing_amount>"
    And user enters tax amount "<tax_amount>"
    And user clicks on calculate button
    Then it gives the final amount "<final_amount>"
    Examples:
      | billing_amount | tax_amount | final_amount |
      | 1000           | 10         | 1010         |
      | 500            | 20         | 520          |
      | 100            | 5.5        | 105.5        |
