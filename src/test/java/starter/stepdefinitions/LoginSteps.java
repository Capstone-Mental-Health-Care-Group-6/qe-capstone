package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Login;

public class LoginSteps {

    @Steps
    Login login;

    // Authentication_login_positive1
    @Given("I set authentication endpoint")
    public void ISetAuthenticationEndpoint() {
        login.ISetAuthenticationEndpoint();
    }

    @And("I send authentication endpoint")
    public void ISendAuthenticationEndpoint() {
        login.ISendAuthenticationEndpoint();
    }

    // Authentication_login_negative1
    @When("I sends a POST request to the login endpoint with incorrect password")
    public void RequestToTheLoginEndpointWithIncorrectPassword() {
        login.RequestToTheLoginEndpointWithIncorrectPassword();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request")
    public void ResponseWithHTTPStatusCodeBad400Request() {
        login.ResponseWithHTTPStatusCodeBad400Request();
    }

    // Authentication_login_negative2
    @When("I sends a POST request to the login endpoint with data not found")
    public void RequestToTheLoginEndpointWithDataNotFound() {
        login.RequestToTheLoginEndpointWithDataNotFound();
    }
}
