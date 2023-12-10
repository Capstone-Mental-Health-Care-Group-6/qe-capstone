package starter.restapi.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_LoginGoogle {

    public String valid_url_loginGoogle = "localhost:8000/login/google";

    @Step("I sets a GET request to a valid endpoint for login google endpoint")
    public String RequestToAValidEndpointForLoginGoogleEndpoint() {
        return valid_url_loginGoogle;
    }

    @Step("I sends a GET request to the login google endpoint for redirection to callback")
    public void RequestToTheLoginGoogleEndpointForRedirectionToCallback() {
        SerenityRest.given()
                .get(RequestToAValidEndpointForLoginGoogleEndpoint());
    }

    @Step("I should receive a response with HTTP status code 200 OK")
    public void ResponseWithHTTPStatusCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
