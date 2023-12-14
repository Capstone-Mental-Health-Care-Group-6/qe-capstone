package starter.restapi;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {


    protected String email = "doctor5@gmail.com";
    protected String password = "password";
    public String endpoint_auth = "https://kmb5alta.online/login";


    //  [Positive] POST - Success Login Admin
    //  [Positive] POST - Success Login Patient
    //  [Positive] POST - Success Login Doctor
    @Step("I set authentication endpoint for login")
    public String ISetAuthenticationEndpoint() {
        return endpoint_auth;
    }

    @Step("I send authentication endpoint for login")
    public void ISendAuthenticationEndpoint(String role) {
        String authEmail = email;
        String authPassword = password;

        // Set credentials based on role
        switch (role.toLowerCase()) {
            case "admin":
                authEmail = "admin@gmail.com";
                authPassword = "admin@12";
                break;
            case "doctor":
                authEmail = "Doctor5@gmail.com";
                authPassword = "password";
                break;
            case "user":
                authEmail = "user@gmail.com";
                authPassword = "user@12";
                break;
            default:
                // Handle unknown role or provide a default scenario
                break;
        }

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", authEmail);
        requestBody.put("password", authPassword);

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(ISetAuthenticationEndpoint());

    }

    @Step("I receive a valid data response for login with HTTP status code 200 OK")
    public void validateLogin200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - Incorrect Password
    @Step("I set authentication endpoint with Incorrect Password")
    public String IncorrectPassword() {
        return endpoint_auth;
    }

    @Step("I send a POST request to the login endpoint with incorrect password")
    public void LoginEndpointWithIncorrectPassword(String role) {
        String authEmail = email;
        String authPassword = password;

        // Set credentials based on role
        switch (role.toLowerCase()) {
            case "admin":
                authEmail = "admin@gmail.com";
                authPassword = "incorrectpassword";
                break;
            case "doctor":
                authEmail = "Doctor5@gmail.com";
                authPassword = "incorrectpassword";
                break;
            case "user":
                authEmail = "user@gmail.com";
                authPassword = "incorrectpassword";
                break;
            default:
                // Handle unknown role or provide a default scenario
                break;
        }

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", authEmail);
        requestBody.put("password", authPassword);

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(IncorrectPassword());
    }

    @Step("I receive a response with HTTP status code 400 Bad Request")
    public void ResponseWithHTTPStatusCodeBad400Request() {
        restAssuredThat(response -> response.statusCode(400));

    }



 /*   // Authentication_login_negative2
    @Step("I send a POST request to the login endpoint with data not found")
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
    }*/
}
