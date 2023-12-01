@DashboardNotifikasi
Feature: Title of your feature
  As a user
  I want to access my dashboard
  So that I can view menu dashboard

  Scenario: Verify Links in the Sidebar Menu - Chat
    Given I logged in and was on the dashboard page
    When I check the links in the sidebar menu under "Chat"
    Then I should verify the functionality and correctness of the links

  Scenario: Verify Links in the Sidebar Menu - Transactions
    Given I logged in and was on the dashboard page
    When I check the links in the sidebar menu under "Transactions"
    Then I should verify the functionality and correctness of the links

  Scenario: Verify Links in the Sidebar Menu - Articles
    Given I logged in and was on the dashboard page
    When I check the links in the sidebar menu under "Articles"
    Then I should verify the functionality and correctness of the links

  Scenario: Verify Notification Icons in the Navbar
    Given I logged in and was on the dashboard page
    When I check the notification icons in the navbar
    Then I should verify the visibility and correctness of the notification icons

  Scenario: Verify Profile Icons in the Navbar
    Given I logged in and was on the dashboard page
    When I check the profile icons in the navbar
    Then I should verify the visibility and correctness of the profile icons

  Scenario: Verify Functions of the View Details button on the Patient View Table
    Given I logged in and was on the dashboard page
    When I click the view details button on the patient view table
    Then I should be directed to the detailed information page for the selected patient
