package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginDoctor {

//    protected String email = "Admin1@gmail.com";
//    protected String password = "password";
    public String endpoint_auth = "https://kmb5alta.online/login";

    public static String token = "";


    @Step("I receive a valid data login HTTP response code 200 OK")
    public void validateAdminLoginResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // LoginAdmin by Doctor
    @Step("I set authentication endpoint for login doctor")
    public String setAuthenticationEndpointForDoctorLogin() {
        return endpoint_auth;
    }

    @Step("I send authentication endpoint for login doctor")
    public void sendAuthenticationEndpointForDoctorLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "Doctor5@gmail.com");
        requestBody.put("password", "password");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setAuthenticationEndpointForDoctorLogin());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data.token.access_token");
    }

    @Step("I receive a valid data response for login doctor with HTTP status code 200 OK")
    public void validateDoctorLoginResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }



}
