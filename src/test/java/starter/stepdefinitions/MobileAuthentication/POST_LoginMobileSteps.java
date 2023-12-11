package starter.stepdefinitions.MobileAuthentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.MobileAuthentication.POST_LoginMobile;

public class POST_LoginMobileSteps {
    @Steps
    POST_LoginMobile post_loginMobile;

    // [Positive] POST - Login Success
    @Given("I set the authentication mobile endpoint")
    public void AuthenticationMobileEndpoint() {
        post_loginMobile.AuthenticationMobileEndpoint();
    }

    @And("I send a POST request to the authentication mobile endpoint")
    public void RequestToTheAuthenticationMobileEndpoint() {
        post_loginMobile.RequestToTheAuthenticationMobileEndpoint();
    }

    @Then("I should receive a response with HTTP status code 200 OK and successfully log in")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn() {
        post_loginMobile.ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn();
    }

    // [Negative] POST - Login Error Password Invalid
    @When("I send a POST request to the login endpoint with an invalid Password")
    public void RequestToTheLoginEndpointWithAnInvalidPassword() {
        post_loginMobile.RequestToTheLoginEndpointWithAnInvalidPassword();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request and invalid Password")
    public void ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword() {
        post_loginMobile.ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword();
    }

    // [Positive] POST - Login Success update Password
    @When("I send a POST request to the login endpoint with a successful password update")
    public void RequestToTheLoginEndpointWithASuccessfulPasswordUpdate() {
        post_loginMobile.RequestToTheLoginEndpointWithASuccessfulPasswordUpdate();
    }

    @Then("I should receive a response with HTTP status code 200 OK and successful password update")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfulPasswordUpdate() {
        post_loginMobile.ResponseWithHTTPStatusCode200OKAndSuccessfulPasswordUpdate();
    }
}
