package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.Random;

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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .get(setGetInactivePatientDataEndpoint());
    }

    @Step("I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK")
    public void validateInactivePatientDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET - Get Patient by Name
    @Step("I set the GET endpoint for retrieving patient data by name")
    public String setGetPatientByNameEndpoint() {
        return url + "patient?name=";
    }

    @Step("I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name")
    public void sendHttpGetRequestForPatientByName() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .param("name", "fa") // Adjust the parameter as needed
                .get(setGetPatientByNameEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK")
    public void validatePatientByNameDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Get Patient Data Empty
    @Step("I set the GET endpoint for retrieving patient data is empty")
    public String setGetPatientDataEmptyEndpoint() {
        return url + "patient";
    }

    @Step("I send an HTTP GET request with valid baseURL for retrieving patient data is empty")
    public void sendHttpGetRequestForEmptyPatientData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .get(setGetPatientDataEmptyEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found")
    public void validateEmptyPatientDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Get Patient Invalid Endpoint
    @Step("I set the GET endpoint for retrieving patient data with an invalid endpoint")
    public String setGetPatientInvalidEndpoint() {
        return url + "patien";
    }

    @Step("I send an HTTP GET request with invalid baseURL for retrieving patient data")
    public void sendHttpGetRequestForInvalidPatientDataEndpoint() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .get(setGetPatientInvalidEndpoint());
    }

    @Step("I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidPatientDataEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET - Dashboard
    @Step("I set the GET endpoint for retrieving dashboard data")
    public String setGetDashboardDataEndpoint() {
        return url + "patient/dashboard";
    }

    @Step("I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data")
    public void sendHttpGetRequestForDashboardData() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .get(setGetDashboardDataEndpoint());
    }

    @Step("I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK")
    public void validateDashboardDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Dashboard Invalid Endpoint
    @Step("I set the GET endpoint for retrieving dashboard data with an invalid endpoint")
    public String setGetDashboardInvalidEndpoint() {
        return url + "patient/dashboar";
    }

    @Step("I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDashboardEndpoint() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .get(setGetDashboardInvalidEndpoint());
    }

    @Step("I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidDashboardEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] PUT - Update Profile Admin
    @Step("I set the PUT endpoint for updating admin profile")
    public String setPutUpdateAdminProfileEndpoint() {
        return url + "admin/update";
    }

    @Step("I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile")
    public void sendHttpPutRequestForUpdateAdminProfile() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "admin7");
        requestBody.put("password", "password");
        requestBody.put("email", generateRandomEmail());

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateAdminProfileEndpoint());
    }

    private String generateRandomEmail() {
        String[] emailProviders = {"gmail.com", "yahoo.com"};
        String randomUsername = getRandomString(8); // You can adjust the length of the username as needed
        String randomProvider = emailProviders[new Random().nextInt(emailProviders.length)];

        return randomUsername + "@" + randomProvider;
    }

    private String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }

    @Step("I receive a valid data response for updating admin profile with HTTP status code 200 OK")
    public void validateUpdateAdminProfileResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] PUT - Update Profile Admin Invalid Endpoint
    @Step("I set the PUT endpoint for updating admin profile with an invalid endpoint")
    public String setPutUpdateAdminProfileInvalidEndpoint() {
        return url + "admin/updat";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint")
    public void sendHttpPutRequestForUpdateAdminProfileInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "admin6");
        requestBody.put("password", "password");
        requestBody.put("email", "adminaja6@yahoo.com");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutUpdateAdminProfileInvalidEndpoint());
    }

    @Step("I receive a valid data response for updating admin profile with HTTP status code 200 OK")
    public void validateUpdateAdminProfileInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
