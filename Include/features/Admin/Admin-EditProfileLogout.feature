@EditProfileLogout
Feature: Edit Profile and Logout
  I want to edit my profile and be able to log out
  So that I can manage my profile account

  #Include Closes Pop-up
  Scenario: User Edits Profile
    Given I am logged in
    When I edit my profile with valid information and close the success pop-up
    Then I should see a success message

  Scenario: User Edits Profile with Blank Name
    Given I am logged in
    When I edit my profile with a blank name
    Then I should see an error message

  Scenario: User Edits Profile with Blank Email
    Given I am logged in
    When I edit my profile with a blank email
    Then I should see an error message

  Scenario: User Edits Profile with Blank Old Password
    Given I am logged in
    When I edit my profile with a blank old password
    Then I should see an error message

  Scenario: User Edits Profile with Blank New Password
    Given I am logged in
    When I edit my profile with a blank new password
    Then I should see an error message

  #Scenario: User Closes Successfully Saved Data Pop-up
  #Given I am logged in
  #When I edit my profile and close the success pop-up
  #Then the pop-up should be closed successfully
  
  Scenario: User Logs Out of Account
    Given I am logged in
    When I log out and confirm
    Then I should be successfully logged out

  #Include "x" button
  Scenario: User Cancels Log Out of Account
    Given I am logged in
    When I log out and cancel
    Then I should remain logged in
	#=====================FIX=====================