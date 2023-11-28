@LoginPageDokter
Feature: Transaction History
  As a user
  I want to see transaction history
  So that I can manage my history transaction

  Scenario: User Searches Transaction History by Transaction ID
    Given I am on the transaction history page
    When I search for transaction history by transaction ID
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History by Patient's Name
    Given I am on the transaction history page
    When I search for transaction history by patient's name
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History by Date
    Given I am on the transaction history page
    When I search for transaction history by date
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History by Subscription Package
    Given I am on the transaction history page
    When I search for transaction history by subscription package
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History by Price
    Given I am on the transaction history page
    When I search for transaction history by price
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History by Payment Method
    Given I am on the transaction history page
    When I search for transaction history by payment method
    Then I should see relevant transaction records

  Scenario: User Searches Transaction History and No Data Exist
    Given I am on the transaction history page
    When I search for transaction history with no existing data
    Then I should see a message indicating no data found

  Scenario: User Wants to Filter Data Based on Transaction ID
    Given I am on the transaction history page
    When I apply a filter to display data based on transaction ID
    Then I should see filtered transaction records

  Scenario: User Sees the Next Transaction Data
    Given I am on the transaction history page
    When I navigate to view the next transaction data
    Then I should see the details of the next transaction

  Scenario: User Sees the Previous Transaction Data
    Given I am on the transaction history page
    When I navigate to view the previous transaction data
    Then I should see the details of the previous transaction

  Scenario: User Sees Transaction Details
    Given I am on the transaction history page
    When I view the details of a transaction
    Then I should see detailed information about the transaction

  Scenario: User Returns to the Transaction History Page from the Transaction Details Page
    Given I am on the transaction details page
    When I navigate back to the transaction history page
    Then I should be on the transaction history page