#Feature: Reset Password
#  In order to reset my password
#  As a user
#  I want to successfully reset my password using the API
#
#  # [Positive] POST - Success Reset Password
#  Scenario: Success Reset Password
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with a valid token and matching passwords
#    Then I should receive a response indicating successful password reset with HTTP status code 200 OK
#
#  # [Negative] POST - Reset Password Token Not Found
#  Scenario: Reset Password Token Not Found
#    Given I sets a POST request to a invalid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with an invalid token
#    Then I should receive an error response due to token not found with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Failed Verify Token
#  Scenario: Reset Password Failed Verify Token
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with a token that fails verification
#    Then I should receive an error response due to failed token verification with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Token Expired
#  Scenario: Reset Password Token Expired
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with an expired token
#    Then I should receive an error response due to expired token with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password Validation Error
#  Scenario: Reset Password Validation Error
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with invalid validation inputs
#    Then I should receive an error response due to validation error with HTTP status code 400 Bad Request
#
#  # [Negative] POST - Reset Password not Match
#  Scenario: Reset Password not Match
#    Given I sets a POST request to a valid endpoint for the reset password endpoint
#    When I send a POST request to the reset password endpoint with passwords that do not match
#    Then I should receive an error response due to mismatched passwords with HTTP status code 400 Bad Request
