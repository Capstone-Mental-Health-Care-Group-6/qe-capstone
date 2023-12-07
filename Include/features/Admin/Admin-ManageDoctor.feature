@ManageDokter
Feature: Manage Doctor Accounts
  As a user
  I want to see doctor accounts
  So that I can manage doctor accounts

  #==NON AKTIFKAN AKUN DOKTER VIA DETAIL ACCOUNT==
  Scenario: User Deactivates the Doctor Account via the Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    Then I should successfully receive the appropriate results

  #include "x" Button
  Scenario: User Cancels Deactivating Doctor Accounts via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    And I click the cancel button to deactivate the account
    Then I should successfully receive the appropriate results

  #Information, Documents, Experience, Articles
  Scenario: User Sees the Detail Information Doctor's via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the detail information doctor
    Then I should successfully receive the appropriate results

  #Scenario: User Closes the Alert Successfully Deactivates the Doctor Account via Account Details Page
  #Given I am on the manage doctor page
  #When I click the doctor profile on the doctor list data
  #And I click the Deactivate Account button
  #And I click the x button to close the alert
  #Then I should be successfully deactivated doctor account
  
  Scenario: User Verification Tooltip Info via Doctor's Details
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Tooltip Info button
    Then I should successfully receive the appropriate results

  #==NON AKTIFKAN AKUN DOKTER VIA TABLE==
  Scenario: User Deactivates the Doctor Account via the Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the Deactivate Account button table
    #And I click the sure button to deactivate the account
    Then I should successfully receive the appropriate results

  #include "x" Button
  Scenario: User Cancels Deactivating Doctor Accounts via the Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the Deactivate Account button
    And I click the cancel button to deactivate the account
    Then I should successfully receive the appropriate results

  Scenario: User Views Doctor Account Details via Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the View Account Details button
    Then I should successfully receive the appropriate results

  #Scenario: User Closes the Alert Successfully Deactivates the Doctor Account via Account Details Page
  #Given I am on the manage doctor page
  #When I click the doctor profile on the doctor list data
  #And I click the Deactivate Account button
  #And I click the x button to close the alert
  #Then I should be successfully deactivated doctor account
  Scenario: User Sees the Next Doctor's Data
    Given I am on the manage doctor page
    When I click the Next button from the list data doctor
    Then I should successfully receive the appropriate results

  Scenario: User Sees the Previous Doctor's Data
    Given I am on the manage doctor page
    When I click the Previous button from the list data doctor
    Then I should successfully receive the appropriate results

  #name, email, phone number, work hours
  Scenario: User Searches Doctor Data
    Given I am on the manage doctor page
    When I input the keyword to search
    Then I should successfully receive the appropriate results

  #Active & Non Active Account
  Scenario: User Wants to Filter Data
    Given I am on the manage doctor page
    When I click the button filter
    Then I should successfully receive the appropriate results

  #==(TERIMA) MANAGE PENGAJUAN DOKTER VIA DASHBOARD==
  Scenario: User Wants to Apply for a Doctor via the Dashboard
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click to accept the doctor's request
    Then I should successfully receive the appropriate results

  #include "x" Button
  Scenario: User Wants to Cancel Doctor Request on Approval Alert via Dashboard
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click to accept the doctor's request
    And I click cancel in the alert to cancel the doctor's request
    Then I should successfully receive the appropriate results

  #==(TERIMA) MANAGE PENGAJUAN DOKTER VIA NOTIFICATION==
  Scenario: User Wants to Apply for a Doctor via the Notification
    Given I am on the manage doctor page
    When I click on the notification
    And I click to accept the doctor's request
    Then I should successfully receive the appropriate results

  #include "x" Button
  Scenario: User Wants to Cancel Doctor Request on Approval Alert via Notification
    Given I am on the manage doctor page
    When I click on the notification
    And I click to accept the doctor's request
    And I click cancel in the alert to cancel the doctor's request
    Then I should successfully receive the appropriate results

  #name, specialist doctor, phone number,  application status
  Scenario: User Searches Doctor Data via Doctor Application Card
    Given I am on the manage doctor page
    When I input the keyword to search data doctor application
    Then I should successfully receive the appropriate results

  #latest submission, last 7 days, last 30 days, all dates
  Scenario: User Wants to Filter Data via Doctor Application Card
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click the filter data
    Then I should successfully receive the appropriate results

  Scenario: User Sees the Next Doctor's Data
    Given I am on the manage doctor page
    When I click the Next button from the list data doctor
    Then I should successfully receive the appropriate results

  Scenario: User Sees the Previous Doctor's Data
    Given I am on the manage doctor page
    When I click the Previous button from the list data doctor
    Then I should successfully receive the appropriate results

  #==(TOLAK) MANAGE PENGAJUAN DOKTER VIA DASHBOARD==
  Scenario: User Wants to Reject Acceptance of the Doctor's Application
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click the Reject Payment button
    #And I click the Illegal Practice License button for reasons to reject the application
    #And I click the Diploma Manipulation button for reasons to reject the application
    #And I click the There Are Differences Between Documents button for reasons to reject the application
    #And I click the Other Reason button for reasons to reject the application
    #And I input the other reason
    Then I should successfully receive the appropriate results

  Scenario: User Cancels Reject Acceptance of the Doctor's Application
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click the Reject Payment button
    And I click the cancel button
    Then I should successfully receive the appropriate results

  #Scenario: User Closes the Alert Successfully Reject Acceptance of the Doctor's Application
  #Given I am on the manage doctor page
  #When I click on the doctor's application card
  #And I click detail account doctor's
  #And I click the Reject Payment button
  #And I click the Illegal Practice License button for reasons to reject the application
  #And I click the x button to close the alert reject acceptance Doctor's application
  #Then I should be rejected the doctor's application
  #==Empty state Manage dokter==
  #User on dashboard
  Scenario: User Verifies Empty Data on Doctor Management Page
    Given I am on the dashboard doctor page
    When I open the menu and click on Manage Doctor
    Then I should successfully receive the appropriate results

  Scenario: User Verifies Empty Data on Pending Transaction Page
    Given I am on the dashboard doctor page
    When I open the menu and click on Manage Doctor
    And I click on the doctor's application card
    Then I should successfully receive the appropriate results

  Scenario: User Verifies Empty Data on Doctor's Account Details
    Given I am on the dashboard doctor page
    #When I open the menu and click on Manage Doctor
    When I click the doctor profile on the doctor list data
    Then I should successfully receive the appropriate results

  #==Error state - Ketika pencarian data tidak ditemukan==
  #User on manage doctor again
  Scenario: Users Verify Searches That Don't Exist on the Doctor Data Page
    Given I am on the manage doctor page
    When I input a keyword that doesn't exist in the doctor data
    Then I should successfully receive the appropriate results

  Scenario: Users Verify Searches That Don't Exist on the Practice Application Data Page
    Given I am on the manage doctor page
    When I click on the doctor's application card
    #And I click on doctor's account details
    #And I input a keyword that doesn't exist in the practice application data
    Then I should successfully receive the appropriate results
    
    	#=====================FIX=====================
