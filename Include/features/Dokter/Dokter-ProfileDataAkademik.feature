@ProfileDataAkademik
Feature: Profile doktor data akademik
  As a user
  I want to access and edit personal data on the doctor's dashboard
  So I can make changes to my academic data
  
  @positive
    Scenario: User Verify Update Academic data
    Given I already logged in dashboard dokter
    When I go to profile
    And  I Click data academic
    And I fill in the asal universitas, jenjang pendidikan, tahun masuk universitas, tahun tamat universitas 
    And I clicked the save changes button
    Then I see pop up data succesfully saved
    
      
    Scenario: User Verify Cancel Button on Popup update academic data
    Given I already logged in dashboard dokter
    When I fill in the asal universitas, jenjang pendidikan, tahun masuk universitas, tahun tamat universitas 
    And I click the cancel button on the popup academic data
    Then I successfully canceled changes and close the save changes popup
    
    
   #@negative
 #		Scenario: User Verify Update Academic data emptying form 
    #Given I already logged in dashboard dokter
    #When I go to profile
    #And  I Click data academic
    #And I emptying asal universitas, jenjang pendidikan, tahun masuk universitas, tahun tamat universitas
    #And I clicked the save changes button
    #Then I see message data must be filled
    
  
      
  