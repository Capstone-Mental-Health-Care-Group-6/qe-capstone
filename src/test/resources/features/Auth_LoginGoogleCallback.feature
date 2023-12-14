Feature: Login Google Callback
  In order to access my account
  As a
  I want to successfully log in with google using the API

  # [Positive] GET - Success Login Google Callback
  Scenario: I success login google callback
    Given I sets a GET request to a valid endpoint for login google callback endpoint
    When I sends a GET request to the login google callback endpoint
    Then I should receive a response with HTTP status code 200
