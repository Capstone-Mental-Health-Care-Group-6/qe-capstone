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
    @Given("I set authentication endpoint for login")
    public void ISetAuthenticationEndpoint() {
        login.ISetAuthenticationEndpoint();
    }
    @When("I send authentication endpoint for login")
    public void ISendAuthenticationEndpoint() {
        login.ISendAuthenticationEndpoint("doctor");
    }
    @Then("I receive a valid data response for login with HTTP status code 200 OK")
    public void validateLogin200() {
        login.validateLogin200();
    }

    // [Negative] POST - Incorrect Password
    @Given("I set authentication endpoint with Incorrect Password")
    public void IncorrectPassword() {
        login.IncorrectPassword();
    }
    @When("I sends a POST request to the login endpoint with incorrect password")
    public void LoginEndpointWithIncorrectPassword() {
        login.LoginEndpointWithIncorrectPassword("doctor");
    }
    @Then("I receive a response with HTTP status code 400 Bad Request")
    public void ResponseWithHTTPStatusCodeBad400Request() {
        login.ResponseWithHTTPStatusCodeBad400Request();
    }


   /* // Authentication_login_negative2
    @When("I send a POST request to the login endpoint with data not found")
    public void RequestToTheLoginEndpointWithDataNotFound() {
        login.RequestToTheLoginEndpointWithDataNotFound();
    }
*/


}
