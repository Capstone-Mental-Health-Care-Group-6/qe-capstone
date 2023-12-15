#Feature: Login mobile
#  In order to access my account
#  As a registered user
#  I want to successfully log in using the API
#
#  # [Positive] POST - Login Success
#  Scenario: I login using authentication mobile
#    Given I set the authentication mobile endpoint
#    And I send a POST request to the authentication mobile endpoint
#    Then I should receive a response with HTTP status code 200 OK and successfully log in
#
#  # [Negative] POST - Login Error Password Invalid
#  Scenario: I login using authentication with an invalid Password
#    Given I set the authentication mobile endpoint
#    When I send a POST request to the login endpoint with an invalid Password
#    Then I should receive a response with HTTP status code 400 Bad Request and invalid Password
#
#  # [Positive] POST - Login Success update Password
#  Scenario: I login using authentication with updated password
#    Given I set the authentication mobile endpoint
#    When I send a POST request to the login endpoint with a successful password update
#    Then I should receive a response with HTTP status code 200 OK and successful password update
