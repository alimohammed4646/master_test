package tusharpro;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by ali1 on 17/08/2017.
 */
public class MyStepDef {
    Elements element= new Elements();

    @Given("^user on home page$")
    public void user_on_home_page()  {
        element.isOnSearchPAge();

    }

    @When("^user search for product$")
    public void user_search_for_product()  {
        element.searchForProduct();

    }

    @Then("^user should see relevant product$")
    public void user_should_see_relevant_product()  {
        element.seeTheRelevantProduct();

    }
}
