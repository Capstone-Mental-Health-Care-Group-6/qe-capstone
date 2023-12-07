@ManageConsultationPackages
Feature: Manage Consultation Packages
  I want to Manage Consultation Packages
  So that I can access and utilize counseling services

  Scenario: Add Premium Counseling Package Data
    Given I am logged in and on the consultation packages page
    When I add a premium counseling package with valid data
    Then I should see a success message add premium counseling packages

  #include "x" button
  Scenario: Cancel Add Premium Counseling Package Data
    Given I am logged in and on the consultation packages page
    When I attempt to add a premium counseling package and cancel
    Then the operation should be canceled successfully

  #Scenario: Verify Button "X" on Add Premium Counseling Package Data
  #Given I am logged in and on the consultation packages page
  #When I attempt to add a premium counseling package and close the pop-up
  #Then the pop-up should be closed successfully
  
  Scenario: Edit Premium Counseling Package Data Successfully
    Given I am logged in and on the consultation packages page
    When I edit a premium counseling package with valid data
    Then I should see a success message

  #include "x" button
  Scenario: Cancel Edit Premium Counseling Package Data
    Given I am logged in and on the consultation packages page
    When I attempt to edit a premium counseling package and cancel
    Then the operation should be canceled successfully

  Scenario: Verify Button "X" on Edit Premium Counseling Package Data
    Given I am logged in and on the consultation packages page
    When I attempt to edit a premium counseling package and close the pop-up
    Then the pop-up should be closed successfully

  Scenario: Delete Premium Counseling Package Data Successfully
    Given I am logged in and on the consultation packages page
    When I delete a premium counseling package
    Then I should see a success message add premium counseling packages

  Scenario: Cancel Delete Premium Counseling Package Data
    Given I am logged in and on the consultation packages page
    When I attempt to delete a premium counseling package and cancel
    Then the operation should be canceled successfully
    
	#=====================FIX=====================