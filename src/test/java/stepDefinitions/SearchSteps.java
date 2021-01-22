package stepDefinitions;

import appPages.Product;
import appPages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    Product product;
    Search search;

    @Given("I have a search field on Amazon Page")
    public void iHaveASearchFieldOnAmazonPage(){
        System.out.println("Step 1: I am on Search page");
    }

    @When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
    public void iSearchForAProductWithNameAndPrice(String productName, int price){
        System.out.println("Step 2: Search the product with name: " + productName + " price : " + price);

        product = new Product (productName, price);

        System.out.println("Product object created: " + product.getProductName());
        System.out.println("Print productList: " + product.getProductList());
    }

    @Then("Product with name {string} should be displayed")
    public void productWithNameShouldBeDisplayed(String productName){
        System.out.println("Step 3: product " + productName + " is displayed");

        search = new Search();
        String name = search.displayProduct(product);
        System.out.println("Searched product is :" + name);

        Assert.assertEquals(product.getProductName(), name);
    }

}
