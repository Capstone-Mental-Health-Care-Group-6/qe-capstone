@ProfileDataPribadi
Feature: Data Pribadi
  As a user
  I want to access and edit personal data on the doctor's dashboard
  So I can make changes to my profile information


# Bdd belum bisa dijalankan, cuz field calender dan upload pitcure!

Background: 
    Given I am logged in on the doctor's dashboard page

# Include User Verify Save Changes Button	
  Scenario: User Verify Personal Data Editing
    When I navigate to the personal data section
    And I fill in the personal data 
    And I click the save changes button
    Then I should see a successful message indicating the changes are saved in the doctor's personal data

  Scenario: User Verify Save Changes Button on Popup
    When I fill in the required personal data fields
    And I click the save changes button on the popup
    Then I should successfully use the save changes button

  Scenario: User Verify Cancel Button on Popup
    When I fill in the required personal data fields
    And I click the cancel button on the popup
    Then I should successfully cancel the changes and close the save changes popup

  Scenario: User Verify Alert for Data Saved Successfully
    When I fill in the required personal data fields
    And I click the save changes button
    Then I should see an alert confirming that the data has been successfully saved

  Scenario: User Close Successfully Saved Data Popup
    When I fill in the required personal data fields
    And I click the save changes button
    And I click the x icon on the personal data page popup
    Then I should successfully close the popup indicating saved data

  Scenario: User Return to Previous Profile Edit Data
    When I navigate to the personal data section
    And I click the back button
    Then I should successfully return to the previous profile edit data page
