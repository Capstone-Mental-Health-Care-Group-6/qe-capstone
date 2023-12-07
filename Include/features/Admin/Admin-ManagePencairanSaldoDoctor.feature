Feature: Manage Pencairan Dana Dokter

  Scenario: Click on Pencairan Dana Dokter Button
    Given User is at the "Manage Pencairan Dana Dokter" page
    When User clicks the "Dana Dokter" button
    Then User should be navigated to the "Manage Pencairan Dana Dokter" page

  Scenario: Click on a List at Table Pencairan Dana Dokter
    Given User is at the "Manage Pencairan Dana Dokter" page
    When User clicks one of the lists at the table of Pencairan Dana Dokter
    Then User should see detailed information about the selected Pencairan Dana Dokter

  Scenario: Click and Choose Processed for Pencairan Dana Dokter
    Given User is at the "Manage Pencairan Dana Dokter" page
    When User clicks one of the lists at the table of Pencairan Dana Dokter
    And User clicks and chooses "Processed"
    Then User should see the status of the selected Pencairan Dana Dokter set to "Processed"

  Scenario: Click and Choose Success for Pencairan Dana Dokter
    Given User is at the "Manage Pencairan Dana Dokter" page
    When User clicks one of the lists at the table of Pencairan Dana Dokter
    And User clicks and chooses "Success"
    Then User should see the status of the selected Pencairan Dana Dokter set to "Success"

  Scenario: Click and Choose Pending for Pencairan Dana Dokter
    Given User is at the "Manage Pencairan Dana Dokter" page
    When User clicks one of the lists at the table of Pencairan Dana Dokter
    And User clicks and chooses "Pending"
    Then User should see the status of the selected Pencairan Dana Dokter set to "Pending"
