package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_AdminArticlesCategory;

public class Web_AdminArticlesCategorySteps {

    @Steps
    Web_AdminArticlesCategory adminArticlesCategory;


    // [Positive] GET - Success Get All
    @Given("I set authentication endpoint to retrieve article categories")
    public void iSetAuthenticationEndpointToRetrieveArticleCategories() {
        adminArticlesCategory.iSetAuthenticationEndpointToRetrieveArticleCategories();
    }

    @When("I send an HTTP GET request to fetch articles categories using a valid endpoint")
    public void RequestToFetchArticlesCategoriesUsingAValidEndpoint() {
        adminArticlesCategory.RequestToFetchArticlesCategoriesUsingAValidEndpoint();
    }

    @Then("I should receive a valid HTTP response with status code 200 for articles categories")
    public void ValidHTTPResponseWithStatusCode200ForArticlesCategories() {
        adminArticlesCategory.ValidHTTPResponseWithStatusCode200ForArticlesCategories();
    }

    // [Positive] POST - Success Create
    @Given("I set a POST request to a valid endpoint for creating a new articles category")
    public void iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory() {
        adminArticlesCategory.iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory();
    }

    @When("I send the POST request to create a new articles category")
    public void iSendThePOSTRequestToCreateANewArticlesCategory() {
        adminArticlesCategory.iSendThePOSTRequestToCreateANewArticlesCategory();
    }

    @Then("I receive an HTTP response with code 201 for creating a new articles category")
    public void ResponseWithCode201ForCreatingANewArticlesCategory() {
        adminArticlesCategory.ResponseWithCode201ForCreatingANewArticlesCategory();
    }

    // [Negative] POST - Input Error
    @Given("I set a POST request with invalid input for creating a new articles category")
    public void InvalidInputForCreatingANewArticlesCategory() {
        adminArticlesCategory.InvalidInputForCreatingANewArticlesCategory();
    }

    @When("I send the POST request with invalid input for creating a new articles category")
    public void iSendThePOSTRequestWithInvalidInputForCreatingANewArticlesCategory() {
        adminArticlesCategory.iSendThePOSTRequestWithInvalidInputForCreatingANewArticlesCategory();
    }

    @Then("I receive an HTTP response with code 400 for creating a new articles category")
    public void ResponseWithCode400ForCreatingANewArticlesCategory() {
        adminArticlesCategory.ResponseWithCode400ForCreatingANewArticlesCategory();
    }

    // [Positive] GET - Success Get By ID
    @Given("I set a valid GET endpoint for articles category by ID")
    public void iSetAValidGETEndpointForArticlesCategoryByID() {
        adminArticlesCategory.iSetAValidGETEndpointForArticlesCategoryByID();
    }

    @When("I sends a GET HTTP request with a valid endpoint for articles category by ID")
    public void RequestWithAValidEndpointForArticlesCategoryByID() {
        adminArticlesCategory.RequestWithAValidEndpointForArticlesCategoryByID();

    }

    @Then("I receives a valid GET HTTP response with a status code of 200 for articles category by ID")
    public void ResponseWithAStatusCodeOf200ForArticlesCategoryByID() {
        adminArticlesCategory.ResponseWithAStatusCodeOf200ForArticlesCategoryByID();
    }

    //  [Negative] GET - Invalid User Input
    @Given("I set an valid GET endpoint for articles category by ID")
    public void iSetAnValidGETEndpointForArticlesCategoryByID() {
        adminArticlesCategory.iSetAnValidGETEndpointForArticlesCategoryByID();
    }

    @When("I sends a GET HTTP request with an invalid user input for articles category by ID")
    public void iSendsAGETHTTPRequestWithAnInvalidUserInputForArticlesCategoryByID() {
        adminArticlesCategory.iSendsAGETHTTPRequestWithAnInvalidUserInputForArticlesCategoryByID();
    }

    @Then("I receives a GET HTTP response with a status code of 400 for articles category by ID")
    public void ResponseWithAStatusCode400OfForArticlesCategoryByID() {
        adminArticlesCategory.ResponseWithAStatusCode400OfForArticlesCategoryByID();

    }
    // [Positive] PUT - Success Update
    @Given("I set a valid PUT endpoint Update Articles Category")
    public void iSetAValidPUTEndpointUpdateArticlesCategory() {
        adminArticlesCategory.iSetAValidPUTEndpointUpdateArticlesCategory();
    }

