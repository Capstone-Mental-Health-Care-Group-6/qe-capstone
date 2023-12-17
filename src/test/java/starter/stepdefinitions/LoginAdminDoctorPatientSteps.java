package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.LoginAdmin;
import starter.restapi.LoginDoctor;
import starter.restapi.LoginPatient;

public class LoginAdminDoctorPatientSteps {

    @Steps
    LoginAdmin loginAdmin;
    @Steps
    LoginDoctor LoginDoctor;
    @Steps
    LoginPatient LoginPatient;


    // LoginAdmin by Admin
    @Given("I set authentication endpoint for login admin")
    public void setAuthenticationEndpointForAdminLogin() {
        loginAdmin.setAuthenticationEndpointForAdminLogin();
    }

    @When("I send authentication endpoint for login admin")
    public void sendAuthenticationEndpointForAdminLogin() {
        loginAdmin.sendAuthenticationEndpointForAdminLogin();
    }

    @Then("I receive a valid data response for login admin with HTTP status code 200 OK")
    public void validateAdminLoginResponse() {
        loginAdmin.validateAdminLoginResponse();
    }

    // LoginAdmin by Doctor
    @Given("I set authentication endpoint for login doctor")
    public void setAuthenticationEndpointForDoctorLogin() {
        LoginDoctor.setAuthenticationEndpointForDoctorLogin();
    }

    @When("I send authentication endpoint for login doctor")
    public void sendAuthenticationEndpointForDoctorLogin() {
        LoginDoctor.sendAuthenticationEndpointForDoctorLogin();
    }

    @Then("I receive a valid data response for login doctor with HTTP status code 200 OK")
    public void validateDoctorLoginResponse() {
        LoginDoctor.validateDoctorLoginResponse();
    }

    // LoginAdmin by Patient
    @Given("I set authentication endpoint for login patient")
    public void setAuthenticationEndpointForPatientLogin() {
        LoginPatient.setAuthenticationEndpointForPatientLogin();
    }

    @When("I send authentication endpoint for login patient")
    public void sendAuthenticationEndpointForPatientLogin() {
        LoginPatient.sendAuthenticationEndpointForPatientLogin();
    }

    @Then("I receive a valid data response for login patient with HTTP status code 200 OK")
    public void validatePatientLoginResponse() {
        LoginPatient.validatePatientLoginResponse();
    }


}
