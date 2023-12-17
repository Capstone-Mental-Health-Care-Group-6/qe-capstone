@Manageuser
Feature: User Management
As a user i want to manage Account

  Background:
    Given User is on the dashboard

  Scenario: View User Details
    When User opens the menu "Manage User"
    And User clicks the action button on the user data
    And User chooses "Lihat Detail Account"
    Then User should see the details of the selected user account

  Scenario: Deactivate Account
    When User opens the menu "Manage User"
    And User clicks the action button on the user data
    And User chooses "Non Aktifkan Akun"
    And User clicks the "Yakin" button to deactivate the account
    Then User should see a confirmation message for deactivating the account

  Scenario: Cancel Deactivate Account
    When User opens the menu "Manage User"
    And User clicks the action button on the user data
    And User chooses "Non Aktifkan Akun"
    And User clicks the "Batal" button to cancel deactivating the account
    Then User should remain on the user details page without deactivating the account

  Scenario: Activate Account
    When User opens the menu "Manage User"
    And User clicks the action button on the user data
    And User chooses "Aktifkan Akun"
    And User clicks the "Yakin" button to activate the account
    Then User should see a confirmation message for activating the account

  Scenario: Cancel Activate Account
    When User opens the menu "Manage User"
    And User clicks the action button on the user data
    And User chooses "Aktifkan Akun"
    And User clicks the "Batal" button to cancel activating the account
    Then User should remain on the user details page without activating the account

  Scenario: Deactivate Account from User Profile
    When User opens the menu "Manage User"
    And User clicks the user profile on the user list data
    And User clicks the deactivate account button
    And User clicks the "Yakin" button to deactivate the account
    Then User should see a confirmation message for deactivating the account

  Scenario: Cancel Deactivate Account from User Profile
    When User opens the menu "Manage User"
    And User clicks the user profile on the user list data
    And User clicks the deactivate account button
    And User clicks the "Batal" button to cancel deactivating the account
    Then User should remain on the user profile without deactivating the account

  Scenario: Search User Data
    When User opens the menu "Manage User"
    And User clicks the search field
    And User fills and inputs the search field to search data
    Then User should see the search results based on the entered criteria

  Scenario: Navigate to Next Page
    When User opens the menu "Manage User"
    And User clicks the next button
    Then User should navigate to the next page of user data

  Scenario: Navigate to Previous Page
    When User opens the menu "Manage User"
    And User clicks the prev button
    Then User should navigate to the previous page of user data
