package starter.restapi.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_ForgetPasswordVerify {
    public String valid_url_ForgetPasswordVerify = "localhost:8000/forget-password/verify?token_reset_password=7485";
    public String invalid_url_ForgetPasswordVerify = "localhost:8000/forget-password/verify?token_reset_password=8177";

    // [Positive] POST - Success Forget Password Verify
    @Step("I set a POST request to a valid endpoint for the forget password verify endpoint")
    public String ValidEndpointForTheForgetPasswordVerifyEndpoint() {
        return valid_url_ForgetPasswordVerify;
    }

    @Step("I send a POST request to the forget password verify endpoint with valid data")
    public void RequestToTheForgetPasswordVerifyEndpointWithValidData() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body("")
                .post(ValidEndpointForTheForgetPasswordVerifyEndpoint());
    }

    @Step("I should receive a response with HTTP status code 200 OK indicating success")
    public void ResponseWithHTTPStatusCode200OKIndicatingSuccess() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - Error  Forget Password
    @Step("I set a POST request to a invalid endpoint for the forget password verify endpoint")
    public String InvalidEndpointForTheForgetPasswordVerifyEndpoint() {
        return invalid_url_ForgetPasswordVerify;
    }

    @Step("I send a POST request to the Error Forget Password endpoint with invalid data")
    public void RequestToTheErrorForgetPasswordEndpointWithInvalidData() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body("")
                .post(InvalidEndpointForTheForgetPasswordVerifyEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request indicating an error")
    public void ResponseWithHTTPStatusCode400BadRequestIndicatingAnError() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Forget Password Token Not Found
    @Step("I send a POST request to the forget password verify endpoint with a missing token")
    public void RequestToTheForgetPasswordVerifyEndpointWithAMissingToken() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body("")
                .post(InvalidEndpointForTheForgetPasswordVerifyEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request indicating token not found")
    public void ResponseWithHTTPStatusCode400BadRequestIndicatingTokenNotFound() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
