Feature: Chat Bot CS

  As a user
  I want to use Chat Bot with CS
  So that I can manage Chat Bot with CS

  # [Positive] GET - All Chatbot
  Scenario: User retrieves all chatbot messages successfully
    Given I set the GET endpoint for retrieving all chatbot messages
    When I send an HTTP GET request Chatbot
    Then I receive a valid data response for get all chatbot with HTTP status code 200 OK

  # [Positive] POST - Send Message
  Scenario: User sends a message to chatbot successfully
    Given I set the POST endpoint for sending a message to chatbot
    When I send an HTTP POST request chatbot send message
    Then I receive a valid data response for send message with HTTP status code 200 OK

  # [Negative] GET - All Chatbot Invalid Endpoint
  Scenario: User fails to retrieve all chatbot messages with an invalid endpoint
    Given I set the GET endpoint for retrieving all chatbot messages with an invalid endpoint
    When I send an HTTP GET request Chatbot Invalid Endpoint
    Then I receive a valid data response for chatbot invalid endpoint with HTTP status code 404 Not Found

  # [Negative] POST - Send Message Invalid Endpoint
  Scenario: User fails to send a message to chatbot with an invalid endpoint
    Given I set the POST endpoint for sending a message to chatbot with an invalid endpoint
    When I send an HTTP POST request Chatbot Invalid Endpoint
    Then I receive a valid data response for send message invalid endpoint with HTTP status code 404 Not Found