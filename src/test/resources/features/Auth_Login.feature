Feature: Login
  In order to access my account
  As a registered user
  I want to successfully log in using the API

  # [Positive] POST - Success Login Admin
  # [Positive] POST - Success Login Patient
  # [Positive] POST - Success Login Doctor
  Scenario: I login using authentication
    Given I set authentication endpoint for login
    When I send authentication endpoint for login
    Then I receive a valid data response for login with HTTP status code 200 OK

  # [Negative] POST - Incorrect Password
  Scenario: I login using authentication with Incorrect Password
    Given I set authentication endpoint with Incorrect Password
    When I sends a POST request to the login endpoint with incorrect password
    Then I receive a response with HTTP status code 400 Bad Request

#  # [Negative] POST - Data Not Found
#  @Authentication_login_negative2
#  Scenario: I login using authentication with data not found
#    Given I set authentication endpoint
#    When I sends a POST request to the login endpoint with data not found
#    Then I should receive a response with HTTP status code 400 Bad Request
