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
  Scenario Outline: User verify button select a counseling topic
    Given I am in make an appointment menu
    When I click Start now and select
    Then I am redirected to package and bundle selection page