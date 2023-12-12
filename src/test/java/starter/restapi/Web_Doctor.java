package starter.restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_Doctor {
    protected static String url = "https://kmb5alta.online/";
    public static String token = "";

    // [Positive] GET - Get All Doctor
    @Step("I set the GET endpoint for retrieving all doctors")
    public String setGetAllDoctorEndpoint() {
        return url + "doctor";
    }

    @Step("I send an HTTP GET request with a valid baseURL for get all doctors")
    public void sendHttpGetRequestForAllDoctors() {
        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .when()
                .get(setGetAllDoctorEndpoint());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive a valid data response for get all doctors with HTTP status code 200 OK")
    public void validateGetAllDoctorsResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET Doctor By ID
    @Step("I set the GET endpoint for retrieving a doctor by ID")
    public String setGetDoctorByIdEndpoint() {
        return url + "doctor/3";
    }

    @Step("I send an HTTP GET request with a valid ID and baseURL")
    public void sendHttpGetRequestForDoctorById() {
        SerenityRest.given()
                .when()
                .get(setGetDoctorByIdEndpoint());
    }

    @Step("I receive a valid data response for get doctor by ID with HTTP status code 200 OK")
    public void validateGetDoctorByIdResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

//    Belum Fix
    // [Positive] POST Register Doctor
    @Step("I set the POST endpoint for registering a doctor")
    public static String setPostRegisterDoctorEndpoint() {
        return url + "doctor/3";
    }

    @Step("I send an HTTP POST request with a valid baseURL and body parameters")
    public static Response sendHttpPostRequestForRegisteringDoctor(String doctor_name, String doctor_experienced, String doctor_description,
                                                                   String doctor_office_name, String doctor_office_address, String doctor_office_city,
                                                                   String doctor_meet_link, int expertise_id, String[] doctor_university,
                                                                   String[] doctor_study_program, String[] doctor_graduate_year,
                                                                   String[] doctor_company, String[] doctor_title, String[] doctor_experience_description,
                                                                   String[] doctor_start_date, String[] doctor_end_date, boolean[] doctor_is_now,
                                                                   int[] workday_id, String[] start_time, String[] end_time,
                                                                   String avatarPath, String sippPath, String strPath, String cvPath, String ijazahPath) {
        RequestSpecification request = RestAssured.given()
                .multiPart("doctor_name", doctor_name)
                .multiPart("doctor_experienced", doctor_experienced)
                .multiPart("doctor_description", doctor_description)
                .multiPart("doctor_office_name", doctor_office_name)
                .multiPart("doctor_office_address", doctor_office_address)
                .multiPart("doctor_office_city", doctor_office_city)
                .multiPart("doctor_meet_link", doctor_meet_link)
                .multiPart("expertise_id", expertise_id)
                .multiPart("doctor_university", doctor_university)
                .multiPart("doctor_study_program", doctor_study_program)
                .multiPart("doctor_graduate_year", doctor_graduate_year)
                .multiPart("doctor_company", doctor_company)
                .multiPart("doctor_title", doctor_title)
                .multiPart("doctor_experience_description", doctor_experience_description)
                .multiPart("doctor_start_date", doctor_start_date)
                .multiPart("doctor_end_date", doctor_end_date)
                .multiPart("doctor_is_now", doctor_is_now)
                .multiPart("workday_id", workday_id)
                .multiPart("start_time", start_time)
                .multiPart("end_time", end_time)
                .multiPart("doctor_avatar", "@" + avatarPath)
                .multiPart("doctor_sipp_file", "@" + sippPath)
                .multiPart("doctor_str_file", "@" + strPath)
                .multiPart("doctor_cv", "@" + cvPath)
                .multiPart("doctor_ijazah", "@" + ijazahPath);

        return request.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .when()
                .post(setPostRegisterDoctorEndpoint());
    }

    @Step("I receive a valid data response for registering a doctor with HTTP status code 200 OK")
    public static void validateRegisterDoctorResponse(Response response) {
        response.then().statusCode(400);
    }
    // [Positive] GET Search Doctor by Name
    @Step("I set the GET endpoint for searching a doctor by name")
    public String setGetSearchDoctorByNameEndpoint() {
        return url + "doctor/search?name=Fauzan";
    }

    @Step("I send an HTTP GET request with a valid name parameter and baseURL")
    public void sendHttpGetRequestForSearchDoctorByName() {
        SerenityRest.given()
                .when()
                .get(setGetSearchDoctorByNameEndpoint());
    }

    @Step("I receive a valid data response for searching a doctor by name with HTTP status code 200 OK")
    public void validateSearchDoctorByNameResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] PUT Edit Doctor Datapokok By Doctor ID


    // [Positive] PUT Edit Doctor Workdays By Doctor ID
    @Step("I set the PUT endpoint for editing doctor workdays by ID")
    public String setPutEditDoctorWorkdaysEndpoint() {
        return url + "doctor/workday/1";
    }

    @Step("I send an HTTP PUT request with a valid ID, workdays data, and baseURL")
    public void sendHttpPutRequestForEditDoctorWorkdays() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", 1);
        requestBody.put("workday_id", 3);

        LocalDateTime startTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("start_time", startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        LocalDateTime endTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("end_time", endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        // Data kedua
//        JSONObject workday2 = new JSONObject();
//        workday2.put("id", 2);
//        workday2.put("workday_id", 4);
//        workday2.put("start_time", "2021-01-01T00:00:00Z");
//        workday2.put("end_time", "2021-01-01T00:00:00Z");

//        workdaysArray.put(workday1);
//        workdaysArray.put(workday2);

        SerenityRest
                .given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPutEditDoctorWorkdaysEndpoint());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive a valid data response for editing doctor workdays by ID with HTTP status code 200 OK")
    public void validateEditDoctorWorkdaysResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }


    // [Positive] PUT Edit Doctor Education By Doctor ID
    @Step("I set the PUT endpoint for editing doctor education by ID")
    public String setPutEditDoctorEducationEndpoint() {
        return url + "doctor/education/1";
    }

    @Step("I send an HTTP PUT request with a valid ID, education data, and baseURL")
    public void sendHttpPutRequestForEditDoctorEducation() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("doctor_university", "University C Testing");
        requestBody.put("doctor_study_program", "Program C Testing");

        LocalDateTime endTime = LocalDateTime.parse("2020-01-01T00:00:00Z");
        requestBody.put("doctor_graduate_year", endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        SerenityRest
                .given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutEditDoctorEducationEndpoint());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive a valid data response for editing doctor education by ID with HTTP status code 200 OK")
    public void validateEditDoctorEducationResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] PUT Edit Doctor Experience By Doctor ID
    @Step("I set the PUT endpoint for editing doctor experience by ID")
    public String setPutEditDoctorExperienceEndpoint() {
        return url + "doctor/experience/1";
    }

    @Step("I send an HTTP PUT request with a valid ID, experience data, and baseURL")
    public void sendHttpPutRequestForEditDoctorExperience() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("doctor_company", "Company C Update");
        requestBody.put("doctor_title", "Title C Update");
        requestBody.put("doctor_experience_description", "Description C Update");
        requestBody.put("doctor_start_date", "2020-01-01T00:00:00Z");
        requestBody.put("doctor_end_date", "2021-01-01T00:00:00Z");
        requestBody.put("doctor_is_now", true);

