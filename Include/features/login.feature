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
      | email           | password |


  @InvalidCredentials
  Scenario Outline: User Login with Invalid Credentials
    Given I want to log in
    When I enter the invalid <email> and invalid <password>
    Then I should see an error message and stay on the login page

    Examples: 
      | email           | password        |



  #Scenario: User Clicks Register Link
    #Given I want to log in
    #When I click the register link
    #Then I should be directed to the registration page
