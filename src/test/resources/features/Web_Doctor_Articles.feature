Feature: Manage Doctor Articles
  As a user
  I want to view all doctor articles
  So that I can view all doctor article

  # [Positive] POST - Success Create Article Doctor
  Scenario: User creating a new articles doctor with a valid endpoint
    Given I set a POST request to a valid endpoint for creating a new articles doctor
    When I send the POST request to create a new articles doctor
    Then I receive an HTTP response with code 201 for creating a new articles doctor

  # [Negative] POST - Error Invalid User Input Thumbnail
  Scenario: I Attempting to create a new articles doctor with invalid input thumbnail
    Given I set a POST request with invalid input for creating a new articles doctor
    When I send the POST request with invalid input thumbnail for creating a new articles doctor
    Then I receive an HTTP response with code 400 for creating a invalid input thumbnail

  # [Negative] POST - Invalid User Input
  Scenario: I Attempting to create a new articles doctor with invalid input
    Given I set a POST request with invalid user input for creating a new articles doctor
    When I send the POST request with invalid user input for creating a new articles doctor
    Then I receive an HTTP response with code 400 for creating a invalid user input

  # [Positive] PUT - Success Update Article Doctor
  Scenario: User Update cart Product with Valid Endpoint
    Given I set a valid PUT endpoint Update articles doctor
    When I sends a PUT HTTP request Update articles doctor
    Then I receives an HTTP response code 200 with valid endpoint for update articles doctor

  # [Negative] PUT - Invalid Param ID
  Scenario: User Update User with Invalid Endpoint
    Given I set an valid PUT endpoint Update articles doctor with an invalid param ID
    When I sends a PUT HTTP request Update articles doctor with an invalid param ID
    Then I receives an HTTP response code 400 with invalid param ID for articles doctor

  # [Negative] PUT - Invalid User Input Thumbnail
  Scenario: User Update User with invalid user input thumbnail
    Given I set an valid PUT endpoint Update articles doctor with an invalid user input thumbnail
    When I sends a PUT HTTP request Update Articles Category with an invalid user input thumbnail
    Then I receives an HTTP response code 400 with invalid user input thumbnail

  # [Positive] GET - Get Data Articles By Doctor
  Scenario: User Retrieving all articles doctor with a valid endpoint
    Given I set authentication endpoint to retrieve articles doctor
    When I send an HTTP GET request to fetch articles doctor using a valid endpoint
    Then I should receive a valid HTTP response with status code 200 for articles doctor
