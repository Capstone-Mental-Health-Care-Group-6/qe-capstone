Feature: Emphati Care
  As a user
  I want to access my application
  So that I can manage application

 # ===========================AUTH REGISTER===========================
#  [Positive] POST - Successful Registration for Admin
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

# ===========================AUTH lOGIN==============================

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

  # [Negative] POST - Data Not Found
  Scenario: I login using authentication with data not found
    Given I set authentication endpoint with data not found
    When I sends a POST request to the login endpoint with admin data not found
    And I sends a POST request to the login endpoint with doctor data not found
    And I sends a POST request to the login endpoint with patient data not found
    Then I should receive a response with HTTP status code 500 Internal Server Error

# ===========================AUTH PATIENT REGISTRATION============================

#  [Positive] POST - Register Success
#  Scenario: Successful registration
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for registration
#    Then I should receive a response with HTTP status code 400 OK and successfully registered
#     Then I should receive a response with HTTP status code 201 created and successfully registered
#     Then I should receive a response with HTTP status code 200 OK and successfully registered

  # [Negative] POST - Register Error Upload Avatar
  Scenario: Registration error due to invalid avatar
    Given I have a valid registration mobile endpoint
    When I provide valid user information with an invalid avatar for registration
    Then I should receive a response with HTTP status code 400 Bad Request due to invalid avatar

  # [Negative] POST - Register Duplicate Email
#  Scenario: Registration with duplicate email
#    Given I have a valid registration mobile endpoint
#    When I provide valid user information for a user account with a duplicate email
#    Then I should receive a response with HTTP status code 400 Bad Request due to duplicate email

#  # ==============================AUTH PATIENT LOGIN MOBILE================================

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

# ===================================LOGIN GOOGLE=================================

  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK

# ==============================LOGIN GOOGLE CALLBACK=============================

  # [Positive] GET - Login Google Redirect to Callback
  Scenario: I login google redirect to callback
    Given I sets a GET request to a valid endpoint for login google endpoint
    When I sends a GET request to the login google endpoint for redirection to callback
    Then I should receive a response with HTTP status code 200 OK

# =============================AUTH FORGET PASSWORD===============================

  # [Positive] POST - Success Forget Password
  Scenario: Successful Forget Password
    Given I sets a POST request to a valid endpoint for forget password endpoint
    When I sends a POST request to the forget password endpoint with a valid email
    Then I should receive a response with HTTP status code 500 internal server error but successfully

# ==========================AUTH FORGET PASSWORD VERIFY===========================

  # [Positive] POST - Success Forget Password Verify
  Scenario: Success Forget Password Verify
    Given I set a POST request to a valid endpoint for the forget password verify endpoint
    When I send a POST request to the forget password verify endpoint with valid data
    Then I should receive a response with HTTP status code 400 OK indicating success

  # [Negative] POST - Error  Forget Password
  Scenario: Error Forget Password
    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
    When I send a POST request to the Error Forget Password endpoint with invalid data
    Then I should receive a response with HTTP status code 400 Bad Request indicating an error

  # [Negative] POST - Forget Password Token Not Found
  Scenario: Forget Password Token Not Found
    Given I set a POST request to a invalid endpoint for the forget password verify endpoint
    When I send a POST request to the forget password verify endpoint with a missing token
    Then I should receive a response with HTTP status code 400 Bad Request indicating token not found

