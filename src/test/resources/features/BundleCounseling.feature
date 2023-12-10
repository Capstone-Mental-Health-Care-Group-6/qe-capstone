Feature: Bundle Counseling

  As a user
  I want to manage Bundle Counseling
  So that I can manage to Counseling

  # [Positive] GET - Get All Bundle
  Scenario: User retrieves Get All Bundle successfully
    Given I set the GET endpoint for retrieving Get All Bundle
    When I send an HTTP GET request Get All Bundle Counseling
    Then I receive a valid data response for Get All Bundle with HTTP status code 200 OK

  # [Negative] GET - Data Empty Bundle
  Scenario: User retrieves Data Empty Bundle successfully
    Given I set the GET endpoint for retrieving Data Empty Bundle
    When I send an HTTP GET request Data Empty Bundle
    Then I receive a valid data response for Data Empty Bundle with HTTP status code 200 OK

  # [Negative] GET - Bundle Invalid Endpoint
  Scenario: User fails to retrieve Bundle Invalid Endpoint
    Given I set the GET endpoint for retrieving Bundle Invalid Endpoint
    When I send an HTTP GET request Bundle Invalid Endpoint
    Then I receive a valid data response for Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] POST - Create Bundle
  Scenario: User successfully creates a bundle
    Given I set the POST endpoint for creating a bundle
    When I send an HTTP POST request Create Bundle
    Then I receive a valid data response for Create Bundle with HTTP status code 201 Created

  # [Negative] POST - Create Bundle Validation Error
  Scenario: User fails to create a bundle due to validation errors
    Given I set the POST endpoint for Create Bundle Validation Error
    When I send an HTTP POST request with invalid data for Create Bundle Validation Error
    Then I receive a valid data response for Create Bundle Validation Error with HTTP status code 400 Bad Request

  # [Negative] POST - Create Bundle Validation File Error
  Scenario: User fails to create a bundle due to file validation error
    Given I set the POST endpoint for Create Bundle Validation File Error
    When I send an HTTP POST request with invalid file type for Create Bundle Validation File Error
    Then I receive a valid data response for Create Bundle Validation File Error with HTTP status code 404 Not Found

    # [Negative] POST - Create Bundle Validation File Invalid Type
  Scenario: User fails to create a bundle due to invalid file type
    Given I set the POST endpoint for Create Bundle Validation File Invalid Type
    When I send an HTTP POST request with a file of invalid type for Create Bundle Validation File Invalid Type
    Then I receive a valid data response for Create Bundle Validation File Invalid Type with HTTP status code 400 Bad Request

# [Negative] POST - Create Bundle Validation File Size Error
  Scenario: User fails to create a bundle due to file size error
    Given I set the POST endpoint for Create Bundle Validation File Size Error
    When I send an HTTP POST request with a file exceeding size limit for Create Bundle Validation File Size Error
    Then I receive a valid data response for Create Bundle Validation File Size Error with HTTP status code 400 Bad Request

# [Negative] POST - Create Bundle Invalid Endpoint
  Scenario: User fails to create a bundle with an invalid endpoint
    Given I set the POST endpoint for creating a bundle with an invalid endpoint
    When I send an HTTP POST request for Create Bundle Invalid Endpoint
    Then I receive a valid data response for Create Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] GET - Get By ID
  Scenario: User retrieves a bundle by ID successfully
    Given I set the GET endpoint for retrieving a bundle by ID
    When I send an HTTP GET request with a valid ID
    Then I receive a valid data response with HTTP status code 200 OK

  # [Negative] GET - Get By ID Invalid ID
  Scenario: User fails to retrieve a bundle with an Get By ID Invalid ID
    Given I set the GET endpoint for retrieving a bundle Get By ID Invalid ID
    When I send an HTTP GET request with an Get By ID Invalid ID
    Then I receive a valid data response for Get By ID Invalid ID with HTTP status code 400 Bad Request

  #  GET - Get By ID Data Not Found
  Scenario: User fails to retrieve a bundle with an Get By ID Data Not Found
    Given I set the GET endpoint for retrieving a bundle Get By ID Data Not Found
    When I send an HTTP GET request with an Get By ID Data Not Found
    Then I receive a valid data response for get Get By ID Data Not Found with HTTP status code 400 Bad Request

  #  GET - Get By ID Invalid Endpoint
  Scenario: User fails to retrieve a bundle with an Get By ID Invalid Endpoint
    Given I set the GET endpoint for retrieving a bundle Get By ID Invalid Endpoint
    When I send an HTTP GET request with an Get By ID Invalid Endpoint
    Then I receive a valid data response for Get By ID Invalid Endpoint with HTTP status code 400 Bad Request

  # [Positive] PUT - Update Bundle Success With File Update
  Scenario: User successfully updates a bundle With File Update
    Given I set the PUT endpoint for updating a bundle With File Update
    When I send an HTTP PUT request with valid data for Update Bundle Success With File Update
    Then I receive a valid data response for Update Bundle Success With File Update with HTTP status code 200 OK

  # [Positive] PUT - Update Bundle Success But File Not Update
  Scenario: User successfully updates a bundle But File Not Update
    Given I set the PUT endpoint for updating a bundle With File Update
    When I send an HTTP PUT request with valid data for Update Bundle Success But File Not Update
    Then I receive a valid data response for Update Bundle Success But File Not Update with HTTP status code 200 OK

  # [Negative] PUT - Update Bundle Validate Error
  Scenario: User fails to update a bundle due to validation errors
    Given I set the PUT endpoint for updating a bundle
    When I send an HTTP PUT request with invalid data
    Then I receive a valid data response with HTTP status code 400 Bad Request

  # [Negative] PUT - Update Bundle Server Error
  Scenario: User fails to update a bundle, resulting in a server error
    Given I set the PUT endpoint for Update Bundle Server Error
    When I send an HTTP PUT request with valid data for Update Bundle Server Error
    Then I receive a valid data response for Update Bundle Server Error with HTTP status code 500 Internal Server Error

# [Negative] PUT - Update Bundle Invalid Endpoint
  Scenario: User fails to update a bundle with an invalid endpoint
    Given I set the PUT endpoint for updating a bundle with an invalid endpoint
    When I send an HTTP PUT request for Update Bundle Invalid Endpoint
    Then I receive a valid data response for Update Bundle Invalid Endpoint with HTTP status code 404 Not Found

  # [Positive] DELETE - Delete Bundle
  Scenario: User successfully deletes a bundle
    Given I set the DELETE endpoint for deleting a bundle
    When I send an HTTP DELETE request with a valid ID
    Then I receive a valid data response with HTTP status code 200 OK

  # [Negative] DELETE - Delete Bundle Invalid ID
  Scenario: User fails to delete a bundle with an invalid ID
    Given I set the DELETE endpoint for deleting a bundle with an invalid ID
    When I send an HTTP DELETE request with an invalid ID
    Then I receive a valid data response for Delete Bundle Invalid ID with HTTP status code 400 Bad Request

  # [Negative] DELETE - Delete Bundle Invalid Endpoint
  Scenario: User fails to delete a bundle with an invalid endpoint
    Given I set the DELETE endpoint for deleting a bundle with an invalid endpoint
    When I send an HTTP DELETE request with an invalid endpoint
    Then I receive a valid data response for Delete Bundle Invalid Endpoint with HTTP status code 400 Bad Request

