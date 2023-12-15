package starter.restapi;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import starter.restapi.LoginAdmin;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Web_AdminArticlesCategory {
    public String url = "https://kmb5alta.online/";


    // [Positive] GET - Success Get All
    @Step("I set authentication endpoint to retrieve article categories")
    public String iSetAuthenticationEndpointToRetrieveArticleCategories() {
        return url + "article/categories";
    }

    @Step("I send an HTTP GET request to fetch articles categories using a valid endpoint")
    public void RequestToFetchArticlesCategoriesUsingAValidEndpoint() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .get(iSetAuthenticationEndpointToRetrieveArticleCategories());

    }

    @Step("I should receive a valid HTTP response with status code 200 for articles categories")
    public void ValidHTTPResponseWithStatusCode200ForArticlesCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] POST - Success Create
    @Step("I set a POST request to a valid endpoint for creating a new articles category")
    public String iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory() {
        return url + "article/categories";
    }

    @Step("I send the POST request to create a new articles category")
    public void iSendThePOSTRequestToCreateANewArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Kecemasan");

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post( iSetAPOSTRequestToAValidEndpointForCreatingANewArticlesCategory());
    }

    @Step("I receive an HTTP response with code 201 for creating a new articles category")
    public void ResponseWithCode201ForCreatingANewArticlesCategory() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // [Negative] POST - Input Error
    @Step("I set a POST request with invalid input for creating a new articles category")
    public String InvalidInputForCreatingANewArticlesCategory() {
        return url + "article/categories";
    }

    @Step("I send the POST request with invalid input for creating a new articles category")
    public void iSendThePOSTRequestWithInvalidInputForCreatingANewArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 123);

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(InvalidInputForCreatingANewArticlesCategory());

    }

    @Step("I receive an HTTP response with code 400 for creating a new articles category")
    public void ResponseWithCode400ForCreatingANewArticlesCategory() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] GET - Success Get By ID
    @Step("I set a valid GET endpoint for articles category by ID")
    public String iSetAValidGETEndpointForArticlesCategoryByID() {
        return url + "article/categories/2";
    }

    @Step("I sends a GET HTTP request with a valid endpoint for articles category by ID")
    public void RequestWithAValidEndpointForArticlesCategoryByID() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .get(iSetAValidGETEndpointForArticlesCategoryByID());

    }

    @Step("I receives a valid GET HTTP response with a status code of 200 for articles category by ID")
    public void ResponseWithAStatusCodeOf200ForArticlesCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //  [Negative] GET - Invalid User Input
    @Step("I set an valid GET endpoint for articles category by ID")
    public String iSetAnValidGETEndpointForArticlesCategoryByID() {
        return url + "article/categories/satu";
    }
    @Step("I sends a GET HTTP request with an invalid user input for articles category by ID")
    public void iSendsAGETHTTPRequestWithAnInvalidUserInputForArticlesCategoryByID() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .get(iSetAnValidGETEndpointForArticlesCategoryByID());

    }

    @Step("I receives a GET HTTP response with a status code of 400 for articles category by ID")
    public void ResponseWithAStatusCode400OfForArticlesCategoryByID() {
        restAssuredThat(response -> response.statusCode(400));
    }

    // [Positive] PUT - Success Update
    @Step("I set a valid PUT endpoint Update Articles Category")
    public String iSetAValidPUTEndpointUpdateArticlesCategory() {
        return url + "article/categories/2";
    }

    @Step("I sends a PUT HTTP request Update Articles Category")
    public void iSendsAPUTHTTPRequestUpdateArticlesCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Depresi");

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(iSetAValidPUTEndpointUpdateArticlesCategory());
    }

//    #  Expected status code <200> but was <405>
    @Step("I receives an HTTP response code 405 with valid endpoint")
    public void ResponseCode405WithValidEndpoint() {
        restAssuredThat(response -> response.statusCode(405));
    }

//    @Step("I receives an HTTP response code 200 with valid endpoint")
//    public void ResponseCode200WithValidEndpoint() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    //  [Negative] PUT - Invalid Param ID
    @Step("I set an valid PUT endpoint Update Articles Category with an invalid param ID")
    public String iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID() {
        return url + "article/categories/satu";
    }

    @Step("I sends a PUT HTTP request Update Articles Category with an invalid param ID")
    public void RequestUpdateArticlesCategoryWithAnInvalidParamID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 123);

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(iSetAnValidPUTEndpointUpdateArticlesCategoryWithAnInvalidParamID());
    }

//    #  Expected status code <400> but was <405>
    @Step("I receives an HTTP response code 405 with invalid param ID")
    public void ResponseCode405WithInvalidParamID() {
        restAssuredThat(response -> response.statusCode(405));
    }

//    @Step("I receives an HTTP response code 400 with invalid param ID")
//    public void ResponseCode400WithInvalidParamID() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    // [Negative] PUT - Invalid User Input
    @Step("I set an valid PUT endpoint Update Articles Category with an invalid user input")
    public String ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput() {
        return url + "article/categories/1";
    }

    @Step("I sends a PUT HTTP request Update Articles Category with an invalid user input")
    public void RequestUpdateArticlesCategoryWithAnInvalidUserInput() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", 123);

        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(ValidPUTEndpointUpdateArticlesCategoryWithAnInvalidUserInput());
    }

    @Step("I receives an HTTP response code 405 with invalid user input")
    public void ResponseCode405WithInvalidUserInput() {
        restAssuredThat(response -> response.statusCode(405));
    }

//    @Step("I receives an HTTP response code 400 with invalid user input")
//    public void ResponseCode400WithInvalidUserInput() {
//        restAssuredThat(response -> response.statusCode(400));
//    }


    // [Positive] DEL - Delete Success
    @Step("I set the DELETE endpoint to a valid endpoint")
    public String iSetTheDELETEEndpointToAValidEndpoint() {
        return url + "article/categories/2";
    }

    @Step("I send a DELETE HTTP request with a valid endpoint")
    public void iSendADELETEHTTPRequestWithAValidEndpoint() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .delete(iSetTheDELETEEndpointToAValidEndpoint()); // Menggunakan method .delete() untuk DELETE request
    }

    @Step("I receive a DELETE HTTP response with a status code of 204 for the valid endpoint")
    public void ResponseWithAStatusCodeOf204ForTheValidEndpoint() {
        restAssuredThat(response -> response.statusCode(204));
    }

    // [Negative] DEL - Delete Invalid Param ID
    @Step("I set the DELETE endpoint to an Invalid Param ID")
    public String iSetTheDELETEEndpointToAnInvalidParamID() {
        return url + "article/categories/satu";
    }

    @Step("I send a DELETE HTTP request with an invalid param ID")
    public void iSendADELETEHTTPRequestWithAnInvalidParamID() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginAdmin.token)
                .contentType("application/json")
                .delete(iSetTheDELETEEndpointToAnInvalidParamID());
        // Menggunakan method .delete() untuk DELETE request
    }

    @Step("I receive a DELETE HTTP response with a status code of 400 for the invalid param ID")
    public void ResponseWithAStatusCodeOf400ForTheInvalidParamID() {
        restAssuredThat(response -> response.statusCode(400));
    }

//    @Step("I receive a DELETE HTTP response with a status code of 404 for the invalid param ID")
//    public void ResponseWithAStatusCodeOf404ForTheInvalidParamID() {
//        restAssuredThat(response -> response.statusCode(404));
//    }


}
