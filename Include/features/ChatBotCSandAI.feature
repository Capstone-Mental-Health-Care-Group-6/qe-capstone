@tag
Feature: Chatbot CS dan ChatbotAI
  I want to use this template for my feature file

  # [Positive] Chat AI Interaction
  Scenario: User interacts with Chat AI
    Given on HomePage, I click the robot icon
    When I choose an option
    Then I receive a reply from AI

  # [Positive] return back to homepage
  Scenario: User return back to homepage from Chat AI page
    Given on HomePage, I click the robot icon
    When I click return back to homepage
    Then I successfully back to homepage