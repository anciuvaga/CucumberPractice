package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("User is on registration page");
    }

    @When("user enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> user : userList) {
            System.out.println(user);
        }

    }

    @When("user enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);

//        System.out.println(userList.get(0).get("firstName"));
//        for(Map<String, String> user : userList){
//            System.out.println(user.get("firstName"));
//            System.out.println(user.get("lastName"));
//            System.out.println(user.get("email"));
//            System.out.println(user.get("phone"));
//            System.out.println(user.get("city"));
//            System.out.println();
//        }
        userList.forEach(System.out::println);

    }

    @Then("user registration is successful")
    public void user_registration_is_successful() {
        System.out.println("User registration should be successful");
    }

}
