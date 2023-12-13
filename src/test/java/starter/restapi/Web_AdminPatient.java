package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminPatient {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - Get All Patient
    @Step("I set the GET endpoint for retrieving all patient data")
    public String setGetAllPatientDataEndpoint(){
        return url + "patient";

    }
    @Step("I send an HTTP GET request with valid baseURL for retrieving all patient data")
    public void sendHttpGetRequestForAllPatientData(){
        SerenityRest.given()
                .when()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI0NzI1NjAsImlhdCI6MTcwMjQ2ODk2MCwiaWQiOjU0LCJyb2xlIjoiQWRtaW4iLCJzdGF0dXMiOiJBY3RpdmUifQ.P7q_BQcsbCYHTSgqx2iW5wJxGnGVHZX8OWTZr51o9M0")
                .get(setGetAllPatientDataEndpoint());

    }
    @Step("I receive a valid data response for retrieving all patient data with HTTP status code 200 OK")
    public void validateAllPatientDataResponse(){
        restAssuredThat(response ->response.statusCode(200));
    }

    // [Positive] GET - Get Patient Status Active
    @Step("I set the GET endpoint for retrieving active patient data")
    public String setGetActivePatientDataEndpoint() {
        return url + "patient?status=active";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving active patient data")
    public void sendHttpGetRequestForActivePatientData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetActivePatientDataEndpoint());
    }

    @Step("I receive a valid data response for retrieving active patient data with HTTP status code 200 OK")
    public void validateActivePatientDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET - Get Patient Status Inactive
    @Step("I set the GET endpoint for retrieving inactive patient data")
    public String setGetInactivePatientDataEndpoint() {
        return url + "patient?status=inactive";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving inactive patient data")
    public void sendHttpGetRequestForInactivePatientData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetInactivePatientDataEndpoint());
    }

    @Step("I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK")
    public void validateInactivePatientDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET - Get Patient by Name
    @Step("I set the GET endpoint for retrieving patient data by name")
    public String setGetPatientByNameEndpoint() {
        return url + "patient/byName";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name")
    public void sendHttpGetRequestForPatientByName() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .param("name", "your_patient_name_here") // Adjust the parameter as needed
                .get(setGetPatientByNameEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK")
    public void validatePatientByNameDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Get Patient Data Empty
    @Step("I set the GET endpoint for retrieving patient data is empty")
    public String setGetPatientDataEmptyEndpoint() {
        return url + "patient/empty";
    }

    @Step("I send an HTTP GET request with valid baseURL for retrieving patient data is empty")
    public void sendHttpGetRequestForEmptyPatientData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetPatientDataEmptyEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found")
    public void validateEmptyPatientDataResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] GET - Get Patient Invalid Endpoint
    @Step("I set the GET endpoint for retrieving patient data with an invalid endpoint")
    public String setGetPatientInvalidEndpoint() {
        return url + "patient/invalid";
    }

    @Step("I send an HTTP GET request with invalid baseURL for retrieving patient data")
    public void sendHttpGetRequestForInvalidPatientDataEndpoint() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetPatientInvalidEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidPatientDataEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET - Dashboard
    @Given("I set the GET endpoint for retrieving dashboard data")
    public String setGetDashboardDataEndpoint() {
        return url + "dashboard";
    }

    @When("I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data")
    public void sendHttpGetRequestForDashboardData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetDashboardDataEndpoint());
    }

    @Step("I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK")
    public void validateDashboardDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Dashboard Invalid Endpoint
    @Step("I set the GET endpoint for retrieving dashboard data with an invalid endpoint")
    public String setGetDashboardInvalidEndpoint() {
        return url + "dashboard/invalid";
    }

    @Step("I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDashboardEndpoint() {
        SerenityRest.given()
                .when()
                .header("Authorization", "your_auth_token_here")
                .get(setGetDashboardInvalidEndpoint());
    }

    @Step("I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidDashboardEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] PUT - Update Profile Admin
    @Step("I set the PUT endpoint for updating admin profile")
    public String setPutUpdateAdminProfileEndpoint() {
        return url + "admin/profile";
    }

    @Step("I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile")
    public void sendHttpPutRequestForUpdateAdminProfile() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "larasati@gmail.com");
        requestBody.put("password", "password");

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IiAiLCJFbWFpbCI6ImxhcmFzYXRpQGdtYWlsLmNvbSJ9.MabljNzw6McLeT2yj_RllLcEgjbvnnNOb4_R_bKi83E")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPutUpdateAdminProfileEndpoint());
    }

    @Step("I receive a valid data response for updating admin profile with HTTP status code 200 OK")
    public void validateUpdateAdminProfileResponse() {
        // Add your logic to validate the response, e.g., check for status code 200
    }

    // [Negative] PUT - Update Profile Admin Invalid Endpoint
    @Step("I set the PUT endpoint for updating admin profile with an invalid endpoint")
    public String setPutUpdateAdminProfileInvalidEndpoint() {
        return url + "admin/profile/invalid";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint")
    public void sendHttpPutRequestForUpdateAdminProfileInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "larasati@gmail.com");
        requestBody.put("password", "password");

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IiAiLCJFbWFpbCI6ImxhcmFzYXRpQGdtYWlsLmNvbSJ9.MabljNzw6McLeT2yj_RllLcEgjbvnnNOb4_R_bKi83E")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPutUpdateAdminProfileInvalidEndpoint());
    }

    @Step("I receive a valid data response for updating admin profile with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateUpdateAdminProfileInvalidEndpointResponse() {
        // Add your logic to validate the response, e.g., check for status code 404
    }

}
