@ForgetPassword
Feature: Forget Password Process
  As a user
  I want to reset my password when forgotten
  So I can regain access to my account

  #include verify link, verify otp, validate new pw, OK button
  @ForgotPassword
  Scenario Outline: User forgot password
    Given User is on the Forgot Password page
    When I input the valid <email>
    And I input valid code <OTP>
    And I input valid new password <confirm_password> and <confirm_password_verify>
    Then I should have successfully created a new password

    Examples: 
      | email             | OTP  | confirm_password | confirm_password_verify |
      | laras@example.com | 1221 | laras2           | laras2                  |