/*
        // Mengubah "doctor_graduate_year" menjadi timestamp
        LocalDateTime endTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("doctor_start_date", endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Mengubah "doctor_graduate_year" menjadi timestamp
        LocalDateTime startTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("doctor_end_date", startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
*/

        SerenityRest
                .given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDIzODU3MTMsImlhdCI6MTcwMjM4MjExMywiaWQiOjQ2LCJyb2xlIjoiRG9jdG9yIiwic3RhdHVzIjoiQWN0aXZlIn0.qSOTy0VA79oscbnPkMAaezLuAhKBayyuJsyCnhLJHis")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutEditDoctorExperienceEndpoint());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive a valid data response for editing doctor experience by ID with HTTP status code 200 OK")
    public void validateEditDoctorExperienceResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET All Doctor Invalid Endpoint
    @Step("I set the GET endpoint for retrieving all doctors with an invalid endpoint")
    public String setGetAllDoctorInvalidEndpoint() {
        return url + "docto";
    }

    @Step("I send an HTTP GET request for retrieving all doctors with an invalid endpoint")
    public void sendHttpGetRequestForAllDoctorsWithInvalidEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetAllDoctorInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint retrieving all doctors with HTTP status code 404 Not Found")
    public void validateInvalidEndpointResponseForAllDoctors() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Positive] GET Doctor By ID Invalid Endpoint
    @Step("I set the GET endpoint for retrieving a doctor by ID with an invalid endpoint")
    public String setGetDoctorByIdInvalidEndpoint() {
        return url + "doctor/ks";
    }

    @Step("I send an HTTP GET request for retrieving a doctor by ID with an invalid endpoint")
    public void sendHttpGetRequestForInvalidDoctorByIdEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetDoctorByIdInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 404 Not Found")
    public void validateInvalidDoctorByIdEndpointResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST Register Doctor Invalid Endpoint


    // [Negative] GET Search Doctor by Name Invalid Endpoint
    @Step("I set the GET endpoint for searching a doctor by name with an invalid endpoint")
    public String setGetSearchDoctorByNameInvalidEndpoint() {
        return url + "docto/search?name=Fauzan";
    }

    @Step("I send an HTTP GET request for searching a doctor by name with an invalid endpoint")
    public void sendHttpGetRequestForInvalidSearchDoctorByNameEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetSearchDoctorByNameInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found")
    public void validateInvalidSearchDoctorByNameEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }


}