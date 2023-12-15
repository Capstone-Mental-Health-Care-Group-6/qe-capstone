#Feature: User Registration Mobile API
#  In order to create a new user account
#  As a user
#  I want to successfully register mobile using the API
#
#  # [Positive] POST - Register Success
#  Scenario: Successful registration
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for registration
#    Then I should receive a response with HTTP status code 200 OK and successfully registered
#
#  # [Negative] POST - Register Error Upload Avatar
#  Scenario: Registration error due to invalid avatar
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information with an invalid avatar for registration
#    Then I should receive a response with HTTP status code 400 Bad Request due to invalid avatar
#
#  # [Negative] POST - Register Duplicate Email
#  Scenario: Registration with duplicate email
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for a user account with a duplicate email
#    Then I should receive a response with HTTP status code 400 Bad Request due to duplicate email
