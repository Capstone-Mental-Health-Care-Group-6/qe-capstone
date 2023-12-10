Feature: Forget Password
  In order to reset my password
  As a user
  I want to successfully request a password reset using the API

 # Forget Password
  @Authentication_Forget_Password_positive1
  Scenario: Successful Forget Password
    Given I sets a POST request to a valid endpoint for forget password endpoint
    When I sends a POST request to the forget password endpoint with a valid email
    Then I should receive a response with HTTP status code 200 OK and successfully
