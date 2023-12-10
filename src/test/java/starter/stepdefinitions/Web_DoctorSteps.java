package starter.stepdefinitions;

import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.restapi.Web_Doctor;

public class Web_DoctorSteps {

    @Steps
    Web_Doctor WebDoctorSteps;

    // [Positive] GET All Doctor
    @Given("I set the GET endpoint for retrieving all doctors")
    public void setGetAllDoctorEndpoint() {
        WebDoctorSteps.setGetAllDoctorEndpoint();
    }

    @When("I send an HTTP GET request with a valid baseURL for get all doctors")
    public void sendHttpGetRequestForAllDoctors() {
        WebDoctorSteps.sendHttpGetRequestForAllDoctors();
    }

    @Then("I receive a valid data response for get all doctors with HTTP status code 200 OK")
    public void validateGetAllDoctorsResponse() {
        WebDoctorSteps.validateGetAllDoctorsResponse();
    }

    // [Positive] GET Doctor By ID
    @Given("I set the GET endpoint for retrieving a doctor by ID")
    public void setGetDoctorByIdEndpoint() {
        WebDoctorSteps.setGetDoctorByIdEndpoint();
    }

    @When("I send an HTTP GET request with a valid ID and baseURL")
    public void sendHttpGetRequestForDoctorById() {
        WebDoctorSteps.sendHttpGetRequestForDoctorById();
    }

    @Then("I receive a valid data response for get doctor by ID with HTTP status code 200 OK")
    public void validateGetDoctorByIdResponse() {
        WebDoctorSteps.validateGetDoctorByIdResponse();
    }

/*
    // [Positive] POST Register Doctor
    @Given("I set the POST endpoint for registering a doctor")
    public void setPostRegisterDoctorEndpoint() {
        WebDoctorSteps.setPostRegisterDoctorEndpoint();
    }

    @When("I send an HTTP POST request with a valid baseURL and body parameters")
    public void sendHttpPostRequestForRegisteringDoctor() {
        WebDoctorSteps.sendHttpPostRequestForRegisteringDoctor();
    }

    @Then("I receive a valid data response for registering a doctor with HTTP status code 200 OK")
    public void validateRegisterDoctorResponse() {
        WebDoctorSteps.validateRegisterDoctorResponse();
    }
*/

    // [Positive] GET Search Doctor by Name
    @Given("I set the GET endpoint for searching a doctor by name")
    public void setGetSearchDoctorByNameEndpoint() {
        WebDoctorSteps.setGetSearchDoctorByNameEndpoint();
    }

    @When("I send an HTTP GET request with a valid name parameter and baseURL")
    public void sendHttpGetRequestForSearchDoctorByName() {
        WebDoctorSteps.sendHttpGetRequestForSearchDoctorByName();
    }

    @Then("I receive a valid data response for searching a doctor by name with HTTP status code 200 OK")
    public void validateSearchDoctorByNameResponse() {
        WebDoctorSteps.validateSearchDoctorByNameResponse();
    }

