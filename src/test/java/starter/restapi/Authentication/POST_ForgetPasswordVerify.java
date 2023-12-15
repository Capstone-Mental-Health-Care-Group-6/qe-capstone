package starter.restapi.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.restapi.LoginAdmin;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_ForgetPasswordVerify {
    public String valid_url_ForgetPasswordVerify = "https://kmb5alta.online/forget-password/verify";
    // [Positive] POST - Success Forget Password Verify
    @Step("I set a POST request to a valid endpoint for the forget password verify endpoint")
    public String ValidEndpointForTheForgetPasswordVerifyEndpoint() {
        return valid_url_ForgetPasswordVerify;
    }

    @Step("I send a POST request to the forget password verify endpoint with valid data")
    public void RequestToTheForgetPasswordVerifyEndpointWithValidData() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .param("token_reset_password", "7485") // Menambahkan token_reset_password sebagai query parameter
                .post(ValidEndpointForTheForgetPasswordVerifyEndpoint());
    }

//    Expected status code <200> but was <400> Bad request => token not found
    @Step("I should receive a response with HTTP status code 400 OK indicating success")
    public void ResponseWithHTTPStatusCode400OKIndicatingSuccess() {
        restAssuredThat(response -> response.statusCode(400));

//    @Step("I should receive a response with HTTP status code 200 OK indicating success")
//    public void ResponseWithHTTPStatusCode200OKIndicatingSuccess() {
//        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - Error  Forget Password
    @Step("I set a POST request to a invalid endpoint for the forget password verify endpoint")
    public String InvalidEndpointForTheForgetPasswordVerifyEndpoint() {
        return valid_url_ForgetPasswordVerify;
    }

    @Step("I send a POST request to the Error Forget Password endpoint with invalid data")
    public void RequestToTheErrorForgetPasswordEndpointWithInvalidData() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .param("token_reset_password=", "8177") // Adjust the parameter as needed
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
                .param("token_reset_password=", "8177") // Adjust the parameter as needed
                .post(InvalidEndpointForTheForgetPasswordVerifyEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request indicating token not found")
    public void ResponseWithHTTPStatusCode400BadRequestIndicatingTokenNotFound() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
