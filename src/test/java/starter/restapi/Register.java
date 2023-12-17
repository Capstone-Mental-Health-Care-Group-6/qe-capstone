package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {

    public String valid_domain_register = "https://kmb5alta.online/register";
    public String valid_endpoint_register = "https://kmb5alta.online/register";
    @Step("I have a valid registration endpoint")
    public String ValidRegistrationEndpoint() {
        return valid_domain_register;
    }

    // [Positive] POST - Successful Registration

    @Step("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnAdmin() {

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "admin");
        reqBody.put("email", "AdminAja6@gmail.com");
        reqBody.put("role", "Admin");
        reqBody.put("password", "admin");


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(reqBody.toString())
                .post(ValidRegistrationEndpoint());
    }
    @Step("I provide name, email, role, and password for an admin")
    public void NameEmailRoleAndPasswordForAnDoctor() {
        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "Dokter");
        reqBody.put("email", "DoctorAja6@gmail.com");
        reqBody.put("role", "Dokter");
        reqBody.put("password", "password");

        SerenityRest
                .given()
                .contentType("application/json")
                .post(ValidRegistrationEndpoint());
    }

    // [Positive] POST - Successful Registration for Patient
    @Step("I provide name, email, role, and password for a patient")
    public void NameEmailRoleAndPasswordForAnPatient() {
        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "Patient");
        reqBody.put("email", "Patient6@gmail.com");
        reqBody.put("role", "Patient");
        reqBody.put("password", "password");

        SerenityRest
                .given()
                .contentType("application/json")
                .post(ValidRegistrationEndpoint());
    }
    @Step("I should receive a response with HTTP status code 201 created")
    public void ResponseWithHTTPStatusCode201Created() {
        restAssuredThat(response -> response.statusCode(201));
    }

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
//        String email = "Admin6@gmail.com";

        JSONObject reqBody = new JSONObject();
        reqBody.put("name", "admin");
        reqBody.put("email", "AdminAja@gmail.com");
        reqBody.put("role", "admin");
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

//    // [Positive] POST - Successful Registration for Admin
//    public String generateUniqueEmail(String role) {
//        // Membuat alamat email unik berdasarkan timestamp saat ini
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//        String timeStamp = dateFormat.format(new Date());
//        return role.toLowerCase() + "_" + timeStamp + "@gmail.com";
//    }

}
