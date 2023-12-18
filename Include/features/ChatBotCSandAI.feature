@tag
Feature: Chatbot CS dan ChatbotAI
  I want to use this template for my feature file

  # [Positive] Chat AI Interaction
  Scenario: User interacts with Chat AI
    Given on HomePage, I click the robot icon
    When I choose an option
    Then I receive a reply from AI

  # [Positive] Empty State Chat AI
  Scenario: Start Conversation with Empty State Chat AI
    Given on HomePage, I click the robot icon
    When I click Start Conversation, choose an option
    Then I successfully start a chat and receive a reply from AI

  # [Positive] Chatbot CS Interaction
  Scenario: User interacts with Chatbot Customer Support
    Given on HomePage, I click the robot icon
    When I input a question, choose an option
    Then I receive a reply from Customer Support
