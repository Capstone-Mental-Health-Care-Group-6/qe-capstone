@BuatJanji
Feature: Make an appointment with a doctor
  As a user
  I want Make an appointment with a doctor
  So I can access my Make an appointment with a doctor

   #[Positive] User explore counseling flow
   #include x button
  Scenario: User verify button click read more make an appointment
    Given I am in make an appointment menu
    When I click Read more
    Then I am directed to the correct page

   #[Positive] User select counseling topics
   #include x button 
  Scenario: User verify button select a counseling topic
    Given I am in make an appointment menu
    When I click Start now and select
    Then I am directed to the correct page

   #[User choose the instant bundle in the introductory package]
  @CounselingChoosePackage
  Scenario: Choose Instant Bundle in Introductory Package
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    Then I am directed to the correct page

  # [User chooses a psychologist to start the chat]
  Scenario: Choose Psychologist to Start the Chat
    Given I am on the instant package and bundle select page
    When I click the premium package menu
    And I select and click start chat with doctor
    And I click the payment method using Gopay, complete the payment approval checklist, and click pay now
    Then I am directed to the correct page