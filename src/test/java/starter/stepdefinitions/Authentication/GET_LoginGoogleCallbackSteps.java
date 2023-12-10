package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Authentication.GET_LoginGoogle;
import starter.restapi.Authentication.GET_LoginGoogleCallback;

public class GET_LoginGoogleCallbackSteps {

    @Steps
    GET_LoginGoogleCallback get_loginGoogleCallback;

    @Given("I sets a GET request to a valid endpoint for login google callback endpoint")
    public void ValidEndpointForLoginGoogleCallbackEndpoint() {
        get_loginGoogleCallback.ValidEndpointForLoginGoogleCallbackEndpoint();
    }

    @When("I sends a GET request to the login google callback endpoint")
    public void RequestToTheLoginGoogleCallbackEndpoint() {
        get_loginGoogleCallback.RequestToTheLoginGoogleCallbackEndpoint();

    }

    @Then("I should receive a response with HTTP status code 200")
    public void ResponseWithHTTPStatusCode200() {
        get_loginGoogleCallback.ResponseWithHTTPStatusCode200();
    }
}