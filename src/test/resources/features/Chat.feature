Feature: Chat

  As a user
  I want to use Chat
  So that I can manage Chat

  # [Positive] GET - All User Chat Rooms
  Scenario: User retrieves all user chat rooms successfully
    Given I set the GET endpoint for retrieving all user chatroom
    When I sending HTTP GET request for retrieving all user chatroom
    Then I receive a valid data response status 200 OK by GET request for retrieving all user chatroom

    # [Positive] GET - Filtered User Chat
  Scenario: User retrieves filtered user chat succesfully
    Given I set the GET endpoint for retrieves filtered user chat
    When I sending HTTP GET request for retrieves filtered user chat
    Then I receive a valid data response status 200 OK by GET request for retrieves filtered user chat

  # [Positive] POST - Post Create Chat Room
  Scenario: User sends a message to chat successfully
    Given I set the POST endpoint for create chatroom and create messages
    When I sending HTTP POST request for create chatroom and create messages
    Then I receive a valid data response status 200 OK by POST create chatroom and create messages

  # [Negative] GET - Chat with Invalid Endpoint
  Scenario: User fails to retrieve all chat messages with an invalid endpoint
    Given I set the GET invalid endpoint for create chat and create messages
    When I sending HTTP GET request Chat invalid endpoint
    Then I receive a valid data response status 404 not found by GET invalid endpoint chat

   # [Positive] DELETE - Chat Room
  Scenario: User delete ChatRoom succesfully
    Given I set the DELETE endpoint for deleting chatroom
    When I sending HTTP DELETE request for deleting chatroom
    Then I receive a valid data response status 200 OK Deleting chatroom