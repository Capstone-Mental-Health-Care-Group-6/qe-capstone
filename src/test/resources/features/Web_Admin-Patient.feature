#Feature: Admin Patient
#
#  As a user
#  I want to see patient data
#  So that I can manage patient data
#
#  # [Positive] GET - Get All Patient
#  Scenario: User retrieves all patient data successfully
#    Given I set the GET endpoint for retrieving all patient data
#    When I send an HTTP GET request with valid baseURL for retrieving all patient data
#    Then I receive a valid data response for retrieving all patient data with HTTP status code 200 OK
#
#  # [Positive] GET - Get Patient Status Active
#  Scenario: User retrieves active patient data successfully
#    Given I set the GET endpoint for retrieving active patient data
#    When I send an HTTP GET request with valid parameters and baseURL for retrieving active patient data
#    Then I receive a valid data response for retrieving active patient data with HTTP status code 200 OK
#
#  # [Positive] GET - Get Patient Status Inactive
#  Scenario: User retrieves inactive patient data successfully
#    Given I set the GET endpoint for retrieving inactive patient data
#    When I send an HTTP GET request with valid parameters and baseURL for retrieving inactive patient data
#    Then I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK
#
#  # [Positive] GET - Get Patient by Name
#  Scenario: User retrieves patient data by name successfully
#    Given I set the GET endpoint for retrieving patient data by name
#    When I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name
#    Then I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK
#
#  # [Negative] GET - Get Patient Data Empty
#  Scenario: User fails to retrieve patient data when it is empty
#    Given I set the GET endpoint for retrieving patient data is empty
#    When I send an HTTP GET request with valid baseURL for retrieving patient data is empty
#    Then I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found
#
#  # [Negative] GET - Get Patient Invalid Endpoint
#  Scenario: User fails to retrieve patient data with an invalid endpoint
#    Given I set the GET endpoint for retrieving patient data with an invalid endpoint
#    When I send an HTTP GET request with invalid baseURL for retrieving patient data
#    Then I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found
#
#  # [Positive] GET - Dashboard
#  Scenario: User retrieves the dashboard data successfully
#    Given I set the GET endpoint for retrieving dashboard data
#    When I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data
#    Then I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK
#
#  # [Negative] GET - Dashboard Invalid Endpoint
#  Scenario: User fails to retrieve the dashboard data with an invalid endpoint
#    Given I set the GET endpoint for retrieving dashboard data with an invalid endpoint
#    When I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint
#    Then I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found
#
#  # [Positive] PUT - Update Profile Admin
#  Scenario: Admin updates profile successfully
#    Given I set the PUT endpoint for updating admin profile
#    When I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile
#    Then I receive a valid data response for updating admin profile with HTTP status code 200 OK
#
#  # [Negative] PUT - Update Profile Admin Invalid Endpoint
#  Scenario: Admin fails to update profile with an invalid endpoint
#    Given I set the PUT endpoint for updating admin profile with an invalid endpoint
#    When I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint
#    Then I receive a valid data response for updating admin profile with an invalid endpoint with HTTP status code 404 Not Found
