package starter.restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient {

    protected static String url = "https://kmb5alta.online/patient";
    public static String token = "";

    // [Positive] GET - Get All Patient
    @Step("I set the GET endpoint for Get all patient")
    public String setGetAllPatientEndpoint() {
        return url + "patient";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all patient")
    public void setGetvalURL() {
        SerenityRest.given()
                .header("Authorization", "")
                .when()
                .get(setGetAllPatientEndpoint());


        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }
    @Step("I receive a response status 200 OK get all patient")
    public void validateGetAllDoctorsResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET Doctor By ID
    @Step("I set the GET endpoint for retrieving a doctor by ID")
    public String setGetDoctorByIdEndpoint() {
        return url + "doctor/3";
    }

    @Step("I send an HTTP GET request with a valid ID and baseURL")
    public void sendHttpGetRequestForDoctorById() {
        SerenityRest.given()
                .when()
                .get(setGetDoctorByIdEndpoint());
    }

    @Step("I receive a valid data response for get doctor by ID with HTTP status code 200 OK")
    public void validateGetDoctorByIdResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }


}
