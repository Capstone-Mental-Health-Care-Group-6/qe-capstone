@LogoutDokter
Feature: Logout for dokter
As a user i want to logout account

@positive
Scenario: Logout
    Given the user clicks profile
    When the user clicks the Logout button
    And the user clicks the exit button on the pop-up permissions
    Then the user should be logged out and redirected to the home page

@negative      
Scenario: Cancel Logout
    Given the user clicks profile
    When the user clicks the Logout button
    And the user clicks the cancel button on the pop-up permissions
    Then the user should remain on the profile page
    
    
Scenario: Close Logout
    Given the user clicks profile
    When the user clicks the Logout button
    And the user clicks the x button on the pop-up permissions
    Then the user should be canceling logout 