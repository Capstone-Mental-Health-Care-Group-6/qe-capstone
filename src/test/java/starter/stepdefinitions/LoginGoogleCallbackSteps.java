package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.LoginGoogleCallback;

public class LoginGoogleCallbackSteps {

    @Steps
    LoginGoogleCallback get_loginGoogleCallback;

    // # [Positive] GET - Success LoginAdmin Google Callback
    @Given("I sets a GET request to a valid endpoint for login google callback endpoint")
    public void ValidEndpointForLoginGoogleCallbackEndpoint() {
        get_loginGoogleCallback.ValidEndpointForLoginGoogleCallbackEndpoint();
    }

    @When("I sends a GET request to the login google callback endpoint")
    public void RequestToTheLoginGoogleCallbackEndpoint() {
        get_loginGoogleCallback.RequestToTheLoginGoogleCallbackEndpoint();
    }

    @Then("I should receive a response with HTTP status code 500")
    public void ResponseWithHTTPStatusCode500() {
        get_loginGoogleCallback.ResponseWithHTTPStatusCode500();
    }
}
//    @Then("I should receive a response with HTTP status code 200")
//    public void ResponseWithHTTPStatusCode200() {
//        get_loginGoogleCallback.ResponseWithHTTPStatusCode200();
//    }
//}
