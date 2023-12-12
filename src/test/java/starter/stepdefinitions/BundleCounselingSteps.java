package starter.stepdefinitions;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.restapi.BundleCounseling;

public class BundleCounselingSteps {

    private Response BundleCounselingTest;

    @Steps
    BundleCounseling BundleCounseling;

    // [Positive] GET - Get All Bundle
    @Given("I set the GET endpoint for retrieving Get All Bundle")
    public void setGetAllBundleEndpoint() {
        BundleCounseling.setGetAllBundleEndpoint();
    }

    @When("I send an HTTP GET request Get All Bundle Counseling")
    public void sendGetAllBundleRequest() {
        BundleCounseling.sendGetAllBundleRequest();
    }

    @Then("I receive a valid data response for Get All Bundle with HTTP status code 200 OK")
    public void validateGetAllBundle200() {
        BundleCounseling.validateGetAllBundle200();
    }

    // [Negative] GET - Data Empty Bundle
    @Given("I set the GET endpoint for retrieving Data Empty Bundle")
    public void setDataEmptyBundleEndpoint() {
        BundleCounseling.setDataEmptyBundleEndpoint();
    }

    @When("I send an HTTP GET request Data Empty Bundle")
    public void sendDataEmptyBundleRequest() {
        BundleCounseling.sendDataEmptyBundleRequest();
    }

    @Then("I receive a valid data response for Data Empty Bundle with HTTP status code 200 OK")
    public void validateDataEmptyBundle200() {
        BundleCounseling.validateDataEmptyBundle200();
    }

    // [Negative] GET - Bundle Invalid Endpoint
    @Given("I set the GET endpoint for retrieving Bundle Invalid Endpoint")
    public void setBundleInvalidEndpoint() {
        BundleCounseling.setBundleInvalidEndpoint();
    }

