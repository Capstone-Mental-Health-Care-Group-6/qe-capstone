Feature: Get All Withdraw Balance
  As a user
  I want to retrieve all data from balance disbursement
  So that I can view all data from balance disbursement

  Background:
    Given I set a valid endpoint for Withdraw Balance Disbursement operations
    # Endpoint: User localhost:8000/withdraw

  # [Positive] GET - Get All Data
  Scenario: User Retrieving all data from balance disbursement with a valid endpoint
    When I set the authentication endpoint to retrieve all data from Balance Disbursement
    And I send an HTTP GET request to fetch all data from Balance Disbursement
    Then I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement
