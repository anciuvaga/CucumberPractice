
@All
Feature: Uber Booking Feature

  @Smoke @Regression
  Scenario: Booking Cab Sedan
    Given user wants to select a car type "sedan" from uber application
    When user selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then driver starts the journey
    And driver ends the journey
    And user pays 1000 USD

    @Regression
  Scenario: Booking Cab SUV
    Given user wants to select a car type "suv" from uber application
    When user selects car "suv" and pick up point "Bangalore" and drop location "Hyderabad"
    Then driver starts the journey
    And driver ends the journey
    And user pays 1000 USD

   @Prod
  Scenario: Booking Cab Mini
    Given user wants to select a car type "mini" from uber application
    When user selects car "mini" and pick up point "Pune" and drop location "Mumbai "
    Then driver starts the journey
    And driver ends the journey
    And user pays 1000 USD