package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient_Auth_UpdatePw {
    public String endpoint_login_mobile = "https://kmb5alta.online/";
    // [Positive] POST - LoginAdmin Success update Password

    @Step("I set the authentication mobile endpoint updated password")
    public String AuthenticationMobileEndpointUpdate() {
        return endpoint_login_mobile + "patient/account/update/password";
    }
    @Step("I send a POST request to the login endpoint with a successful password update")
    public void RequestToTheLoginEndpointWithASuccessfulPasswordUpdate(String pwPatient) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + Mobile_Patient_Auth_Login.token)
                .multiPart("password", pwPatient)
                .put(AuthenticationMobileEndpointUpdate());

    }

    @Step("I should receive a response with HTTP status code 400 OK and successful password update")
    public void ResponseWithHTTPStatusCode400OKAndSuccessfulPasswordUpdate() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
