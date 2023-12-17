package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Register;

public class RegisterSteps {
    
    @Steps
    Register POSTRegister;
    
    // [Negative] POST - Register Error Validation
    @Given("I have an valid registration endpoint")
    public void validRegistrationEndpoint() {
        POSTRegister.validRegistrationEndpoint();
    }

    @When("I send a POST request to the registration endpoint with an empty request body")
    public void RequestToTheRegistrationEndpointWithAnEmptyRequestBody() {
        POSTRegister.RegistrationEndpointWithAnEmptyRequestBody();
    }

    @Then("I should receive a response with HTTP status code 400 bad request")
    public void ResponseWithHTTPStatusCode400BadRequest() {
        POSTRegister.ResponseWithHTTPStatusCode400BadRequest();
    }

    // [Negative] POST - Register Error
    @When("I provide name, email, role, and password that are already registered")
    public void NameEmailRoleAndPasswordThatAreAlreadyRegistered() {
        POSTRegister.NameEmailRoleAndPasswordThatAreAlreadyRegistered();
    }

    @Then("I should receive a response with HTTP status code 500 internal server error")
    public void ResponseWithHTTPStatusCode500InternalServerError() {
        POSTRegister.ResponseWithHTTPStatusCode500InternalServerError();
    }

    // [Negative] POST - Error Email Already Registered
    @Given("I have a valid registration endpoint")
    public void ValidRegistrationEndpoint() {
        POSTRegister.ValidRegistrationEndpoint();
    }

    // [Positive] POST - Successful Registration for Admin
    @When("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnAdmin() {
        POSTRegister.NameEmailRoleAndPasswordForAnAdmin();
    }

    @When("I provide name, email, role, and password for a doctor")
    public void NameEmailRoleAndPasswordForAnDoctor() {
        POSTRegister.NameEmailRoleAndPasswordForAnDoctor();
    }

    @When("I provide name, email, role, and password for a patient")
    public void NameEmailRoleAndPasswordForAnPatient() {
        POSTRegister.NameEmailRoleAndPasswordForAnPatient();
    }

    @Then("I should receive a response with HTTP status code 201 created")
    public void ResponseWithHTTPStatusCode201Created() {
        POSTRegister.ResponseWithHTTPStatusCode201Created();
    }




}
