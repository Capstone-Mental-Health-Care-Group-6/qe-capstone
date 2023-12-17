//package starter.stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.thucydides.core.annotations.Steps;
//import starter.restapi.Chat;
//
//public class ChatSteps {
//    @Steps
//    Chat chat;
//
//    // [Positive] GET - All User Chat Rooms
//    @Given("I set the GET endpoint for retrieving all user chatroom")
//    public void setGetAllUserChatRoomsEndpoint() {
//        chat.setGetAllUserChatRoomsEndpoint();
//    }
//
//    @When("I sending HTTP GET request for retrieving all user chatroom")
//    public void sendGetAllUserChatRoomsRequest() {
//        chat.sendGetAllUserChatRoomsRequest();
//    }
//
//    @Then("I receive a valid data response status 200 OK by GET request for retrieving all user chatroom")
//    public void validateGetAllUserChatRoomsResponse() {
//        chat.validateGetAllUserChatRoomsResponse();
//    }
//
//    // [Positive] GET - Filtered User Chat
//    @Given("I set the GET endpoint for retrieves filtered user chat")
//    public void setGetFilteredUserChatEndpoint() {
//        chat.setGetFilteredUserChatEndpoint();
//    }
//
//    @When("I sending HTTP GET request for retrieves filtered user chat")
//    public void sendGetFilteredUserChatRequest() {
//        chat.sendGetFilteredUserChatRequest();
//    }
//
//    @Then("I receive a valid data response status 200 OK by GET request for retrieves filtered user chat")
//    public void validateGetFilteredUserChatResponse() {
//        chat.validateGetFilteredUserChatResponse();
//    }
//
//    // [Positive] POST - Post Create Chat Room
//    @Given("I set the POST endpoint for create chatroom and create messages")
//    public void setPostCreateChatRoomEndpoint() {
//        chat.setPostCreateChatRoomEndpoint();
//    }
//
//    @When("I sending HTTP POST request for create chatroom and create messages")
//    public void sendPostCreateChatRoomRequest() {
//        chat.sendPostCreateChatRoomRequest();
//    }
//
//    @Then("I receive a valid data response status 200 OK by POST create chatroom and create messages")
//    public void validatePostCreateChatRoomResponse() {
//        chat.validatePostCreateChatRoomResponse();
//    }
//
//    // [Negative] GET - Chat with Invalid Endpoint
//    @Given("I set the GET invalid endpoint for create chat and create messages")
//    public void setGetChatInvalidEndpoint() {
//        chat.setGetChatInvalidEndpoint();
//    }
//
//    @When("I sending HTTP GET request Chat invalid endpoint")
//    public void sendGetChatInvalidEndpointRequest() {
//        chat.sendGetChatInvalidEndpointRequest();
//    }
//
//    @Then("I receive a valid data response status 404 not found by GET invalid endpoint chat")
//    public void validateGetChatInvalidEndpointResponse() {
//        chat.validateGetChatInvalidEndpointResponse();
//    }
//
//    // [Positive] DELETE - Chat Room
//    @Given("I set the DELETE endpoint for deleting chatroom")
//    public void setDeleteChatRoomEndpoint() {
//        chat.setDeleteChatRoomEndpoint();
//    }
//
//    @When("I sending HTTP DELETE request for deleting chatroom")
//    public void sendDeleteChatRoomRequest() {
//        chat.sendDeleteChatRoomRequest();
//    }
//
//    @Then("I receive a valid data response status 200 OK Deleting chatroom")
//    public void validateDeleteChatRoomResponse() {
//        chat.validateDeleteChatRoomResponse();
//    }
//}
