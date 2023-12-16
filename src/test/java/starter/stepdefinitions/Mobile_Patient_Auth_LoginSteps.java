package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Mobile_Patient_Auth_Login;
import starter.restapi.Mobile_Patient_Auth_UpdatePw;

public class Mobile_Patient_Auth_LoginSteps {
    @Steps
    Mobile_Patient_Auth_Login mobilePatientAuthLogin;

    @Steps
    Mobile_Patient_Auth_UpdatePw mobilePatientAuthLoginUpdatePW;

    // [Positive] POST - LoginAdmin Success
    @Given("I set the authentication mobile endpoint")
    public void AuthenticationMobileEndpoint() {
        mobilePatientAuthLogin.AuthenticationMobileEndpoint();
    }

    @When("I send a POST request to the authentication mobile endpoint")
    public void RequestToTheAuthenticationMobileEndpoint() {
        String emailPatient = "nurulfauziah2@gmail.com";
        String pwPatient = "fauzi123";
        mobilePatientAuthLogin.RequestToTheAuthenticationMobileEndpoint(emailPatient, pwPatient);
    }

    @Then("I should receive a response with HTTP status code 200 OK and successfully log in")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn() {
        mobilePatientAuthLogin.ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn();
    }

    // [Negative] POST - LoginAdmin Error Password Invalid

    @When("I send a POST request to the loginAdmin endpoint with an invalid Password")
    public void RequestToTheLoginEndpointWithAnInvalidPassword() {
        String emailPatient = "nurulfauziah2@gmail.com";
        String pwPatient = "asdf";
        mobilePatientAuthLogin.RequestToTheLoginEndpointWithAnInvalidPassword(emailPatient, pwPatient);
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request and invalid Password")
    public void ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword() {
        mobilePatientAuthLogin.ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword();
    }

    // [Positive] POST - LoginAdmin Success update Password

    @Given("I set the authentication mobile endpoint updated password")
    public void AuthenticationMobileEndpointUpdate() {
        mobilePatientAuthLoginUpdatePW.AuthenticationMobileEndpointUpdate();
    }

    @When("I send a POST request to the login endpoint with a successful password update")
    public void RequestToTheLoginEndpointWithASuccessfulPasswordUpdate() {
        String pwPatient = "asdaf";
        mobilePatientAuthLoginUpdatePW.RequestToTheLoginEndpointWithASuccessfulPasswordUpdate(pwPatient);
    }

    @Then("I should receive a response with HTTP status code 400 OK and successful password update")
    public void ResponseWithHTTPStatusCode400OKAndSuccessfulPasswordUpdate() {
        mobilePatientAuthLoginUpdatePW.ResponseWithHTTPStatusCode400OKAndSuccessfulPasswordUpdate();
}

}
