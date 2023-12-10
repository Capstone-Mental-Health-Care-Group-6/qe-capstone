package starter.restapi;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ChatBotCS {
    protected static String url = "https://kmb5alta.online/";

    // [Positive] GET - Get All Bundle
    @Step("I set the GET endpoint for retrieving all chatbot messages")
    public String setGetAllChatbotEndpoint() {
        return url + "chatbotcs";
    }

    @Step("I send an HTTP GET request Chatbot")
    public void sendHttpGetRequestToChatbot() {
        SerenityRest.given()
                .when()
                .get(setGetAllChatbotEndpoint());
    }

    @Step("I receive a valid data response for get all chatbot with HTTP status code 200 OK")
    public void validateGetAllChatbotResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Positive] POST - Send Message
    @Step("I set the POST endpoint for sending a message to chatbot")
    public String setPostSendMessageEndpoint() {
        return url + "chatbotcs";
    }

    @Step("I send an HTTP POST request chatbot send message")
    public void sendHttpPostRequestToSendMessage() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "bagaimana cara melakukan pendaftaran?");

        SerenityRest
                .given()
                .header("Authorization", "xxxx")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostSendMessageEndpoint());
    }

    @Step("I receive a valid data response for send message with HTTP status code 200 OK")
    public void validateSendMessageResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    // [Negative] GET - All Chatbot Invalid Endpoint
    @Step("I set the GET endpoint for retrieving all chatbot messages with an invalid endpoint")
    public String setGetAllChatbotInvalidEndpoint() {
        return url + "chatbotcs";
    }

    @Step("I send an HTTP GET request Chatbot Invalid Endpoint")
    public void sendHttpGetRequestToInvalidEndpoint() {
        SerenityRest.given()
                .when()
                .get(setGetAllChatbotInvalidEndpoint());
    }

    @Step("I receive a valid data response for chatbot invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }

    // [Negative] - POST Send Message Invalid Endpoint
    @Step("I set the POST endpoint for sending a message to chatbot with an invalid endpoint")
    public String setPostSendMessageInvalidEndpoint() {
        return url + "chatbocs";
    }

    @Step("I send an HTTP POST request Chatbot Invalid Endpoint")
    public void sendHttpPostRequestToInvalidSendMessageEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "bagaimana cara melakukan pendaftaran?");

        SerenityRest
                .given()
                .header("Authorization", "xxxx")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostSendMessageInvalidEndpoint());
    }

    @Step("I receive a valid data response for send message invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidSendMessageEndpointResponse() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
