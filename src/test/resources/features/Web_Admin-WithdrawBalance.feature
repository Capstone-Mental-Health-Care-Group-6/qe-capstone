#Feature: User Balance Disbursement Management
#  As a user
#  I want to view all withdrawal balance data
#  So that I can manage Balance Disbursement
#
#  # Endpoint: User localhost:8000/withdraw
#
#  # [Positive] GET - Get All Data
#  Scenario: User Retrieving all data from balance disbursement with a valid endpoint
#    Given I set the authentication endpoint for Withdraw Balance Disbursement operations
#    When I send an HTTP GET request to fetch all data from Balance Disbursement
#    Then I should receive a valid HTTP response with status code 200 for all data from Balance Disbursement
#
#  # [Positive] PUT - Update Status Done
#  Scenario: User Updating status to Done for Withdraw Balance Disbursement
#    Given I sets a valid PUT endpoint Update status done all data from balance disbursement
#    When I send a PUT HTTP request to Update status to Done
#    Then I receive an HTTP response code 200 with a valid endpoint for updating status to Done
#
#  # [Negative] PUT - Update Status Pending
#  Scenario: User Updating status to Pending for Withdraw Balance Disbursement
#    Given I sets a valid PUT endpoint Update status pending all data from balance disbursement
#    When I send a PUT HTTP request to Update status to Pending
#    Then I receive an HTTP response code 200 with a valid endpoint for updating status to Pending
#
#  # [Negative] PUT - Update Failed Validation
#  Scenario: User Failed attempt to update status due to validation issues
#    Given I sets a valid PUT endpoint Update status failed validation all data from balance disbursement
#    When I send a PUT HTTP request with invalid data validation to Update status of Balance Disbursement
#    Then I receive an HTTP response code 400 due to invalid request format
#
#  # [Positive] GET - Get By ID Success
#  Scenario: User Retrieve All Balance Withdraw data by ID using a valid endpoint
#    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID
#    When I send a GET HTTP request with a valid ID for All Balance Withdraw
#    Then I receive a valid GET HTTP response with a status code of 200 for the All Balance Withdraw data by ID
#
#  # [Negative] GET - Get By ID Not Found
#  Scenario: User Retrieve All Balance Withdraw data by ID but not found
#    Given I sets a valid GET endpoint for retrieving All Balance Withdraw data by ID Not found
#    When I send a GET HTTP request with an invalid ID for All Balance Withdraw
#    Then I receive a GET HTTP response with a status code of 400 for the All Balance Withdraw data by ID