    /*// [Positive] PUT Edit Doctor Datapokok By Doctor ID
    @Given("I set the PUT endpoint for editing doctor datapokok by ID")
    public void setPutEditDoctorDatapokokEndpoint() {
        WebDoctorSteps.setPutEditDoctorDatapokokEndpoint();
    }

    @When("I send an HTTP PUT request with a valid ID and baseURL for editing doctor datapokok by ID")
    public void sendHttpPutRequestForEditDoctorDatapokok() {
        WebDoctorSteps.sendHttpPutRequestForEditDoctorDatapokok();
    }

    @Then("I receive a valid data response for editing doctor datapokok by ID with HTTP status code 200 OK")
    public void validateEditDoctorDatapokokResponse() {
        WebDoctorSteps.validateEditDoctorDatapokokResponse();
    }

    // [Positive] PUT Edit Doctor Workdays By Doctor ID
    @Given("I set the PUT endpoint for editing doctor workdays by ID")
    public void setPutEditDoctorWorkdaysEndpoint() {
        WebDoctorSteps.setPutEditDoctorWorkdaysEndpoint();
    }

    @When("I send an HTTP PUT request with a valid ID, workdays data, and baseURL")
    public void sendHttpPutRequestForEditDoctorWorkdays() {
        WebDoctorSteps.sendHttpPutRequestForEditDoctorWorkdays();
    }

    @Then("I receive a valid data response for editing doctor workdays by ID with HTTP status code 200 OK")
    public void validateEditDoctorWorkdaysResponse() {
        WebDoctorSteps.validateEditDoctorWorkdaysResponse();
    }

    // [Positive] PUT Edit Doctor Education By Doctor ID
    @Given("I set the PUT endpoint for editing doctor education by ID")
    public void setPutEditDoctorEducationEndpoint() {
        WebDoctorSteps.setPutEditDoctorEducationEndpoint();
    }

    @When("I send an HTTP PUT request with a valid ID, education data, and baseURL")
    public void sendHttpPutRequestForEditDoctorEducation() {
        WebDoctorSteps.sendHttpPutRequestForEditDoctorEducation();
    }

    @Then("I receive a valid data response for editing doctor education by ID with HTTP status code 200 OK")
    public void validateEditDoctorEducationResponse() {
        WebDoctorSteps.validateEditDoctorEducationResponse();
    }

    // [Positive] PUT Edit Doctor Experience By Doctor ID
    @Given("I set the PUT endpoint for editing doctor experience by ID")
    public void setPutEditDoctorExperienceEndpoint() {
        WebDoctorSteps.setPutEditDoctorExperienceEndpoint();
    }

    @When("I send an HTTP PUT request with a valid ID, experience data, and baseURL")
    public void sendHttpPutRequestForEditDoctorExperience() {
        WebDoctorSteps.sendHttpPutRequestForEditDoctorExperience();
    }

    @Then("I receive a valid data response for editing doctor experience by ID with HTTP status code 200 OK")
    public void validateEditDoctorExperienceResponse() {
        WebDoctorSteps.validateEditDoctorExperienceResponse();
    }
*/
    // [Negative] GET All Doctor Invalid Endpoint
    @Given("I set the GET endpoint for retrieving all doctors with an invalid endpoint")
    public void setGetAllDoctorInvalidEndpoint() {
        WebDoctorSteps.setGetAllDoctorInvalidEndpoint();
    }

