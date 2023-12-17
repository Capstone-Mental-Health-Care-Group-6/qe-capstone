package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET All Patient
    @Step("I set the GET endpoint for Get all patient")
    public String setGetAllPatientEndpoint() {
        return url + "patient";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all patient")
    public void sendGetAllPatientRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .get(setGetAllPatientEndpoint());
    }

    @Step("I receive a response status 200 OK get all patient")
    public void validateGetAllPatientResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // [Positive] GET All Patient Empty Data
    @Step("I set the GET endpoint for Get all patient Empty Data")
    public String setGetAllPatientEmptyDataEndpoint() {
        return url + "patient";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all patient empty data")
    public void sendGetAllPatientEmptyDataRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .get(setGetAllPatientEmptyDataEndpoint());
    }

    @Step("I receive a response status 200 OK empty data patient")
    public void validateGetAllPatientEmptyDataResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // [Negative] GET All Patient Error JWT
    @Step("I set the GET endpoint for Get all patient for error JWT")
    public String setGetAllPatientErrorJwtEndpoint() {
        return url + "patient";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all patient for error JWT")
    public void sendGetAllPatientErrorJwtRequest() {
        SerenityRest.given()
//                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetAllPatientErrorJwtEndpoint());
    }

    @Step("I receive a response status 401 Unauthorized for error JWT")
    public void validateGetAllPatientErrorJwtResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // [Negative] GET All Patient Invalid Endpoint
    @Step("I set the GET Invalid endpoint for Get all patient")
    public String setGetAllPatientInvalidEndpoint() {
        return url + "patien";
    }

    @Step("I send an HTTP GET request with an invalid baseURL for get all patient")
    public void sendGetAllPatientInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetAllPatientInvalidEndpoint());
    }

    @Step("I receive a response status 404 Not Found get all patient invalid endpoint")
    public void validateGetAllPatientInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET Patient By ID
    @Step("I set the GET endpoint for Patient By ID")
    public String setGetPatientByIdEndpoint() {
        return url + "patient/account/1";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get patient by ID")
    public void sendGetPatientByIdRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetPatientByIdEndpoint());
    }

    @Step("I receive a response status 200 OK get patient by ID")
    public void validateGetPatientByIdResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET Patient By ID Error JWT
    @Step("I set the GET endpoint for Patient By ID for error JWT")
    public String setGetPatientByIdErrorJwtEndpoint() {
        return url + "patient/account/1";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get patient by ID for error JWT")
    public void sendGetPatientByIdErrorJwtRequest() {
        SerenityRest.given()
//                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetPatientByIdErrorJwtEndpoint());
    }

    @Step("I receive a response status 401 Unauthorized for error JWT by ID Patient")
    public void validateGetPatientByIdErrorJwtResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // [Negative] GET Patient By ID Invalid Endpoint
    @Step("I set the GET Invalid endpoint for Patient By ID")
    public String setGetPatientByIdInvalidEndpoint() {
        return url + "patien/account/1";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all patient for Patient By ID")
    public void sendGetPatientByIdInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .get(setGetPatientByIdInvalidEndpoint());
    }

    @Step("I receive a response status 404 Not Found for Patient By ID")
    public void validateGetPatientByIdInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] PUT - Update Profile
    @Step("I set the PUT endpoint for updating the user profile")
    public String setUpdateProfileEndpoint() {
        return url + "patient/account/update";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating the user profile")
    public void sendUpdateProfileRequest(String namePatient, String emailPatient, String dateofBirth, String phoneNumber, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .multiPart("name", namePatient)
                .multiPart("sessions", emailPatient)
                .multiPart("date_of_birth", dateofBirth)
                .multiPart("phone_number", phoneNumber)
                .multiPart("avatar", avatarPath)

                .put(setUpdateProfileEndpoint());
    }

    @Step("I receive a valid data response for updating the user profile with HTTP status code 200 OK")
    public void validateUpdateProfileResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] PUT - Update Password
    @Step("I set the PUT endpoint for updating the user password")
    public String setUpdatePasswordEndpoint() {
        return url + "patient/account/update/password";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating the user password")
    public void sendUpdatePasswordRequest(String passwordPatient) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .multiPart("password", passwordPatient)
                .put(setUpdatePasswordEndpoint());
    }

    @Step("I receive a valid data response for updating the user password with HTTP status code 200 OK")
    public void validateUpdatePasswordResponse() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // [Positive] DELETE - Delete Profile
    @Step("I set the DELETE endpoint for deleting the user profile")
    public String setDeleteProfileEndpoint() {
        return url + "patient/delete";
    }

    @Step("I send an HTTP DELETE request with valid baseURL for deleting the user profile")
    public void sendDeleteProfileRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .delete(setDeleteProfileEndpoint());
    }

    @Step("I receive a valid data response for deleting the user profile with HTTP status code 200 OK")
    public void validateDeleteProfileResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] PUT - Update Status
    @Step("I set the PUT endpoint for updating the user status")
    public String setUpdateStatusEndpoint() {
        return url + "patient/update/1/status";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for updating the user status")
    public void sendUpdateStatusRequest(String statusPatient) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .multiPart("status", statusPatient)
                .put(setUpdateStatusEndpoint());
    }

    @Step("I receive a valid data response for updating the user status with HTTP status code 200 OK")
    public void validateUpdateStatusResponse() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // [Negative] PUT - Update Profile Invalid Endpoint
    @Step("I set an invalid PUT endpoint for updating the user profile")
    public String setUpdateProfileInvalidEndpoint() {
        return url + "patien/account/update";
    }

    @Step("I send an HTTP PUT request with invalid baseURL")
    public void sendUpdateProfileInvalidEndpointRequest(String namePatient, String emailPatient, String dateofBirth, String phoneNumber, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .multiPart("name", namePatient)
                .multiPart("sessions", emailPatient)
                .multiPart("date_of_birth", dateofBirth)
                .multiPart("phone_number", phoneNumber)
                .multiPart("avatar", avatarPath)

                .put(setUpdateProfileInvalidEndpoint());
    }

    @Step("I receive an error response with HTTP status code 404 Not Found")
    public void validateUpdateProfileInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] PUT - Update Password Invalid Endpoint
    @Step("I set an invalid PUT endpoint for updating the user password")
    public String setUpdatePasswordInvalidEndpoint() {
        return url + "patien/account/update/password";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for updating the user password")
    public void sendUpdatePasswordInvalidEndpointRequest(String passwordPatient) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .multiPart("password", passwordPatient)
                .put(setUpdatePasswordInvalidEndpoint());
    }

    @Step("I receive an error response with HTTP status code 404 Not Found for updating the user password")
    public void validateUpdatePasswordInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] DELETE - Delete Profile Invalid Endpoint
    @Step("I set an invalid DELETE endpoint for deleting the user profile")
    public String setDeleteProfileInvalidEndpoint() {
        return url + "patien/delete";
    }

    @Step("I send an HTTP DELETE request with invalid baseURL for deleting the user profile")
    public void sendDeleteProfileInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .delete(setDeleteProfileInvalidEndpoint());
    }

    @Step("I receive an error response with HTTP status code 404 Not Found for deleting the user profile")
    public void validateDeleteProfileInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] PUT - Update Status Invalid Endpoint
    @Step("I set an invalid PUT endpoint for updating the user status")
    public String setUpdateStatusInvalidEndpoint() {
        return url + "patien/update/1/status";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for updating the user status")
    public void sendUpdateStatusInvalidEndpointRequest(String statusPatient) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .when()
                .multiPart("status", statusPatient)
                .put(setUpdateStatusInvalidEndpoint());
    }

    @Step("I receive an error response with HTTP status code 404 Not Found for updating the user status")
    public void validateUpdateStatusInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
