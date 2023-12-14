package starter.stepdefinitions;

import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_AdminArticle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Web_AdminArticleSteps {

    @Steps
    Web_AdminArticle webAdminArticle;

    // [Positive] PUT - Approve Article
    @Given("I set the PUT endpoint for approving an article")
    public void setPutEndpointForApprovingArticle() {
        webAdminArticle.setPutEndpointForApprovingArticle();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for approving an article")
    public void sendPutRequestForApprovingArticle() {
        webAdminArticle.sendPutRequestForApprovingArticle();
    }

    @Then("I receive a valid data response for approving an article with HTTP status code 200 OK")
    public void validateApproveArticleResponse() {
        webAdminArticle.validateApproveArticleResponse();
    }

    // [Negative] PUT - Approve Article Invalid Input Param
    @Given("I set the PUT endpoint for approving an article with invalid input parameters")
    public void setPutEndpointForApprovingArticleWithInvalidInput() {
        webAdminArticle.setPutEndpointForApprovingArticleWithInvalidInput();
    }

    @When("I send an HTTP PUT request with invalid baseURL for approving an article with invalid input parameters")
    public void sendPutRequestForApprovingArticleWithInvalidInput() {
        webAdminArticle.sendPutRequestForApprovingArticleWithInvalidInput();
    }

    @Then("I receive a valid data response for approving an article with invalid input parameters with HTTP status code 400 Bad Request")
    public void validateApproveArticleInvalidInputResponse() {
        webAdminArticle.validateApproveArticleInvalidInputResponse();
    }

    // [Positive] PUT - Deny Article
    @Given("I set the PUT endpoint for denying an article")
    public void setPutEndpointForDenyingArticle() {
        webAdminArticle.setPutEndpointForDenyingArticle();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for denying an article")
    public void sendPutRequestForDenyingArticle() {
        webAdminArticle.sendPutRequestForDenyingArticle();
    }

    @Then("I receive a valid data response for denying an article with HTTP status code 200 OK")
    public void validateDenyArticleResponse() {
        webAdminArticle.validateDenyArticleResponse();
    }

    // [Negative] PUT - Deny Article Invalid Input Param
    @Given("I set the PUT endpoint for denying an article with invalid input parameters")
    public void setPutEndpointForDenyingArticleWithInvalidInput() {
        webAdminArticle.setPutEndpointForDenyingArticleWithInvalidInput();
    }

    @When("I send an HTTP PUT request with invalid baseURL for denying an article with invalid input parameters")
    public void sendPutRequestForDenyingArticleWithInvalidInput() {
        webAdminArticle.sendPutRequestForDenyingArticleWithInvalidInput();
    }

    @Then("I receive a valid data response for denying an article with invalid input parameters with HTTP status code 400 Bad Request")
    public void validateDenyArticleInvalidInputResponse() {
        webAdminArticle.validateDenyArticleInvalidInputResponse();
    }

    // [Positive] GET - Get All Article
    @Given("I set the GET endpoint for retrieving all articles")
    public void setGetEndpointForAllArticles() {
        webAdminArticle.setGetEndpointForAllArticles();
    }

    @When("I send an HTTP GET request with valid baseURL for retrieving all articles")
    public void sendGetRequestForAllArticles() {
        webAdminArticle.sendGetRequestForAllArticles();
    }

    @Then("I receive a valid data response for retrieving all articles with HTTP status code 200 OK")
    public void validateAllArticlesResponse() {
        webAdminArticle.validateAllArticlesResponse();
    }

    // [Negative] GET - Get All Article Invalid Endpoint
    @Given("I set the GET endpoint for retrieving all articles with an invalid endpoint")
    public void setGetEndpointForAllArticlesWithInvalidEndpoint() {
        webAdminArticle.setGetEndpointForAllArticlesWithInvalidEndpoint();
    }

    @When("I send an HTTP GET request with invalid baseURL for retrieving all articles with an invalid endpoint")
    public void sendGetRequestForAllArticlesWithInvalidEndpoint() {
        webAdminArticle.sendGetRequestForAllArticlesWithInvalidEndpoint();
    }

    @Then("I receive a valid data response for retrieving all articles with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateAllArticlesInvalidEndpointResponse() {
        webAdminArticle.validateAllArticlesInvalidEndpointResponse();
    }

}