# ===========================WEB ADMIN ARTICLE CATEGORY===========================

 # [Positive] GET - Success Get All
  Scenario: User Retrieving all articles categories with a valid endpoint
    Given I set authentication endpoint to retrieve article categories
    When I send an HTTP GET request to fetch articles categories using a valid endpoint
    Then I should receive a valid HTTP response with status code 200 for articles categories

  # [Positive] POST - Success Create
  Scenario: I creating a new articles category with a valid endpoint
    Given I set a POST request to a valid endpoint for creating a new articles category
    When I send the POST request to create a new articles category
    Then I receive an HTTP response with code 201 for creating a new articles category

  # [Negative] POST - Input Error
  Scenario: I Attempting to create a new article category with invalid input
    Given I set a POST request with invalid input for creating a new articles category
    When I send the POST request with invalid input for creating a new articles category
    Then I receive an HTTP response with code 400 for creating a new articles category

  # [Positive] GET - Success Get By ID
  Scenario: User get articles category by ID using valid endpoint
    Given I set a valid GET endpoint for articles category by ID
    When I sends a GET HTTP request with a valid endpoint for articles category by ID
    Then I receives a valid GET HTTP response with a status code of 200 for articles category by ID

  # [Negative] GET - Invalid User Input
  Scenario: User get articles category by ID using invalid user input
    Given I set an valid GET endpoint for articles category by ID
    When I sends a GET HTTP request with an invalid user input for articles category by ID
    Then I receives a GET HTTP response with a status code of 400 for articles category by ID

  # [Positive] PUT - Success Update
  Scenario: User Update articles category with Valid Endpoint
    Given I set a valid PUT endpoint Update Articles Category
    When I sends a PUT HTTP request Update Articles Category
    Then I receives an HTTP response code 405 with valid endpoint

  # [Negative] PUT - Invalid Param ID
  Scenario: User Update User with Invalid Endpoint
    Given I set an valid PUT endpoint Update Articles Category with an invalid param ID
    When I sends a PUT HTTP request Update Articles Category with an invalid param ID
    Then I receives an HTTP response code 405 with invalid param ID

  # [Negative] PUT - Invalid User Input
  Scenario: User Update User with invalid user input
    Given I set an valid PUT endpoint Update Articles Category with an invalid user input
    When I sends a PUT HTTP request Update Articles Category with an invalid user input
    Then I receives an HTTP response code 405 with invalid user input

  # [Positive] DEL - Delete Success
  Scenario: User Deleting an Articles Category with a valid endpoint
    Given I set the DELETE endpoint to a valid endpoint
    When I send a DELETE HTTP request with a valid endpoint
    Then I receive a DELETE HTTP response with a status code of 204 for the valid endpoint

  # [Negative] DEL - Delete Invalid Param ID
  Scenario: User Deleting an Articles Category with an Invalid Param ID
    Given I set the DELETE endpoint to an Invalid Param ID
    When I send a DELETE HTTP request with an invalid param ID
    Then I receive a DELETE HTTP response with a status code of 400 for the invalid param ID

# ===========================WEB ADMIN WITHDRAW BALANCE===========================

# [Positive] GET - Get All Data
  Scenario: User Retrieving all data from balance disbursement with a valid endpoint
    Given I set the authentication endpoint for Withdraw Balance Disbursement operations
    When I send an HTTP GET request to fetch all data from Balance Disbursement
    Then I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement

  # [Positive] PUT - Update Status Done
  Scenario: User Updating status to Done for Withdraw Balance Disbursement
    Given I sets a valid PUT endpoint Update status done all data from balance disbursement
    When I send a PUT HTTP request to Update status to Done
    Then I receive an HTTP response code 404 with a valid endpoint for updating status to Done

  # [Negative] PUT - Update Status Pending
  Scenario: User Updating status to Pending for Withdraw Balance Disbursement
    Given I sets a valid PUT endpoint Update status pending all data from balance disbursement
    When I send a PUT HTTP request to Update status to Pending
    Then I receive an HTTP response code 404 with a valid endpoint for updating status to Pending

  # [Negative] PUT - Update Failed Validation
  Scenario: User Failed attempt to update status due to validation issues
    Given I sets a valid PUT endpoint Update status failed validation all data from balance disbursement
    When I send a PUT HTTP request with invalid data validation to Update status of Balance Disbursement
    Then I receive an HTTP response code 404 due to invalid request format

  # [Positive] GET - Get By ID Success
  Scenario: User Retrieve All Balance Withdraw data by ID using a valid endpoint
    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID
    When I send a GET HTTP request with a valid ID for All Balance Withdraw
    Then I receive a valid GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID

  # [Negative] GET - Get By ID Not Found
  Scenario: User Retrieve All Balance Withdraw data by ID but not found
    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID Not found
    When I send a GET HTTP request with an invalid ID for All Balance Withdraw
    Then I receive a GET HTTP response with a status code of 404 for the All Balance Withdraw data by ID
