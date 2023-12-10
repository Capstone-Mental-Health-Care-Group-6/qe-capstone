package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Authentication.POST_Register;

public class POST_RegisterSteps {
    
    @Steps
    POST_Register POSTRegister;
    
    // Authentication_register_negative1
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

    // Authentication_register_negative2
    @When("I provide name, email, role, and password that are already registered")
    public void NameEmailRoleAndPasswordThatAreAlreadyRegistered() {
        POSTRegister.NameEmailRoleAndPasswordThatAreAlreadyRegistered();
    }

    @And("I send a POST request to the invalid registration endpoint")
    public void iSendAPOSTRequestToTheInvalidRegistrationEndpoint() {
    }

    @Then("I should receive a response with HTTP status code 500 internal server error")
    public void ResponseWithHTTPStatusCode500InternalServerError() {
        POSTRegister.ResponseWithHTTPStatusCode500InternalServerError();
    }

    // Authentication_register_negative3
    @Given("I have a valid registration endpoint")
    public void ValidRegistrationEndpoint() {
        POSTRegister.ValidRegistrationEndpoint();
    }

    // Authentication_register_positive1
    @When("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnAdmin() {
        POSTRegister.NameEmailRoleAndPasswordForAnAdmin();
    }

    @And("I send a POST request to the valid registration endpoint")
    public void RequestToTheValidRegistrationEndpoint() {
        POSTRegister.RequestToTheValidRegistrationEndpoint();
    }

    @Then("I should receive a response with HTTP status code 201 created")
    public void ResponseWithHTTPStatusCode201Created() {
        POSTRegister.ResponseWithHTTPStatusCode201Created();
    }

    // Authentication_register_positive2
    @When("I provide name, email, role, and password for a patient")
    public void NameEmailRoleAndPasswordForAPatient() {
        POSTRegister.NameEmailRoleAndPasswordForAPatient();
    }

    // Authentication_register_positive3
    @When("I provide name, email, role, and password for a doctor")
    public void NameEmailRoleAndPasswordForADoctor() {
        POSTRegister.NameEmailRoleAndPasswordForADoctor();
    }


}
