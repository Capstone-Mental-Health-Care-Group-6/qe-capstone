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

    // [Negative] POST - Incorrect Password
    @Given("I set authentication endpoint with Incorrect Password")
    public void iSetAuthenticationEndpointWithIncorrectPassword() {
        login.iSetAuthenticationEndpointWithIncorrectPassword();
    }

    @When("I sends a POST request to the login endpoint with admin credentials")
    public void RequestToTheLoginEndpointWithAdminCredentials() {
        login.RequestToTheLoginEndpointWithAdminCredentials();
    }

    @And("I sends a POST request to the login endpoint with doctor credentials")
    public void RequestToTheLoginEndpointWithDoctorCredentials() {
        login.RequestToTheLoginEndpointWithDoctorCredentials();
    }

    @And("I sends a POST request to the login endpoint with patient credentials")
    public void RequestToTheLoginEndpointWithPatientCredentials() {
        login.RequestToTheLoginEndpointWithPatientCredentials();
    }

    @Then("I receive a response with HTTP status code 500 Internal Server Error")
            public void ResponseWithHTTPStatusCode500InternalServerError() {
            login.ResponseWithHTTPStatusCode500InternalServerError();
    }

//    @Then("I receive a response with HTTP status code 400 Bad Request")
//    public void ResponseWithHTTPStatusCode400BadRequest() {
//        login.ResponseWithHTTPStatusCode400BadRequest();
//    }


    // [Negative] POST - Data Not Found
    @Given("I set authentication endpoint with data not found")
    public void iSetAuthenticationEndpointWithDataNotFound() {
        login.iSetAuthenticationEndpointWithDataNotFound();
    }

    @When("I sends a POST request to the login endpoint with admin data not found")
    public void RequestToTheLoginEndpointWithAdminDataNotFound() {
        login.RequestToTheLoginEndpointWithAdminDataNotFound();
    }

    @And("I sends a POST request to the login endpoint with doctor data not found")
    public void RequestToTheLoginEndpointWithDoctorDataNotFound() {
        login.RequestToTheLoginEndpointWithDoctorDataNotFound();
    }

    @And("I sends a POST request to the login endpoint with patient data not found")
    public void RequestToTheLoginEndpointWithPatientDataNotFound() {
        login.RequestToTheLoginEndpointWithPatientDataNotFound();
    }

    @Then("I should receive a response with HTTP status code 500 Internal Server Error")
    public void ResponseWithHTTPStatusCodeInternalServerError() {
        login.ResponseWithHTTPStatusCodeInternalServerError();
    }

//    @Then("I should receive a response with HTTP status code 400 Bad Request")
//    public void iShouldReceiveAResponseWithHTTPStatusCode400BadRequest() {
//        login.iShouldReceiveAResponseWithHTTPStatusCode400BadRequest();
//    }


}
