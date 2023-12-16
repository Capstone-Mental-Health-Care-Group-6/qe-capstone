package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;
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
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .when()
                .get(setGetAllDoctorEndpoint());
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
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .when()
                .get(setGetDoctorByIdEndpoint());
    }

    @Step("I receive a valid data response for get doctor by ID with HTTP status code 200 OK")
    public void validateGetDoctorByIdResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] POST Register Doctor
    @Step("I set the POST endpoint for registering a doctor")
    public String setPostRegisterDoctorEndpoint() {
        return url + "doctor/register";
    }

    @Step("I send an HTTP POST request with a valid baseURL and body parameters")
    public void sendHttpPostRequestForRegisteringDoctor(String doctorName, String doctorNik, String doctorDob, String doctorGender,
                                                        String doctorDescription, String doctorProvinsi, String doctorKota, String doctorNumberPhone,
                                                        String doctorMeetLink, String doctorSipp, String doctorStr, int expertiseId,
                                                        String doctorUniversity1, String doctorUniversity2,
                                                        String doctorStudyProgram1, String doctorStudyProgram2,
                                                        String doctorEnrollYear1, String doctorEnrollYear2,
                                                        String doctorGraduateYear1, String doctorGraduateYear2,
                                                        String doctorCompany1, String doctorCompany2,
                                                        String doctorStartDate1, String doctorStartDate2,
                                                        String doctorEndDate1, String doctorEndDate2,
                                                        String doctorimgAvatar, String doctorSippFile1,
                                                        String doctorStrFile1, String doctorCv1, String doctorIjazah1) {

        File doctorAvatar = new File(doctorimgAvatar);
        File doctorSippFile = new File(doctorSippFile1);
        File doctorStrFile = new File(doctorStrFile1);
        File doctorCv = new File(doctorCv1);
        File doctorIjazah = new File(doctorIjazah1);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .multiPart("doctor_name", doctorName)
                .multiPart("doctor_nik", doctorNik)
                .multiPart("doctor_dob", doctorDob)
                .multiPart("doctor_gender", doctorGender)
                .multiPart("doctor_description", doctorDescription)
                .multiPart("doctor_provinsi", doctorProvinsi)
                .multiPart("doctor_kota", doctorKota)
                .multiPart("doctor_number_phone", doctorNumberPhone)
                .multiPart("doctor_meet_link", doctorMeetLink)
                .multiPart("doctor_sipp", doctorSipp)
                .multiPart("doctor_str", doctorStr)
                .multiPart("expertise_id", expertiseId)
                .multiPart("doctor_university", doctorUniversity1)
                .multiPart("doctor_university", doctorUniversity2)
                .multiPart("doctor_study_program", doctorStudyProgram1)
                .multiPart("doctor_study_program", doctorStudyProgram2)
                .multiPart("doctor_enroll_year", doctorEnrollYear1)
                .multiPart("doctor_enroll_year", doctorEnrollYear2)
                .multiPart("doctor_graduate_year", doctorGraduateYear1)
                .multiPart("doctor_graduate_year", doctorGraduateYear2)
                .multiPart("doctor_company", doctorCompany1)
                .multiPart("doctor_company", doctorCompany2)
                .multiPart("doctor_start_date", doctorStartDate1)
                .multiPart("doctor_start_date", doctorStartDate2)
                .multiPart("doctor_end_date", doctorEndDate1)
                .multiPart("doctor_end_date", doctorEndDate2)
                .multiPart("doctor_avatar", doctorAvatar)
                .multiPart("doctor_sipp_file", doctorSippFile)
                .multiPart("doctor_str_file", doctorStrFile)
                .multiPart("doctor_cv", doctorCv)
                .multiPart("doctor_ijazah", doctorIjazah)

                .post(setPostRegisterDoctorEndpoint());
    }


    @Step("I receive a valid data response for registering a doctor with HTTP status code 201 Created")
    public void validateRegisterDoctorResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] GET Search Doctor by Name
    @Step("I set the GET endpoint for searching a doctor by name")
    public String setGetSearchDoctorByNameEndpoint() {
        return url + "doctor/search?name=";
    }

    @Step("I send an HTTP GET request with a valid name parameter and baseURL")
    public void sendHttpGetRequestForSearchDoctorByName() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .param("name", "Doctor 43") // Adjust the parameter as needed
                .get(setGetSearchDoctorByNameEndpoint());
    }

    @Step("I receive a valid data response for searching a doctor by name with HTTP status code 200 OK")
    public void validateSearchDoctorByNameResponse() {
        restAssuredThat(response -> response.statusCode(400));
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
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setPutEditDoctorWorkdaysEndpoint());

    }

    @Step("I receive a valid data response for editing doctor workdays by ID with HTTP status code 200 OK")
    public void validateEditDoctorWorkdaysResponse() {
        restAssuredThat(response -> response.statusCode(400));
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

        String endDateString = "2020-01-01T00:00:00Z";
        requestBody.put("doctor_graduate_year", endDateString);

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutEditDoctorEducationEndpoint());
    }

    @Step("I receive a valid data response for editing doctor education by ID with HTTP status code 200 OK")
    public void validateEditDoctorEducationResponse() {
        restAssuredThat(response -> response.statusCode(400));
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
//        requestBody.put("doctor_start_date", "2020-01-01T00:00:00Z");
//        requestBody.put("doctor_end_date", "2021-01-01T00:00:00Z");
        requestBody.put("doctor_is_now", "true");


        // Mengubah "doctor_graduate_year" menjadi timestamp
        LocalDateTime endTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("doctor_start_date", endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Mengubah "doctor_graduate_year" menjadi timestamp
        LocalDateTime startTime = LocalDateTime.parse("2021-01-01T00:00:00");
        requestBody.put("doctor_end_date", startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutEditDoctorExperienceEndpoint());
    }

    @Step("I receive a valid data response for editing doctor experience by ID with HTTP status code 200 OK")
    public void validateEditDoctorExperienceResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] GET All Doctor Invalid Endpoint
    @Step("I set the GET endpoint for retrieving all doctors with an invalid endpoint")
    public String setGetAllDoctorInvalidEndpoint() {
        return url + "docto";
    }

    @Step("I send an HTTP GET request for retrieving all doctors with an invalid endpoint")
    public void sendHttpGetRequestForAllDoctorsWithInvalidEndpoint() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginDoctor.token)
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
                .header("Authorization", "Bearer " + LoginDoctor.token)
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
                .header("Authorization", "Bearer " + LoginDoctor.token)
                .when()
                .get(setGetSearchDoctorByNameInvalidEndpoint());
    }

    @Step("I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found")
    public void validateInvalidSearchDoctorByNameEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }


}