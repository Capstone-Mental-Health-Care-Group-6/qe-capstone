Feature: Transaction Manual

  As a user
  I want to make a transaction manual
  So that I can manage my transaction

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

  # [Positive] PUT - Update Transaction By Transaction ID
  Scenario: User updates transaction by transaction ID successfully
  Given I set the PUT endpoint for updating a transaction by transaction ID
  When I send an HTTP PUT request with valid parameters and baseURL for updating a transaction by transaction ID
  Then I receive a valid data response for updating a transaction by transaction ID with HTTP status code 200 OK

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