    @When("I sends a PUT HTTP request Update Articles Category")
    public void iSendsAPUTHTTPRequestUpdateArticlesCategory() {
        adminArticlesCategory.iSendsAPUTHTTPRequestUpdateArticlesCategory();
    }

    @Then("I receives an HTTP response code 405 with valid endpoint")
    public void ResponseCode405WithValidEndpoint() {
        adminArticlesCategory.ResponseCode405WithValidEndpoint();
    }


//    @Then("I receives an HTTP response code 200 with valid endpoint")
//    public void ResponseCode200WithValidEndpoint() {
//        adminArticlesCategory.ResponseCode200WithValidEndpoint();
//    }

    //  [Negative] PUT - Invalid Param ID
    @Given("I set an valid PUT endpoint Update Articles Category with an invalid param ID")
    public void iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID() {
        adminArticlesCategory.iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID();
    }

    @When("I sends a PUT HTTP request Update Articles Category with an invalid param ID")
    public void RequestUpdateArticlesCategoryWithAnInvalidParamID() {
        adminArticlesCategory.RequestUpdateArticlesCategoryWithAnInvalidParamID();
    }

    @Then("I receives an HTTP response code 405 with invalid param ID")
    public void ResponseCode405WithInvalidParamID() {
        adminArticlesCategory.ResponseCode405WithInvalidParamID();
    }

//    @Then("I receives an HTTP response code 400 with invalid param ID")
//    public void ResponseCode400WithInvalidParamID() {
//        adminArticlesCategory.ResponseCode400WithInvalidParamID();
//    }

    // [Negative] PUT - Invalid User Input
    @Given("I set an valid PUT endpoint Update Articles Category with an invalid user input")
    public void ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput() {
        adminArticlesCategory.ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput();
    }

    @When("I sends a PUT HTTP request Update Articles Category with an invalid user input")
    public void RequestUpdateArticlesCategoryWithAnInvalidUserInput() {
        adminArticlesCategory.RequestUpdateArticlesCategoryWithAnInvalidUserInput();
    }


    @Then("I receives an HTTP response code 405 with invalid user input")
    public void ResponseCode405WithInvalidUserInput() {
        adminArticlesCategory.ResponseCode405WithInvalidUserInput();
    }

//    @Then("I receives an HTTP response code 400 with invalid user input")
//    public void ResponseCode400WithInvalidUserInput() {
//        adminArticlesCategory.ResponseCode400WithInvalidUserInput();
//    }

    // [Positive] DEL - Delete Success
    @Given("I set the DELETE endpoint to a valid endpoint")
    public void iSetTheDELETEEndpointToAValidEndpoint() {
        adminArticlesCategory.iSetTheDELETEEndpointToAValidEndpoint();
    }

    @When("I send a DELETE HTTP request with a valid endpoint")
    public void iSendADELETEHTTPRequestWithAValidEndpoint() {
        adminArticlesCategory.iSendADELETEHTTPRequestWithAValidEndpoint();
    }

    @Then("I receive a DELETE HTTP response with a status code of 204 for the valid endpoint")
    public void ResponseWithAStatusCodeOf204ForTheValidEndpoint() {
        adminArticlesCategory.ResponseWithAStatusCodeOf204ForTheValidEndpoint();
    }

    // [Negative] DEL - Delete Invalid Param ID
    @Given("I set the DELETE endpoint to an Invalid Param ID")
    public void iSetTheDELETEEndpointToAnInvalidParamID() {
        adminArticlesCategory.iSetTheDELETEEndpointToAnInvalidParamID();
    }

    @When("I send a DELETE HTTP request with an invalid param ID")
    public void iSendADELETEHTTPRequestWithAnInvalidParamID() {
        adminArticlesCategory.iSendADELETEHTTPRequestWithAnInvalidParamID();
    }


    @Then("I receive a DELETE HTTP response with a status code of 400 for the invalid param ID")
    public void ResponseWithAStatusCodeOf400ForTheInvalidParamID() {
        adminArticlesCategory.ResponseWithAStatusCodeOf400ForTheInvalidParamID();
    }
//    @Then("I receive a DELETE HTTP response with a status code of 404 for the invalid param ID")
//    public void ResponseWithAStatusCodeOf404ForTheInvalidParamID() {
//        adminArticlesCategory.ResponseWithAStatusCodeOf404ForTheInvalidParamID();
//    }



}
