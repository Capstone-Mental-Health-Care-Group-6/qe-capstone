Feature: Retrieve All Balance Withdraw Data by ID
  As a user
  I want to retrieve specific All Balance Withdraw details by their ID

  Background:
    Given I set a valid endpoint for Withdraw Balance Disbursement operations
    # Endpoint: User localhost:8000/withdraw

 # [Positive] GET - Get By ID Success
  Scenario: User Retrieve All Balance Withdraw data by ID using a valid endpoint
    When I send a GET HTTP request with a valid ID for All Balance Withdraw
    Then I receive a valid GET HTTP response with a status code of 200 for the All Balance Withdraw data by ID

  # [Negative] GET - Get By ID Not Found
  Scenario: User Retrieve All Balance Withdraw data by ID but not found
    When I send a GET HTTP request with an invalid ID for All Balance Withdraw
    Then I receive a GET HTTP response with a status code of 400 for the All Balance Withdraw data by ID
