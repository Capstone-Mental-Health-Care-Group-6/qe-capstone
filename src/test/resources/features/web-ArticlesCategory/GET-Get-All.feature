Feature: Get All Articles Category
  As a user
  I want to retrieve articles categories
  So that I can view all article categories

  # [Positive] GET - Success Get All
  Scenario: Retrieving all articles categories with a valid endpoint
    Given I set authentication endpoint to retrieve article categories
    When I send an HTTP GET request to fetch articles categories using a valid endpoint
    Then I should receive a valid HTTP response with status code 200 for articles categories
