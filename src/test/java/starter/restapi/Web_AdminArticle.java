package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminArticle {
    protected static String url = "https://kmb5alta.online/";

    // [Positive] PUT - Approve Article
    @Step("I set the PUT endpoint for approving an article")
    public String setPutEndpointForApprovingArticle() {
        return url + "articles/1/approve";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for approving an article")
    public void sendPutRequestForApprovingArticle() {

        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .put(setPutEndpointForApprovingArticle());
    }

    @Step("I receive a valid data response for approving an article with HTTP status code 200 OK")
    public void validateApproveArticleResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] PUT - Approve Article Invalid Input Param
    @Step("I set the PUT endpoint for approving an article with invalid input parameters")
    public String setPutEndpointForApprovingArticleWithInvalidInput() {
        return url + "articles/satu/approve";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for approving an article with invalid input parameters")
    public void sendPutRequestForApprovingArticleWithInvalidInput() {
        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .put(setPutEndpointForApprovingArticleWithInvalidInput());
    }

    @Step("I receive a valid data response for approving an article with invalid input parameters with HTTP status code 400 Bad Request")
    public void validateApproveArticleInvalidInputResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] PUT - Deny Article
    @Step("I set the PUT endpoint for denying an article")
    public String setPutEndpointForDenyingArticle() {
        return url + "articles/1/deny";
    }

    @Step("I send an HTTP PUT request with valid parameters and baseURL for denying an article")
    public void sendPutRequestForDenyingArticle() {

        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .put(setPutEndpointForDenyingArticle());
    }

    @Step("I receive a valid data response for denying an article with HTTP status code 200 OK")
    public void validateDenyArticleResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] PUT - Deny Article Invalid Input Param
    @Step("I set the PUT endpoint for denying an article with invalid input parameters")
    public String setPutEndpointForDenyingArticleWithInvalidInput() {
        return url + "articles/satu/deny";
    }

    @Step("I send an HTTP PUT request with invalid baseURL for denying an article with invalid input parameters")
    public void sendPutRequestForDenyingArticleWithInvalidInput() {

        SerenityRest.given()
                .when()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .put(setPutEndpointForDenyingArticleWithInvalidInput());
    }

    @Step("I receive a valid data response for denying an article with invalid input parameters with HTTP status code 400 Bad Request")
    public void validateDenyArticleInvalidInputResponse() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] GET - Get All Article
    @Step("I set the GET endpoint for retrieving all articles")
    public String setGetEndpointForAllArticles() {
        return url + "articles";
    }

    @Step("I send an HTTP GET request with valid baseURL for retrieving all articles")
    public void sendGetRequestForAllArticles() {
        SerenityRest.given()
                .when()
                .get(setGetEndpointForAllArticles());
    }

    @Step("I receive a valid data response for retrieving all articles with HTTP status code 200 OK")
    public void validateAllArticlesResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - Get All Article Invalid Endpoint
    @Step("I set the GET endpoint for retrieving all articles with an invalid endpoint")
    public String setGetEndpointForAllArticlesWithInvalidEndpoint() {
        return url + "article";
    }

    @Step("I send an HTTP GET request with invalid baseURL for retrieving all articles with an invalid endpoint")
    public void sendGetRequestForAllArticlesWithInvalidEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetEndpointForAllArticlesWithInvalidEndpoint());
    }

    @Step("I receive a valid data response for retrieving all articles with an invalid endpoint with HTTP status code 404 Not Found")
    public void validateAllArticlesInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
