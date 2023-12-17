package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.restapi.Chatbot;

public class ChatbotSteps {

    @Steps
    Chatbot chatbot;

    // [Positive] GET - All Chatbot
    @Given("I set the GET endpoint for retrieving all chat")
    public void setGetAllChatbotEndpoint() {
        chatbot.setGetAllChatbotEndpoint();
    }

    @When("I send an HTTP GET request to Chatbot")
    public void sendGetAllChatbotRequest() {
        chatbot.sendGetAllChatbotRequest();
    }

    @Then("I receive a valid data response with status 200 OK")
    public void validateGetAllChatbotResponse() {
        chatbot.validateGetAllChatbotResponse();
    }

    // [Positive] GET - All Chatbot with Null Data
    @Given("I set the GET endpoint for retrieving all chat with null data")
    public void setGetAllChatbotWithNullDataEndpoint() {
        chatbot.setGetAllChatbotWithNullDataEndpoint();
    }

    @When("I send an HTTP GET request to Chatbot with null data")
    public void sendGetAllChatbotWithNullDataRequest() {
        chatbot.sendGetAllChatbotWithNullDataRequest();
    }

    @Then("I receive a valid data response with status 200 OK for GET with null data")
    public void validateGetAllChatbotWithNullDataResponse() {
        chatbot.validateGetAllChatbotWithNullDataResponse();
    }

    // [Positive] POST - Create Chatbot
    @Given("I set the POST endpoint for creating chatbot and messages")
    public void setPostCreateChatbotEndpoint() {
        chatbot.setPostCreateChatbotEndpoint();
    }

    @When("I send an HTTP POST request to Chatbot for creating chatbot and messages")
    public void sendPostCreateChatbotRequest() {
        chatbot.sendPostCreateChatbotRequest();
    }

    @Then("I receive a valid data response with status 201 for creating chatbot and messages")
    public void validatePostCreateChatbotResponse() {
        chatbot.validatePostCreateChatbotResponse();
    }

    // [Negative] GET - All Chatbot with Invalid Endpoint
    @Given("I set the GET invalid endpoint for creating chatbot and messages")
    public void setGetChatbotInvalidEndpoint() {
        chatbot.setGetChatbotInvalidEndpoint();
    }

    @When("I send an HTTP GET request to Chatbot with an invalid endpoint")
    public void sendGetChatbotInvalidEndpointRequest() {
        chatbot.sendGetChatbotInvalidEndpointRequest();
    }

    @Then("I receive a valid data response with status 404 Not Found for GET chatbot")
    public void validateGetChatbotInvalidEndpointResponse() {
        chatbot.validateGetChatbotInvalidEndpointResponse();
    }

    // [Negative] POST - Create Chatbot with Invalid Endpoint
    @Given("I set the POST invalid endpoint for creating chatbot and messages")
    public void setPostChatbotInvalidEndpoint() {
        chatbot.setPostChatbotInvalidEndpoint();
    }

    @When("I send an HTTP POST request to Chatbot with an invalid endpoint")
    public void sendPostChatbotInvalidEndpointRequest() {
        chatbot.sendPostChatbotInvalidEndpointRequest();
    }

    @Then("I receive a valid data response with status 404 Not Found for POST chatbot")
    public void validatePostChatbotInvalidEndpointResponse() {
        chatbot.validatePostChatbotInvalidEndpointResponse();
    }

}
