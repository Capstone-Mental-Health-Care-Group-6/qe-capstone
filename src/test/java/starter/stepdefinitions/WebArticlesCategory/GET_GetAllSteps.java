package starter.stepdefinitions.WebArticlesCategory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.WebArticlesCategory.GET_GetAll;

public class GET_GetAllSteps {
    @Steps
    GET_GetAll get_getAll;

    // [Positive] GET - Success Get All
    @Given("I set authentication endpoint to retrieve article categories")
    public void iSetAuthenticationEndpointToRetrieveArticleCategories() {
        get_getAll.iSetAuthenticationEndpointToRetrieveArticleCategories();
    }

    @When("I send an HTTP GET request to fetch articles categories using a valid endpoint")
    public void RequestToFetchArticlesCategoriesUsingAValidEndpoint() {
        get_getAll.RequestToFetchArticlesCategoriesUsingAValidEndpoint();
    }

    @Then("I should receive a valid HTTP response with status code 200 for articles categories")
    public void ValidHTTPResponseWithStatusCode200ForArticlesCategories() {
        get_getAll.ValidHTTPResponseWithStatusCode200ForArticlesCategories();
    }

}
