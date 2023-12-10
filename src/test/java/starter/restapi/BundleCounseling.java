package starter.restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
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
                .get(setDataEmptyBundleEndpoint());
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
                .get(setBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // BELUM FIX
    // [Positive] POST - Create Bundle
    @Step("I set the POST endpoint for creating a bundle")
    public static String setCreateBundleEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request Create Bundle")
    public static Response sendCreateBundleRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarPath) {
        RequestSpecification request = RestAssured.given()
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", "@" + avatarPath);

        return request.when().post(setCreateBundleEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle with HTTP status code 201 Created")
    public static void validateCreateBundle201(Response response) {
        response.then().statusCode(201);
    }

    // [Positive] GET - Get All Bundle
    @Step("I set the GET endpoint for retrieving a bundle by ID")
    public String setGetBundleByIdEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP GET request with a valid ID")
    public void sendGetBundleByIdRequest() {
        SerenityRest.given()
                .when()
                .get(setGetAllBundleEndpoint());
    }

    @Step("I receive a valid data response with HTTP status code 200 OK")
    public void validateGetBundleById() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Get By ID Invalid ID
    @Step("I set the GET endpoint for retrieving a bundle Get By ID Invalid ID")
    public String setGetBundleByIdInvalidIdEndpoint() {
        return url + "bundle/ks";
    }

    @Step("I send an HTTP GET request with an Get By ID Invalid ID")
    public void sendGetBundleByIdInvalidIdRequest() {
        SerenityRest.given()
                .when()
                .get(setGetBundleByIdInvalidIdEndpoint());
    }

    @Step("I receive a valid data response for Get By ID Invalid ID with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdInvalidId400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] GET - Get By ID Data Not Found
    @Step("I set the GET endpoint for retrieving a bundle Get By ID Data Not Found")
    public String setGetBundleByIdDataNotFoundEndpoint() {
        return url + "bundle/999";
    }

    @Step("I send an HTTP GET request with an Get By ID Data Not Found")
    public void sendGetBundleByIdDataNotFoundRequest() {
        SerenityRest.given()
                .when()
                .get(setGetBundleByIdDataNotFoundEndpoint());
    }

    @Step("I receive a valid data response for get Get By ID Data Not Found with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdDataNotFound400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] GET - Get By ID Invalid Endpoint
    @Step("I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint")
    public String setGetBundleByIdInvalidEndpoint() {
        return url + "bundl/1";
    }

    @Step("I send an HTTP GET request with an Get By ID Invalid Endpoint")
    public void sendGetBundleByIdInvalidEndpointRequest() {
        SerenityRest.given()
                .when()
                .get(setGetBundleByIdInvalidEndpoint());
    }

    @Step("I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdInvalidEndpoint400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] DELETE - Delete Bundle
    @Step("I set the DELETE endpoint for deleting a bundle")
    public String setDeleteBundleEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP DELETE request with a valid ID")
    public void sendDeleteBundleRequest() {
        SerenityRest.given()
                .delete(setDeleteBundleEndpoint());
    }

    @Step("I receive a valid data response with HTTP status code 200 OK")
    public void validateDeleteBundle200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] DELETE - Delete Bundle Invalid ID
    @Step("I set the DELETE endpoint for deleting a bundle with an invalid ID")
    public String setDeleteBundleInvalidIdEndpoint() {
        return url + "bundle/ks";
    }

    @Step("I send an HTTP DELETE request with an invalid ID")
    public void sendDeleteBundleInvalidIdRequest() {
        SerenityRest.given()
                .delete(setDeleteBundleInvalidIdEndpoint());
    }

    @Step("I receive a valid data response for Delete Bundle Invalid ID with HTTP status code 400 Bad Request")
    public void validateDeleteBundleInvalidId400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] DELETE - Delete Bundle Invalid Endpoint
    @Step("I set the DELETE endpoint for deleting a bundle with an invalid endpoint")
    public String setDeleteBundleInvalidEndpoint() {
        return url + "bundl/1";
    }

    @Step("I send an HTTP DELETE request with an invalid endpoint")
    public void sendDeleteBundleInvalidEndpointRequest() {
        SerenityRest.given()
                .delete(setDeleteBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 400 Bad Request")
    public void validateDeleteBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
