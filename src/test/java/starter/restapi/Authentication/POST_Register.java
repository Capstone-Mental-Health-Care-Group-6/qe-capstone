package starter.restapi.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_Register {

    public String valid_domain_register = "https://kmb5alta.online/register";
    public String valid_endpoint_register = "localhost:8000/register";

    // Authentication_register_negative1
    @Step("I have an valid registration endpoint")
    public String validRegistrationEndpoint() {
        return valid_endpoint_register;
    }

    @Step("I send a POST request to the registration endpoint with an empty request body")
    public void RegistrationEndpointWithAnEmptyRequestBody() {
        JSONObject reqBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())  // Mengonversi objek JSON menjadi string
                .post(validRegistrationEndpoint());
    }

    @Step("I should receive a response with HTTP status code 400 bad request")
    public void ResponseWithHTTPStatusCode400BadRequest() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // Authentication_register_negative2
    @Step("I provide name, email, role, and password that are already registered")
    public void NameEmailRoleAndPasswordThatAreAlreadyRegistered() {
        String email = "admin@gmail.com";

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "admin"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", email);
        reqBody.put("role", "admin"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(validRegistrationEndpoint());
    }
    @Step("I should receive a response with HTTP status code 500 internal server error")
    public void ResponseWithHTTPStatusCode500InternalServerError() {
        restAssuredThat(response -> response.statusCode(500));
    }

    // Authentication_register_negative3
    @Step("I have a valid registration endpoint")
    public String ValidRegistrationEndpoint() {
        return valid_domain_register;
    }

    // Authentication_register_positive1
    @Step("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnAdmin() {
        String email = "admin@gmail.com";

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "admin"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", email);
        reqBody.put("role", "admin"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "admin");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ValidRegistrationEndpoint());
    }

    @Step("I send a POST request to the valid registration endpoint")
    public void RequestToTheValidRegistrationEndpoint() {
        // Mengirimkan permintaan POST ke endpoint registrasi yang valid
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(ValidRegistrationEndpoint());
    }

    @Step("I should receive a response with HTTP status code 201 created")
    public void ResponseWithHTTPStatusCode201Created() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // Authentication_register_positive2
    @Step("I provide name, email, role, and password for a patient")
    public void NameEmailRoleAndPasswordForAPatient() {
        String email = "patient@gmail.com";

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "patient"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", email);
        reqBody.put("role", "patient"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "patient");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(validRegistrationEndpoint());
    }

    // Authentication_register_positive3
    @Step("I provide name, email, role, and password for a doctor")
    public void NameEmailRoleAndPasswordForADoctor() {
        String email = "doctorkedua@gmail.com";

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "Doctor"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", email);
        reqBody.put("role", "Doctor"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "Doctor");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(validRegistrationEndpoint());
    }
}
