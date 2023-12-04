@LoginPageDokter
Feature: Login
  As a user
  I want to login with my registered account
  So that I can manage my account

  @Positive
  Scenario Outline: Login with valid data
    Given I navigate to login page
    When I input <username> and <password>
    Then I click login button

    Examples: 
      | username         | password |
      | dokter@gmail.com | pw123    |

  @Positive-by-google
  Scenario: Login with Google account
    Given I navigate to login page
    When I click button login by Google
    Then I navigate to dashboard

  @Negative-input-invalid
  Scenario Outline: Login with invalid data
    Given I navigate to login page
    When I input <username> and <password>
    Then I click login button
    And Error message showed

    Examples: 
      | username         | password |
      | dokter@gmail.com | xxx      |
      | lalala           | pw123    |
      | la123            | xxx      |

  @Negative-input-blank
  Scenario Outline: Login with blank data
    Given I navigate to login page
    When I input <username> and <password>
    Then I click login button
    And Error message showed

    Examples: 
      | username         | password |
      |                  | pw123    |
      | dokter@gmail.com |          |
      |                  |          |
	#=====================FIX=====================
