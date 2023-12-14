package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Mobile_Patient_Auth_Login {
    public String endpoint_login_mobile = "104.198.45.50:80/patient/login ";

    // [Positive] POST - LoginAdmin Success
    @Step("I set the authentication mobile endpoint")
    public String AuthenticationMobileEndpoint() {
        return endpoint_login_mobile;
    }

    @Step("I send a POST request to the authentication mobile endpoint")
    public void RequestToTheAuthenticationMobileEndpoint() {
        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded") // Set content type as form data
                .formParam("email", "nurulfauziah2@gmail.com") // Add form parameters
                .formParam("password", "fauzi123")
                .post(AuthenticationMobileEndpoint());
        // formParam digunakan ketika Anda ingin mengirim data sebagai formulir biasa dalam permintaan HTTP,
        // seperti mengirim data teks atau numerik, bukan file atau objek biner lainnya. Misalnya,
        // ketika perlu mengirimkan nama pengguna, kata sandi, alamat email, atau data serupa yang tidak melibatkan file.
    }

    @Step("I should receive a response with HTTP status code 200 OK and successfully log in")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfullyLogIn() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] POST - LoginAdmin Error Password Invalid
    @Step("I send a POST request to the login endpoint with an invalid Password")
    public void RequestToTheLoginEndpointWithAnInvalidPassword() {
        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded") // Set content type as form data
                .formParam("email", "nurulfauziah2@gmail.com") // Add form parameters
                .formParam("password", "fauzi123")
                .post(AuthenticationMobileEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 Bad Request and invalid Password")
    public void ResponseWithHTTPStatusCode400BadRequestAndInvalidPassword() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] POST - LoginAdmin Success update Password
    @Step("I send a POST request to the login endpoint with a successful password update")
    public void RequestToTheLoginEndpointWithASuccessfulPasswordUpdate() {
        SerenityRest.given()
                .contentType("application/x-www-form-urlencoded") // Set content type as form data
                .formParam("email", "nurulfauziah2@gmail.com") // Add form parameters
                .formParam("password", "fauziah123")
                .post(AuthenticationMobileEndpoint());
    }

    @Step("I should receive a response with HTTP status code 200 OK and successful password update")
    public void ResponseWithHTTPStatusCode200OKAndSuccessfulPasswordUpdate() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
