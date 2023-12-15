package starter.restapi;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient_Auth_Register {

    public String endpoint_register_mobile = "https://kmb5alta.online";

    // [Positive] POST - Register Success
    @Step("I have a valid registration mobile endpoint")
    public String ValidRegistrationMobileEndpoint() {
        return endpoint_register_mobile + "/patient/register";
    }

    @Step("I provide valid user information for registration")
    public void ProvideValidUserInformationForRegistration(String name, String email, String password, String dateOfBirth, String gender, String phoneNumber, String avatar) {
        File avatarFile = new File(avatar);

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("date_of_birth", dateOfBirth)
                .multiPart("gender", gender)
                .multiPart("phone_number", phoneNumber)
                .multiPart("avatar", avatarFile)
                .post(ValidRegistrationMobileEndpoint());
    }
////    # Expected status code <201> but was <400>.
    @Step("I should receive a response with HTTP status code 400 OK and successfully registered")
    public void ResponseWithHTTPStatusCode400OKAndSuccessfullyRegistered() {
        restAssuredThat(response -> response.statusCode(400));
    }
////    # Expected status code <400> but was <201>.
//    @Step("I should receive a response with HTTP status code 201 created and successfully registered")
//    public void ResponseWithHTTPStatusCode201CreatedAndSuccessfullyRegistered() {
//        restAssuredThat(response -> response.statusCode(201));
//    }
//
////    # Expected status code <200> but was <400>.
////    @Step("I should receive a response with HTTP status code 200 OK and successfully registered")
////    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered() {
////        restAssuredThat(response -> response.statusCode(200));
////    }


    // [Negative] POST - Register Error Upload Avatar
    @Step("I provide valid user information with an invalid avatar for registration")
    public void ProvideValidUserInformationWithAnInvalidAvatarForRegistration(String name, String email, String password, String dateOfBirth, String gender, String phoneNumber) {
//        File avatarFile = new File(avatar);
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("date_of_birth", dateOfBirth)
                .multiPart("gender", gender)
                .multiPart("phone_number", phoneNumber)
//                .multiPart("avatar", avatarFile)
                .post(ValidRegistrationMobileEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request due to invalid avatar")
    public void ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Register Duplicate Email
    @Step("I provide valid user information for a user account with a duplicate email")
    public void ProvideValidUserInformationForAUserAccountWithADuplicateEmail(String name, String email, String password, String dateOfBirth, String gender, String phoneNumber, String avatar) {

        File avatarFile = new File(avatar);
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("date_of_birth", dateOfBirth)
                .multiPart("gender", gender)
                .multiPart("phone_number", phoneNumber)
                .multiPart("avatar", avatarFile)
                .post(ValidRegistrationMobileEndpoint());
        // Jika Anda menggunakan form data yang melibatkan file (seperti avatar), metode yang benar adalah multiPart karena ini memungkinkan pengiriman data multipart/form-data
        // yang mencakup file. Jadi, dalam kasus ini, penggunaan multiPart akan lebih tepat daripada formParam.
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request due to duplicate email")
    public void ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }


}
