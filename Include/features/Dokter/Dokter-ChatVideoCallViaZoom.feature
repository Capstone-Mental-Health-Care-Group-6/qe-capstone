@ChatVideoCallViaZoom
Feature: Chat Video Call via Zoom
  As a user
  I want to access the chat menu page
  So I can interact with active patient chats, perform actions, and conduct video calls via Zoom

  @VerifyChatMenuDisplay
  Scenario: User Verify Chat Menu Page Display
    Given I am logged in and on the chat menu page
    When I open the chat menu page
    Then I should see the active patient chat display

  @ActivePatientChatView
  Scenario: User Verify Active Patient Chat Page View
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    Then I should see the contents of the active patient chat

  @EndedChatDisplay
  Scenario: User Verify Ended Chat Page Display
    Given I am logged in and on the chat menu page
    When I navigate to the ended chat page
    Then I should see the contents of the ended chat

  @MoreButtonFunctionality
  Scenario: User Verify More Button Functionality in Active Patient Chat Content
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    And I click the Show More button
    Then I successfully display more actions for the chat

  @SendButtonFunctionality
  Scenario: User Verify Send Button in Chat Room
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    And I click the Send button
    Then I successfully send a message

  @ArticleLinksFunctionality
  Scenario: User Verify Article Links in Chat Rooms
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    And I click on an article link
    Then I should be redirected to the article page

  @EndsChatSessionFunctionality
  Scenario: User Verify Ends Chat Session Button Functionality
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    And I click the Show More button
    And I click the Ends Chat Session button
    Then I successfully end the chat session and enter the end page

  @ChatDeleteFunctionality
  Scenario: User Verify Chat Delete Button Functionality
    Given I am logged in and on the chat menu page
    When I click on an active patient chat
    And I click the Show More button
    And I click the Chat Delete button
    Then I successfully delete the patient's chat

  @ZoomButtonFunctionality
  Scenario: User Verify Functionality of the Zoom Button in the Chat Room
    Given I am logged in and on the chat menu page
    When I click the Zoom button
    Then I should be successfully redirected to the new page/Zoom app
