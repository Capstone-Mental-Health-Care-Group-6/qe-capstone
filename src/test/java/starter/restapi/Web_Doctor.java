package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_Doctor {
    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - Get All Bundle
    @Step("I set the GET endpoint for retrieving all doctors")
    public String setGetAllDoctorEndpoint() {
        return url + "doctor";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all doctors")
    public void sendHttpGetRequestForAllDoctors() {
        SerenityRest.given()
                .when()
                .get(setGetAllDoctorEndpoint());
    }

    @Step("I receive a valid data response for get all doctors with HTTP status code 200 OK")
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

    // [Positive] GET Search Doctor by Name
    @Step("I set the GET endpoint for searching a doctor by name")
    public String setGetSearchDoctorByNameEndpoint() {
        return url + "doctor/search?name=Fauzan";
    }

    @Step("I send an HTTP GET request with a valid name parameter and baseURL")
    public void sendHttpGetRequestForSearchDoctorByName() {
        SerenityRest.given()
                .when()
                .get(setGetSearchDoctorByNameEndpoint());
    }

    @Step("I receive a valid data response for searching a doctor by name with HTTP status code 200 OK")
    public void validateSearchDoctorByNameResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET - Get All Bundle Invalid Endpoint
    @Step("I set the GET endpoint for retrieving all doctors with an invalid endpoint")
    public String setGetAllDoctorInvalidEndpoint() {
        return url + "docto";
    }

    @Step("I send an HTTP GET request for retrieving all doctors with an invalid endpoint")
    public void sendHttpGetRequestForAllDoctorsWithInvalidEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetAllDoctorInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint retrieving all doctors with HTTP status code 404 Not Found")
    public void validateInvalidEndpointResponseForAllDoctors() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET Doctor By ID Invalid Endpoint
    @Step("I set the GET endpoint for retrieving a doctor by ID with an invalid endpoint")
    public String setGetDoctorByIdInvalidEndpoint() {
        return url + "doctor/ks";
    }

    @Step("I send an HTTP GET request for retrieving a doctor by ID with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDoctorByIdEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetDoctorByIdInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 400 Bad Request")
    public void validateInvalidDoctorByIdEndpointResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] GET Search Doctor by Name
    @Step("I set the GET endpoint for searching a doctor by name with an invalid endpoint")
    public String setGetSearchDoctorByNameInvalidEndpoint() {
        return url + "docto/search?name=Fauzan";
    }

    @Step("I send an HTTP GET request for searching a doctor by name with an invalid endpoint")
    public void sendHttpGetRequestForInvalidSearchDoctorByNameEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetSearchDoctorByNameInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found")
    public void validateInvalidSearchDoctorByNameEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }
}