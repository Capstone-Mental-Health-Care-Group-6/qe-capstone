package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.restapi.Authentication.POST_ResetPassword;

public class POST_ResetPasswordSteps {

    POST_ResetPassword post_resetPassword;

    // [Positive] POST - Success Reset Password
    @Given("I sets a POST request to a valid endpoint for the reset password endpoint")
    public void ValidEndpointForTheResetPasswordEndpoint() {
        post_resetPassword.ValidEndpointForTheResetPasswordEndpoint();
    }

    @When("I send a POST request to the reset password endpoint with a valid token and matching passwords")
    public void RequestToTheResetPasswordEndpointWithAValidTokenAndMatchingPasswords() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithAValidTokenAndMatchingPasswords();
    }

    @Then("I should receive a response indicating successful password reset with HTTP status code 200 OK")
    public void ResponseIndicatingSuccessfulPasswordResetWithHTTPStatusCode200OK() {
        post_resetPassword.ResponseIndicatingSuccessfulPasswordResetWithHTTPStatusCode200OK();
    }

    // [Negative] POST - Reset Password Token Not Found
    @Given("I sets a POST request to a invalid endpoint for the reset password endpoint")
    public void RequestToAInvalidEndpointForTheResetPasswordEndpoint() {
        post_resetPassword.RequestToAInvalidEndpointForTheResetPasswordEndpoint();
    }

    @When("I send a POST request to the reset password endpoint with an invalid token")
    public void RequestToTheResetPasswordEndpointWithAnInvalidToken() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithAnInvalidToken();
    }

    @Then("I should receive an error response due to token not found with HTTP status code 400 Bad Request")
    public void ErrorResponseDueToTokenNotFoundWithHTTPStatusCode400BadRequest() {
        post_resetPassword.ErrorResponseDueToTokenNotFoundWithHTTPStatusCode400BadRequest();
    }

    // [Negative] POST - Reset Password Failed Verify Token
    @When("I send a POST request to the reset password endpoint with a token that fails verification")
    public void RequestToTheResetPasswordEndpointWithATokenThatFailsVerification() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithATokenThatFailsVerification();
    }

    @Then("I should receive an error response due to failed token verification with HTTP status code 400 Bad Request")
    public void ErrorResponseDueToFailedTokenVerificationWithHTTPStatusCode400BadRequest() {
        post_resetPassword.ErrorResponseDueToFailedTokenVerificationWithHTTPStatusCode400BadRequest();
    }

    // [Negative] POST - Reset Password Token Expired
    @When("I send a POST request to the reset password endpoint with an expired token")
    public void RequestToTheResetPasswordEndpointWithAnExpiredToken() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithAnExpiredToken();
    }

    @Then("I should receive an error response due to expired token with HTTP status code 400 Bad Request")
    public void ErrorResponseDueToExpiredTokenWithHTTPStatusCode400BadRequest() {
        post_resetPassword.ErrorResponseDueToExpiredTokenWithHTTPStatusCode400BadRequest();
    }

    // [Negative] POST - Reset Password Validation Error
    @When("I send a POST request to the reset password endpoint with invalid validation inputs")
    public void RequestToTheResetPasswordEndpointWithInvalidValidationInputs() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithInvalidValidationInputs();
    }

    @Then("I should receive an error response due to validation error with HTTP status code 400 Bad Request")
    public void ErrorResponseDueToValidationErrorWithHTTPStatusCode400BadRequest() {
        post_resetPassword.ErrorResponseDueToValidationErrorWithHTTPStatusCode400BadRequest();
    }

    // [Negative] POST - Reset Password not Match
    @When("I send a POST request to the reset password endpoint with passwords that do not match")
    public void RequestToTheResetPasswordEndpointWithPasswordsThatDoNotMatch() {
        post_resetPassword.RequestToTheResetPasswordEndpointWithPasswordsThatDoNotMatch();
    }

    @Then("I should receive an error response due to mismatched passwords with HTTP status code 400 Bad Request")
    public void ErrorResponseDueToMismatchedPasswordsWithHTTPStatusCode400BadRequest() {
        post_resetPassword.ErrorResponseDueToMismatchedPasswordsWithHTTPStatusCode400BadRequest();
    }


}
