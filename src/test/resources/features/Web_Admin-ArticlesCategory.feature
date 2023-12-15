#Feature: Get All Articles Category
#  As a user
#  I want to view all articles categories
#  So that I can view all article categories
#
#  # [Positive] GET - Success Get All
#  Scenario: User Retrieving all articles categories with a valid endpoint
#    Given I set authentication endpoint to retrieve article categories
#    When I send an HTTP GET request to fetch articles categories using a valid endpoint
#    Then I should receive a valid HTTP response with status code 200 for articles categories
#
#  # [Positive] POST - Success Create
#  Scenario: I creating a new articles category with a valid endpoint
#    Given I set a POST request to a valid endpoint for creating a new articles category
#    When I send the POST request to create a new articles category
#    Then I receive an HTTP response with code 201 for creating a new articles category
#
#  # [Negative] POST - Input Error
#  Scenario: I Attempting to create a new article category with invalid input
#    Given I set a POST request with invalid input for creating a new articles category
#    When I send the POST request with invalid input for creating a new articles category
#    Then I receive an HTTP response with code 400 for creating a new articles category
#
#  # [Positive] GET - Success Get By ID
#  Scenario: User get articles category by ID using valid endpoint
#    Given I set a valid GET endpoint for articles category by ID
#    When I sends a GET HTTP request with a valid endpoint for articles category by ID
#    Then I receives a valid GET HTTP response with a status code of 200 for articles category by ID
#
#  # [Negative] GET - Invalid User Input
#  Scenario: User get articles category by ID using invalid user input
#    Given I set an valid GET endpoint for articles category by ID
#    When I sends a GET HTTP request with an invalid user input for articles category by ID
#    Then I receives a GET HTTP response with a status code of 400 for articles category by ID
#
#  # [Positive] PUT - Success Update
#  Scenario: User Update cart Product with Valid Endpoint
#    Given I set a valid PUT endpoint Update Articles Category
#    When I sends a PUT HTTP request Update Articles Category
#    Then I receives an HTTP response code 200 with valid endpoint
#
#  # [Negative] PUT - Invalid Param ID
#  Scenario: User Update User with Invalid Endpoint
#    Given I set an valid PUT endpoint Update Articles Category with an invalid param ID
#    When I sends a PUT HTTP request Update Articles Category with an invalid param ID
#    Then I receives an HTTP response code 400 with invalid param ID
#
#  # [Negative] PUT - Invalid User Input
#  Scenario: User Update User with invalid user input
#    Given I set an valid PUT endpoint Update Articles Category with an invalid user input
#    When I sends a PUT HTTP request Update Articles Category with an invalid user input
#    Then I receives an HTTP response code 400 with invalid user input
#
#  # [Positive] DEL - Delete Success
#  Scenario: User Deleting an Articles Category with a valid endpoint
#    Given I set the DELETE endpoint to a valid endpoint
#    When I send a DELETE HTTP request with a valid endpoint
#    Then I receive a DELETE HTTP response with a status code of 200 for the valid endpoint
#
#  # [Negative] DEL - Delete Invalid Param ID
#  Scenario: User Deleting an Articles Category with an Invalid Param ID
#    Given I set the DELETE endpoint to an Invalid Param ID
#    When I send a DELETE HTTP request with an invalid param ID
#    Then I receive a DELETE HTTP response with a status code of 404 for the invalid param ID
