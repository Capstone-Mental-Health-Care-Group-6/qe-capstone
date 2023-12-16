#Feature: MidtransTrasaction
#
#  As a user
#  I want to use Transaction feature
#
#  # [Positive] POST - Make Transaction Gopay
#  Scenario: User makes transaction Gopay
#    Given I set the POST endpoint for making Gopay Transaction
#    When I send an HTTP POST request with a valid parameters and baseURL for making a midtrans transaction
#    Then I receive a response status 201 Created for making midtrans transaction Gopay
#
#     # [Positive] POST - Make Transaction Qris
#  Scenario: User makes transaction Gopay
#    Given I set the POST endpoint for making Qris Transaction
#    When I send an HTTP POST request with a valid parameters and baseURL for making a midtrans transaction
#    Then I receive a response status 201 Created for making midtrans transaction Qris
#
#  # [Positive] GET - Get All Transactions from User ID
#  Scenario: User succes Get and See All Transaction by ID
#    Given I set the GET endpoint for get all transaction by ID
#    When I send an HTTP GET request with a valid baseURL for get all transaction by ID
#    Then I receive a response status 200 OK by get all transaction by ID
#
#    # [Positive] GET - Get Filtered By Payment Type Transactions from User ID
#  Scenario: User succes Get filtered data by payment type from user ID
#    Given I set the GET endpoint for get filtered data by payment type from user ID
#    When I send an HTTP GET request with a valid baseURL for get filtered data by payment type from user ID
#    Then I receive a response status 200 OK by get filtered data by payment type from user ID
#
#   # [Positive] GET - Get All Transactions
#  Scenario: User succes Get All Transaction
#    Given I set the GET endpoint for get all transaction
#    When I send an HTTP GET request with a valid baseURL for get all transaction
#    Then I receive a response status 200 OK by get all transaction
#
# # [Negative]  GET - Get invalid Endpoint Transaction
#  Scenario: User Get Invalid Endpoint Transaction
#    Given I set the Get Invalid Endpoint Transaction
#    When I send an HTTP GET request with a invalid baseURL for Get Invalid Endpoint Transaction
#    Then I receive a response status 404 Not Found by Get Invalid Endpoint Transaction
#
