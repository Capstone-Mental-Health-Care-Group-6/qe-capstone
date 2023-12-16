package starter.restapi.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_Register {

    public String valid_domain_register = "https://kmb5alta.online/register";
    public String valid_endpoint_register = "https://kmb5alta.online/register";

    // [Negative] POST - Register Error Validation
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

    // [Negative] POST - Register Error
    @Step("I provide name, email, role, and password that are already registered")
    public void NameEmailRoleAndPasswordThatAreAlreadyRegistered() {
        String email = "Admin6@gmail.com";

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

    // [Negative] POST - Error Email Already Registered
    @Step("I have a valid registration endpoint")
    public String ValidRegistrationEndpoint() {
        return valid_domain_register;
    }

    // [Positive] POST - Successful Registration for Admin
    public String generateUniqueEmail(String role) {
        // Membuat alamat email unik berdasarkan timestamp saat ini
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String timeStamp = dateFormat.format(new Date());
        return role.toLowerCase() + "_" + timeStamp + "@gmail.com";
    }
    @Step("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnAdmin() {
        String uniqueAdminEmail = generateUniqueEmail("admin");

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "admin");
        reqBody.put("email", uniqueAdminEmail);
        reqBody.put("role", "admin");
        reqBody.put("password", "admin");


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ValidRegistrationEndpoint());
    }

    @Step("I should receive a response with HTTP status code 201 created")
    public void ResponseWithHTTPStatusCode201Created() {
        restAssuredThat(response -> response.statusCode(201));
    }


    // [Positive] POST - Successful Registration for Patient
    @Step("I provide name, email, role, and password for a patient")
    public void NameEmailRoleAndPasswordForAPatient() {
        String uniquePatientEmail = generateUniqueEmail("patient");

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "patient"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", uniquePatientEmail);
        reqBody.put("role", "patient"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "patient");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(validRegistrationEndpoint());
    }

    // [Positive] POST - Successful Registration for Doctor
    @Step("I provide name, email, role, and password for a doctor")
    public void NameEmailRoleAndPasswordForADoctor() {
        String uniqueDoctorEmail = generateUniqueEmail("doctor");

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "Doctor"); // Mengubah "fullname" menjadi "name"
        reqBody.put("email", uniqueDoctorEmail);
        reqBody.put("role", "Doctor"); // Menambahkan peran sebagai "admin"
        reqBody.put("password", "Doctor");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(validRegistrationEndpoint());
    }
}
