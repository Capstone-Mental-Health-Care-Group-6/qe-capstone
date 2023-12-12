Feature: PUT - Update Articles Category
  As a user,
  I want to Update Articles Category,
  So that I can modify Articles Category information.

  # [Positive] PUT - Success Update
  Scenario: User Update cart Product with Valid Endpoint
    Given I sets a valid PUT endpoint Update Articles Category
    When I sends a PUT HTTP request Update Articles Category
    Then I receives an HTTP response code 200 with valid endpoint

  # [Negative] PUT - Invalid Param ID
  Scenario: User Update User with Invalid Endpoint
    Given I sets an valid PUT endpoint Update Articles Category
    When I sends a PUT HTTP request Update Articles Category with an invalid param ID
    Then I receives an HTTP response code 400 with invalid param ID

  # [Negative] PUT - Invalid User Input
  Scenario: User Update User with invalid user input
    Given I sets an valid PUT endpoint Update Articles Category
    When I sends a PUT HTTP request Update Articles Category with an invalid user input
    Then I receives an HTTP response code 400 with invalid user input
