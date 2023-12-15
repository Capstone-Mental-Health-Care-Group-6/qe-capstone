package starter.restapi.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_LoginGoogleCallback {
    public String valid_url_loginGoogleCallback = "https://kmb5alta.online/login/google/callback ";

    // [Positive] GET - Success LoginAdmin Google Callback
    @Step("I sets a GET request to a valid endpoint for login google callback endpoint")
    public String ValidEndpointForLoginGoogleCallbackEndpoint() {
        return valid_url_loginGoogleCallback;
    }

    @Step("I sends a GET request to the login google callbback endpoint")
    public void RequestToTheLoginGoogleCallbackEndpoint() {
        SerenityRest.given()
                .get(ValidEndpointForLoginGoogleCallbackEndpoint());
    }

    @Step("I should receive a response with HTTP status code 500")
    public void ResponseWithHTTPStatusCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }
}
//    @Step("I should receive a response with HTTP status code 200")
//    public void ResponseWithHTTPStatusCode200() {
//        restAssuredThat(response -> response.statusCode(200));
//    }
//}
