package starter.restapi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Chatbot {

    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - All Chatbot
    @Step("I set the GET endpoint for retrieving all chat")
    public String setGetAllChatbotEndpoint() {
        return url + "chatbot";
    }

    @Step("I send an HTTP GET request to Chatbot")
    public void sendGetAllChatbotRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetAllChatbotEndpoint());
    }

    @Step("I receive a valid data response with status 200 OK")
    public void validateGetAllChatbotResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] GET - All Chatbot with Null Data
    @Step("I set the GET endpoint for retrieving all chat with null data")
    public String setGetAllChatbotWithNullDataEndpoint() {
        return url + "chatbot";
    }

    @Step("I send an HTTP GET request to Chatbot with null data")
    public void sendGetAllChatbotWithNullDataRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetAllChatbotWithNullDataEndpoint());
    }

    @Step("I receive a valid data response with status 200 OK for GET with null data")
    public void validateGetAllChatbotWithNullDataResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] POST - Create Chatbot
    @Step("I set the POST endpoint for creating chatbot and messages")
    public String setPostCreateChatbotEndpoint() {
        return url + "chatbot";
    }

    @Step("I send an HTTP POST request to Chatbot for creating chatbot and messages")
    public void sendPostCreateChatbotRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("prompt", "Bagaimana Cara Mengatasi Stress?");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateChatbotEndpoint());
    }

    @Step("I receive a valid data response with status 201 for creating chatbot and messages")
    public void validatePostCreateChatbotResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    // [Negative] GET - All Chatbot with Invalid Endpoint
    @Step("I set the GET invalid endpoint for creating chatbot and messages")
    public String setGetChatbotInvalidEndpoint() {
        return url + "chatbo";
    }

    @Step("I send an HTTP GET request to Chatbot with an invalid endpoint")
    public void sendGetChatbotInvalidEndpointRequest() {
        SerenityRest.given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .when()
                .get(setGetChatbotInvalidEndpoint());
    }

    @Step("I receive a valid data response with status 404 Not Found for GET chatbot")
    public void validateGetChatbotInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] POST - Create Chatbot with Invalid Endpoint
    @Step("I set the POST invalid endpoint for creating chatbot and messages")
    public String setPostChatbotInvalidEndpoint() {
        return url + "chatbo";
    }

    @Step("I send an HTTP POST request to Chatbot with an invalid endpoint")
    public void sendPostChatbotInvalidEndpointRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("prompt", "Bagaimana Cara Mengatasi Stress?");

        SerenityRest
                .given()
                .header("Authorization", "Bearer " + LoginPatient.token)
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostChatbotInvalidEndpoint());
    }

    @Step("I receive a valid data response with status 404 Not Found for POST chatbot")
    public void validatePostChatbotInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
