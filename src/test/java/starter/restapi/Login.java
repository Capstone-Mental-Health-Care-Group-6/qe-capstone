package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {

    protected static String email = "admin@gmail.com";
    protected static String password = "admin123";

    public String endpoint_auth = "https://kmb5alta.online/login";
    public  String Endpoint_auth1 = "34.132.155.76:8000/login";
    public static String token = "";

    // Authentication_login_positive1
    @Step ("I set authentication endpoint")
    public String ISetAuthenticationEndpoint() {
        return Endpoint_auth1; }

    @Step("I send authentication endpoint")
    public void ISendAuthenticationEndpoint() {
        String email = "admin@gmail.com";
        String password = "admin123";

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("email", email);
        requestBody.put("password", password);

        JSONObject reqBody = new JSONObject(requestBody);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ISetAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    // Authentication_login_negative1
    @Step("I sends a POST request to the login endpoint with incorrect password")
    public void RequestToTheLoginEndpointWithIncorrectPassword() {
        String email = "admin@gmail.com";
        String password = "admin1234"; // incorrect password

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("email", email);
        requestBody.put("password", password);

        JSONObject reqBody = new JSONObject(requestBody);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ISetAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request")
    public void ResponseWithHTTPStatusCodeBad400Request() {
        restAssuredThat(response -> response.statusCode(400));
    }
    // Authentication_login_negative2
    @Step("I sends a POST request to the login endpoint with data not found")
    public void RequestToTheLoginEndpointWithDataNotFound() {
        String email = "admin@gmail.com";
        String password = "admin1234"; // incorrect password

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("email", email);
        requestBody.put("password", password);

        JSONObject reqBody = new JSONObject(requestBody);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ISetAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("data");
    }
}
