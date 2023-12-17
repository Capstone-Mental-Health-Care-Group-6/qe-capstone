@ProfileDataAkademik
Feature: Profile doktor data akademik
  As a user
  I want to access and edit personal data on the doctor's dashboard
  So I can make changes to my academic data
  
  @positive
    Scenario Outline: User Verify Update Academic data
    Given I already logged in dashboard dokter
    When I go to profile
    And  I Click data academic
    And I fill in the asal universitas <University>, jenjang pendidikan <Education>, tahun masuk universitas <EnrollmentUni>, tahun tamat universitas <GraduationUni>
    And I clicked the save changes button
    Then I see pop up data succesfully saved
    
    Examples: 
      | University              | Education  | EnrollmentUni | GraduationUni  | 
      | Universitas Indonesia		| S1				 | 2021					 | 2024						| 
      
    Scenario: User Verify Cancel Button on Popup update academic data
    Given I login on the doctor dashboard page
    When I already fill in the required personal data fields
    And I click the cancel button on the popup academic data
    Then I successfully canceled changes and close the save changes popup
    
    
   @negative
 		Scenario Outline: User Verify Update Academic data emptying form 
    Given I go to logged in dashboard dokters
    When I go to profile doctors
    And  I Click data academic doctors
    And I emptying asal universitas <University>, jenjang pendidikan <Education>, tahun masuk universitas <EnrollmentUni>, tahun tamat universitas <GraduationUni>
    And I clicking the save changes buttons
    Then I see message data must be filled
    
    Examples: 
      | University  | Education | EnrollmentUni | GraduationUni | 
      | 						| 				  |								| 							| 
      
  