    @When("I send an HTTP GET request for retrieving all doctors with an invalid endpoint")
    public void sendHttpGetRequestForAllDoctorsWithInvalidEndpoint() {
        WebDoctorSteps.sendHttpGetRequestForAllDoctorsWithInvalidEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint retrieving all doctors with HTTP status code 404 Not Found")
    public void validateInvalidEndpointResponseForAllDoctors() {
        WebDoctorSteps.validateInvalidEndpointResponseForAllDoctors();
    }

    // [Negative] GET Doctor By ID Invalid Endpoint
    @Given("I set the GET endpoint for retrieving a doctor by ID with an invalid endpoint")
    public void setGetDoctorByIdInvalidEndpoint() {
        WebDoctorSteps.setGetDoctorByIdInvalidEndpoint();
    }

    @When("I send an HTTP GET request for retrieving a doctor by ID with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDoctorByIdEndpoint() {
        WebDoctorSteps.sendHttpGetRequestForInvalidDoctorByIdEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 400 Bad Request")
    public void validateInvalidDoctorByIdEndpointResponse() {
        WebDoctorSteps.validateInvalidDoctorByIdEndpointResponse();
    }

/*    // [Negative] POST Register Doctor Invalid Endpoint
    @Given("I set the POST endpoint for registering a doctor with an invalid endpoint")
    public void setPostRegisterDoctorInvalidEndpoint() {
        WebDoctorSteps.setPostRegisterDoctorInvalidEndpoint();
    }

    @When("I send an HTTP POST request for registering a doctor with an invalid endpoint")
    public void sendHttpPostRequestForInvalidRegisterDoctorEndpoint() {
        WebDoctorSteps.sendHttpPostRequestForInvalidRegisterDoctorEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint registering a doctor with HTTP status code 404 Not Found")
    public void validateInvalidRegisterDoctorEndpointResponse() {
        WebDoctorSteps.validateInvalidRegisterDoctorEndpointResponse();
    }*/

    // [Negative] GET Search Doctor by Name Invalid Endpoint
    @Given("I set the GET endpoint for searching a doctor by name with an invalid endpoint")
    public void setGetSearchDoctorByNameInvalidEndpoint() {
        WebDoctorSteps.setGetSearchDoctorByNameInvalidEndpoint();
    }

    @When("I send an HTTP GET request for searching a doctor by name with an invalid endpoint")
    public void sendHttpGetRequestForInvalidSearchDoctorByNameEndpoint() {
        WebDoctorSteps.sendHttpGetRequestForInvalidSearchDoctorByNameEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found")
    public void validateInvalidSearchDoctorByNameEndpointResponse() {
        WebDoctorSteps.validateInvalidSearchDoctorByNameEndpointResponse();
    }
/*

    // [Negative] PUT Edit Doctor Datapokok By Doctor ID Invalid Endpoint
    @Given("I set the PUT endpoint for editing doctor datapokok by ID with an invalid endpoint")
    public void setPutEditDoctorDatapokokInvalidEndpoint() {
        WebDoctorSteps.setPutEditDoctorDatapokokInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for editing doctor datapokok by ID with an invalid endpoint")
    public void sendHttpPutRequestForInvalidEditDoctorDatapokokEndpoint() {
        WebDoctorSteps.sendHttpPutRequestForInvalidEditDoctorDatapokokEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint editing doctor datapokok by ID with HTTP status code 404 Not Found")
    public void validateInvalidEditDoctorDatapokokEndpointResponse() {
        WebDoctorSteps.validateInvalidEditDoctorDatapokokEndpointResponse();
    }

    // [Negative] PUT Edit Doctor Workdays By Doctor ID Invalid Endpoint
    @Given("I set the PUT endpoint for editing doctor workdays by ID with an invalid endpoint")
    public void setPutEditDoctorWorkdaysInvalidEndpoint() {
        WebDoctorSteps.setPutEditDoctorWorkdaysInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for editing doctor workdays by ID with an invalid endpoint")
    public void sendHttpPutRequestForInvalidEditDoctorWorkdaysEndpoint() {
        WebDoctorSteps.sendHttpPutRequestForInvalidEditDoctorWorkdaysEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint editing doctor workdays by ID with HTTP status code 404 Not Found")
    public void validateInvalidEditDoctorWorkdaysEndpointResponse() {
        WebDoctorSteps.validateInvalidEditDoctorWorkdaysEndpointResponse();
    }

    // [Negative] PUT Edit Doctor Education By Doctor ID Invalid Endpoint
    @Given("I set the PUT endpoint for editing doctor education by ID with an invalid endpoint")
    public void setPutEditDoctorEducationInvalidEndpoint() {
        WebDoctorSteps.setPutEditDoctorEducationInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for editing doctor education by ID with an invalid endpoint")
    public void sendHttpPutRequestForInvalidEditDoctorEducationEndpoint() {
        WebDoctorSteps.sendHttpPutRequestForInvalidEditDoctorEducationEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint editing doctor education by ID with HTTP status code 404 Not Found")
    public void validateInvalidEditDoctorEducationEndpointResponse() {
        WebDoctorSteps.validateInvalidEditDoctorEducationEndpointResponse();
    }

    // [Negative] PUT Edit Doctor Experience By Doctor ID Invalid Endpoint
    @Given("I set the PUT endpoint for editing doctor experience by ID with an invalid endpoint")
    public void setPutEditDoctorExperienceInvalidEndpoint() {
        WebDoctorSteps.setPutEditDoctorExperienceInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for editing doctor experience by ID with an invalid endpoint")
    public void sendHttpPutRequestForInvalidEditDoctorExperienceEndpoint() {
        WebDoctorSteps.sendHttpPutRequestForInvalidEditDoctorExperienceEndpoint();
    }

    @Then("I receive a valid data response for invalid endpoint editing doctor experience by ID with HTTP status code 404 Not Found")
    public void validateInvalidEditDoctorExperienceEndpointResponse() {
        WebDoctorSteps.validateInvalidEditDoctorExperienceEndpointResponse();
    }
*/
}
