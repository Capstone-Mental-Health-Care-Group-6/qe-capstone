Feature: Login Google
  In order to access my account
  As a
  I want to successfully log in with google using the API

  # login google
  @Authentication_login_Google_positive1
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK
