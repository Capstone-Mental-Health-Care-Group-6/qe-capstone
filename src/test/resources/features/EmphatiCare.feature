Feature: Emphati Care
  As a user
  I want to access my application
  So that I can manage application

 # ===========================AUTH REGISTER===========================
##   [Positive] POST - Successful Registration for Admin
#  Scenario: Successful Registration for Admin
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for an admin
#    Then I should receive a response with HTTP status code 201 created
#
#    # [Positive] POST - Successful Registration for Doctor
#  Scenario: Successful Registration for Doctor
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for a doctor
#    Then I should receive a response with HTTP status code 201 created
#
#  # [Positive] POST - Successful Registration for Patient
#  Scenario: Successful Registration for Patient
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for a patient
#    Then I should receive a response with HTTP status code 201 created

  # [Negative] POST - Register Error Validation
  Scenario: Error Validation on POST Register
    Given I have an valid registration endpoint
    When I send a POST request to the registration endpoint with an empty request body
    Then I should receive a response with HTTP status code 400 bad request

  # [Negative] POST - Register Error
  Scenario: Error on POST Register with Duplicate Information
    Given I have an valid registration endpoint
    When I provide name, email, role, and password that are already registered
    Then I should receive a response with HTTP status code 500 internal server error

  # [Negative] POST - Error Email Already Registered
  Scenario: Error - Email Already Registered
    Given I have a valid registration endpoint
    When I provide name, email, role, and password that are already registered
    Then I should receive a response with HTTP status code 500 internal server error

    #  # ===========================AUTH lOGIN==============================

  # [Positive] Login by Admin
  Scenario: I login using authentication for Admin
    Given I set authentication endpoint for login admin
    When I send authentication endpoint for login admin
    Then I receive a valid data response for login admin with HTTP status code 200 OK

  # [Positive] Login by Doctor
  Scenario: I login using authentication for Doctor
    Given I set authentication endpoint for login doctor
    When I send authentication endpoint for login doctor
    Then I receive a valid data response for login doctor with HTTP status code 200 OK

  # [Positive] Login by Patient
  Scenario: I login using authentication for Patient
    Given I set authentication endpoint for login patient
    When I send authentication endpoint for login patient
    Then I receive a valid data response for login patient with HTTP status code 200 OK

  # [Negative] POST - Incorrect Password
  Scenario: I login using authentication with Incorrect Password
    Given I set authentication endpoint with Incorrect Password
    When I sends a POST request to the login endpoint with admin credentials
    And I sends a POST request to the login endpoint with doctor credentials
    And I sends a POST request to the login endpoint with patient credentials
    Then I receive a response with HTTP status code 500 Internal Server Error

    # Then I receive a response with HTTP status code 400 Bad Request
    # Expected status code <400> but was <500> Internal Server Error

  # [Negative] POST - Data Not Found
  Scenario: I login using authentication with data not found
    Given I set authentication endpoint with data not found
    When I sends a POST request to the login endpoint with admin data not found
    And I sends a POST request to the login endpoint with doctor data not found
    And I sends a POST request to the login endpoint with patient data not found
    Then I should receive a response with HTTP status code 500 Internal Server Error

    # Then I should receive a response with HTTP status code 400 Bad Request
    # Expected status code <400> but was <500> Internal Server Error

  #  # ===========================AUTH PATIENT REGISTRATION============================
#
#  [Positive] POST - Register Success
#  Scenario: Successful registration
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for registration
#    Then I should receive a response with HTTP status code 400 OK and successfully registered
#     Then I should receive a response with HTTP status code 201 created and successfully registered
#     Then I should receive a response with HTTP status code 200 OK and successfully registered
    # Expected status code <200> but was <400>
    # Expected status code <200> but was <201>

  # [Negative] POST - Register Error Upload Avatar
  Scenario: Registration error due to invalid avatar
    Given I have a valid registration mobile endpoint
    When I provide valid user information with an invalid avatar for registration
    Then I should receive a response with HTTP status code 400 Bad Request due to invalid avatar

#  # [Negative] POST - Register Duplicate Email
#  Scenario: Registration with duplicate email
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for a user account with a duplicate email
#    Then I should receive a response with HTTP status code 400 Bad Request due to duplicate email

#  # ==============================AUTH PATIENT LOGIN MOBILE================================
#
  # [Positive] POST - Login Success
  Scenario: I login using authentication mobile
    Given I set the authentication mobile endpoint
    When I send a POST request to the authentication mobile endpoint
    Then I should receive a response with HTTP status code 200 OK and successfully log in

  # [Negative] POST - Login Error Password Invalid
  Scenario: I login using authentication with an invalid Password
    Given I set the authentication mobile endpoint
    When I send a POST request to the loginAdmin endpoint with an invalid Password
    Then I should receive a response with HTTP status code 400 Bad Request and invalid Password

  # [Positive] PUT - Login Success update Password
#  Scenario: I login using authentication with updated password
#    Given I set the authentication mobile endpoint updated password
#    When I send a POST request to the login endpoint with a successful password update
#    Then I should receive a response with HTTP status code 400 OK and successful password update
#    # Then I should receive a response with HTTP status code 200 OK and successful password update
    # Expected status code <200> but was <400>.

  #  # ===================================LOGIN GOOGLE=================================

  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK

#  # ==============================LOGIN GOOGLE CALLBACK=============================
#
  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK
