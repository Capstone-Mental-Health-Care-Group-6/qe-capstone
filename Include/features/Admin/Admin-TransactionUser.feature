@UserTransaction
Feature: User Transaction
  As a user
  I want to access and manage pending transactions
  So I can perform necessary actions on them

  @UserTransaction
  Scenario: User verifies pending transaction page
    Given I am on the transaction user page
    When I click the static pending transaction
    Then I should be redirected to the section page

  @Search
  Scenario Outline: User searches pending transactions by <criteria>
    Given I am on the transaction user page
    When I search for <criteria>
    Then I get the searched <criteria>

    Examples: 
      | criteria          | results         |
      | name              | Rafael Leao     |
      | ID                | 129834          |
      | subscription plan | Instan package  |
      | subscription plan | Premium package |
      | payment status    | Already paid    |
      | payment status    | Not yet paid    |

  @Filter
  Scenario Outline: User filters data based on <filter>
    Given I am on the transaction user page
    When I apply the filter by <filter>
    Then I receive the filtered data

    Examples: 
      | filter            |
      | name              |
      | ID                |
      | subscription plan |
      | payments status   |

  @MenuSection
  Scenario Outline: User navigates to manual and automatic transaction sections
    Given I am on the transaction user page
    When I access the <section> in the menu
    Then I successfully move to the <section> menu

    Examples: 
      | section               |
      | manual transaction    |
      | automatic transaction |

  @Navigation
  Scenario: User navigates through pending transaction list
    Given I am on the transaction user page
    When I navigate through the transaction list
    Then I can see the next/previous transaction data

  @PaymentHandling
  Scenario Outline: User manages payment acceptance/rejection
    Given I am on the transaction user page
    When I <action> payment
    Then I receive a <notification> for the action

    Examples: 
      | action         | notification                |
      | accept payment | successful payment pop up   |
      | reject payment | successful rejection pop up |

  @UserSeePreviousTransaction-button
  Scenario: User Sees Previous Pending Transaction Data
    Given User is on the transaction user page
    When User clicks the Previous button in the pending transaction section
    Then User should see the previous data from the list of pending transactions

  @UserAcceptsManualPaymentsbutton-popup
  Scenario: User Accepts Manual Payments
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks the Accept payment button
    Then User should successfully see the successful payment pop-up

  @UserCancelPopupWithCancelButton
  Scenario: User Cancels Popup With Cancel Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks the Accept payment button
    And User clicks the Cancel button
    Then User successfully cancels with the Cancel button to close the pop-up

  @UserCancelPopupWithXIcon
  Scenario: User Cancels Popup With X Icon
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks the Accept payment button
    And User clicks the X icon
    Then User successfully cancels with the X icon to close the pop-up

  @UserVerifyProofOfTransfer
  Scenario: User Verifies Proof of Transfer via User Transaction Details Page
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks on the transfer proof photo
    Then User successfully sees a pop-up photo of proof of transfer

  @UserCloseTransferProofPopUp
  Scenario: User Closes Transfer Proof Pop Up via User Transaction Details Page
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks on the transfer proof photo
    And User clicks the X icon
    Then User successfully closes with the X icon

  @UserRejectsManualPayments
  Scenario: User Rejects Manual Payments
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks the Reject payment button
    Then User should see the successful payment pop-up/alert

  @UserCancelRejectPopupWithCancelButton
  Scenario: User Cancels Reject Popup With Cancel Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks the Reject payment button
    And User clicks Cancel
    Then User successfully cancels with the Cancel button to close the pop-up

  @UserRejectsWithPhotoProofNotClear
  Scenario: User Rejects With Photo Proof of Payment is Not Clear Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Photo Proof of Payment is Not Clear
    And User clicks Reject payment button
    Then User successfully rejects user payment

  @UserVerifyRejectPopup
  Scenario: User Verifies Reject Popup As Per Selection
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Photo Proof of Payment is Not Clear
    And User clicks Reject payment button
    Then User successfully sees a pop-up/warning that the user's payment has been successfully rejected

  @UserRejectsWithTransferAmountMismatch
  Scenario: User Rejects With Transfer Amount Does Not Match Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Transfer Amount Does Not Match
    And User clicks Reject payment button
    Then User successfully rejects user payment

  @UserVerifyRejectPopupTransferAmountMismatch
  Scenario: User Verifies Reject Popup As Per Selection (Transfer Amount Does Not Match)
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Transfer Amount Does Not Match
    And User clicks Reject payment button
    Then User successfully sees a pop-up/warning that the user's payment has been successfully rejected

  @UserRejectsWithTransferDestinationMismatch
  Scenario: User Rejects With Transfer Destination Account Number Does Not Match Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Transfer Destination Account Number Does Not Match
    And User clicks Reject payment button
    Then User successfully rejects user payment

  @UserVerifyRejectPopupTransferDestinationMismatch
  Scenario: User Verifies Reject Popup As Per Selection (Transfer Destination Account Number Does Not Match)
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Transfer Destination Account Number Does Not Match
    And User clicks Reject payment button
    Then User successfully sees a pop-up/warning that the user's payment has been successfully rejected

  @UserRejectsWithOtherReason
  Scenario: User Rejects With Other Reason Button
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Other reason
    And User clicks Reject payment button
    Then User successfully rejects user payment

  @UserVerifyRejectionReasonField
  Scenario: User Verifies Rejection Reason Field in Other Reasons Option
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Other reason
    And User clicks the field for rejection reason
    And User clicks Reject payment button
    Then User has successfully filled in the reason for rejection field

  @UserVerifyRejectPopupReasonSelection
  Scenario: User Verifies Reject Popup As Per Reason Selection
    Given User is on the transaction user page
    When User clicks on a patient's name in the table and moves to the User transaction details page
    And User clicks Other reason
    And User clicks Reject payment button
    Then User successfully sees a pop-up/warning that the user's payment has been successfully rejected

  @EmptyStateDashboardTransactionUser-1
  Scenario: Users verify empty data on the user transaction page
    Given User is already on the transaction user page
    When User opens the pending transaction section
    Then User view page does not have a list
    
	@EmptyStateDashboardTransactionUser-2
  Scenario: User verifies empty data on pending transaction page
    Given User is already on the transaction user page
    When User opens the pending transaction section
    Then User view page does not have a list

	@EmptyStateDashboardTransactionUser-3
  Scenario: Users verify empty data in the manual transaction menu section on the pending transaction page
    Given User is already on the transaction user page
    When User opens the pending transaction section and selects manual transaction menu
    Then User view page does not have a list

	@EmptyStateDashboardTransactionUser-4
  Scenario: Users verify empty data in the automatic transaction menu section on the pending transaction page
    Given User is already on the transaction user page
    When User opens the pending transaction section and selects automatic transaction menu
    Then User view page does not have a list

	@ErrorStateDashboardTransactionUser-1
  Scenario: User verify that the search is not present in the manual transactions menu section of the pending transactions page
    Given User is already on the transaction user page
    When User opens the pending transaction section and selects manual transaction menu
    And User inputs a search keyword "XXX"
    Then Users see pages that do not have the keywords they are looking for

	@ErrorStateDashboardTransactionUser-2
  Scenario: User verify that the search is not present in the automatic transactions menu section of the pending transactions page
    Given User is already on the transaction user page
    When User opens the pending transaction section and selects automatic transaction menu
    And User inputs a search keyword "XXX"
    Then Users see pages that do not have the keywords they are looking for
