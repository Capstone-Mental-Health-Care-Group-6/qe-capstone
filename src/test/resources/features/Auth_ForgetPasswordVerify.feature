#Feature: Forget Password Verify
#  In order to reset my password
#  As a user
#  I want to successfully request a password reset using the API
#
#  # [Positive] POST - Success Forget Password Verify
#  Scenario: Success Forget Password Verify
#    Given I set a POST request to a valid endpoint for the forget password verify endpoint
#    When I send a POST request to the forget password verify endpoint with valid data
#    Then I should receive a response with HTTP status code 200 OK indicating success
#
#  # [Negative] POST - Error  Forget Password
#  Scenario: Error Forget Password
#    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
#    When I send a POST request to the Error Forget Password endpoint with invalid data
#    Then I should receive a response with HTTP status code 400 Bad Request indicating an error
#
#  # [Negative] POST - Forget Password Token Not Found
#  Scenario: Forget Password Token Not Found
#    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
#    When I send a POST request to the forget password verify endpoint with a missing token
#    Then I should receive a response with HTTP status code 400 Bad Request indicating token not found
