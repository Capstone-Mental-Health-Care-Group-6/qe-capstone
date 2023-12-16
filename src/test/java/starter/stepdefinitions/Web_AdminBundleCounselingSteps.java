package starter.stepdefinitions;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.restapi.Web_AdminBundleCounseling;

public class Web_AdminBundleCounselingSteps {

    private Response BundleCounselingTest;

    @Steps
    Web_AdminBundleCounseling Web_AdminBundleCounseling;

    // [Positive] GET - Get All Bundle
    @Given("I set the GET endpoint for retrieving Get All Bundle")
    public void setGetAllBundleEndpoint() {
        Web_AdminBundleCounseling.setGetAllBundleEndpoint();
    }

    @When("I send an HTTP GET request Get All Bundle Counseling")
    public void sendGetAllBundleRequest() {
        Web_AdminBundleCounseling.sendGetAllBundleRequest();
    }

    @Then("I receive a valid data response for Get All Bundle with HTTP status code 200 OK")
    public void validateGetAllBundle200() {
        Web_AdminBundleCounseling.validateGetAllBundle200();
    }

    // [Negative] GET - Data Empty Bundle
    @Given("I set the GET endpoint for retrieving Data Empty Bundle")
    public void setDataEmptyBundleEndpoint() {
        Web_AdminBundleCounseling.setDataEmptyBundleEndpoint();
    }

    @When("I send an HTTP GET request Data Empty Bundle")
    public void sendDataEmptyBundleRequest() {
        Web_AdminBundleCounseling.sendDataEmptyBundleRequest();
    }

    @Then("I receive a valid data response for Data Empty Bundle with HTTP status code 200 OK")
    public void validateDataEmptyBundle200() {
        Web_AdminBundleCounseling.validateDataEmptyBundle200();
    }

    // [Negative] GET - Bundle Invalid Endpoint
    @Given("I set the GET endpoint for retrieving Bundle Invalid Endpoint")
    public void setBundleInvalidEndpoint() {
        Web_AdminBundleCounseling.setBundleInvalidEndpoint();
    }

