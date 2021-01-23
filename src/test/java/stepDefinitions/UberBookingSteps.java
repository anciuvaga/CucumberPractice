package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

    @Given("user wants to select a car type {string} from uber application")
    public void userWantsToSelectaCarTypeFromUberApplication(String car) {
        System.out.println("Step 1: select car: " + car);
    }

    @When("user selects car {string} and pick up point {string} and drop location {string}")
    public void userSelectsCarAndPickUpPointAndDropLocation(String car, String pickUpPoint, String dropOffPoint) {
        System.out.println("Step 2: selected car: " + car + " pick up: " + pickUpPoint + " dropOff: " + dropOffPoint );
    }
    @Then("driver starts the journey")
    public void driverStartsTheJourney() {
        System.out.println("Step 3: start the journey");
    }
    @Then("driver ends the journey")
    public void driverEndsTheJourney() {
        System.out.println("Step 4: end the journey");
    }
    @Then("user pays {int} USD")
    public void userPaysUsd(int price) {
        System.out.println("Step 5: pay price: " + price);
    }

}
