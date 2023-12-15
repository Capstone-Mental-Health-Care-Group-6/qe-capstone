//package starter.restapi.Authentication;
//
//import io.cucumber.java.en.When;
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Step;
//import org.json.simple.JSONObject;
//
//import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
//
//public class POST_ResetPassword {
//
//    public String valid_url_ForgetPassword = "https://kmb5alta.online/reset-password";
//
//    // [Positive] POST - Success Reset Password
//    @Step("I sets a POST request to a valid endpoint for the reset password endpoint")
//    public String ValidEndpointForTheResetPasswordEndpoint() {
//        return valid_url_ForgetPassword;
//    }
//
//    @Step("I send a POST request to the reset password endpoint with a valid token and matching passwords")
//    public void RequestToTheResetPasswordEndpointWithAValidTokenAndMatchingPasswords() {
//        JSONObject reqBody = new JSONObject();
//        reqBody.put("password", "12345");
//        reqBody.put("password_confirm", "12345");
//
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "8177") // Menambahkan token_reset_password sebagai query parameter
//                .body(reqBody.toString())
//                .post(ValidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive a response indicating successful password reset with HTTP status code 200 OK")
//    public void ResponseIndicatingSuccessfulPasswordResetWithHTTPStatusCode200OK() {
//        restAssuredThat(response -> response.statusCode(200));
//    }
//
//    // [Negative] POST - Reset Password Token Not Found
//    @Step("I sets a POST request to a invalid endpoint for the reset password endpoint")
//    public String RequestToAInvalidEndpointForTheResetPasswordEndpoint() {
//        return valid_url_ForgetPassword;
//    }
//    @Step("I send a POST request to the reset password endpoint with an invalid token")
//    public void RequestToTheResetPasswordEndpointWithAnInvalidToken() {
//        JSONObject reqBody = new JSONObject();
//        reqBody.put("password", "12345");
//        reqBody.put("password_confirm", "12345");
//
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "") // Menambahkan token_reset_password sebagai query parameter
//                .body(reqBody.toString()) // Tambahkan body yang valid jika diperlukan
//                .post(RequestToAInvalidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive an error response due to token not found with HTTP status code 400 Bad Request")
//    public void ErrorResponseDueToTokenNotFoundWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    // [Negative] POST - Reset Password Failed Verify Token
//    @Step("I send a POST request to the reset password endpoint with a token that fails verification")
//    public void RequestToTheResetPasswordEndpointWithATokenThatFailsVerification() {
//
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "8177") // Menambahkan token_reset_password sebagai query parameter
//                .post(ValidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive an error response due to failed token verification with HTTP status code 400 Bad Request")
//    public void ErrorResponseDueToFailedTokenVerificationWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    // [Negative] POST - Reset Password Token Expired
//    @Step("I send a POST request to the reset password endpoint with an expired token")
//    public void RequestToTheResetPasswordEndpointWithAnExpiredToken() {
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "8177") // Menambahkan token_reset_password sebagai query parameter
//                .post(ValidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive an error response due to expired token with HTTP status code 400 Bad Request")
//    public void ErrorResponseDueToExpiredTokenWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    // [Negative] POST - Reset Password Validation Error
//    @Step("I send a POST request to the reset password endpoint with invalid validation inputs")
//    public void RequestToTheResetPasswordEndpointWithInvalidValidationInputs() {
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "8177") // Menambahkan token_reset_password sebagai query parameter
//                .post(ValidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive an error response due to validation error with HTTP status code 400 Bad Request")
//    public void ErrorResponseDueToValidationErrorWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    // [Negative] POST - Reset Password not Match
//    @Step("I send a POST request to the reset password endpoint with passwords that do not match")
//    public void RequestToTheResetPasswordEndpointWithPasswordsThatDoNotMatch() {
//        JSONObject reqBody = new JSONObject();
//        reqBody.put("password", "12345");
//        reqBody.put("password_confirm", "1234");
//
//        SerenityRest.given()
//                .header("Content-Type", "application/json")
//                .param("token_reset_password", "8177") // Menambahkan token_reset_password sebagai query parameter
//                .body(reqBody.toString())
//                .post(ValidEndpointForTheResetPasswordEndpoint());
//    }
//
//    @Step("I should receive an error response due to mismatched passwords with HTTP status code 400 Bad Request")
//    public void ErrorResponseDueToMismatchedPasswordsWithHTTPStatusCode400BadRequest() {
//        restAssuredThat(response -> response.statusCode(400));
//    }
//}
