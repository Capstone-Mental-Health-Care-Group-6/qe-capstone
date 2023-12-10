Feature: Doctor

  As a user
  I want to see Doctor's data
  So that I can manage Doctor's data

# [Positive] GET All Doctor
  Scenario: User retrieves all doctors successfully
    Given I set the GET endpoint for retrieving all doctors
    When I send an HTTP GET request with a valid baseURL for get all doctors
    Then I receive a valid data response for get all doctors with HTTP status code 200 OK

# [Positive] GET Doctor By ID
  Scenario: User retrieves a doctor by ID successfully
    Given I set the GET endpoint for retrieving a doctor by ID
    When I send an HTTP GET request with a valid ID and baseURL
    Then I receive a valid data response for get doctor by ID with HTTP status code 200 OK

# [Positive] POST Register Doctor
  Scenario: User registers a doctor successfully
    Given I set the POST endpoint for registering a doctor
    When I send an HTTP POST request with a valid baseURL and body parameters
    Then I receive a valid data response for registering a doctor with HTTP status code 200 OK

# [Positive] GET Search Doctor by Name
  Scenario: User searches for a doctor by name successfully
    Given I set the GET endpoint for searching a doctor by name
    When I send an HTTP GET request with a valid name parameter and baseURL
    Then I receive a valid data response for searching a doctor by name with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Datapokok By Doctor ID
  Scenario: User edits doctor datapokok by ID successfully
    Given I set the PUT endpoint for editing doctor datapokok by ID
    When I send an HTTP PUT request with a valid ID and baseURL for editing doctor datapokok by ID
    Then I receive a valid data response for editing doctor datapokok by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Workdays By Doctor ID
  Scenario: User edits doctor workdays by ID successfully
    Given I set the PUT endpoint for editing doctor workdays by ID
    When I send an HTTP PUT request with a valid ID, workdays data, and baseURL
    Then I receive a valid data response for editing doctor workdays by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Education By Doctor ID
  Scenario: User edits doctor education by ID successfully
    Given I set the PUT endpoint for editing doctor education by ID
    When I send an HTTP PUT request with a valid ID, education data, and baseURL
    Then I receive a valid data response for editing doctor education by ID with HTTP status code 200 OK

# [Positive] PUT Edit Doctor Experience By Doctor ID
  Scenario: User edits doctor experience by ID successfully
    Given I set the PUT endpoint for editing doctor experience by ID
    When I send an HTTP PUT request with a valid ID, experience data, and baseURL
    Then I receive a valid data response for editing doctor experience by ID with HTTP status code 200 OK

# [Negative] GET All Doctor Invalid Endpoint
  Scenario: User fails to retrieve all doctors with an invalid endpoint
    Given I set the GET endpoint for retrieving all doctors with an invalid endpoint
    When I send an HTTP GET request for retrieving all doctors with an invalid endpoint
    Then I receive a valid data response for invalid endpoint retrieving all doctors with HTTP status code 404 Not Found

# [Negative] GET Doctor By ID Invalid Endpoint
  Scenario: User fails to retrieve a doctor by ID with an invalid endpoint
    Given I set the GET endpoint for retrieving a doctor by ID with an invalid endpoint
    When I send an HTTP GET request for retrieving a doctor by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint retrieving a doctor by ID with HTTP status code 404 Not Found

# [Negative] POST Register Doctor Invalid Endpoint
  Scenario: User fails to register a doctor with an invalid endpoint
    Given I set the POST endpoint for registering a doctor with an invalid endpoint
    When I send an HTTP POST request for registering a doctor with an invalid endpoint
    Then I receive a valid data response for invalid endpoint registering a doctor with HTTP status code 404 Not Found

# [Negative] GET Search Doctor by Name Invalid Endpoint
  Scenario: User fails to search for a doctor by name with an invalid endpoint
    Given I set the GET endpoint for searching a doctor by name with an invalid endpoint
    When I send an HTTP GET request for searching a doctor by name with an invalid endpoint
    Then I receive a valid data response for invalid endpoint searching a doctor by name with HTTP status code 404 Not Found

# [Negative] PUT Edit Doctor Datapokok By Doctor ID Invalid Endpoint
  Scenario: User fails to edit doctor datapokok by ID with an invalid endpoint
    Given I set the PUT endpoint for editing doctor datapokok by ID with an invalid endpoint
    When I send an HTTP PUT request for editing doctor datapokok by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint editing doctor datapokok by ID with HTTP status code 404 Not Found

# [Negative] PUT Edit Doctor Workdays By Doctor ID Invalid Endpoint
  Scenario: User fails to edit doctor workdays by ID with an invalid endpoint
    Given I set the PUT endpoint for editing doctor workdays by ID with an invalid endpoint
    When I send an HTTP PUT request for editing doctor workdays by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint editing doctor workdays by ID with HTTP status code 404 Not Found

# [Negative] PUT Edit Doctor Education By Doctor ID Invalid Endpoint
  Scenario: User fails to edit doctor education by ID with an invalid endpoint
    Given I set the PUT endpoint for editing doctor education by ID with an invalid endpoint
    When I send an HTTP PUT request for editing doctor education by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint editing doctor education by ID with HTTP status code 404 Not Found

# [Negative] PUT Edit Doctor Experience By Doctor ID Invalid Endpoint
  Scenario: User fails to edit doctor experience by ID with an invalid endpoint
    Given I set the PUT endpoint for editing doctor experience by ID with an invalid endpoint
    When I send an HTTP PUT request for editing doctor experience by ID with an invalid endpoint
    Then I receive a valid data response for invalid endpoint editing doctor experience by ID with HTTP status code 404 Not Found