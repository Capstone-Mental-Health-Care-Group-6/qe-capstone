package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.ChatBotCS;

public class ChatBotCSSteps {

    @Steps
    ChatBotCS chatBotCS;

    // [Positive] GET - All Chatbot
    @Given("I set the GET endpoint for retrieving all chatbot messages")
    public void setGetAllChatbotEndpoint() {
        chatBotCS.setGetAllChatbotEndpoint();
    }

    @When("I send an HTTP GET request Chatbot")
    public void sendHttpGetRequestToChatbot() {
        chatBotCS.sendHttpGetRequestToChatbot();
    }

    @Then("I receive a valid data response for get all chatbot with HTTP status code 200 OK")
    public void validateGetAllChatbotResponse() {
        chatBotCS.validateGetAllChatbotResponse();
    }

    // [Positive] POST - Send Message
    @Given("I set the POST endpoint for sending a message to chatbot")
    public void setPostSendMessageEndpoint() {
        chatBotCS.setPostSendMessageEndpoint();
    }

    @When("I send an HTTP POST request chatbot send message")
    public void sendHttpPostRequestToSendMessage() {
        chatBotCS.sendHttpPostRequestToSendMessage();
    }

    @Then("I receive a valid data response for send message with HTTP status code 200 OK")
    public void validateSendMessageResponse() {
        chatBotCS.validateSendMessageResponse();
    }

    // [Negative] GET - All Chatbot Invalid Endpoint
    @Given("I set the GET endpoint for retrieving all chatbot messages with an invalid endpoint")
    public void setGetAllChatbotInvalidEndpoint() {
        chatBotCS.setGetAllChatbotInvalidEndpoint();
    }

    @When("I send an HTTP GET request Chatbot Invalid Endpoint")
    public void sendHttpGetRequestToInvalidEndpoint() {
        chatBotCS.sendHttpGetRequestToInvalidEndpoint();
    }

    @Then("I receive a valid data response for chatbot invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidEndpointResponse() {
        chatBotCS.validateInvalidEndpointResponse();
    }

    // [Negative] - POST Send Message Invalid Endpoint
    @Given("I set the POST endpoint for sending a message to chatbot with an invalid endpoint")
    public void setPostSendMessageInvalidEndpoint() {
        chatBotCS.setPostSendMessageInvalidEndpoint();
    }

    @When("I send an HTTP POST request Chatbot Invalid Endpoint")
    public void sendHttpPostRequestToInvalidSendMessageEndpoint() {
        chatBotCS.sendHttpPostRequestToInvalidSendMessageEndpoint();
    }

    @Then("I receive a valid data response for send message invalid endpoint with HTTP status code 404 Not Found")
    public void validateInvalidSendMessageEndpointResponse() {
        chatBotCS.validateInvalidSendMessageEndpointResponse();
    }
}
