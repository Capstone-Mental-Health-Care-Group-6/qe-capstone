Feature: Reset Password
  In order to reset my password
  As a user
  I want to successfully reset my password using the API

  # Reset Password Scenarios

  @Authentication_Reset_Password_positive1
  Scenario: Success Reset Password
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with a valid token and matching passwords
    Then I should receive a response with HTTP status code 200 OK

  @Authentication_Reset_Password_Negative1
  Scenario: Reset Password Token Not Found
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with an invalid token
    Then I should receive a response with HTTP status code 400 Bad Request

  @Authentication_Reset_Password_Negative2
  Scenario: Reset Password Failed Verify Token
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with a token that fails verification
    Then I should receive a response with HTTP status code 400 Bad Request

  @Authentication_Reset_Password_Negative3
  Scenario: Reset Password Token Expired
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with an expired token
    Then I should receive a response with HTTP status code 400 Bad Request

  @Authentication_Reset_Password_Negative4
  Scenario: Reset Password Validation Error
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with invalid validation inputs
    Then I should receive a response with HTTP status code 400 Bad Request

  @Authentication_Reset_Password_Negative5
  Scenario: Reset Password not Match
    Given I have the reset password endpoint
    When I send a POST request to the reset password endpoint with passwords that do not match
    Then I should receive a response with HTTP status code 400 Bad Request
