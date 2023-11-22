Feature: Login
  As a user
  I want to login with my registered account

  @Positive
  Scenario Outline: Login with valid data
    Given I navigate to login page
    When I input <username> and <password>
    Then I click login button

    Examples: 
      | username                    | password |
      | larasatimaharanii@gmail.com | pw123    |

@Positive-by-google
  Scenario Outline: Login with Google account
    Given I navigate to login page
    When I click login by google button
    Then I redirect to dashboard

  @Negative-input-invalid
  Scenario Outline: Login with invalid data
    Given Navigate to altashop homepage
    When User navigate to login page
    And User input <username> and <password>
    And User click login button
    Then Error message showed

    Examples: 
      | username                    | password |
      | larasatimaharanii@gmail.com | xxx      |
      | lala                        | pw123    |
      | la123                       | xxx      |

  @Negative-input-blank
  Scenario Outline: Login with blank data
    Given Navigate to altashop homepage
    When User navigate to login page
    And User input <username> and <password>
    And User click login button
    Then Error message showed

    Examples: 
      | username                    | password |
      |                             | pw123    |
      | larasatimaharanii@gmail.com |          |
      |                             |          |