    @When("I send an HTTP GET request Bundle Invalid Endpoint")
    public void sendBundleInvalidEndpointRequest() {
        BundleCounseling.sendBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateBundleInvalidEndpoint404() {
        BundleCounseling.validateBundleInvalidEndpoint404();
    }

//    // [Positive] POST - Create Bundle
//    @Given("I set the POST endpoint for creating a bundle")
//    public void setCreateBundleEndpoint() {
//        starter.restapi.BundleCounseling.setCreateBundleEndpoint();
//    }

    // [Positive] POST - Create Bundle
    @Given("I set the POST endpoint for creating a bundle")
    public void setCreateBundleEndpoint() {
        // Simpan hasilnya dalam variabel
        String endpoint = starter.restapi.BundleCounseling.setCreateBundleEndpoint();
        // Opsional, Anda dapat menggunakan nilai endpoint dalam langkah-langkah selanjutnya atau mencetaknya
        System.out.println("Endpoint untuk membuat bundle: " + endpoint);
    }

    @When("I send an HTTP POST request Create Bundle")
    public void sendCreateBundleRequest() {
        BundleCounselingTest = starter.restapi.BundleCounseling.sendCreateBundleRequest("Test", 1, "PREMIUM", 300000, "Test", 1, "/Users/laras/OneDrive/Pictures/Icon/1.png");
    }

    @Then("I receive a valid data response for Create Bundle with HTTP status code 201 Created")
    public void validateCreateBundle201() {
        starter.restapi.BundleCounseling.validateCreateBundle201(BundleCounselingTest);
    }

    // [Negative] POST - Create Bundle Validation Error
/*    @Given("I set the POST endpoint for Create Bundle Validation Error")
    public void setCreateBundleValidationErrorEndpoint() {
        BundleCounseling.setCreateBundleValidationErrorEndpoint();
    }

    @When("I send an HTTP POST request with invalid data for Create Bundle Validation Error")
    public void sendCreateBundleValidationErrorRequest() {
        BundleCounseling.sendCreateBundleValidationErrorRequest();
    }

    @Then("I receive a valid data response for Create Bundle Validation Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationError400() {
        BundleCounseling.validateCreateBundleValidationError400();
    }

    // [Negative] POST - Create Bundle Validation File Error
    @Given("I set the POST endpoint for Create Bundle Validation File Error")
    public void setCreateBundleValidationFileErrorEndpoint() {
        BundleCounseling.setCreateBundleValidationFileErrorEndpoint();
    }

    @When("I send an HTTP POST request with invalid file type for Create Bundle Validation File Error")
    public void sendCreateBundleValidationFileErrorRequest() {
        BundleCounseling.sendCreateBundleValidationFileErrorRequest();
    }

    @Then("I receive a valid data response for Create Bundle Validation File Error with HTTP status code 404 Not Found")
    public void validateCreateBundleValidationFileError404() {
        BundleCounseling.validateCreateBundleValidationFileError404();
    }

    // [Negative] POST - Create Bundle Validation File Invalid Type
    @Given("I set the POST endpoint for Create Bundle Validation File Invalid Type")
    public void setCreateBundleValidationFileInvalidTypeEndpoint() {
        BundleCounseling.setCreateBundleValidationFileInvalidTypeEndpoint();
    }

    @When("I send an HTTP POST request with a file of invalid type for Create Bundle Validation File Invalid Type")
    public void sendCreateBundleValidationFileInvalidTypeRequest() {
        BundleCounseling.sendCreateBundleValidationFileInvalidTypeRequest();
    }

    @Then("I receive a valid data response for Create Bundle Validation File Invalid Type with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileInvalidType400() {
        BundleCounseling.validateCreateBundleValidationFileInvalidType400();
    }

    // [Negative] POST - Create Bundle Validation File Size Error
    @Given("I set the POST endpoint for Create Bundle Validation File Size Error")
    public void setCreateBundleValidationFileSizeErrorEndpoint() {
        BundleCounseling.setCreateBundleValidationFileSizeErrorEndpoint();
    }

    @When("I send an HTTP POST request with a file exceeding size limit for Create Bundle Validation File Size Error")
    public void sendCreateBundleValidationFileSizeErrorRequest() {
        BundleCounseling.sendCreateBundleValidationFileSizeErrorRequest();
    }

    @Then("I receive a valid data response for Create Bundle Validation File Size Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileSizeError400() {
        BundleCounseling.validateCreateBundleValidationFileSizeError400();
    }

    // [Negative] POST - Create Bundle Invalid Endpoint
    @Given("I set the POST endpoint for creating a bundle with an invalid endpoint")
    public void setCreateBundleInvalidEndpoint() {
        BundleCounseling.setCreateBundleInvalidEndpoint();
    }

    @When("I send an HTTP POST request for Create Bundle Invalid Endpoint")
    public void sendCreateBundleInvalidEndpointRequest() {
        BundleCounseling.sendCreateBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Create Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateCreateBundleInvalidEndpoint404() {
        BundleCounseling.validateCreateBundleInvalidEndpoint404();
    }*/

    // [Positive] GET - Get By ID
    @Given("I set the GET endpoint for retrieving a bundle by ID")
    public void setGetBundleByIdEndpoint() {
        BundleCounseling.setGetBundleByIdEndpoint();
    }

    @When("I send an HTTP GET request with a valid ID")
    public void sendGetBundleByIdRequest() {
        BundleCounseling.sendGetBundleByIdRequest();
    }

    @Then("I receive a valid data response with HTTP status code 200 OK")
    public void validateGetBundleById200() {
        BundleCounseling.validateGetBundleById();
    }

    // [Negative] GET - Get By ID Invalid ID
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Invalid ID")
    public void setGetBundleByIdInvalidIdEndpoint() {
        BundleCounseling.setGetBundleByIdInvalidIdEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Invalid ID")
    public void sendGetBundleByIdInvalidIdRequest() {
        BundleCounseling.sendGetBundleByIdInvalidIdRequest();
    }

    @Then("I receive a valid data response for Get By ID Invalid ID with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdInvalidId400() {
        BundleCounseling.validateGetBundleByIdInvalidId400();
    }

    // [Negative] GET - Get By ID Data Not Found
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Data Not Found")
    public void setGetBundleByIdDataNotFoundEndpoint() {
        BundleCounseling.setGetBundleByIdDataNotFoundEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Data Not Found")
    public void sendGetBundleByIdDataNotFoundRequest() {
        BundleCounseling.sendGetBundleByIdDataNotFoundRequest();
    }

    @Then("I receive a valid data response for get Get By ID Data Not Found with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdDataNotFound400() {
        BundleCounseling.validateGetBundleByIdDataNotFound400();
    }

    // [Negative] GET - Get By ID Invalid Endpoint
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint")
    public void setGetBundleByIdInvalidEndpoint() {
        BundleCounseling.setGetBundleByIdInvalidEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Invalid Endpoint")
    public void sendGetBundleByIdInvalidEndpointRequest() {
        BundleCounseling.sendGetBundleByIdInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdInvalidEndpoint400() {
        BundleCounseling.validateGetBundleByIdInvalidEndpoint400();
    }

/*    // [Positive] PUT - Update Bundle Success With File Update
    @Given("I set the PUT endpoint for updating a bundle With File Update")
    public void setUpdateBundleWithFileUpdateEndpoint() {
        BundleCounseling.setUpdateBundleWithFileUpdateEndpoint();
    }

    @When("I send an HTTP PUT request with valid data for Update Bundle Success With File Update")
    public void sendUpdateBundleWithFileUpdateRequest() {
        BundleCounseling.sendUpdateBundleWithFileUpdateRequest();
    }

    @Then("I receive a valid data response for Update Bundle Success With File Update with HTTP status code 200 OK")
    public void validateUpdateBundleWithFileUpdate200() {
        BundleCounseling.validateUpdateBundleWithFileUpdate200();
    }

    // [Positive] PUT - Update Bundle Success But File Not Update
    @Given("I set the PUT endpoint for updating a bundle With File Update")
    public void setUpdateBundleSuccessButFileNotUpdateEndpoint() {
        BundleCounseling.setUpdateBundleSuccessButFileNotUpdateEndpoint();
    }

    @When("I send an HTTP PUT request with valid data for Update Bundle Success But File Not Update")
    public void sendUpdateBundleSuccessButFileNotUpdateRequest() {
        BundleCounseling.sendUpdateBundleSuccessButFileNotUpdateRequest();
    }

    @Then("I receive a valid data response for Update Bundle Success But File Not Update with HTTP status code 200 OK")
    public void validateUpdateBundleSuccessButFileNotUpdate200() {
        BundleCounseling.validateUpdateBundleSuccessButFileNotUpdate200();
    }

    // [Negative] PUT - Update Bundle Validate Error
    @Given("I set the PUT endpoint for updating a bundle")
    public void setUpdateBundleValidateErrorEndpoint() {
        BundleCounseling.setUpdateBundleValidateErrorEndpoint();
    }

    @When("I send an HTTP PUT request with invalid data")
    public void sendUpdateBundleValidateErrorRequest() {
        BundleCounseling.sendUpdateBundleValidateErrorRequest();
    }

    @Then("I receive a valid data response with HTTP status code 400 Bad Request")
    public void validateUpdateBundleValidateError400() {
        BundleCounseling.validateUpdateBundleValidateError400();
    }

    // [Negative] PUT - Update Bundle Server Error
    @Given("I set the PUT endpoint for Update Bundle Server Error")
    public void setUpdateBundleServerErrorEndpoint() {
        BundleCounseling.setUpdateBundleServerErrorEndpoint();
    }

    @When("I send an HTTP PUT request with valid data for Update Bundle Server Error")
    public void sendUpdateBundleServerErrorRequest() {
        BundleCounseling.sendUpdateBundleServerErrorRequest();
    }

    @Then("I receive a valid data response for Update Bundle Server Error with HTTP status code 500 Internal Server Error")
    public void validateUpdateBundleServerError500() {
        BundleCounseling.validateUpdateBundleServerError500();
    }

    // [Negative] PUT - Update Bundle Invalid Endpoint
    @Given("I set the PUT endpoint for updating a bundle with an invalid endpoint")
    public void setUpdateBundleInvalidEndpoint() {
        BundleCounseling.setUpdateBundleInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for Update Bundle Invalid Endpoint")
    public void sendUpdateBundleInvalidEndpointRequest() {
        BundleCounseling.sendUpdateBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Update Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateUpdateBundleInvalidEndpoint404() {
        BundleCounseling.validateUpdateBundleInvalidEndpoint404();
    }*/

    // [Positive] DELETE - Delete Bundle
    @Given("I set the DELETE endpoint for deleting a bundle")
    public void setDeleteBundleEndpoint() {
        BundleCounseling.setDeleteBundleEndpoint();
    }

    @When("I send an HTTP DELETE request with a valid ID")
    public void sendDeleteBundleRequest() {
        BundleCounseling.sendDeleteBundleRequest();
    }

    @Then("I receive a valid data response with HTTP status code 200 OK for delete bundle")

    public void validateDeleteBundle200() {
        BundleCounseling.validateDeleteBundle200();
    }

    // [Negative] DELETE - Delete Bundle Invalid ID
    @Given("I set the DELETE endpoint for deleting a bundle with an invalid ID")
    public void setDeleteBundleInvalidIdEndpoint() {
        BundleCounseling.setDeleteBundleInvalidIdEndpoint();
    }

    @When("I send an HTTP DELETE request with an invalid ID")
    public void sendDeleteBundleInvalidIdRequest() {
        BundleCounseling.sendDeleteBundleInvalidIdRequest();
    }

    @Then("I receive a valid data response for Delete Bundle Invalid ID with HTTP status code 400 Bad Request")
    public void validateDeleteBundleInvalidId400() {
        BundleCounseling.validateDeleteBundleInvalidId400();
    }

    // [Negative] DELETE - Delete Bundle Invalid Endpoint
    @Given("I set the DELETE endpoint for deleting a bundle with an invalid endpoint")
    public void setDeleteBundleInvalidEndpoint() {
        BundleCounseling.setDeleteBundleInvalidEndpoint();
    }

    @When("I send an HTTP DELETE request with an invalid endpoint")
    public void sendDeleteBundleInvalidEndpointRequest() {
        BundleCounseling.sendDeleteBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateDeleteBundleInvalidEndpoint400() {
        BundleCounseling.validateDeleteBundleInvalidEndpoint404();
    }

}
