package starter.stepdefinitions.MobileAuthentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.MobileAuthentication.POST_RegisterMobile;

public class POST_RegisterMobileSteps {

    @Steps
    POST_RegisterMobile post_registerMobile;

    // [Positive] POST - Register Success
    @Given("I have a valid registration mobile endpoint")
    public void ValidRegistrationMobileEndpoint() {
        post_registerMobile.ValidRegistrationMobileEndpoint();
    }

    @When("I provide valid user information for registration")
    public void ProvideValidUserInformationForRegistration() {
        post_registerMobile.ProvideValidUserInformationForRegistration();
    }

    @Then("I should receive a response with HTTP status code 200 OK and successfully registered")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered() {
        post_registerMobile.ResponseWithHTTPStatusCode200OKAndSuccessfullyRegistered();
    }

    // [Negative] POST - Register Error Upload Avatar
    @When("I provide valid user information with an invalid avatar for registration")
    public void ProvideValidUserInformationWithAnInvalidAvatarForRegistration() {
        post_registerMobile.ProvideValidUserInformationWithAnInvalidAvatarForRegistration();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request due to invalid avatar")
    public void ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar() {
        post_registerMobile.ResponseWithHTTPStatusCode400BadRequestDueToInvalidAvatar();
    }

    // [Negative] POST - Register Duplicate Email
    @When("I provide valid user information for a user account with a duplicate email")
    public void ProvideValidUserInformationForAUserAccountWithADuplicateEmail() {
        post_registerMobile.ProvideValidUserInformationForAUserAccountWithADuplicateEmail();
    }

    @Then("I should receive a response with HTTP status code 400 Bad Request due to duplicate email")
    public void ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail() {
        post_registerMobile.ResponseWithHTTPStatusCode400BadRequestDueToDuplicateEmail();
    }
}