@ManageArtikelDoctor
Feature: Manage Artikel Doctor
  As a user
  I want to manage the Article
  So that I can publish and edit article
  
  @positive
  Scenario: I verify sidebar menu konten or article
	  Given I opened dashboard doctor
    When I Clicked button article
    Then I go to artikel pages
    
  #Scenario: I verify feature add article public
  #	Given I open the dashboard doctor
  #	When I Click add button article
  #	And I filling tittle and description article 
  #	And I set visibility to public
  #	Then I click button Upload article
  	
  #Scenario: I verify feature add article private
  #	Given I open dashboard doctors
  #	When I Clicking add button article
  #	And I filled tittle and description article 
  #	And I set visibility to private
  #	Then I clicked button Upload article
  	
  #Scenario: I verify feature add article to draft
  #	Given I open the dashboard doctors
  #	When I Clicking add button article
  #	And I fill tittle and description article 
  #	And I seting visibility to public
  #	Then I click button save to draft
  
  Scenario: I verify choose categories article
    Given I go opened dashboard doctor
  	When I go Clicking add button articles
  	Then I choose one of categories article
  	
  Scenario: I verivy button browse for upload thumbnail 
    Given I go open dashboard doctor
  	When I go Click add button articles
  	And I Click browse button
  	Then I choose file for thumbnail

 
  	@negative 	
  Scenario: I verify feature add article if emptying tittle and description
  	Given I opened dashboard doctors
  	When I Clicking add button articles
  	And I emptying tittle and description article 
  	Then I shoud see error content cant be empty
  	
  	