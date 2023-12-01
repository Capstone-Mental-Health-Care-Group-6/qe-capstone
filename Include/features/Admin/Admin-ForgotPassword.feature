@ForgotPassword
Feature: Forgot Password
  As a user
  I want to change my password account
  So that I have a new password

  Scenario: Password Reset for User Login
    Given I am on the login page
    When I click on the Forgot Password link
    And I input email
    And I click the Send Verification Link button
    And I input new password
    Then I should receive a verification email
