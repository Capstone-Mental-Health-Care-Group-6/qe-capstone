@LogoutDokter
Feature: Logout for dokter
As a user i want to logout account

@positive
Scenario: Logout
    Given I already login
    When I clicks the logout button
    And I clicks the exit button on the pop-up permissions
    Then I should be logged out and redirected to the login page

@negative      
Scenario: Cancel Logout
    Given I already logged in
    When I am clicking the Logout button
    And I am clicks the cancel button on the pop-up permissions
    Then I am should remain on the profile page
    
    
Scenario: Close Logout
    Given I am already login
    When I clicked the Logout button
    And I clicked the x button on the pop-up permissions
    Then I should be canceling logout
    
    