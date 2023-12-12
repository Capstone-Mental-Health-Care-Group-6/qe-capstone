
public String valid_endpoint_withdrawBalance = "localhost:8000/withdraw";


Feature: User Balance Disbursement Management

  Background:
    Given I set a valid endpoint for Withdraw Balance Disbursement operations
    # Endpoint: User localhost:8000/withdraw

  # [Positive] GET - Get All Data
  Scenario: User Retrieving all data from balance disbursement with a valid endpoint
    When I set the authentication endpoint to retrieve all data from Balance Disbursement
    And I send an HTTP GET request to fetch all data from Balance Disbursement
    Then I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement

  # [Positive] PUT - Update Status Done
  Scenario: User Updating status to Done for Withdraw Balance Disbursement
    When I send a PUT HTTP request to Update status to Done
    Then I receive an HTTP response code 200 with a valid endpoint for updating status to Done

  # [Negative] PUT - Update Status Pending
  Scenario: User Updating status to Pending for Withdraw Balance Disbursement
    When I send a PUT HTTP request to Update status to Pending
    Then I receive an HTTP response code 200 with a valid endpoint for updating status to Pending

  # [Negative] PUT - Update Failed Validation
  Scenario: User Failed attempt to update status due to validation issues
    When I send a PUT HTTP request with invalid data to Update status of Balance Disbursement
    Then I receive an HTTP response code 400 due to invalid request format

  # [Positive] GET - Get By ID Success
  Scenario: User Retrieve All Balance Withdraw data by ID using a valid endpoint
    When I send a GET HTTP request with a valid ID for All Balance Withdraw
    Then I receive a valid GET HTTP response with a status code of 200 for the All Balance Withdraw data by ID

  # [Negative] GET - Get By ID Not Found
  Scenario: User Retrieve All Balance Withdraw data by ID but not found
    When I send a GET HTTP request with an invalid ID for All Balance Withdraw
    Then I receive a GET HTTP response with a status code of 400 for the All Balance Withdraw data by ID
