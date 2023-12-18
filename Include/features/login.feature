@Login
Feature: Login Functionality
  As a user
  I want to log in
  So I can access my account

  @ValidCredentials
  Scenario Outline: User Login with Valid Credentials
    Given I want to log in
    When I enter the <email> and <password>
    Then I should be logged in to the application

    Examples: 
      | email                   | password |
      | nurulfauziah3@gmail.com | fauzi123 |

  @InvalidCredentials
  Scenario Outline: User Login with Invalid Credentials
    Given I want to log in
    When I enter the invalid <email> and invalid <password>
    Then I should see an error message and stay on the login page

    Examples: 
      | email                   | password        |
      | nurulfauziah3@gmail.com | $(invalid pass) |
      | xxx                     | fauzi123        |
      |                         |                 |

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
  #@GoogleButton
  #Scenario: User Uses "Google" Login
    #Given I want to log in using Google account
    #When I select the "Google" button
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
