#Feature: ChatBot
#
#  As a user
#  I want to use ChatBot
#  So that I can manage ChatBot
#
#  # [Positive] GET - All Chatbot
#  Scenario: User retrieves all chatbot messages successfully
#    Given I set the GET endpoint for retrieving all chat
#    When I sending HTTP GET request Chatbot
#    Then I receive a valid data response status 200 OK
#
#    # [Positive] GET - All Chatbot data null
#  Scenario: User retrieves all chatbot messages successfully
#    Given I set the GET endpoint for retrieving all chat data null
#    When I sending HTTP GET request Chatbot data null
#    Then I receive a valid data response status 200 OK GET data null
#
#  # [Positive] POST - Post Create Chatbot
#  Scenario: User sends a message to chatbot successfully
#    Given I set the POST endpoint for create chatbot and create messages
#    When I sending HTTP POST request Chatbot for create chatbot and create messages
#    Then I receive a valid data response status 200 OK for create chatbot and create messages
#
#  # [Negative] GET - All Chatbot with Invalid Endpoint
#  Scenario: User fails to retrieve all chatbot messages with an invalid endpoint
#    Given I set the GET invalid endpoint for create chatbot and create messages
#    When I sending HTTP GET request Chatbot invalid endpoint
#    Then I receive a valid data response status 404 not found for GET chatbot
#
#   # [Positive] POST - Post Create Chatbot Invalid Endpoint
#  Scenario: User sends a message to chatbot unsecessfulyy
#    Given I set the POST invalid endpoint for create chatbot and create messages
#    When I sending HTTP POST request Chatbot Invalid Endpoint
#    Then I receive a valid data response status 404 not found for POST chatbot