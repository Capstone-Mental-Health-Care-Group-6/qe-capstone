package starter.restapi.WebArticlesCategory;

import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_GetAll {
    public String endpoint_articles_category = "localhost:8000/article/categories";
    public String endpoint_articles_category1 = "34.132.155.76:8000/article/categories";
    public static String token = "";


    // [Positive] GET - Success Get All
    @Step("I set authentication endpoint to retrieve article categories")
    public String iSetAuthenticationEndpointToRetrieveArticleCategories() {
        return endpoint_articles_category;
    }

    @Step("I send an HTTP GET request to fetch articles categories using a valid endpoint")
    public void RequestToFetchArticlesCategoriesUsingAValidEndpoint() {
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .post(iSetAuthenticationEndpointToRetrieveArticleCategories() );
    }

    @Step("I should receive a valid HTTP response with status code 200 for articles categories")
    public void ValidHTTPResponseWithStatusCode200ForArticlesCategories() {
        restAssuredThat(response -> response.statusCode(200));

    }



}
