Feature: User Balance Disbursement Management
  As a user
  I want to view all withdrawal balance data
  So that I can withdraw funds


  # [Positive] GET - Get All Data Withdraw
  Scenario: User Retrieving all data withdraw balance doctor
    Given I set endpoit for get all withdraw balance
    When I send an HTTP GET request with a valid baseURL for get all witdraw
    Then I receive a response status code 200 OK get all withdraw balance

  # [Positive] POST - Post Add Withdraw
  Scenario: User added withdraw for withdraw funds
    Given I set endpoit for post withdraw balance
    When I send an HTTP POST request with a valid baseURL and bodyparameter
    Then I receive a response status code 201 Created post withdraw balance

#  # [Negative] POST - Post Balance not enough
#  Scenario: User Updating status to Pending for Withdraw Balance Disbursement
#    Given I set endpoit for Updating status to Pending post withdraw balance
#    When I send an HTTP POST request with a valid baseURL and bodyparameter for Updating status to Pending
#    Then I receive an HTTP response status code 500 Internal Server Error

  # [Negative] POST - Post invalid endpoint
  Scenario: User added withdraw with invalid endpoint
    Given I set invalid endpoit for post withdraw balance
    When I send an HTTP POST request with a invalid baseURL for added withdraw
    Then I receive an HTTP response code 404 Not Found Post invalid endpoint added withdraw

