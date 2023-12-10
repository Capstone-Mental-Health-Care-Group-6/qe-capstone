Feature: User Registration API
  In order to create a new user account
  As a user
  I want to successfully register using the API

  @Authentication_register_negative1
  Scenario: Error Validation on POST Register
    Given I have an valid registration endpoint
    When I send a POST request to the registration endpoint with an empty request body
    Then I should receive a response with HTTP status code 400 bad request

  @Authentication_register_negative2
  Scenario: Error on POST Register with Duplicate Information
    Given I have an valid registration endpoint
    When I provide name, email, role, and password that are already registered
    And I send a POST request to the invalid registration endpoint
    Then I should receive a response with HTTP status code 500 internal server error

  @Authentication_register_negative3
  Scenario: Error - Email Already Registered
    Given I have a valid registration endpoint
    When I provide name, email, role, and password that are already registered
    Then I should receive a response with HTTP status code 500 internal server error

  @Authentication_register_positive1
  Scenario: Successful Registration for Admin
    Given I have a valid registration endpoint
    When I provide name, email, role, and password for an admin
    And I send a POST request to the valid registration endpoint
    Then I should receive a response with HTTP status code 201 created

  @Authentication_register_positive2
  Scenario: Successful Registration for Patient
    Given I have a valid registration endpoint
    When I provide name, email, role, and password for a patient
    And I send a POST request to the valid registration endpoint
    Then I should receive a response with HTTP status code 201 created

  @Authentication_register_positive3
  Scenario: Successful Registration for Doctor
    Given I have a valid registration endpoint
    When I provide name, email, role, and password for a doctor
    And I send a POST request to the valid registration endpoint
    Then I should receive a response with HTTP status code 201 created
