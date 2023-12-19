@Signup
Feature: User Signup Scenarios
  As a user
  I want to signup
  So I can access the platform

  @Positive-Valid
  Scenario Outline: User Signup with Valid Credentials
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then User goes directly to the token page and filling profile page

    Examples: 
      | email          | password | confirmPassword |
      | user@gmail.com | user123  | user123         |

  @Negative-Invalid
  Scenario Outline: User Signup with Invalid/Empty Credentials
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then User shows error messages and user failed to navigate into filling profile page

    Examples: 
      | email          | password | confirmPassword |
      |                |          |                 |
      | user@gmail.com |          | user123         |
      | user@gmail.com | user123  |                 |
      | user@gmail.com | user123  | user12345       |

  @Positive-FunctionEyeIcon
  Scenario Outline: User verify the function of the eye icon inside password input field
    Given User is not registered previously
    When User opens the Sign Up login page
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User clicks eye icon
    Then User displays the password

    Examples: 
      | email          | password | confirmPassword |
      | user@gmail.com | user123  | user123         |

  @Positive-buttonRegistered
  Scenario: User verify button Registered on the login page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    Then Users go directly to the token page

  @Positive-FunctionResend
  Scenario: User verify the resend link on the token page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    And User fills token
    And User clicks resend link
    Then User successfully received the token code

  @Positive-buttonVerifications
  Scenario: User verify button verification on the login page
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks the registered link
    And User fills <email> in email field
    And User fills <password> in password field
    And User fills <confirmPassword> in confirm password field
    And User ticks the checkbox terms and Conditions
    And User clicks register button
    And User fills token
    And User clicks verification button
    Then User goes directly to filling profile page

  @ProfileFilling
  Scenario Outline: User verifies profile filling
    Given User is not registered previously
    When User opens the Sign Up login page
    And User fills "<full name>" in full name field
    And User clicks next button
    And User fills "<phone number>" in phone number field
    And User clicks next button
    And User clicks "<calendar>" for the calendar icon
    And User clicks next button
    And User clicks "<male>" in the gender button
    And User clicks "<female>" in the gender button
    And User clicks finish button
    And User clicks "Ok" in the profile filling notification button
    Then User goes directly to the login page

    Examples: 
      | full name            | phone number  | calendar | male    | female  |
      | Helen Dharani Jiffri | 0895192865783 | clicked  | clicked | clicked |

  @Positive-FunctionLogin
  Scenario: User verify the function of the Login link
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks login link
    Then Users go directly to the Login page

  @Positive-FunctionTermsAndConditions
  Scenario: User verify the function of the Terms and Conditions link
    Given User is not registered previously
    When User opens the Sign Up login page
    And User clicks Terms and Conditions link
    Then Users go directly to the Terms and Conditions page
