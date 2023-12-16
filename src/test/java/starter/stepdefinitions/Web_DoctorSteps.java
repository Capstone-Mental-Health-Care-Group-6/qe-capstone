package starter.stepdefinitions;

import io.restassured.response.Response;
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

    // [Positive] POST Register Doctor
    @Given("I set the POST endpoint for registering a doctor")
    public void setPostRegisterDoctorEndpoint() {
        WebDoctorSteps.setPostRegisterDoctorEndpoint();
    }

    @When("I send an HTTP POST request with a valid baseURL and body parameters")
    public void sendHttpPostRequestForRegisteringDoctor() {
        String doctorName = "Fauzan Ali Gans";
        String doctorNik = "3173645454546372";
        String doctorDob = "Tangerang, 11 Mei 2002";
        String doctorGender = "laki";
        String doctorDescription = "Doctor Description";
        String doctorProvinsi = "Jakarta";
        String doctorKota = "Jakarta Barat";
        String doctorNumberPhone = "0876776547364";
        String doctorMeetLink = "www.google.com";
        String doctorSipp = "0034588908839";
        String doctorStr = "0034588908839";
        int expertiseId = 4;
        String doctorUniversity1 = "University C";
        String doctorUniversity2 = "University D";
        String doctorStudyProgram1 = "Program C";
        String doctorStudyProgram2 = "Program D";
        String doctorEnrollYear1 = "2020-01-01T00:00:00Z";
        String doctorEnrollYear2 = "2020-01-01T00:00:00Z";
        String doctorGraduateYear1 = "2020-01-01T00:00:00Z";
        String doctorGraduateYear2 = "2021-01-01T00:00:00Z";
        String doctorCompany1 = "Company C";
        String doctorCompany2 = "Company D";
        String doctorStartDate1 = "2020-01-01T00:00:00Z";
        String doctorStartDate2 = "2021-01-01T00:00:00Z";
        String doctorEndDate1 = "2021-01-01T00:00:00Z";
        String doctorEndDate2 = "2022-01-01T00:00:00Z";
        String doctorAvatar = "C:/Users/laras/OneDrive/Pictures/Icon/1.png";
        String doctorSippFile = "Users/EmpathiCare/Quality Engineer-empathiCare.pdf";
        String doctorStrFile = "Users/EmpathiCare/Quality Engineer-empathiCare.pdf";
        String doctorCv = "Users/EmpathiCare/Quality Engineer-empathiCare.pdf";
        String doctorIjazah = "Users/EmpathiCare/Quality Engineer-empathiCare.pdf";

        WebDoctorSteps.sendHttpPostRequestForRegisteringDoctor(doctorName, doctorNik, doctorDob, doctorGender,
                doctorDescription, doctorProvinsi, doctorKota, doctorNumberPhone,
                doctorMeetLink, doctorSipp, doctorStr, expertiseId,
                doctorUniversity1, doctorUniversity2,
                doctorStudyProgram1, doctorStudyProgram2,
                doctorEnrollYear1, doctorEnrollYear2,
                doctorGraduateYear1, doctorGraduateYear2,
                doctorCompany1, doctorCompany2,
                doctorStartDate1, doctorStartDate2,
                doctorEndDate1, doctorEndDate2,
                doctorAvatar, doctorSippFile,
                doctorStrFile, doctorCv, doctorIjazah);

    }

    @Then("I receive a valid data response for registering a doctor with HTTP status code 201 Created")
    public void validateRegisterDoctorResponse() {
        WebDoctorSteps.validateRegisterDoctorResponse();
    }

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
/*

    // [Positive] PUT Edit Doctor Datapokok By Doctor ID
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
*/

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

    @Then("I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 404 Not Found")
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
*/
/*
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
    }*/
}
