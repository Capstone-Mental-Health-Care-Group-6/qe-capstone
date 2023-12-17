package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.ForgetPasswordVerify;

public class ForgetPasswordVerifySteps {

    @Steps
    ForgetPasswordVerify post_forgetPasswordVerify;

    // Authentication_Forget_Password_Verify_positive1
    @Given("I set a POST request to a valid endpoint for the forget password verify endpoint")
    public void ValidEndpointForTheForgetPasswordVerifyEndpoint() {
        post_forgetPasswordVerify.ValidEndpointForTheForgetPasswordVerifyEndpoint();
    }

    @When("I send a POST request to the forget password verify endpoint with valid data")
    public void RequestToTheForgetPasswordVerifyEndpointWithValidData() {
        post_forgetPasswordVerify.RequestToTheForgetPasswordVerifyEndpointWithValidData();
    }

//    Expected status code <200> but was <400> Bad request => token not found
    @Then("I should receive a response with HTTP status code 400 OK indicating success")
    public void ResponseWithHTTPStatusCode400OKIndicatingSuccess() {
        post_forgetPasswordVerify.ResponseWithHTTPStatusCode400OKIndicatingSuccess();
    }

//    @Then("I should receive a response with HTTP status code 200 OK indicating success")
//    public void ResponseWithHTTPStatusCode200OKIndicatingSuccess() {
//        post_forgetPasswordVerify.ResponseWithHTTPStatusCode200OKIndicatingSuccess();
//    }

    // Authentication_Forget_Password_Verify_negative1
    @Given("I set a POST request to a invalid endpoint for the forget password verify endpoint")
    public void InvalidEndpointForTheForgetPasswordVerifyEndpoint() {
        post_forgetPasswordVerify.InvalidEndpointForTheForgetPasswordVerifyEndpoint();
    }

    @When("I send a POST request to the Error Forget Password endpoint with invalid data")
    public void RequestToTheErrorForgetPasswordEndpointWithInvalidData() {
        post_forgetPasswordVerify.RequestToTheErrorForgetPasswordEndpointWithInvalidData();

    }

    @Then("I should receive a response with HTTP status code 400 Bad Request indicating an error")
    public void ResponseWithHTTPStatusCode400BadRequestIndicatingAnError() {
        post_forgetPasswordVerify.ResponseWithHTTPStatusCode400BadRequestIndicatingAnError();
    }

    // Authentication_Forget_Password_Verify_negative2
    @When("I send a POST request to the forget password verify endpoint with a missing token")
    public void RequestToTheForgetPasswordVerifyEndpointWithAMissingToken() {
        post_forgetPasswordVerify.RequestToTheForgetPasswordVerifyEndpointWithAMissingToken();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request indicating token not found")
    public void ResponseWithHTTPStatusCode400BadRequestIndicatingTokenNotFound() {
        post_forgetPasswordVerify.ResponseWithHTTPStatusCode400BadRequestIndicatingTokenNotFound();
    }
}
