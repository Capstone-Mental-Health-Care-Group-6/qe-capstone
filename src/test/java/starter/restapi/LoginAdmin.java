package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginAdmin {

//    protected String email = "Admin1@gmail.com";
//    protected String password = "password";
    public String endpoint_auth = "https://kmb5alta.online/login";

    public static String token = "";

    // LoginAdmin by Admin
    @Step("I set authentication endpoint for login admin")
    public String setAuthenticationEndpointForAdminLogin() {
        return endpoint_auth;
    }

    @Step("I send authentication endpoint for login admin")
    public void sendAuthenticationEndpointForAdminLogin() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "AdminAja1@gmail.com");
        requestBody.put("password", "password");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setAuthenticationEndpointForAdminLogin());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }
    @Step("I receive a valid data response for login admin with HTTP status code 200 OK")
    public void validateAdminLoginResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }


    /*  @Step("I set authentication endpoint for login")
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
                authEmail = "Admin1@gmail.com";
                authPassword = "password";
                break;
            case "doctor":
                authEmail = "Doctor5@gmail.com";
                authPassword = "password";
                break;
            case "patient":
                authEmail = "Patient@gmail.com";
                authPassword = "password";
                break;
            default:
                // Handle unknown role or provide a default scenario
                break;
        }

        JSONObject requestBody = new JSONObject();
        requestBody.put("email", authEmail);
        requestBody.put("password", authPassword);

        SerenityRest.given()
//                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI0OTYzMzEsImlhdCI6MTcwMjQ5MjczMSwiaWQiOjY1LCJyb2xlIjoiQWRtaW4iLCJzdGF0dXMiOiJBY3RpdmUifQ.DxzCeJwKvcOB4jY2dwFk0FB-YGmIQ_s5_A-o3rj0dBQ")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(ISetAuthenticationEndpoint());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I receive a valid data response for login with HTTP status code 200 OK")
    public void validateLogin200() {
        restAssuredThat(response -> response.statusCode(200));
    }*/
}
