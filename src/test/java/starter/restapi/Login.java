package starter.restapi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {

    public String endpoint_auth = "https://kmb5alta.online/login";

    public static String token = "";

    // [Negative] POST - Incorrect Password
    @Step("I set authentication endpoint with Incorrect Password")
    public String iSetAuthenticationEndpointWithIncorrectPassword() {
        return endpoint_auth;
    }

    @Step("I sends a POST request to the login endpoint with admin credentials")
    public void RequestToTheLoginEndpointWithAdminCredentials() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "Admin1@gmail.com");
        requestBody.put("password", "invalid password");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithIncorrectPassword());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I sends a POST request to the login endpoint with doctor credentials")
    public void RequestToTheLoginEndpointWithDoctorCredentials() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "Doctor5@gmail.com");
        requestBody.put("password", "invalid password");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithIncorrectPassword());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I sends a POST request to the login endpoint with patient credentials")
    public void RequestToTheLoginEndpointWithPatientCredentials() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "Patient@gmail.com");
        requestBody.put("password", "invalid password");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithIncorrectPassword());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I receive a response with HTTP status code 500 Internal Server Error")
    public void ResponseWithHTTPStatusCode500InternalServerError() {
        restAssuredThat(response -> response.statusCode(500));
    }

//    @Step("I receive a response with HTTP status code 400 Bad Request")
//    public void ResponseWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    // [Negative] POST - Data Not Found
    @Step("I set authentication endpoint with data not found")
    public String iSetAuthenticationEndpointWithDataNotFound() {
        return endpoint_auth;
    }

    @Step("I sends a POST request to the login endpoint with admin data not found")
    public void RequestToTheLoginEndpointWithAdminDataNotFound() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "AdminNotFound@gmail.com");
        requestBody.put("password", "data not found");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithDataNotFound());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I sends a POST request to the login endpoint with doctor data not found")
    public void RequestToTheLoginEndpointWithDoctorDataNotFound() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "DoctorNotFound@gmail.com");
        requestBody.put("password", "data not found");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithIncorrectPassword());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I sends a POST request to the login endpoint with patient data not found")
    public void RequestToTheLoginEndpointWithPatientDataNotFound() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "PatientNotFound@gmail.com");
        requestBody.put("password", "data not found");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(iSetAuthenticationEndpointWithIncorrectPassword());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I should receive a response with HTTP status code 500 Internal Server Error")
    public void ResponseWithHTTPStatusCodeInternalServerError() {
        restAssuredThat(response -> response.statusCode(500));
    }
//    @Step("I should receive a response with HTTP status code 400 Bad Request")
//    public void iShouldReceiveAResponseWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

}