Feature: GET - Articles Category by ID
  As a user
  I want to retrieve articles category their ID
  So that I can view specific articles category details

  Background:
    Given user set authentication endpoint
    And user send authentication endpoint

  # [Positive] GET - Success Get By ID
  Scenario: User get articles category by ID using valid endpoint
    When I sets a valid GET endpoint for articles category by ID
    And I sends a GET HTTP request with a valid endpoint for articles category by ID
    Then I receives a valid GET HTTP response with a status code of 200 for articles category by ID

  # [Negative] GET - Invalid User Input
  Scenario: User get articles category by ID using invalid user input
    When I sets an valid GET endpoint for articles category by ID
    And I sends a GET HTTP request with an invalid user input for articles category by ID
    Then I receives a GET HTTP response with a status code of 400 for articles category by ID
