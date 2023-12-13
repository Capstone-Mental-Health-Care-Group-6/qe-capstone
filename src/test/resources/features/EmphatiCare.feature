Feature: Emphati Care
  As a user
  I want to access my application
  So that I can manage application

  # BUAT FITUR YANG UDAH FIX TARUH SINI
  # SEMENTARA BUAT FILE FITUR BERBEDA, JANGAN GABUNG SINI KALO BELUM FIX
  # KALO MAU EDIT FILE FITUR INI BILANG BILANG DI GRUP DULU YA, TAKUT KETIBAN KERJAAN KALIAN NANTI HILANG:(

  # ===========================AUTH REGISTER===========================
#
#  # [Negative] POST - Register Error Validation
#  Scenario: Error Validation on POST Register
#    Given I have an valid registration endpoint
#    When I send a POST request to the registration endpoint with an empty request body
#    Then I should receive a response with HTTP status code 400 bad request
#
#  # [Negative] POST - Register Error
#  Scenario: Error on POST Register with Duplicate Information
#    Given I have an valid registration endpoint
#    When I provide name, email, role, and password that are already registered
#    And I send a POST request to the invalid registration endpoint
#    Then I should receive a response with HTTP status code 500 internal server error
#
#  # [Negative] POST - Error Email Already Registered
#  Scenario: Error - Email Already Registered
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password that are already registered
#    Then I should receive a response with HTTP status code 500 internal server error
#
#  # [Positive] POST - Successful Registration for Admin
#  Scenario: Successful Registration for Admin
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for an admin
#    And I send a POST request to the valid registration endpoint
#    Then I should receive a response with HTTP status code 201 created
#
#  # [Positive] POST - Successful Registration for Patient
#  Scenario: Successful Registration for Patient
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for a patient
#    And I send a POST request to the valid registration endpoint
#    Then I should receive a response with HTTP status code 201 created
#
#  # [Positive] POST - Successful Registration for Doctor
#  Scenario: Successful Registration for Doctor
#    Given I have a valid registration endpoint
#    When I provide name, email, role, and password for a doctor
#    And I send a POST request to the valid registration endpoint
#    Then I should receive a response with HTTP status code 201 created


  # ===========================AUTH lOGIN==============================

  # Login by Admin
  Scenario: I login using authentication for Admin
    Given I set authentication endpoint for login admin
    When I send authentication endpoint for login admin
    Then I receive a valid data response for login admin with HTTP status code 200 OK

  # Login by Doctor
  Scenario: I login using authentication for Doctor
    Given I set authentication endpoint for login doctor
    When I send authentication endpoint for login doctor
    Then I receive a valid data response for login doctor with HTTP status code 200 OK

  # Login by Patient
  Scenario: I login using authentication for Patient
    Given I set authentication endpoint for login patient
    When I send authentication endpoint for login patient
    Then I receive a valid data response for login patient with HTTP status code 200 OK

  # anas lanjutin negative case, kalo bisa jangan pake AND biar hemat steps

  # ===========================WEB ADMIN PATIENT===========================

  # [Positive] GET - Get All Patient
  Scenario: User retrieves all patient data successfully
    Given I set the GET endpoint for retrieving all patient data
    When I send an HTTP GET request with valid baseURL for retrieving all patient data
    Then I receive a valid data response for retrieving all patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient Status Active
  Scenario: User retrieves active patient data successfully
    Given I set the GET endpoint for retrieving active patient data
    When I send an HTTP GET request with valid parameters and baseURL for retrieving active patient data
    Then I receive a valid data response for retrieving active patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient Status Inactive
  Scenario: User retrieves inactive patient data successfully
    Given I set the GET endpoint for retrieving inactive patient data
    When I send an HTTP GET request with valid parameters and baseURL for retrieving inactive patient data
    Then I receive a valid data response for retrieving inactive patient data with HTTP status code 200 OK

  # [Positive] GET - Get Patient by Name
  Scenario: User retrieves patient data by name successfully
    Given I set the GET endpoint for retrieving patient data by name
    When I send an HTTP GET request with valid parameters and baseURL for retrieving patient data by name
    Then I receive a valid data response for retrieving patient data by name with HTTP status code 200 OK

  # [Negative] GET - Get Patient Data Empty
  Scenario: User fails to retrieve patient data when it is empty
    Given I set the GET endpoint for retrieving patient data is empty
    When I send an HTTP GET request with valid baseURL for retrieving patient data is empty
    Then I receive a valid data response for retrieving patient data is empty with HTTP status code 404 Not Found

  # [Negative] GET - Get Patient Invalid Endpoint
  Scenario: User fails to retrieve patient data with an invalid endpoint
    Given I set the GET endpoint for retrieving patient data with an invalid endpoint
    When I send an HTTP GET request with invalid baseURL for retrieving patient data
    Then I receive a valid data response for retrieving patient data with an invalid endpoint with HTTP status code 404 Not Found

  # [Positive] GET - Dashboard
  Scenario: User retrieves the dashboard data successfully
    Given I set the GET endpoint for retrieving dashboard data
    When I send an HTTP GET request with valid parameters, token, and baseURL for retrieving dashboard data
    Then I receive a valid data response for retrieving dashboard data with HTTP status code 200 OK

  # [Negative] GET - Dashboard Invalid Endpoint
  Scenario: User fails to retrieve the dashboard data with an invalid endpoint
    Given I set the GET endpoint for retrieving dashboard data with an invalid endpoint
    When I send an HTTP GET request with invalid baseURL for retrieving dashboard data with an invalid endpoint
    Then I receive a valid data response for retrieving dashboard data with an invalid endpoint with HTTP status code 404 Not Found

  # [Positive] PUT - Update Profile Admin
  Scenario: Admin updates profile successfully
    Given I set the PUT endpoint for updating admin profile
    When I send an HTTP PUT request with valid parameters, token, and baseURL for updating admin profile
    Then I receive a valid data response for updating admin profile with HTTP status code 200 OK

  # [Negative] PUT - Update Profile Admin Invalid Endpoint
  Scenario: Admin fails to update profile with an invalid endpoint
    Given I set the PUT endpoint for updating admin profile with an invalid endpoint
    When I send an HTTP PUT request with invalid baseURL for updating admin profile with an invalid endpoint
    Then I receive a valid data response for updating admin profile with an invalid endpoint with HTTP status code 404 Not Found

  # ===========================TRANSACTION MANUAL===========================

  # [Positive] POST - Make Manual Transaction
  Scenario: User makes a manual transaction successfully
    Given I set the POST endpoint for making a manual transaction
    When I send an HTTP POST request with valid parameters and baseURL for making a manual transaction
    Then I receive a valid data response for making a manual transaction with HTTP status code 201 Created

  # [Negative] POST - Make Manual Transaction Doctor ID Not Found
  Scenario: User fails to make a manual transaction with invalid doctor ID
    Given I set the POST endpoint for making a manual transaction with invalid doctor ID
    When I send an HTTP POST request with invalid doctor ID and valid parameters
    Then I receive a valid data response for making a manual transaction with invalid doctor ID with HTTP status code 500 Internal Server Error

  # [Positive] PUT - Update Transaction
  Scenario: User updates transaction successfully
    Given I set the PUT endpoint for updating a transaction
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction
    Then I receive a valid data response for updating a transaction with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction By ID
  Scenario: User updates transaction by ID successfully
    Given I set the PUT endpoint for updating a transaction by ID
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction by ID
    Then I receive a valid data response for updating a transaction by ID with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction Deny Transaction By Admin (On Confirmation)
  Scenario: Admin denies transaction successfully (On Confirmation)
    Given I set the PUT endpoint for updating a transaction to deny status by Admin
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to deny status by Admin
    Then I receive a valid data response for updating a transaction to deny status by Admin with HTTP status code 200 OK

  # [Positive] PUT - Update Transaction Accept Transaction By Admin (On Confirmation)
  Scenario: Admin accepts transaction successfully (On Confirmation)
    Given I set the PUT endpoint for updating a transaction to accept status by Admin
    When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction to accept status by Admin
    Then I receive a valid data response for updating a transaction to accept status by Admin with HTTP status code 200 OK

  # [Negative] PUT - Update Transaction Status is Accepted or Failure
  Scenario: User fails to update transaction status to Accepted or Failure
    Given I set the PUT endpoint for updating a transaction with invalid status
    When I send an HTTP PUT request for updating a transaction with invalid status
    Then I receive a valid data response for updating a transaction with invalid status with HTTP status code 500 Internal Server Error

  # [Positive] GET - Get Transactions from User ID
  Scenario: User retrieves transactions by User ID successfully
    Given I set the GET endpoint for retrieving transactions by User ID
    When I send an HTTP GET request with valid User ID and baseURL for retrieving transactions by User ID
    Then I receive a valid data response for retrieving transactions by User ID with HTTP status code 200 OK

  # [Positive] GET - Get Transactions from User ID Get Filtered By Payment Type Transactions from User ID
  Scenario: User retrieves transactions by User ID and filtered by Payment Type successfully
    Given I set the GET endpoint for retrieving transactions by User ID and filtered by Payment Type
    When I send an HTTP GET request for retrieving transactions by User ID and filtered by Payment Type
    Then I receive a valid data response for retrieving transactions by User ID and filtered by Payment Type with HTTP status code 200 OK

  # [Positive] GET - Get All Transactions
  Scenario: User retrieves all transactions successfully
    Given I set the GET endpoint for retrieving all transactions
    When I send an HTTP GET request with valid baseURL for retrieving all transactions
    Then I receive a valid data response for retrieving all transactions with HTTP status code 200 OK

  # [Positive] GET - Get All Transactions Get Sorted By Payment Type All Transactions
  Scenario: User retrieves all transactions and sorted by Payment Type successfully
    Given I set the GET endpoint for retrieving all transactions and sorted by Payment Type
    When I send an HTTP GET request with valid Payment Type and baseURL for retrieving all transactions and sorted by Payment Type
    Then I receive a valid data response for retrieving all transactions and sorted by Payment Type with HTTP status code 200 OK

  # [Positive] GET - Show Transaction Status By Midtrans ID
  Scenario: User retrieves transaction status by Midtrans ID successfully
    Given I set the GET endpoint for retrieving transaction status by Midtrans ID
    When I send an HTTP GET request with valid Midtrans ID and baseURL for retrieving transaction status by Midtrans ID
    Then I receive a valid data response for retrieving transaction status by Midtrans ID with HTTP status code 200 OK