package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Web_AdminPatient;

public class Web_AdminPatientSteps {

    @Steps
    Web_AdminPatient webAdminPatient;

    // [Positive] GET - Get All Patient
    @Given("I set the GET endpoint for retrieving all patient data")
    public void setGetAllPatientDataEndpoint() {
        webAdminPatient.setGetAllPatientDataEndpoint();
    }

    @When("I send an HTTP GET request with valid baseURL for retrieving all patient data")
    public void sendHttpGetRequestForAllPatientData() {
        webAdminPatient.sendHttpGetRequestForAllPatientData();
    }

    @Then("I receive a valid data response for retrieving all patient data with HTTP status code 200 OK")
    public void validateAllPatientDataResponse() {
        webAdminPatient.validateAllPatientDataResponse();
    }

    // [Positive] GET - Get Patient Status Active
    @Given("I set the GET endpoint for retrieving active patient data")
    public void setGetActivePatientDataEndpoint() {
        webAdminPatient.setGetActivePatientDataEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving active patient data")
    public void sendHttpGetRequestForActivePatientData() {
        webAdminPatient.sendHttpGetRequestForActivePatientData();
    }

    @Then("I receive a valid data response for retrieving active patient data with HTTP status code 200 OK")
    public void validateActivePatientDataResponse() {
        webAdminPatient.validateActivePatientDataResponse();
    }

    // [Positive] GET - Get Patient Status Inactive
    @Given("I set the GET endpoint for retrieving inactive patient data")
    public void setGetInactivePatientDataEndpoint() {
        webAdminPatient.setGetInactivePatientDataEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving inactive patient data")
    public void sendHttpGetRequestForInactivePatientData() {
        webAdminPatient.sendHttpGetRequestForInactivePatientData();
    }

    @Then("I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK")
    public void validateInactivePatientDataResponse() {
        webAdminPatient.validateInactivePatientDataResponse();
    }

    // [Positive] GET - Get Patient by Name
    @Given("I set the GET endpoint for retrieving patient data by name")
    public void setGetPatientByNameEndpoint() {
        webAdminPatient.setGetPatientByNameEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name")
    public void sendHttpGetRequestForPatientByName() {
        webAdminPatient.sendHttpGetRequestForPatientByName();
    }

    @Then("I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK")
    public void validatePatientByNameDataResponse() {
        webAdminPatient.validatePatientByNameDataResponse();
    }

    // [Negative] GET - Get Patient Data Empty
    @Given("I set the GET endpoint for retrieving patient data is empty")
    public void setGetPatientDataEmptyEndpoint() {
        webAdminPatient.setGetPatientDataEmptyEndpoint();
    }

    @When("I send an HTTP GET request with valid baseURL for retrieving patient data is empty")
    public void sendHttpGetRequestForEmptyPatientData() {
        webAdminPatient.sendHttpGetRequestForEmptyPatientData();
    }

    @Then("I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found")
    public void validateEmptyPatientDataResponse() {
        webAdminPatient.validateEmptyPatientDataResponse();
    }

    // [Negative] GET - Get Patient Invalid Endpoint
    @Given("I set the GET endpoint for retrieving patient data with an invalid endpoint")
    public void setGetPatientInvalidEndpoint() {
        webAdminPatient.setGetPatientInvalidEndpoint();
    }

    @When("I send an HTTP GET request with invalid baseURL for retrieving patient data")
    public void sendHttpGetRequestForInvalidPatientDataEndpoint() {
        webAdminPatient.sendHttpGetRequestForInvalidPatientDataEndpoint();
    }

    @Then("I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidPatientDataEndpointResponse() {
        webAdminPatient.validateInvalidPatientDataEndpointResponse();
    }


    // [Positive] GET - Dashboard
    @Given("I set the GET endpoint for retrieving dashboard data")
    public void setGetDashboardDataEndpoint() {
        webAdminPatient.setGetDashboardDataEndpoint();
    }

    @When("I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data")
    public void sendHttpGetRequestForDashboardData() {
        webAdminPatient.sendHttpGetRequestForDashboardData();
    }

    @Then("I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK")
    public void validateDashboardDataResponse() {
        webAdminPatient.validateDashboardDataResponse();
    }

    // [Negative] GET - Dashboard Invalid Endpoint
    @Given("I set the GET endpoint for retrieving dashboard data with an invalid endpoint")
    public void setGetDashboardInvalidEndpoint() {
        webAdminPatient.setGetDashboardInvalidEndpoint();
    }

    @When("I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDashboardEndpoint() {
        webAdminPatient.sendHttpGetRequestForInvalidDashboardEndpoint();
    }

    @Then("I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidDashboardEndpointResponse() {
        webAdminPatient.validateInvalidDashboardEndpointResponse();
    }

    // [Positive] PUT - Update Profile Admin
    @Given("I set the PUT endpoint for updating admin profile")
    public void setPutUpdateAdminProfileEndpoint() {
        webAdminPatient.setPutUpdateAdminProfileEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile")
    public void sendHttpPutRequestForUpdateAdminProfile() {
        webAdminPatient.sendHttpPutRequestForUpdateAdminProfile();
    }

    @Then("I receive a valid data response for updating admin profile with HTTP status code 200 OK")
    public void validateUpdateAdminProfileResponse() {
        webAdminPatient.validateUpdateAdminProfileResponse();
    }

    // [Negative] PUT - Update Profile Admin Invalid Endpoint
    @Given("I set the PUT endpoint for updating admin profile with an invalid endpoint")
    public void setPutUpdateAdminProfileInvalidEndpoint() {
        webAdminPatient.setPutUpdateAdminProfileInvalidEndpoint();
    }

    @When("I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint")
    public void sendHttpPutRequestForUpdateAdminProfileInvalidEndpoint() {
        webAdminPatient.sendHttpPutRequestForUpdateAdminProfileInvalidEndpoint();
    }

    @Then("I receive a valid data response for updating admin profile with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateUpdateAdminProfileInvalidEndpointResponse() {
        webAdminPatient.validateUpdateAdminProfileInvalidEndpointResponse();
    }
}
