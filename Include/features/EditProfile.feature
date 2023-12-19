@EditProfile
Feature: Edit Profile
  As a user
  I want to access my accout
  So I can manage my account profile

  # [Positive] User Edits Profile
  Scenario: Edit Profile Page Actions
    Given on Edit Profile Page
    When select Edit Profile
    Then receive successful data change notification

  # [Positive] User Changes Password
  Scenario: Change Password
    Given on Edit Profile Page
    When select Change Password
    Then receive successful password change notification

  # [Positive] User Views About Us
  Scenario: View About Us
    Given on Edit Profile Page
    When I select About Us
    Then I navigate to the correct page

  # [Positive] User Views Privacy
  Scenario: View Privacy
    Given on Edit Profile Page
    When I select Privacy
    Then I navigate to the correct page

  # [Positive] User Views Terms and Conditions
  Scenario: View Terms and Conditions
    Given on Edit Profile Page
    When I select Terms and Conditions
    Then I navigate to the correct page

  # [Positive] User Logs Out
  # cancel logout
  Scenario: Logout
    Given on Edit Profile Page
    When I select Logout
    Then I navigate to the correct page

  # [Positive] User Deletes Account
  #Cancels
  Scenario: Delete Account
    Given on Edit Profile Page
    When I select Delete Account
    Then I navigate to the correct page
