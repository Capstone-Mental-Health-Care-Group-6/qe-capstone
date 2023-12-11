Feature: Login
  In order to access my account
  As a registered user
  I want to successfully log in using the API

  # [Positive] POST - Success Login Admin
  # [Positive] POST - Success Login Patient
  # [Positive] POST - Success Login Doctor
  @Authentication_login_positive1
  Scenario: I login using authentication
    Given I set authentication endpoint
    And I send authentication endpoint

  # [Negative] POST - Incorrect Password
  @Authentication_login_negative1
  Scenario: I login using authentication with Incorrect Password
    Given I set authentication endpoint
    When I sends a POST request to the login endpoint with incorrect password
    Then I should receive a response with HTTP status code 400 Bad Request

  # [Negative] POST - Data Not Found
  @Authentication_login_negative2
  Scenario: I login using authentication with data not found
    Given I set authentication endpoint
    When I sends a POST request to the login endpoint with data not found
    Then I should receive a response with HTTP status code 400 Bad Request