    @When("I send an HTTP GET request Bundle Invalid Endpoint")
    public void sendBundleInvalidEndpointRequest() {
        Web_AdminBundleCounseling.sendBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateBundleInvalidEndpoint404() {
        Web_AdminBundleCounseling.validateBundleInvalidEndpoint404();
    }


    // [Positive] POST - Create Bundle
    @Given("I set the POST endpoint for creating a bundle")
    public void setCreateBundleEndpoint() {
      Web_AdminBundleCounseling.setCreateBundleEndpoint();

    }

    @When("I send an HTTP POST request Create Bundle")
    public void sendCreateBundleRequest() {
        String name = "Paket Perkenalan";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Test";
        int activePeriod = 1;
        String avatarimgPath = "C:/EmpathiCare/thumbnail.jpg";

        Web_AdminBundleCounseling.sendCreateBundleRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Create Bundle with HTTP status code 201 Created")
    public void validateCreateBundle201() {
        Web_AdminBundleCounseling.validateCreateBundle201();
    }

    // [Negative] POST - Create Bundle Validation Error
    @Given("I set the POST endpoint for Create Bundle Validation Error")
    public void setCreateBundleValidationErrorEndpoint() {
        Web_AdminBundleCounseling.setCreateBundleValidationErrorEndpoint();
    }

    @When("I send an HTTP POST request with invalid data for Create Bundle Validation Error")
    public void sendCreateBundleValidationErrorRequest() {
        String name = " ";
        int sessions = 0;
        String type = " ";
        int price = 0;
        String description = " ";
        int activePeriod = 0;
//        String avatarimgPath = " ";

        Web_AdminBundleCounseling.sendCreateBundleValidationErrorRequest(name, sessions, type, price, description, activePeriod);
    }

    @Then("I receive a valid data response for Create Bundle Validation Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationError400() {
        Web_AdminBundleCounseling.validateCreateBundleValidationError400();
    }

    // [Negative] POST - Create Bundle Validation File Error
    @Given("I set the POST endpoint for Create Bundle Validation File Error")
    public void setCreateBundleValidationFileErrorEndpoint() {
        Web_AdminBundleCounseling.setCreateBundleValidationFileErrorEndpoint();
    }

    @When("I send an HTTP POST request with invalid file type for Create Bundle Validation File Error")
    public void sendCreateBundleValidationFileErrorRequest() {
        String name = "Paket Perkenalan";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Test";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/coba.xlsx";

        Web_AdminBundleCounseling.sendCreateBundleValidationFileErrorRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Create Bundle Validation File Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileError400() {
        Web_AdminBundleCounseling.validateCreateBundleValidationFileError400();
    }

    // [Negative] POST - Create Bundle Validation File Invalid Type
    @Given("I set the POST endpoint for Create Bundle Validation File Invalid Type")
    public void setCreateBundleValidationFileInvalidTypeEndpoint() {
        Web_AdminBundleCounseling.setCreateBundleValidationFileInvalidTypeEndpoint();
    }

    @When("I send an HTTP POST request with a file of invalid type for Create Bundle Validation File Invalid Type")
    public void sendCreateBundleValidationFileInvalidTypeRequest() {
        String name = "Paket Perkenalan";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Test";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/coba.xlsx";

        Web_AdminBundleCounseling.sendCreateBundleValidationFileInvalidTypeRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Create Bundle Validation File Invalid Type with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileInvalidType400() {
        Web_AdminBundleCounseling.validateCreateBundleValidationFileInvalidType400();
    }

    // [Negative] POST - Create Bundle Validation File Size Error
    @Given("I set the POST endpoint for Create Bundle Validation File Size Error")
    public void setCreateBundleValidationFileSizeErrorEndpoint() {
        Web_AdminBundleCounseling.setCreateBundleValidationFileSizeErrorEndpoint();
    }

    @When("I send an HTTP POST request with a file exceeding size limit for Create Bundle Validation File Size Error")
    public void sendCreateBundleValidationFileSizeErrorRequest() {
        String name = "Paket Perkenalan";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Test";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/coba.xlsx";
        Web_AdminBundleCounseling.sendCreateBundleValidationFileSizeErrorRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Create Bundle Validation File Size Error with HTTP status code 400 Bad Request")
    public void validateCreateBundleValidationFileSizeError400() {
        Web_AdminBundleCounseling.validateCreateBundleValidationFileSizeError400();
    }

    // [Negative] POST - Create Bundle Invalid Endpoint
    @Given("I set the POST endpoint for creating a bundle with an invalid endpoint")
    public void setCreateBundleInvalidEndpoint() {
        Web_AdminBundleCounseling.setCreateBundleInvalidEndpoint();
    }

    @When("I send an HTTP POST request for Create Bundle Invalid Endpoint")
    public void sendCreateBundleInvalidEndpointRequest() {
        String name = "Paket Perkenalan";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Test";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/thumbnail.jpg";
        Web_AdminBundleCounseling.sendCreateBundleInvalidEndpointRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Create Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateCreateBundleInvalidEndpoint404() {
        Web_AdminBundleCounseling.validateCreateBundleInvalidEndpoint404();
    }

    // [Positive] GET - Get By ID
    @Given("I set the GET endpoint for retrieving a bundle by ID")
    public void setGetBundleByIdEndpoint() {
        Web_AdminBundleCounseling.setGetBundleByIdEndpoint();
    }

    @When("I send an HTTP GET request with a valid ID")
    public void sendGetBundleByIdRequest() {
        Web_AdminBundleCounseling.sendGetBundleByIdRequest();
    }

    @Then("I receive a valid data response with HTTP status code 200 OK")
    public void validateGetBundleById200() {
        Web_AdminBundleCounseling.validateGetBundleById();
    }

    // [Negative] GET - Get By ID Invalid ID
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Invalid ID")
    public void setGetBundleByIdInvalidIdEndpoint() {
        Web_AdminBundleCounseling.setGetBundleByIdInvalidIdEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Invalid ID")
    public void sendGetBundleByIdInvalidIdRequest() {
        Web_AdminBundleCounseling.sendGetBundleByIdInvalidIdRequest();
    }

    @Then("I receive a valid data response for Get By ID Invalid ID with HTTP status code 400 Bad Request")
    public void validateGetBundleByIdInvalidId400() {
        Web_AdminBundleCounseling.validateGetBundleByIdInvalidId400();
    }

    // [Negative] GET - Get By ID Data Not Found
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Data Not Found")
    public void setGetBundleByIdDataNotFoundEndpoint() {
        Web_AdminBundleCounseling.setGetBundleByIdDataNotFoundEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Data Not Found")
    public void sendGetBundleByIdDataNotFoundRequest() {
        Web_AdminBundleCounseling.sendGetBundleByIdDataNotFoundRequest();
    }

    @Then("I receive a valid data response for get Get By ID Data Not Found with HTTP status code 404 Not Found")
    public void validateGetBundleByIdDataNotFound400() {
        Web_AdminBundleCounseling.validateGetBundleByIdDataNotFound400();
    }

    // [Negative] GET - Get By ID Invalid Endpoint
    @Given("I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint")
    public void setGetBundleByIdInvalidEndpoint() {
        Web_AdminBundleCounseling.setGetBundleByIdInvalidEndpoint();
    }

    @When("I send an HTTP GET request with an Get By ID Invalid Endpoint")
    public void sendGetBundleByIdInvalidEndpointRequest() {
        Web_AdminBundleCounseling.sendGetBundleByIdInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateGetBundleByIdInvalidEndpoint400() {
        Web_AdminBundleCounseling.validateGetBundleByIdInvalidEndpoint404();
    }

   // [Positive] PUT - Update Bundle Success With File Update
    @Given("I set the PUT endpoint for updating a bundle With File Update")
    public void setUpdateBundleWithFileUpdateEndpoint() {
        Web_AdminBundleCounseling.setUpdateBundleWithFileUpdateEndpoint();
    }

    @When("I send an HTTP PUT request with valid data for Update Bundle Success With File Update")
    public void sendUpdateBundleWithFileUpdateRequest() {
        String name = "Paket Update Testing";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Update paket kenangan indah";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/thumbnail.jpg";
        Web_AdminBundleCounseling.sendUpdateBundleWithFileUpdateRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Update Bundle Success With File Update with HTTP status code 200 OK")
    public void validateUpdateBundleWithFileUpdate200() {
        Web_AdminBundleCounseling.validateUpdateBundleWithFileUpdate200();
    }

    // [Positive] PUT - Update Bundle Success But File Not Update
    @Given("I set the PUT endpoint for updating a bundle With File Not Update")
    public void setUpdateBundleSuccessButFileNotUpdateEndpoint() {
        Web_AdminBundleCounseling.setUpdateBundleSuccessButFileNotUpdateEndpoint();
    }

    @When("I send an HTTP PUT request with valid data for Update Bundle Success But File Not Update")
    public void sendUpdateBundleSuccessButFileNotUpdateRequest() {
        String name = "Paket Update Testing";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Update paket kenangan indah";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/thumbnail.jpg";
        Web_AdminBundleCounseling.sendUpdateBundleSuccessButFileNotUpdateRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Update Bundle Success But File Not Update with HTTP status code 200 OK")
    public void validateUpdateBundleSuccessButFileNotUpdate200() {
        Web_AdminBundleCounseling.validateUpdateBundleSuccessButFileNotUpdate200();
    }

    // [Negative] PUT - Update Bundle Validate Error
    @Given("I set the PUT endpoint for updating a bundle")
    public void setUpdateBundleValidateErrorEndpoint() {
        Web_AdminBundleCounseling.setUpdateBundleValidateErrorEndpoint();
    }

    @When("I send an HTTP PUT request with invalid data")
    public void sendUpdateBundleValidateErrorRequest() {
        String name = " ";
        int sessions = 1;
        String type = " ";
        int price = 80000;
        String description = " ";
        int activePeriod = 1;
//        String avatarimgPath = " ";
        Web_AdminBundleCounseling.sendUpdateBundleValidateErrorRequest(name, sessions, type, price, description, activePeriod);
    }

    @Then("I receive a valid data response with HTTP status code 400 Bad Request")
    public void validateUpdateBundleValidateError400() {
        Web_AdminBundleCounseling.validateUpdateBundleValidateError400();
    }

    // [Negative] PUT - Update Bundle Invalid Endpoint
    @Given("I set the PUT endpoint for updating a bundle with an invalid endpoint")
    public void setUpdateBundleInvalidEndpoint() {
        Web_AdminBundleCounseling.setUpdateBundleInvalidEndpoint();
    }

    @When("I send an HTTP PUT request for Update Bundle Invalid Endpoint")
    public void sendUpdateBundleInvalidEndpointRequest() {
        String name = "Paket Update Testing";
        int sessions = 1;
        String type = "INSTAN";
        int price = 80000;
        String description = "Update paket kenangan indah";
        int activePeriod = 1;
        String avatarimgPath = "/EmpathiCare/thumbnail.jpg";
        Web_AdminBundleCounseling.sendUpdateBundleInvalidEndpointRequest(name, sessions, type, price, description, activePeriod, avatarimgPath);
    }

    @Then("I receive a valid data response for Update Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateUpdateBundleInvalidEndpoint404() {
        Web_AdminBundleCounseling.validateUpdateBundleInvalidEndpoint404();
    }

    // [Positive] DELETE - Delete Bundle
    @Given("I set the DELETE endpoint for deleting a bundle")
    public void setDeleteBundleEndpoint() {
        Web_AdminBundleCounseling.setDeleteBundleEndpoint();
    }

    @When("I send an HTTP DELETE request with a valid ID")
    public void sendDeleteBundleRequest() {
        Web_AdminBundleCounseling.sendDeleteBundleRequest();
    }

    @Then("I receive a valid data response with HTTP status code 200 OK for delete bundle")

    public void validateDeleteBundle200() {
        Web_AdminBundleCounseling.validateDeleteBundle200();
    }

    // [Negative] DELETE - Delete Bundle Invalid ID
    @Given("I set the DELETE endpoint for deleting a bundle with an invalid ID")
    public void setDeleteBundleInvalidIdEndpoint() {
        Web_AdminBundleCounseling.setDeleteBundleInvalidIdEndpoint();
    }

    @When("I send an HTTP DELETE request with an invalid ID")
    public void sendDeleteBundleInvalidIdRequest() {
        Web_AdminBundleCounseling.sendDeleteBundleInvalidIdRequest();
    }

    @Then("I receive a valid data response for Delete Bundle Invalid ID with HTTP status code 400 Bad Request")
    public void validateDeleteBundleInvalidId400() {
        Web_AdminBundleCounseling.validateDeleteBundleInvalidId400();
    }

    // [Negative] DELETE - Delete Bundle Invalid Endpoint
    @Given("I set the DELETE endpoint for deleting a bundle with an invalid endpoint")
    public void setDeleteBundleInvalidEndpoint() {
        Web_AdminBundleCounseling.setDeleteBundleInvalidEndpoint();
    }

    @When("I send an HTTP DELETE request with an invalid endpoint")
    public void sendDeleteBundleInvalidEndpointRequest() {
        Web_AdminBundleCounseling.sendDeleteBundleInvalidEndpointRequest();
    }

    @Then("I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 404 Not Found")
    public void validateDeleteBundleInvalidEndpoint400() {
        Web_AdminBundleCounseling.validateDeleteBundleInvalidEndpoint404();
    }
}
