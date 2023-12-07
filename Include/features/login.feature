@Login
Feature: Login Functionality
  As a user
  I want to log in
  So I can access my account

  @ValidCredentials
  Scenario Outline: User Login with Valid Credentials
    Given I want to log in with valid email and password
    When I enter the <email> and <password>
    Then I should be logged in to the application

    Examples:
      | email           | password |
      | user@gmail.com  | user123  |

  #@InvalidCredentials
  #Scenario Outline: User Login with Invalid Credentials
    #Given I want to log in with invalid email and password
    #When I enter the <email> and <password>
    #Then I should see an error message and stay on the login page
#
    #Examples:
      #| email           | password        |
      #| user@gmail.com  | $(invalid pass) |
      #| user123         | user@gmail.com  |
      #|               |               |
#
  #@RegisterLink
  #Scenario: User Clicks Register Link
    #Given I want to register for an account
    #When I click the register link
    #Then I should be directed to the registration page
#
  #@DirectToHomepage
  #Scenario: User Clicks "Login" Button
    #Given I want to log in
    #When I click the "Login" button
    #Then I should be directed to the Homepage
#
  #@GoogleLogin
  #Scenario: User Uses "Google" Login
    #Given I want to log in using Google account
    #When I select the "Google" login option
    #Then I should be directed to sign in with Google
#
  #@LoginWithGoogle
  #Scenario: User Logs in Using Google Account
    #Given I want to log in using Google account
    #When I select and click an available Google account
    #Then I should be directed to the Homepage
#
  #@EyeIconPassword
  #Scenario: User Checks "eye icon" Functionality in Password Field
    #Given I want to see the entered password
    #When I click the "eye icon" in the password field
    #Then I should be able to view the password
#
