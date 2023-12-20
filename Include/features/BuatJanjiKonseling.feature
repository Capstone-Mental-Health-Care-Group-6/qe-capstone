@BuatJanji
Feature: Make an appointment with a doctor
  As a user
  I want Make an appointment with a doctor
  So I can access my Make an appointment with a doctor

  # [Positive] User explore counseling flow
  # include x button
  Scenario: User verify button click read more make an appointment
    Given I am in make an appointment menu
    When I click Read more
    Then I am redirected to counseling flow page

  # [Positive] User select counseling topics
  # include x button
  Scenario: User verify button select a counseling topic
    Given I am in make an appointment menu
    When I click Start now and select
    Then I am redirected to package and bundle selection page

  # [User choose the instant bundle in the introductory package]
  @CounselingChoosePackage
  Scenario: Choose Instant Bundle in Introductory Package
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    Then I am directed to the correct page

  # [User choose the premium bundle in the introductory package]
  Scenario: Choose Premium Bundle in Introductory Package
    Given I am on the instant package and bundle select page
    When I click the premium package menu
    Then I am directed to the correct page

  # [User returns to the package and bundle selection page from the page select psychologist]
  @CounselingChooseDoctor
  Scenario: Return to Package and Bundle Selection Page
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I return to page package and bundle selection page
    Then I am directed to the correct page

  # [User chooses a psychologist to start the chat]
  Scenario: Choose Psychologist to Start the Chat
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    Then I am directed to the correct page

  # [Users return to the select psychologist page from the psychologist profile details page]
  Scenario: Return to Select Psychologist Page
    Given I am on the instant package and bundle select page
    When I click the button to return to the previous page
    Then I am directed to the correct page

  # [Users choose psychologists to see other people's reviews]
  Scenario: Choose Psychologists to See Reviews
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I click the next and previous arrows to see other user reviews
    Then I am directed to the correct page

  # [User selects available psychology schedules]
  Scenario: Select Available Psychology Schedules
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    Then I am directed to the correct page

  # [User choose an manual and otomatis payment method]
  Scenario: User choose an manual and otomatis payment method
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    And I verify radio button Manual Transfer BCA, Mandiri, BNI and Payment Gateway, BCA, BRI, BNI, Gopay, QRIS for method payment
    And I click the payment method using Gopay, complete the payment approval checklist, and click pay now
    Then I am directed to the correct page

  # [User do not check payment approval]
  Scenario: User do not check payment approval
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    And I click the payment method using Gopay, didn't complete the payment approval checklist, and click pay now
    Then I am directed to the correct page

  # [User returns to the psychologist's profile page from the select payment method page]
  Scenario: Return to Psychologist's Profile Page from Payment Page
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    And I click the payment method using Gopay, complete the payment approval checklist, and click pay now
    And I click return to the psychologist's profile page
    Then I am directed to the correct page

# [User verifies dropdown button for payment instructions for manual payments]
  Scenario: Verify Dropdown button for Payment Instructions
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    And I click the payment method using Gopay, complete the payment approval checklist, and click pay now
    And I click drop down button for e-wallet payment instructions
    And I click drop down button for bank transfer payment instructions
    Then User successfully sees the payment instructions

  # [Users make payments manually by uploading proof of transfer]
  Scenario: Make Manual Payments by Uploading Proof of Transfer
    Given I am on the instant package and bundle select page
    When I click the instant package menu
    And I select and click start chat with doctor
    And I select and click available psychology schedules and start the chat
    And I click the payment method using Gopay, complete the payment approval checklist, and click pay now
    And I select the file and confirm the payment
    Then I am directed to the correct page
