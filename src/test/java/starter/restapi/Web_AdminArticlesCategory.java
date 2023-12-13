package starter.restapi;

import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminArticlesCategory {
    public String url = "localhost:8000/article/";
    public String getUrl = "34.132.155.76:8000/";

    public static String token = "";

    // [Positive] GET - Success Get All
    @Step("I set authentication endpoint to retrieve article categories")
    public String iSetAuthenticationEndpointToRetrieveArticleCategories() {
        return getUrl + "article/categories";
    }

    @Step("I send an HTTP GET request to fetch articles categories using a valid endpoint")
    public void RequestToFetchArticlesCategoriesUsingAValidEndpoint() {
            SerenityRest.given()
                    .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                    .contentType("application/json")
                    .put(iSetAuthenticationEndpointToRetrieveArticleCategories());

            token = lastResponse()
                    .getBody()
                    .jsonPath()
                    .get("data");
        }

    @Step("I should receive a valid HTTP response with status code 200 for articles categories")
    public void ValidHTTPResponseWithStatusCode200ForArticlesCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] POST - Success Create
    @Step("I set a POST request to a valid endpoint for creating a new articles category")
    public String iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory() {
        return url + "categories";
    }

    @Step("I send the POST request to create a new articles category")
    public void iSendThePOSTRequestToCreateANewArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Kecemasan");

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put( iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive an HTTP response with code 201 for creating a new articles category")
    public void ResponseWithCode201ForCreatingANewArticlesCategory() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // [Negative] POST - Input Error
    @Step("I set a POST request with invalid input for creating a new articles category")
    public String InvalidInputForCreatingANewArticlesCategory() {
        return url + "categories";
    }

    @Step("I send the POST request with invalid input for creating a new articles category")
    public void iSendThePOSTRequestWithInvalidInputForCreatingANewArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "123");

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(InvalidInputForCreatingANewArticlesCategory());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receive an HTTP response with code 400 for creating a new articles category")
    public void ResponseWithCode400ForCreatingANewArticlesCategory() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //  [Negative] GET - Invalid User Input
    @Step("I set an valid GET endpoint for articles category by ID")
    public String iSetAnValidGETEndpointForArticlesCategoryByID() {
        return url + "categories/satu";
    }
    @Step("I sends a GET HTTP request with an invalid user input for articles category by ID")
    public void iSendsAGETHTTPRequestWithAnInvalidUserInputForArticlesCategoryByID() {
        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .put(iSetAnValidGETEndpointForArticlesCategoryByID());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receives a GET HTTP response with a status code of 400 for articles category by ID")
    public void ResponseWithAStatusCode400OfForArticlesCategoryByID() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] PUT - Success Update
    @Step("I set a valid PUT endpoint Update Articles Category")
    public String iSetAValidPUTEndpointUpdateArticlesCategory() {
        return url + "categories/2";
    }

    @Step("I sends a PUT HTTP request Update Articles Category")
    public void iSendsAPUTHTTPRequestUpdateArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Depresi");

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(iSetAValidPUTEndpointUpdateArticlesCategory());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }
    @Step("I receives an HTTP response code 200 with valid endpoint")
    public void ResponseCode200WithValidEndpoint() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //  [Negative] PUT - Invalid Param ID
    @Step("I set an valid PUT endpoint Update Articles Category with an invalid param ID")
    public String iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID() {
        return url + "categories/2";
    }

    @Step("I sends a PUT HTTP request Update Articles Category with an invalid param ID")
    public void RequestUpdateArticlesCategoryWithAnInvalidParamID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "123");

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receives an HTTP response code 400 with invalid param ID")
    public void ResponseCode400WithInvalidParamID() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Negative] PUT - Invalid User Input
    @Step("I set an valid PUT endpoint Update Articles Category with an invalid user input")
    public String ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput() {
        return url + "categories/satu";

    }

    @Step("I sends a PUT HTTP request Update Articles Category with an invalid user input")
    public void RequestUpdateArticlesCategoryWithAnInvalidUserInput() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Depresi");

        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNzY4MTIsImlhdCI6MTcwMTI3MzIxMiwiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.rpsfDYEVwAjblb_rvWvYaFDxrY2mCbbyAsf-6sAOyOs")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput());

        token = lastResponse()
                .getBody()
                .jsonPath()
                .get("data");
    }

    @Step("I receives an HTTP response code 400 with invalid user input")
    public void ResponseCode400WithInvalidUserInput() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] DEL - Delete Success
    @Step("I set the DELETE endpoint to a valid endpoint")
    public String iSetTheDELETEEndpointToAValidEndpoint() {
        return url + "categories/2";
    }

    @Step("I send a DELETE HTTP request with a valid endpoint")
    public void iSendADELETEHTTPRequestWithAValidEndpoint() {
        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDE5MTg3MDcsImlhdCI6MTcwMTkxNTEwNywiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.91I7PQzXZgkvpcu05u5Fy37BUSfKd9Tk5DDXdKE_x-I")
                .contentType("application/json")
                .delete(iSetTheDELETEEndpointToAValidEndpoint()); // Menggunakan method .delete() untuk DELETE request
    }

    @Step("I receive a DELETE HTTP response with a status code of 200 for the valid endpoint")
    public void ResponseWithAStatusCodeOf200ForTheValidEndpoint() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] DEL - Delete Invalid Param ID
    @Step("I set the DELETE endpoint to an Invalid Param ID")
    public String iSetTheDELETEEndpointToAnInvalidParamID() {
        return url + "categories/satu";
    }

    @Step("I send a DELETE HTTP request with an invalid param ID")
    public void iSendADELETEHTTPRequestWithAnInvalidParamID() {
        SerenityRest.given()
                .header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDE5MTg3MDcsImlhdCI6MTcwMTkxNTEwNywiaWQiOjEsInJvbGUiOiJBZG1pbiIsInN0YXR1cyI6IkFjdGl2ZSJ9.91I7PQzXZgkvpcu05u5Fy37BUSfKd9Tk5DDXdKE_x-I")
                .contentType("application/json")
                .delete(iSetTheDELETEEndpointToAnInvalidParamID());
        // Menggunakan method .delete() untuk DELETE request
    }

    @Step("I receive a DELETE HTTP response with a status code of 404 for the invalid param ID")
    public void ResponseWithAStatusCodeOf404ForTheInvalidParamID() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
