Feature: DELETE - Articles Category
  As a user
  I want to view a list of Articles Categories
  So that I can delete an Articles Category

  # [Positive] DEL - Delete Success
  Scenario: User Deleting an Articles Category with a valid endpoint
    Given I set the DELETE endpoint to a valid endpoint
    When I send a DELETE HTTP request with a valid endpoint
    Then I receive a DELETE HTTP response with a status code of 200 for the valid endpoint

  # [Negative] DEL - Delete Invalid Param ID
  Scenario: User Deleting an Articles Category with an Invalid Param ID
    Given I set the DELETE endpoint to an Invalid Param ID
    When I send a DELETE HTTP request with an invalid param ID
    Then I receive a DELETE HTTP response with a status code of 404 for the invalid param ID
