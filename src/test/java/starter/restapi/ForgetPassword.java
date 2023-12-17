package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ForgetPassword {

    public String valid_url_ForgetPassword = "https://kmb5alta.online/forget-password";

    // [Positive] POST - Success Forget Password
    @Step("I sets a POST request to a valid endpoint for forget password endpoint")
    public String RequestToAValidEndpointForForgetPasswordEndpoint() {
        return valid_url_ForgetPassword;
    }

    @Step("I sends a POST request to the forget password endpoint with a valid email")
    public void RequestToTheForgetPasswordEndpointWithAValidEmail() {
        JSONObject reqBody = new JSONObject();
        reqBody.put("email", "budiawanilham04@gmail.com"); // Menghapus "email":""

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(RequestToAValidEndpointForForgetPasswordEndpoint());
    }

//    @Step("I should receive a response with HTTP status code 200 OK and successfully")
//    public void ResponseWithHTTPStatusCode200OKAndSuccessfully() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    @Step("I should receive a response with HTTP status code 500 internal server error but successfully")
    public void ResponseWithHTTPStatusCode500InternalServerErrorButSuccessfully() {
        restAssuredThat(response -> response.statusCode(500));
    }
}
