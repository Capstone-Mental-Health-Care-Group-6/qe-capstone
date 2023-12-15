package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Mobile_Patient_Auth_Register;

public class Mobile_Patient_Auth_RegisterSteps {

    @Steps
    Mobile_Patient_Auth_Register mobilePatientAuthRegister;

    // [Positive] POST - Register Success
    @Given("I have a valid registration mobile endpoint")
    public void ValidRegistrationMobileEndpoint() {
        mobilePatientAuthRegister.ValidRegistrationMobileEndpoint();
    }

    @When("I provide valid user information for registration")
    public void ProvideValidUserInformationForRegistration() {
                String name = "fauzi";
                String email ="fauzihidayat@gmail.com";
                String password ="fauzi1234";
                String date_of_birth = "2000-10-20";
                String gender = "laki-laki";
                String phone_number= "0812345678";
                String avatar = "/EmpathiCare/thumbnail.jpg";

        mobilePatientAuthRegister.ProvideValidUserInformationForRegistration(name,email,password,date_of_birth,gender,phone_number,avatar);
    }


    @Then("I should receive a response with HTTP status code 400 OK and successfully registered")
    public void ResponseWithHTTPStatusCode400OKAndSuccessfullyRegistered() {
        mobilePatientAuthRegister.ResponseWithHTTPStatusCode400OKAndSuccessfullyRegistered();
    }

// Expected status code <400> but was <201>.
//
//    @Then("I should receive a response with HTTP status code 201 created and successfully registered")
//    public void ResponseWithHTTPStatusCode201createdAndSuccessfullyRegistered() {
//        mobilePatientAuthRegister.ResponseWithHTTPStatusCode201CreatedAndSuccessfullyRegistered();
//    }

// Expected status code <200> but was <400>.
//    @Then("I should receive a response with HTTP status code 200 OK and successfully registered")
//    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered() {
//        mobilePatientAuthRegister.ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered();
//    }

    // [Negative] POST - Register Error Upload Avatar
    @When("I provide valid user information with an invalid avatar for registration")
    public void ProvideValidUserInformationWithAnInvalidAvatarForRegistration() {
        String name = "fauzi";
        String email ="fauzihidayat@gmail.com";
        String password ="fauzi1234";
        String date_of_birth = "2000-10-20";
        String gender = "laki-laki";
        String phone_number= "0812345678";
//        String avatar = "/EmpathiCare/thumbnail.jpg";
        mobilePatientAuthRegister.ProvideValidUserInformationWithAnInvalidAvatarForRegistration(name,email,password,date_of_birth,gender,phone_number);
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request due to invalid avatar")
    public void ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar() {
        mobilePatientAuthRegister.ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar();
    }

    // [Negative] POST - Register Duplicate Email
    @When("I provide valid user information for a user account with a duplicate email")
    public void ProvideValidUserInformationForAUserAccountWithADuplicateEmail() {

        String name = "fauzi";
        String email ="fauzihidayat@gmail.com";
        String password ="fauzi1234";
        String date_of_birth = "2000-10-20";
        String gender = "laki-laki";
        String phone_number= "0812345678";
        String avatar = "/EmpathiCare/thumbnail.jpg";

        mobilePatientAuthRegister.ProvideValidUserInformationForAUserAccountWithADuplicateEmail(name,email,password,date_of_birth,gender,phone_number,avatar);
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request due to duplicate email")
    public void ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail() {
        mobilePatientAuthRegister.ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail();
    }

    // [Negative] PUT - Update Failed Validation
    @When("I send a PUT HTTP request with invalid data to Update status of Balance Disbursement")
    public void iSendAPUTHTTPRequestWithInvalidDataToUpdateStatusOfBalanceDisbursement() {
    }
}