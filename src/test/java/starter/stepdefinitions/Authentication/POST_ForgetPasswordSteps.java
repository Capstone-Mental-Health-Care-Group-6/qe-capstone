package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Authentication.GET_LoginGoogleCallback;
import starter.restapi.Authentication.POST_ForgetPassword;

public class POST_ForgetPasswordSteps {

    @Steps
    POST_ForgetPassword post_forgetPassword;

    @Given("I sets a POST request to a valid endpoint for forget password endpoint")
    public void RequestToAValidEndpointForForgetPasswordEndpoint() {
        post_forgetPassword.RequestToAValidEndpointForForgetPasswordEndpoint();

    }

    @When("I sends a POST request to the forget password endpoint with a valid email")
    public void RequestToTheForgetPasswordEndpointWithAValidEmail() {
        post_forgetPassword.RequestToTheForgetPasswordEndpointWithAValidEmail();

    }

    @Then("I should receive a response with HTTP status code 200 OK and successfully")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfully() {
        post_forgetPassword.ResponseWithHTTPStatusCode200OKAndSuccessfully();
    }
}
