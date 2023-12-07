@ProfileDataAkademik
Feature: Profile doktor data akademik 
  As a user
  I want to access and edit personal data on the doctor's dashboard
  So I can make changes to my academic data


Scenario: Update Academic Data 
    Given the user is on the dashboard page
    When the user clicks academic data
    Then the user should be on the academic data page

    When the user fills in the university field
    And the user fills in the major and level of education
    And the user fills in the doctor field
    And the user fills in the year of entry and year of university graduation
    And the user clicks the save changes button
    Then the academic data should be successfully updated