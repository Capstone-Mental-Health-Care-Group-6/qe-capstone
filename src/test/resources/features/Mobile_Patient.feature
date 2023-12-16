Feature: Patient

  As a user
  I want to see Patient's data
  So that I can manage Patient's  data

  # [Positive] GET All Patient
  Scenario: User succes Get and See All Patient
    Given I set the GET endpoint for Get all patient
    When I send an HTTP GET request with a valid baseURL for get all patient
    Then I receive a response status 200 OK get all patient

  # [Positive] GET All Patient Empty Data
  Scenario: User succes Get and See All Patient
    Given I set the GET endpoint for Get all patient Empty Data
    When I send an HTTP GET request with a valid baseURL for get all patient empty data
    Then I receive a response status 200 OK empty data patient

#  # [Negative] GET All Patient Error JWT
#  Scenario: User Get All Patient Error jwt invalid
#    Given I set the GET endpoint for Get all patient
#    When I send an HTTP GET request with a valid baseURL for get all patient
#    And  I sets Invalid JWT
#    Then I receive a response status 401 Unauthorized

#  # [Negative] GET All Patient Invalid Endpoint
#  Scenario: User Get All Patient Invalid Endpoint
#    Given I set the GET Invalid endpoint for Get all patient
#    When I send an HTTP GET request with a invalid baseURL for get all patient
#    Then I receive a response status 404 Not Found gwt all patient invalid endpoint
#
  # [Positive] GET Patient By ID
  Scenario: User succes Get and See Patient By ID
    Given I set the GET endpoint for Patient By ID
    When I send an HTTP GET request with a valid baseURL for get patient by ID
    Then I receive a response status 200 OK get patient by ID
#
#    # [Negative] GET Patient By ID Error JWT
#  Scenario: User succes Get and See Patient By ID Empty Data
#    Given I set the GET endpoint for Patient By ID
#    When I send an HTTP GET request with a valid baseURL for get patient by ID
#    And  I sets Invalid JWT
#    Then I receive a response status 401 Unauthorized
#
#    # [Negative] GET Patient By ID Invalid Endpoint
#  Scenario: User Get Patient by ID Invalid Endpoint
#    Given I set the GET Invalid endpoint for Patient By ID
#    When I send an HTTP GET request with a valid baseURL for get all patient
#    Then I receive a response status 404 Not Found
