@Signupdokter
Feature: User Registration on Doctor's Sign Up Page
As a user i want to acces the app 
so i want to sign up for acces app



@positive
Scenario: User open Sign Up page for Doctor
    Given the user is on the Sign Up page for Doctor

Scenario: User fills in email on Doctor's Sign Up page
    Given the user is on the Sign Up page for Doctor
    When the user fills in the email
    Then the email field should be populated with the provided email

Scenario: User fills in password on Doctor's Sign Up page
    Given the user is on the Sign Up page for Doctor
    When the user fills in the password
    Then the password field should be populated with the provided password

Scenario: User fills in confirm password on Doctor's Sign Up page
    Given the user is on the Sign Up page for Doctor
    When the user fills in the confirm password
    Then the confirm password field should be populated with the provided confirm password

@negative
Scenario: User empties form register on Doctor's Sign Up page
    Given the user is on the Sign Up page for Doctor
    When the user empties the registration form
    Then the email field should be empty
    And the password field should be empty
    And the confirm password field should be empty
  
  @signupbutton  
Scenario: User clicks the register button on Doctor's Sign Up page
    Given the user is on the Sign Up page for Doctor
    When the user clicks the register button
    Then the registration process should be initiated
