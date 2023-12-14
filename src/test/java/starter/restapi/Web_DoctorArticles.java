package starter.restapi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_DoctorArticles {

    protected static String url = "localhost:8000/";
    public static String token = "";

    //  [Positive] POST - Success Create Article Doctor
    @Step("I set a POST request to a valid endpoint for creating a new articles doctor")
    public String iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesDoctor() {
        return url + "articles";
    }


    @Step("I send the POST request to create a new articles doctor")
    public void iSendThePOSTRequestToCreateANewArticlesDoctor(String categoryId, String title,
                                                              String content, String thumbnail) {

       File thumbnailFile = new File(thumbnail);
       SerenityRest
               .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("category_id", categoryId)
                .multiPart("title", title)
                .multiPart("content", content)
                .multiPart("thumbnail", thumbnail)
                .post(iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesDoctor());

    }

    @Step("I receive an HTTP response with code 201 for creating a new articles doctor")
    public void ResponseWithCode201ForCreatingANewArticlesDoctor() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // [Negative] POST - Error Invalid User Input Thumbnail
    @Step("I set a POST request with invalid input for creating a new articles doctor")
    public String iSetAPOSTRequestWithInvalidInputForCreatingANewArticlesDoctor() {
        return url + "articles";
    }

    @Step("I send the POST request with invalid input thumbnail for creating a new articles doctor")
    public void iSendThePOSTRequestWithInvalidInputThumbnailForCreatingANewArticlesDoctor(String categoryId,
                                                                                          String title, String content,
                                                                                          String thumbnail) {

        File thumbnailFile = new File(thumbnail);
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("category_id", categoryId)
                .multiPart("title", title)
                .multiPart("content", content)
                .multiPart("thumbnail", thumbnailFile) // Gunakan file bukan string kosong untuk thumbnail
                .post(iSetAPOSTRequestWithInvalidInputForCreatingANewArticlesDoctor());
    }


    @Step("I receive an HTTP response with code 400 for creating a invalid input thumbnail")
    public void ResponseWithCode400ForCreatingAInvalidInputThumbnail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] POST - Invalid User Input
    @Step("I set a POST request with invalid user input for creating a new articles doctor")
    public String iSetAPOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor() {
        return url + "articles";
    }

    @Step("I send the POST request with invalid user input for creating a new articles doctor")
    public void iSendThePOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor(String categoryId, String title,
                                                                                     String content, String thumbnail) {

        File thumbnailFile = new File(thumbnail);
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("category_id", categoryId)
                .multiPart("title", title)
                .multiPart("content", content)
                .multiPart("thumbnail", thumbnail)
                .post(iSetAPOSTRequestWithInvalidUserInputForCreatingANewArticlesDoctor());
    }

    @Step("I receive an HTTP response with code 400 for creating a invalid user input")
    public void ResponseWithCode400ForCreatingAInvalidUserInput() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] PUT - Success Update Article Doctor
    @Step("I set a valid PUT endpoint Update articles doctor")
    public String iSetAValidPUTEndpointUpdateArticlesDoctor() {
        return url + "articles/1";
    }

    @Step("I sends a PUT HTTP request Update articles doctor")
    public void RequestUpdateArticlesDoctor(String title, String content,
                                            String thumbnail) {

        File thumbnailFile = new File(thumbnail);
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("title", title)
                .multiPart("content", content)
                .multiPart("thumbnail", thumbnail)
                .put(iSetAValidPUTEndpointUpdateArticlesDoctor());
    }

    @Step("I receives an HTTP response code 200 with valid endpoint for update articles doctor")
    public void ResponseCode200WithValidEndpointForUpdateArticlesDoctor() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] PUT - Invalid Param ID
    @Step("I set an valid PUT endpoint Update articles doctor with an invalid param ID")
    public String iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidParamID() {
        return url + "articles/satu";
    }

    @Step("I sends a PUT HTTP request Update articles doctor with an invalid param ID")
    public void iSendsAPUTHTTPRequestUpdateArticlesDoctorWithAnInvalidParamID() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .put(iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidParamID() );
    }

    @Step   ("I receives an HTTP response code 400 with invalid param ID for articles doctor")
    public void ResponseCode400WithInvalidParamIDForArticlesDoctor() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] PUT - Invalid User Input Thumbnail
    @Step("I set an valid PUT endpoint Update articles doctor with an invalid user input thumbnail")
    public String iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidUserInputThumbnail() {
        return url + "articles/1";
    }

    @Step("I sends a PUT HTTP request Update Articles Category with an invalid user input thumbnail")
    public void iSendsAPUTHTTPRequestUpdateArticlesCategoryWithAnInvalidUserInputThumbnail(String title, String content, String thumbnail) {

        File thumbnailFile = new File(thumbnail);
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .multiPart("title", title)
                .multiPart("content", content)
                .multiPart("thumbnail", thumbnail)
                .put(iSetAnValidPUTEndpointUpdateArticlesDoctorWithAnInvalidUserInputThumbnail());
    }

    @Step("I receives an HTTP response code 400 with invalid user input thumbnail")
    public void ResponseCode400WithInvalidUserInputThumbnail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] GET - Get Data Articles By Doctor
    @Step("I set authentication endpoint to retrieve articles doctor")
    public String iSetAuthenticationEndpointToRetrieveArticlesDoctor() {
        return url + "doctor/articles";
    }

    @Step("I send an HTTP GET request to fetch articles doctor using a valid endpoint")
    public void iSendAnHTTPGETRequestToFetchArticlesDoctorUsingAValidEndpoint() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .get(iSetAuthenticationEndpointToRetrieveArticlesDoctor());
    }

    @Step("I should receive a valid HTTP response with status code 200 for articles doctor")
    public void ResponseWithStatusCode200ForArticlesDoctor() {
        restAssuredThat(response -> response.statusCode(200));
    }


}
