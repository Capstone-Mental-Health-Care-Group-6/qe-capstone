@Login
Feature: Login Functionality
  As a user
  I want to log in
  So I can access my account

  #include DirectToHomepage,EyeIconPassword
  @ValidCredentials
  Scenario Outline: User Login with Valid Credentials
  Given I want to log in
  When I enter the <email> and <password>
  Then I should be logged in to the application
  
  Examples:
  | email            | password |
  | laras1@gmail.com | laras1   |
  
  #@InvalidCredentials
  #Scenario Outline: User Login with Invalid Credentials
    #Given I want to log in
    #When I enter the invalid <email_user> and invalid <password_user>
    #Then I should see an error message and stay on the login page
#
    #Examples: 
      #| email_user    | password_user |
      #| xxx@gmail.com | xxx           |
      
  @RegisterLink
  Scenario: User Clicks Register Link
    Given I want to verify register link
    When I click the register link
    Then I should be directed to the registration page
