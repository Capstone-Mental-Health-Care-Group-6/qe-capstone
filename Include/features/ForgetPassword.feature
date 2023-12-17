@ForgetPassword
Feature: Forget Password Process
  As a user
  I want to reset my password when forgotten
  So I can regain access to my account

  @VerifyLink
  Scenario: User verify Forget Password link
    Given User is on the login page
    When User enters the email and password
    And User clicks on the Forget Password link
    Then User navigates to the forgot password page

  @VerifyOTP
  Scenario Outline: User verify OTP via email
    Given User is on the Forgot Password page
    When User enters the registered email
    And User confirms the email
    Then User receives an email with OTP code
    
    Examples: 
      | email             |
      | user1@example.com |

  @ResetPassword
  Scenario Outline: User resets password
    Given User is on the Forgot Password page
    When User enters the email <email>
    And User confirms the email
    Then User receives an email with OTP code <OTP>

    Examples: 
      | email             | OTP        |
      | user1@example.com | 1234567890 |
      | user2@example.com | 0987654321 |
      
  @ValidateNewPassword
  Scenario Outline: User validates the process of creating a new password
    Given User is already on the Create a New Password page
    When User fills the new password and confirms with <password> and <confirm_password>
    And User clicks the Confirm Password button
    Then User receives a notification that the password has been successfully updated and logs in

    Examples:
      | password    | confirm_password |
      | user12345   | user12345        |
  

  @verifyOkbutton
  Scenario: User verify Ok button after password update
    Given User updates the password successfully
    When User confirms the updated password
    And User clicks the Ok button
    Then User navigates to the Login page
    
