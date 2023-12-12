Feature: Create a New Articles Category
  As a user
  I want to create a new articles category
  So that I can interact with the API

  # [Positive] POST - Success Create
  Scenario: I creating a new articles category with a valid endpoint
    Given I set a POST request to a valid endpoint for creating a new articles category
    When I send the POST request to create a new articles category
    Then I receive an HTTP response with code 201 for creating a new articles category

  # [Negative] POST - Input Error
  Scenario: I Attempting to create a new article category with invalid input
    Given I set a POST request with invalid input for creating a new articles category
    When I send the POST request with invalid input for creating a new articles category
    Then I receive an HTTP response with code 400 for creating a new articles category
