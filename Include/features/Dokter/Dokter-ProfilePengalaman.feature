@ProfilePengalaman
Feature: Pengalaman
  As a user
  I want to access and edit my work experience on the doctor's dashboard
  So I can update my professional history

Background:
    Given I login on the doctor's dashboard page

#Include  Save Changes Button on Work Experience Page, 
#Save Changes Button on Popup, Cancel Button on Popup, 
#Verify Alert for Data Saved Successfully
  Scenario: User Verify Edit Experience
    When I navigate to the work experience section
    And I fill in the company name
    Then I click the save changes button on the work experience
    
  Scenario: User Verifies the Add Data Button on the Work Experience Page
    When I navigate to the work experience section
    And I click the Add Data button
    Then I should have successfully added a new work experience field
