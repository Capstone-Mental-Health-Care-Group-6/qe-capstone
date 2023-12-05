@Signup
Feature: User Signup Scenarios
  As a user
  I want to signup
  So I can access the platform

  @Positive
  Scenario Outline: User Signup with Valid Credentials
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then User goes directly to the token page and filling profile page

    Examples:
      | email           | password | confirmPassword |
      | user@gmail.com  | user123  | user123         |

  @Negative
  Scenario Outline: User Signup with Invalid/Empty Credentials
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then User shows error messages and user failed to navigate into filling profile page

    Examples:
      | email 				 | password | confirmPassword |
      |       				 |          | 	              |
      | user@gmail.com |          | user123 				|
      | user@gmail.com | user123  |      						|
      | user@gmail.com | user123  | user12345  			|

  @Positive
  Scenario Outline: User verify the function of the "eye icon" inside password input field
    Given User is not registered previously
    When User opens the Sign Up login page
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User clicks eye icon
    Then User displays the password

		Examples:
      | email           | password | confirmPassword |
      | user@gmail.com  | user123  | user123         |

  @Positive
  Scenario: User verify button "Registered" on the login page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then Users go directly to the token page

  @Positive
  Scenario: User verify the "resend" link on the token page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    And User fills token
    And User clicks resend link
    Then User successfully received the token code

  @Positive
  Scenario: User verify button "verification" on the login page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills "<email>" in email field
    And User fills "<password>" in password field
    And User fills "<confirmPassword>" in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    And User fills token
    And User clicks verification button
    Then User goes directly to filling profile page

  @Positive
  Scenario: User verify the function of the "Login" link
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks login link
    Then Users go directly to the Login page

  @Positive
  Scenario: User verify the function of the "Terms and Conditions" link
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks "Terms and Conditions" link
    Then Users go directly to the Terms and Conditions page
