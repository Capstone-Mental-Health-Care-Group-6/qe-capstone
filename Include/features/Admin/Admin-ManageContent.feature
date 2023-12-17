@Managecontent
Feature: Manage content
As a user 
i want to manage the content

  Scenario: Search for Articles
    Given User opens the menu "Manage Articles"
    When User clicks the search field
    And User inputs a keyword to search for
    Then User should see search results based on the entered keyword

  Scenario: Filter by Time
    Given User opens the menu "Manage Articles"
    When User clicks the button filter
    And User clicks the filter by time button
    Then User should see articles filtered by time

  Scenario: Filter by Categories
    Given User opens the menu "Manage Articles"
    When User clicks the button filter
    And User clicks the filter by categories button
    Then User should see articles filtered by categories

  Scenario: Navigate to Next Page
    Given User opens the menu "Manage Articles"
    When User clicks the next button
    Then User should navigate to the next page of articles

  Scenario: Navigate to Previous Page
    Given User opens the menu "Manage Articles"
    When User clicks the prev button
    Then User should navigate to the previous page of articles

  Scenario: Reset Filters
    Given User opens the menu "Manage Articles"
    When User clicks the button filter
    And User clicks the filter by categories and time
    And User clicks the reset button
    Then User should see all articles without filters

  Scenario: Accept Requested Article
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to accept
    And User clicks accept request articles
    And User clicks the "accept/terima" button
    Then Article request should be accepted successfully

  Scenario: Cancel Accepting Requested Article
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to accept
    And User clicks accept request articles
    And User clicks the "cancel/batal" button
    Then Article request acceptance should be canceled successfully

  Scenario: Reject Requested Article with Reason
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to reject
    And User clicks reject request articles
    And User chooses a reason and clicks the "reject request" button
    Then Article request should be rejected with a reason

  Scenario: Cancel Rejecting Requested Article
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to reject
    And User clicks reject request articles
    And User clicks the "cancel/batal" button
    Then Article request rejection should be canceled successfully

  Scenario: Close Requested Article without Action
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to accept
    And User clicks reject request articles
    And User clicks the "x" button
    Then Article request should be closed without action

  Scenario: Close Rejected Requested Article without Action
    Given User opens the menu "Manage Articles"
    And User clicks on the request articles card
    And User chooses and clicks an article to reject
    And User clicks accept request articles
    And User clicks the "x" button
    Then Rejected article request should be closed without action

  Scenario: Accept Requested Article from Notification
    Given User clicks on the bell object notification
    And User chooses and clicks an article to accept
    And User clicks accept request articles
    And User clicks the "accept/terima" button
    Then Article request should be accepted successfully from notification

  Scenario: Reject Requested Article from Notification with Reason
    Given User clicks on the bell object notification
    And User chooses and clicks an article to reject
    And User clicks reject request articles
    And User chooses a reason and clicks the "reject request" button
    Then Article request should be rejected with a reason from notification

  Scenario: Click Another Reason and Reject Requested Article
    Given User clicks another reason
    And User fills and inputs a reason
    And User clicks the "reject request" button
    Then Article request should be rejected with another reason

  Scenario: Click Another Reason and Reject Requested Article with Empty Reason
    Given User clicks another reason
    And User leaves the reason field empty
    And User clicks the "reject request" button
    Then Article request rejection should fail due to an empty reason