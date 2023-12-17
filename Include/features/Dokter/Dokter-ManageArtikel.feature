@ManageArtikel
Feature: Manage Artikel Doctor
  As a user
  I want to manage the Article
  So that I can publish and edit article
  
  @positive
  Scenario: I verify sidebar menu konten or article
	  Given I opened dashboard doctor
    When I clicked button konten
    And I go to artikel pages

  
  Scenario: I verify button  list number
    Given I opened dashboard doctor
  	When I clicked button konten
  	And I go to artikel pages
  	Then I click option number
  	
  Scenario: I verify lihat artikel button
    Given I opened dashboard doctor
  	When I clicked button konten
  	And I go to artikel pages
  	Then I click lihat artikel option
  	
  	Scenario: I verify lihat edit artikel
    Given I opened dashboard doctor
  	When I clicked button konten
  	And I go to artikel pages
  	Then I click edit artikel option
  	
  
  	    
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
  	