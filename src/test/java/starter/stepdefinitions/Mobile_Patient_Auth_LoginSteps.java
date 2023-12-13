package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Mobile_Patient_Auth_Login;

public class Mobile_Patient_Auth_LoginSteps {
    @Steps
    Mobile_Patient_Auth_Login mobilePatientAuthLogin;

    // [Positive] POST - Login Success
    @Given("I set the authentication mobile endpoint")
    public void AuthenticationMobileEndpoint() {
        mobilePatientAuthLogin.AuthenticationMobileEndpoint();
    }

    @And("I send a POST request to the authentication mobile endpoint")
    public void RequestToTheAuthenticationMobileEndpoint() {
        mobilePatientAuthLogin.RequestToTheAuthenticationMobileEndpoint();
    }

    @Then("I should receive a response with HTTP status code 200 OK and successfully log in")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn() {
        mobilePatientAuthLogin.ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn();
    }

    // [Negative] POST - Login Error Password Invalid
    @When("I send a POST request to the login endpoint with an invalid Password")
    public void RequestToTheLoginEndpointWithAnInvalidPassword() {
        mobilePatientAuthLogin.RequestToTheLoginEndpointWithAnInvalidPassword();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request and invalid Password")
    public void ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword() {
        mobilePatientAuthLogin.ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword();
    }

    // [Positive] POST - Login Success update Password
    @When("I send a POST request to the login endpoint with a successful password update")
    public void RequestToTheLoginEndpointWithASuccessfulPasswordUpdate() {
        mobilePatientAuthLogin.RequestToTheLoginEndpointWithASuccessfulPasswordUpdate();
    }

    @Then("I should receive a response with HTTP status code 200 OK and successful password update")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfulPasswordUpdate() {
        mobilePatientAuthLogin.ResponseWithHTTPStatusCode200OKAndSuccessfulPasswordUpdate();
    }
}
