@Signup
Feature: User Signup Scenarios
  As a user
  I want to signup
  So I can access the platform

  #Include:
  #User Signup with Invalid/Empty Credentials
  #User verify the function of the eye icon inside password input field
  #User verify button Registered on the login page
  @Positive-Valid
  Scenario Outline: User Signup with Valid Credentials
    Given User opens the Sign Up login page
    When User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User clicks eye icon in password field
    And User fills <confirmPassword> in confirm password field
    And User clicks eye icon in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then User goes directly to the token page and filling profile page

    Examples: 
      | email            | password | confirmPassword |
      |                  |          |                 |
      | user@gmail.com   |          | user123         |
      | user@gmail.com   | user123  |                 |
      | user@gmail.com   | user123  | user12345       |
      | laras1@gmail.com | laras1%A | laras1%A        |

  @ProfileFilling
  Scenario Outline: User verifies profile filling
    Given I want to profile filling after register
    When I fills <fullname> in fullname field and click next button
    And I fill <no phone> in no phone field and click next button
    And I fill bithday in birthday field and click next button
    And I click the gender button and click next button
    And I click ok for succesfully profile filling
    Then I should be logged in to the login page

    Examples: 
      | fullname       | no phone      |
      | Laras maharani | 0895801067847 |

  @Positive-FunctionLogin
  Scenario: User verify the function of the Login link
    Given User open the Sign Up login page
    When User clicks login link
    Then Users go directly to the Login page

  @Positive-FunctionTermsAndConditions
  Scenario: User verify the function of the Terms and Conditions link
    Given User open the Sign Up login page
    When User clicks Terms and Conditions link
    Then Users go directly to the Terms and Conditions page
