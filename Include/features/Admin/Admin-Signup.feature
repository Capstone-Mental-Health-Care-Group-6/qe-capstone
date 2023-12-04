@SignUp
Feature: User Sign-Up
  As a user
  I want to sign up
  So I can access the platform

  @Valid-data
  Scenario Outline: Successful User Sign-Up
    Given I am on the sign-up page
    When I enter valid credentials like <name>, <email>, and <password>
    And I click the Sign Up button
    Then I should be redirected to the dashboard

    Examples: 
      | name  | email              | password   |
      | admin | admin123@gmail.com | admin12345 |

	@Invalid-data
  Scenario Outline: Unsuccessful User Sign-Up
    Given I am on the sign-up page
    When I enter <name>, <email>, and <password>
    And I click the Sign Up button
    Then I should see an error message <error_message>

    Examples: 
      | name  | email              | password   | error_message             |
      |       | admin123@gmail.com | admin12345 | Please enter a name       |
      | admin |                    | admin12345 | Please enter an email     |
      | admin | admin123@gmail.com |            | Please enter a password   |
      |       |                    |            | Please fill in all fields |
      | admin | (2 spaces)         | admin12345 | Invalid email format      |
      | admin | admin@gmail.com    | (2 spaces) | Password cannot be blank  |

	@Registration-button
  Scenario: Verify Registration Button
    Given I am on the Emphati Care sign-up page
    When I click the Register button
    Then I should be successfully navigated to the dashboard
	
	@Login-link
  Scenario: Verify Login Link
    Given I am on the Emphati Care sign-up page
    When I click the Login link
    Then I should be directed to the login page
