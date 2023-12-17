@LoginAdmin
Feature: As a user i want to login
So i can acces the website page

@positive
  Scenario: Successful Login
    Given User is already at the login page
    And User already has an admin account
    When User fills valid name and email
    And User fills valid password
    And User clicks the login button
    Then User should be logged in successfully
    
@negative
    Scenario: Invalid Email
    When User fills valid name but invalid email
    And User fills valid password
    And User clicks the login button
    Then User should see an error message for invalid email
    
    Scenario: Invalid Password
    When User fills valid name and email
    And User fills invalid password
    And User clicks the login button
    Then User should see an error message for invalid password
    
    Scenario: Empty Fields
    When User leaves the name, email, and password empty
    And User clicks the login button
    Then User should see an error message for empty fields
    
    Scenario: Empty Name Field
    When User leaves the name field empty
    And User fills valid email and password
    And User clicks the login button
    Then User should see an error message for the empty name field
    
    Scenario: Empty Email Field
    When User fills valid name but leaves the email field empty
    And User fills valid password
    And User clicks the login button
    Then User should see an error message for the empty email field
    
     Scenario: Empty Password Field
    When User fills valid name and email
    And User leaves the password field empty
    And User clicks the login button
    Then User should see an error message for the empty password field