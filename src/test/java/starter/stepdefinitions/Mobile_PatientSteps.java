package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Mobile_Patient;

import java.util.Random;


public class Mobile_PatientSteps {
    @Steps
    Mobile_Patient mobilePatient;

    // [Positive] GET All Patient
    @Given("I set the GET endpoint for Get all patient")
    public void setGetAllPatientEndpoint() {
        mobilePatient.setGetAllPatientEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get all patient")
    public void sendGetAllPatientRequest() {
        mobilePatient.sendGetAllPatientRequest();
    }

    @Then("I receive a response status 200 OK get all patient")
    public void validateGetAllPatientResponse() {
        mobilePatient.validateGetAllPatientResponse();
    }

    // [Positive] GET All Patient Empty Data
    @Given("I set the GET endpoint for Get all patient Empty Data")
    public void setGetAllPatientEmptyDataEndpoint() {
        mobilePatient.setGetAllPatientEmptyDataEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get all patient empty data")
    public void sendGetAllPatientEmptyDataRequest() {
        mobilePatient.sendGetAllPatientEmptyDataRequest();
    }

    @Then("I receive a response status 200 OK empty data patient")
    public void validateGetAllPatientEmptyDataResponse() {
        mobilePatient.validateGetAllPatientEmptyDataResponse();
    }

    // [Negative] GET All Patient Error JWT
    @Given("I set the GET endpoint for Get all patient for error JWT")
    public void setGetAllPatientErrorJwtEndpoint() {
        mobilePatient.setGetAllPatientErrorJwtEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get all patient for error JWT")
    public void sendGetAllPatientErrorJwtRequest() {
        mobilePatient.sendGetAllPatientErrorJwtRequest();
    }

    @Then("I receive a response status 401 Unauthorized for error JWT")
    public void validateGetAllPatientErrorJwtResponse() {
        mobilePatient.validateGetAllPatientErrorJwtResponse();
    }

    // [Negative] GET All Patient Invalid Endpoint
    @Given("I set the GET Invalid endpoint for Get all patient")
    public void setGetAllPatientInvalidEndpoint() {
        mobilePatient.setGetAllPatientInvalidEndpoint();
    }

    @When("I send an HTTP GET request with a invalid baseURL for get all patient")
    public void sendGetAllPatientInvalidEndpointRequest() {
        mobilePatient.sendGetAllPatientInvalidEndpointRequest();
    }

    @Then("I receive a response status 404 Not Found get all patient invalid endpoint")
    public void validateGetAllPatientInvalidEndpointResponse() {
        mobilePatient.validateGetAllPatientInvalidEndpointResponse();
    }

    // [Positive] GET Patient By ID
    @Given("I set the GET endpoint for Patient By ID")
    public void setGetPatientByIdEndpoint() {
        mobilePatient.setGetPatientByIdEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get patient by ID")
    public void sendGetPatientByIdRequest() {
        mobilePatient.sendGetPatientByIdRequest();
    }

    @Then("I receive a response status 200 OK get patient by ID")
    public void validateGetPatientByIdResponse() {
        mobilePatient.validateGetPatientByIdResponse();
    }

    // [Negative] GET Patient By ID Error JWT
    @Given("I set the GET endpoint for Patient By ID for error JWT")
    public void setGetPatientByIdErrorJwtEndpoint() {
        mobilePatient.setGetPatientByIdErrorJwtEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get patient by ID for error JWT")
    public void sendGetPatientByIdErrorJwtRequest() {
        mobilePatient.sendGetPatientByIdErrorJwtRequest();
    }

    @Then("I receive a response status 401 Unauthorized for error JWT by ID Patient")
    public void validateGetPatientByIdErrorJwtResponse() {
        mobilePatient.validateGetPatientByIdErrorJwtResponse();
    }

    // [Negative] GET Patient By ID Invalid Endpoint
    @Given("I set the GET Invalid endpoint for Patient By ID")
    public void setGetPatientByIdInvalidEndpoint() {
        mobilePatient.setGetPatientByIdInvalidEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get all patient for Patient By ID")
    public void sendGetPatientByIdInvalidEndpointRequest() {
        mobilePatient.sendGetPatientByIdInvalidEndpointRequest();
    }

    @Then("I receive a response status 404 Not Found for Patient By ID")
    public void validateGetPatientByIdInvalidEndpointResponse() {
        mobilePatient.validateGetPatientByIdInvalidEndpointResponse();
    }

    // [Positive] PUT - Update Profile
    @Given("I set the PUT endpoint for updating the user profile")
    public void setUpdateProfileEndpoint() {
        mobilePatient.setUpdateProfileEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating the user profile")
    public void sendUpdateProfileRequest() {
        String namePatient = "nurul fauziah";
        String emailPatient = "generateRandomEmail";
        String dateofBirth = "2000-09-11";
        String phoneNumber = "08795553348";
        String avatarimgPath = "/EmpathiCare/thumbnail.png";
        mobilePatient.sendUpdateProfileRequest(namePatient, emailPatient, dateofBirth, phoneNumber, avatarimgPath);
    }

//    private String generateRandomEmail() {
//        String[] domains = {"gmail.com", "yahoo.com"};
//        java.util.Random random = new Random();
//
//        String username = "user" + random.nextInt(1000); // You can customize the username format
//        String domain = domains[random.nextInt(domains.length)];
//
//        return username + "@" + domain;
//    }

    @Then("I receive a valid data response for updating the user profile with HTTP status code 200 OK")
    public void validateUpdateProfileResponse() {
        mobilePatient.validateUpdateProfileResponse();
    }

    // [Positive] PUT - Update Password
    @Given("I set the PUT endpoint for updating the user password")
    public void setUpdatePasswordEndpoint() {
        mobilePatient.setUpdatePasswordEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating the user password")
    public void sendUpdatePasswordRequest() {
        String passwordPatient = "updateemail";
        mobilePatient.sendUpdatePasswordRequest(passwordPatient);
    }

    @Then("I receive a valid data response for updating the user password with HTTP status code 200 OK")
    public void validateUpdatePasswordResponse() {
        mobilePatient.validateUpdatePasswordResponse();
    }

    // [Positive] DELETE - Delete Profile
    @Given("I set the DELETE endpoint for deleting the user profile")
    public void setDeleteProfileEndpoint() {
        mobilePatient.setDeleteProfileEndpoint();
    }

    @When("I send an HTTP DELETE request with valid baseURL for deleting the user profile")
    public void sendDeleteProfileRequest() {
        mobilePatient.sendDeleteProfileRequest();
    }

    @Then("I receive a valid data response for deleting the user profile with HTTP status code 200 OK")
    public void validateDeleteProfileResponse() {
        mobilePatient.validateDeleteProfileResponse();
    }

    // [Positive] PUT - Update Status
    @Given("I set the PUT endpoint for updating the user status")
    public void setUpdateStatusEndpoint() {
        mobilePatient.setUpdateStatusEndpoint();
    }

    @When("I send an HTTP PUT request with valid parameters and baseURL for updating the user status")
    public void sendUpdateStatusRequest() {
        String statusPatient = "inactive";
        mobilePatient.sendUpdateStatusRequest(statusPatient);
    }

    @Then("I receive a valid data response for updating the user status with HTTP status code 200 OK")
    public void validateUpdateStatusResponse() {
        mobilePatient.validateUpdateStatusResponse();
    }

    // [Negative] PUT - Update Profile Invalid Endpoint
    @Given("I set an invalid PUT endpoint for updating the user profile")
    public void setUpdateProfileInvalidEndpoint() {
        mobilePatient.setUpdateProfileInvalidEndpoint();
    }

    @When("I send an HTTP PUT request with invalid baseURL")
    public void sendUpdateProfileInvalidEndpointRequest() {
        String namePatient = "nurul fauziah";
        String emailPatient = "nurulfauziah1@gmail.com";
        String dateofBirth = "2000-09-11";
        String phoneNumber = "08795553348";
        String avatarimgPath = "/EmpathiCare/thumbnail.jpg";
        mobilePatient.sendUpdateProfileInvalidEndpointRequest(namePatient, emailPatient, dateofBirth, phoneNumber, avatarimgPath);
    }

    @Then("I receive an error response with HTTP status code 404 Not Found")
    public void validateUpdateProfileInvalidEndpointResponse() {
        mobilePatient.validateUpdateProfileInvalidEndpointResponse();
    }

    // [Negative] PUT - Update Password Invalid Endpoint
    @Given("I set an invalid PUT endpoint for updating the user password")
    public void setUpdatePasswordInvalidEndpoint() {
        mobilePatient.setUpdatePasswordInvalidEndpoint();
    }

    @When("I send an HTTP PUT request with invalid baseURL for updating the user password")
    public void sendUpdatePasswordInvalidEndpointRequest() {
        String passwordPatient = "fauziah123";
        mobilePatient.sendUpdatePasswordInvalidEndpointRequest(passwordPatient);
    }

    @Then("I receive an error response with HTTP status code 404 Not Found for updating the user password")
    public void validateUpdatePasswordInvalidEndpointResponse() {
        mobilePatient.validateUpdatePasswordInvalidEndpointResponse();
    }

    // [Negative] DELETE - Delete Profile Invalid Endpoint
    @Given("I set an invalid DELETE endpoint for deleting the user profile")
    public void setDeleteProfileInvalidEndpoint() {
        mobilePatient.setDeleteProfileInvalidEndpoint();
    }

    @When("I send an HTTP DELETE request with invalid baseURL for deleting the user profile")
    public void sendDeleteProfileInvalidEndpointRequest() {
        mobilePatient.sendDeleteProfileInvalidEndpointRequest();
    }

    @Then("I receive an error response with HTTP status code 404 Not Found for deleting the user profile")
    public void validateDeleteProfileInvalidEndpointResponse() {
        mobilePatient.validateDeleteProfileInvalidEndpointResponse();
    }

    // [Negative] PUT - Update Status Invalid Endpoint
    @Given("I set an invalid PUT endpoint for updating the user status")
    public void setUpdateStatusInvalidEndpoint() {
        mobilePatient.setUpdateStatusInvalidEndpoint();
    }

    @When("I send an HTTP PUT request with invalid baseURL for updating the user status")
    public void sendUpdateStatusInvalidEndpointRequest() {
        String statusPatient = "inactive";
        mobilePatient.sendUpdateStatusInvalidEndpointRequest(statusPatient);
    }

    @Then("I receive an error response with HTTP status code 404 Not Found for updating the user status")
    public void validateUpdateStatusInvalidEndpointResponse() {
        mobilePatient.validateUpdateStatusInvalidEndpointResponse();
    }
}