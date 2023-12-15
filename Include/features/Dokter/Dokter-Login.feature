@LoginPageDokter
Feature: Login
  As a user
  I want to login with my registered account
  So that I can manage my account

  @Positive-Login
  Scenario Outline: Login with valid data
    Given I navigate to login page
    When I input <email> and <password>
    Then I click login button
    And I navigate to dashboard

    Examples: 
      | email             | password |
      | Doctor6@gmail.com | password |

  @Negative-input-invalid
  Scenario Outline: Login with invalid data
    Given I navigate to login page
    When I input <email> and <password>
    Then I click login button
    And Error message showed

    Examples: 
      | email             | password |
      | Doctor6@gmail.com | xxx      |
      | lalala            | password |
      | lalala            | xxx      |

  @Negative-input-blank
  Scenario Outline: Login with blank data
    Given I navigate to login page
    When I input <email> and <password>
    Then I click login button
    And Error message showed

    Examples: 
      | email             | password |
      |                   | password |
      | Doctor6@gmail.com |          |

  @Positive-by-google
  Scenario: Login with Google account
    Given I navigate to login page
    When I click button login by Google
    Then I navigate to choose my Google account

  @Positive-Forgot-Password
  Scenario: Forgot Password
    Given I navigate to login page
    When I click button forgot password
    Then I navigate to reset password page

  @Positive-Verify-RegistButton
  Scenario: Verify Regist
    Given I navigate to login page
    When I click button regist
    Then I navigate to regist page
