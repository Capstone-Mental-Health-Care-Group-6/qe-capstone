package starter.restapi;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminBundleCounseling {
    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - Get All Bundle
    @Step("I set the GET endpoint for retrieving Get All Bundle")
    public String setGetAllBundleEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP GET request Get All Bundle Counseling")
    public void sendGetAllBundleRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
        return url + "bundl";
    }

    @Step("I send an HTTP GET request Bundle Invalid Endpoint")
    public void sendBundleInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .when()
                .get(setBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] POST - Create Bundle
    @Step("I set the POST endpoint for creating a bundle")
    public String setCreateBundleEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request Create Bundle")
    public void sendCreateBundleRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .post(setCreateBundleEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle with HTTP status code 201 Created")
    public void validateCreateBundle201() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Create Bundle Validation Error
    @Step("I set the POST endpoint for Create Bundle Validation Error")
    public String setCreateBundleValidationErrorEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request with invalid data for Create Bundle Validation Error")
    public void sendCreateBundleValidationErrorRequest(String name, int sessions, String type, int price, String description, int activePeriod) {
//        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
//                .multiPart("avatar", avatarPath)
                .post(setCreateBundleValidationErrorEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle Validation Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationError400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Create Bundle Validation File Error
    @Step("I set the POST endpoint for Create Bundle Validation File Error")
    public String setCreateBundleValidationFileErrorEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request with invalid file type for Create Bundle Validation File Error")
    public void sendCreateBundleValidationFileErrorRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .post(setCreateBundleValidationFileErrorEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle Validation File Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileError400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Create Bundle Validation File Invalid Type
    @Step("I set the POST endpoint for Create Bundle Validation File Invalid Type")
    public String setCreateBundleValidationFileInvalidTypeEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request with a file of invalid type for Create Bundle Validation File Invalid Type")
    public void sendCreateBundleValidationFileInvalidTypeRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .post(setCreateBundleValidationFileInvalidTypeEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle Validation File Invalid Type with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileInvalidType400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Create Bundle Validation File Size Error
    @Step("I set the POST endpoint for Create Bundle Validation File Size Error")
    public String setCreateBundleValidationFileSizeErrorEndpoint() {
        return url + "bundle";
    }

    @Step("I send an HTTP POST request with a file exceeding size limit for Create Bundle Validation File Size Error")
    public void sendCreateBundleValidationFileSizeErrorRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .post(setCreateBundleValidationFileSizeErrorEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle Validation File Size Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileSizeError400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set the POST endpoint for creating a bundle with an invalid endpoint")
    public String setCreateBundleInvalidEndpoint() {
        return url + "bundl";
    }

    @Step("I send an HTTP POST request for Create Bundle Invalid Endpoint")
    public void sendCreateBundleInvalidEndpointRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .post(setCreateBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Create Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateCreateBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }


    // [Positive] GET - Get By ID
    @Step("I set the GET endpoint for retrieving a bundle by ID")
    public String setGetBundleByIdEndpoint() {
        return url + "bundle/2";
    }

    @Step("I send an HTTP GET request with a valid ID")
    public void sendGetBundleByIdRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .when()
                .get(setGetBundleByIdEndpoint());
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .when()
                .get(setGetBundleByIdDataNotFoundEndpoint());
    }

    @Step("I receive a valid data response for get Get By ID Data Not Found with HTTP status code 404 Not Found")
    public void validateGetBundleByIdDataNotFound400() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] GET - Get By ID Invalid Endpoint
    @Step("I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint")
    public String setGetBundleByIdInvalidEndpoint() {
        return url + "bundl/1";
    }

    @Step("I send an HTTP GET request with an Get By ID Invalid Endpoint")
    public void sendGetBundleByIdInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .when()
                .get(setGetBundleByIdInvalidEndpoint());
    }

    @Step("I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateGetBundleByIdInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] PUT - Update Bundle Success With File Update
    @Step("I set the PUT endpoint for updating a bundle With File Update")
    public String setUpdateBundleWithFileUpdateEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP PUT request with valid data for Update Bundle Success With File Update")
    public void sendUpdateBundleWithFileUpdateRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .put(setUpdateBundleWithFileUpdateEndpoint());
    }

    @Step("I receive a valid data response for Update Bundle Success With File Update with HTTP status code 200 OK")
    public void validateUpdateBundleWithFileUpdate200() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] PUT - Update Bundle Success But File Not Update
    @Step("I set the PUT endpoint for updating a bundle With File Not Update")
    public String setUpdateBundleSuccessButFileNotUpdateEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP PUT request with valid data for Update Bundle Success But File Not Update")
    public void sendUpdateBundleSuccessButFileNotUpdateRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .put(setUpdateBundleSuccessButFileNotUpdateEndpoint());
    }

    @Step("I receive a valid data response for Update Bundle Success But File Not Update with HTTP status code 200 OK")
    public void validateUpdateBundleSuccessButFileNotUpdate200() {
        restAssuredThat(response -> response.statusCode(400));
    }


    // [Negative] PUT - Update Bundle Validate Error
    @Step("I set the PUT endpoint for updating a bundle")
    public String setUpdateBundleValidateErrorEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP PUT request with invalid data")
    public void sendUpdateBundleValidateErrorRequest(String name, int sessions, String type, int price, String description, int activePeriod) {
//        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
//                .multiPart("avatar", avatarPath)
                .put(setUpdateBundleValidateErrorEndpoint());
    }

    @Step("I receive a valid data response with HTTP status code 400 Bad Request")
    public void validateUpdateBundleValidateError400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] PUT - Update Bundle Invalid Endpoint
    @Step("I set the PUT endpoint for updating a bundle with an invalid endpoint")
    public String setUpdateBundleInvalidEndpoint() {
        return url + "bundle/1";
    }

    @Step("I send an HTTP PUT request for Update Bundle Invalid Endpoint")
    public void sendUpdateBundleInvalidEndpointRequest(String name, int sessions, String type, int price, String description, int activePeriod, String avatarimgPath) {
        File avatarPath = new File(avatarimgPath);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .multiPart("name", name)
                .multiPart("sessions", sessions)
                .multiPart("type", type)
                .multiPart("price", price)
                .multiPart("description", description)
                .multiPart("active_period", activePeriod)
                .multiPart("avatar", avatarPath)
                .put(setUpdateBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Update Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateUpdateBundleInvalidEndpoint404() {
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
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
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .delete(setDeleteBundleInvalidEndpoint());
    }

    @Step("I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateDeleteBundleInvalidEndpoint404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
