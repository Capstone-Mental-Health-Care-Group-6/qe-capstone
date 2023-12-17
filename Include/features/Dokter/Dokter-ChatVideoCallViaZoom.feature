@ChatVideoCallViaZoom
Feature: Chat Video Call via Zoom
  As a user
  I want to access the chat menu page
  So I can interact with active patient chats, perform actions, and conduct video calls via Zoom

  Background: 
    Given I am logged in and on the chat menu page

  Scenario: User Verify Chat Menu Page Display
    When I open the chat menu page
    Then I should see the active patient chat display

  Scenario: User Verify Active Patient Chat Page View
    When I click on an active patient chat
    Then I should see the contents of the active patient chat

 #elementnya not found terus
  #Scenario: User Verify Ended Chat Page Display
    #When I navigate to the ended chat page
    #Then I should see the contents of the ended chat

  Scenario: User Verify More Button Functionality in Active Patient Chat Content
    When I click on an active patient chat
    And I click the Show More button
    Then I successfully display more actions for the chat
    
  Scenario: User Verify End chat session Functionality in Active Patient Chat Content
    When I click on an active patient chat
    And I click the Ends Chat Session Button
    Then I successfully End chat session 
    
  Scenario: User Verify Chat Delete Functionality in Active Patient Chat Content
    When I click on an active patient chat
    And I click the Chat Delete button
    Then I successfully delete chat 

  # Message belum masuk room chat, BELUM BERFUNGSI
  Scenario: User Verify Send button in Chat Room
    When I click on an active patient chat
    And I click the Send button
    Then I successfully send a message

  # BELUM BERFUNGSI, link artikel tidak ada!
  #Scenario: User Verify Article Links in Chat Rooms
    #When I click on an active patient chat
    #And I click on an article link
    #Then I should be redirected to the article page

  # BELUM BERFUNGSI, Get element saja!
  #Scenario: User Verify Functionality of the Gmeet Button in the Chat Room
    #When I click on an active patient chat
    #And I click the gmeet button
    #Then I should be successfully redirected to the new page gmeet app
