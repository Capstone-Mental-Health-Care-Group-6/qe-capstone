package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient_Auth_Login {
    public String endpoint_login_mobile = "https://kmb5alta.online/";
    public static String token = "";

    // [Positive] POST - LoginAdmin Success
    @Step("I set the authentication mobile endpoint")
    public String AuthenticationMobileEndpoint() {
        return endpoint_login_mobile + "patient/login";
    }

    @Step("I send a POST request to the authentication mobile endpoint")
    public void RequestToTheAuthenticationMobileEndpoint(String emailPatient, String pwPatient) {
        SerenityRest.given()
                .multiPart("email", emailPatient) // Add form parameters
                .multiPart("password", pwPatient)
                .post(AuthenticationMobileEndpoint());


        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I should receive a response with HTTP status code 200 OK and successfully log in")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - LoginAdmin Error Password Invalid
    @Step("I send a POST request to the loginAdmin endpoint with an invalid Password")
    public void RequestToTheLoginEndpointWithAnInvalidPassword(String emailPatient) {
        SerenityRest.given()
                .multiPart("email", emailPatient) // Add form parameters
//                .multiPart("password", pwPatient)
                .post(AuthenticationMobileEndpoint());


        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request and invalid Password")
    public void ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword() {
        restAssuredThat(response -> response.statusCode(400));
    }



}
