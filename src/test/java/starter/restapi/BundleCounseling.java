package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class BundleCounseling {
    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - Get All Bundle
    @Step("I set the GET endpoint for retrieving Get All Bundle")
    public String setGetAllBundleEndpoint() {

        return url + "bundle";
    }

    @Step("I send an HTTP GET request Get All Bundle Counseling")
    public void sendGetAllBundleRequest() {
        SerenityRest.given()
                .when()
                .get(setGetAllBundleEndpoint());
    }

    @Step("I receive a valid data response for Get All Bundle with HTTP status code 200 OK")
    public void validateGetAllBundle200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Data Empty Bundle
    @Step("I set the GET endpoint for retrieving Data Empty Bundle")
    public String setDataEmptyBundleEndpoint() {

        return url + "bundle";
    }

    @Step("I send an HTTP GET request Data Empty Bundle")
    public void sendDataEmptyBundleRequest() {
        SerenityRest.given()
                .when()
                .get(setGetAllBundleEndpoint());
    }

    @Step("I receive a valid data response for Data Empty Bundle with HTTP status code 200 OK")
    public void validateDataEmptyBundle200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Bundle Invalid Endpoint
    @Step("I set the GET endpoint for retrieving Bundle Invalid Endpoint")
    public String setBundleInvalidEndpoint() {

        return url + "bundle";
    }

    @Step("I send an HTTP GET request Bundle Invalid Endpoint")
    public void sendBundleInvalidEndpointRequest() {
        SerenityRest.given()
                .when()
                .get(setGetAllBundleEndpoint());
    }

    @Step("I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
