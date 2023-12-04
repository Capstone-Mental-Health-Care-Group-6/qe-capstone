@ManageDokter
Feature: Manage Doctor Accounts
  As a user
  I want to see doctor accounts
  So that I can manage doctor accounts

  #NON AKTIFKAN AKUN DOKTER
  Scenario Outline: User Deactivates the Doctor Account via the Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    Then I should be successfully deactivated doctor account

  #include "x" Button
  Scenario Outline: User Cancels Deactivating Doctor Accounts via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    And I click the cancel button to deactivate the account
    Then I should be successfully cancel deactivated doctor account

  Scenario Outline: User Sees the Detail Information Doctor's via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Doctor Information button
    And I click the Doctor Documents button
    And I click the Doctor Experience button
    And I click the Doctor Articles button
    Then I should see the general information of the doctor

  Scenario Outline: User Closes the Alert Successfully Deactivates the Doctor Account via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    And I click the x button to close the alert
    Then I should be successfully deactivated doctor account

  Scenario Outline: User Deactivates the Doctor Account via the Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the Deactivate Account button
    And I click the sure button to deactivate the account
    Then I should be successfully deactivated doctor account

  #include "x" Button
  Scenario Outline: User Cancels Deactivating Doctor Accounts via the Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the Deactivate Account button
    And I click the cancel button to deactivate the account
    Then I should be successfully cancel deactivated doctor account

  Scenario Outline: User Views Doctor Account Details via Doctor Data Table
    Given I am on the manage doctor page
    When I click the doctor profile action button on the doctor list data
    And I click the View Account Details button
    Then I should see the detailed account information of the doctor

  Scenario Outline: User Closes the Alert Successfully Deactivates the Doctor Account via Account Details Page
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Deactivate Account button
    And I click the x button to close the alert
    Then I should be successfully deactivated doctor account

  Scenario Outline: User Sees the Next Doctor's Data
    Given I am on the manage doctor page
    When I click the Next button from the list data doctor
    Then I should see the details of the next doctor's data

  Scenario Outline: User Sees the Previous Doctor's Data
    Given I am on the manage doctor page
    When I click the Previous button from the list data doctor
    Then I should see the details of the previous doctor's data

  Scenario Outline: User Searches Doctor Data
    Given I am on the manage doctor page
    When I click the search field
    And I input the name as the keyword to search for
    And I input the email as the keyword to search for
    And I input the phone number as the keyword to search for
    And I input the work hours as the keyword to search for
    Then I should see the doctor data that matches the keyword

  Scenario Outline: User Wants to Filter Data
    Given I am on the manage doctor page
    When I click the button filter
    And I click the filter by Name button
    And I click the filter by Email button
    And I click the filter by Phone Number button
    And I click the filter by Work Hours button
    Then I should see the doctor data filtered

  Scenario Outline: User Verification Tooltip Info via Doctor's Details
    Given I am on the manage doctor page
    When I click the doctor profile on the doctor list data
    And I click the Tooltip Info button
    Then I should see the tooltip information for the doctor

  #MANAGE PENGAJUAN DOKTER
  Scenario Outline: User Wants to Apply for a Doctor via the Dashboard
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click to accept the doctor's request
    Then I successfully to accept the doctor's request

  #include "x" Button
  Scenario Outline: User Wants to Cancel Doctor Request on Approval Alert via Dashboard
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click to accept the doctor's request
    And I click cancel in the alert to cancel the doctor's request
    Then I canceled the doctor's request

  Scenario Outline: User Wants to Apply for a Doctor via the Notification
    Given I am on the manage doctor page
    When I click on the notification
    And I click to accept the doctor's request
    Then I successfully to accept the doctor's request

  #include "x" Button
  Scenario Outline: User Wants to Cancel Doctor Request on Approval Alert via Notification
    Given I am on the manage doctor page
    When I click on the notification
    And I click to accept the doctor's request
    And I click cancel in the alert to cancel the doctor's request
    Then I canceled the doctor's request

  Scenario Outline: User Searches Doctor Data via Doctor Application Card
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I input the name as the keyword to search for
    And I input the specialist doctor as the keyword to search for
    And I input the phone number as the keyword to search for
    And I input the application status as the keyword to search for
    Then I should see the doctor data that matches the name

  Scenario Outline: User Wants to Filter Data via Doctor Application Card
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click the filter by Name Doctor button
    And I click the filter by specialist doctor button
    And I click the filter by Phone Number Doctor button
    And I click the filter by application status button
    Then I should see the doctor data filtered

  #Scenario: User Sees the Next Doctor's Data
  #Given I am on the manage doctor page
  #When I click the Next button from the list data doctor
  #Then I should see the details of the next doctor's data
  #Scenario: User Sees the Previous Doctor's Data
  #Given I am on the manage doctor page
  #When I click the Previous button from the list data doctor
  #Then I should see the details of the previous doctor's data
  Scenario Outline: User Wants to Reject Acceptance of the Doctor's Application
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click detail account doctor's
    And I click the Reject Payment button
    And I click the Illegal Practice License button for reasons to reject the application
    And I click the Diploma Manipulation button for reasons to reject the application
    And I click the There Are Differences Between Documents button for reasons to reject the application
    And I click the Other Reason button for reasons to reject the application
    And I input the other reason
    And I click refuse payment
    Then I should be rejected the doctor's application

  Scenario Outline: User Cancels Reject Acceptance of the Doctor's Application
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click the doctor profile on the doctor list data
    And I click to reject the acceptance of the doctor's application
    And I click the cancel button
    Then I should be canceled the rejection of the doctor's application

  Scenario Outline: User Closes the Alert Successfully Reject Acceptance of the Doctor's Application
    Given I am on the manage doctor page
    When I click on the doctor's application card
    And I click detail account doctor's
    And I click the Reject Payment button
    And I click the Illegal Practice License button for reasons to reject the application
    And I click the x button to close the alert reject acceptance Doctor's application
    Then I should be rejected the doctor's application

  #User on dashboard
  Scenario Outline: User Verifies Empty Data on Doctor Management Page
    Given I am on the dashboard doctor page
    When I open the menu and click on Manage Doctor
    Then I should see empty data on the doctor management page

  Scenario Outline: User Verifies Empty Data on Pending Transaction Page
    Given I am on the dashboard doctor page
    When I open the menu and click on Manage Doctor
    And I click on the doctor's application card
    Then I should see empty data on the pending transaction page

  Scenario Outline: User Verifies Empty Data on Pending Article Data Page
    Given I am on the dashboard doctor page
    When I open the menu and click on Manage Doctor
    And I click on doctor's account details
    Then I should see empty data on the pending article data page

  #User on manage doctor again
  Scenario Outline: Users Verify Searches That Don't Exist on the Doctor Data Page
    Given I am on the manage doctor page
    When I input a keyword that doesn't exist in the doctor data
    Then I should see no search results

  Scenario Outline: Users Verify Searches That Don't Exist on the Practice Application Data Page
    Given I am on the manage doctor page
    When I click on the doctor's practice application
    #And I click on doctor's account details
    #And I input a keyword that doesn't exist in the practice application data
    Then I should see no search results