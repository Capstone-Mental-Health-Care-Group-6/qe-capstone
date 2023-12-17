package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.LoginGoogle;

public class LoginGoogleSteps {
    @Steps
    LoginGoogle get_loginGoogle;

    // [Positive] GET - LoginAdmin Google Redirect to Callback
    @Given("I sets a GET request to a valid endpoint for login google endpoint")
    public void RequestToAValidEndpointForLoginGoogleEndpoint() {
        get_loginGoogle.RequestToAValidEndpointForLoginGoogleEndpoint();
    }

    @When("I sends a GET request to the login google endpoint for redirection to callback")
    public void RequestToTheLoginGoogleEndpointForRedirectionToCallback() {
        get_loginGoogle.RequestToTheLoginGoogleEndpointForRedirectionToCallback();

    }

    @Then("I should receive a response with HTTP status code 200 OK")
    public void ResponseWithHTTPStatusCode200OK() {
        get_loginGoogle.ResponseWithHTTPStatusCode200OK();
    }
}
