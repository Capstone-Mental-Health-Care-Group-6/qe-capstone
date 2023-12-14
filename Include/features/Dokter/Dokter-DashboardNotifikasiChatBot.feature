@DashboardNotifikasi
Feature: Title of your feature
  As a user
  I want to access my dashboard
  So that I can view menu dashboard

  #Include Chat, Transactions, Balance Disbursement, Articles
  Scenario: Verify Links in the Sidebar Menu
    Given I logged in and was on the dashboard page
    When I click the sidebar menu
    Then I should verify the functionality and correctness of the links

  #Include Notification, profile
  Scenario: Verify Icons in the Navbar
    Given I logged in and was on the dashboard page
    When I check the icons in the navbar
    Then I should verify the visibility and correctness of the notification icons

  #Scenario: User Uses the Chatbot Feature
  #Given I logged in and was on the dashboard page
  #When I click the chatbot button
  #And I click the send button
  #Then I should send message with the chatbot successfully
  
  #Scenario: User Uses the Chatbot Feature with a yet button
  #Given I logged in and was on the dashboard page
  #When I click the chatbot button
  #And I click the send button
  #And I click the yet button
  #Then I should provide information for Chatbot
  
  #Overcoming Anxiety Disorders, Overcome Stress, Overcome Depression, Overcome Madness
  Scenario: User Verifies Chat button
    Given I logged in and was on the dashboard page
    When I click the chatbot button
    And I select and click the chat button
    Then I should provide information for Chatbot

  Scenario: User Returns to the Dashboard Page from the Chatbot Page
    Given I logged in and was on the dashboard page
    When I click the chatbot button
    And I click the return button
    Then I should be redirected to the dashboard page
    
  #Scenario: User Verifies button Attachment
    #Given I logged in and was on the dashboard page
    #When I click the chatbot button
    #And I click the attachment button
    #Then I should provide options for attachments Chatbot
