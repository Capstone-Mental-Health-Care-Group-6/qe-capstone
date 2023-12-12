Feature: PUT - Update Status of Balance Disbursement Data
  As a user,
  I want to update the status of balance disbursement data,
  So that I can modify the status information.


  Background:
    Given I set a valid endpoint for Withdraw Balance Disbursement operations
    # Endpoint: User localhost:8000/withdraw

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
