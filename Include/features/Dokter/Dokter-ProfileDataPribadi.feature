@ProfileDataPribadi
Feature: Data Pribadi
  As a user
  I want to access and edit personal data on the doctor's dashboard
  So I can make changes to my profile information

  Scenario Outline: User Verify Personal Data Editing
    Given I am logged in on the doctor's dashboard page
    When I navigate to the personal data section
    And I fill in the full name <Name>, email <Email>, NIK <NIK>, cellphone number <Phone>, date of birth <DOB>, city/district <City>, and gender <Gender>
    And I click the save changes button
    Then I should see a successful message indicating the changes are saved in the doctor's personal data

    Examples: 
      | Name                 | Email           | NIK               | Phone        | Birthdy     | City        | Gender    |
      | Helen Dharani Jiffri | helen@gmail.com | 12050761060100001 | 089678393638 | 17/11/2001 	| DKI Jakarta | Perempuan |

  Scenario: User Verify Save Changes Button on Personal Data Page
    Given I am logged in on the doctor's dashboard page
    When I navigate to the personal data section
    And I fill in the required personal data fields
    And I click the save changes button
    Then I should successfully use the save changes button

  Scenario: User Verify Save Changes Button on Popup
    Given I am logged in on the doctor's dashboard page
    When I fill in the required personal data fields
    And I click the save changes button on the popup
    Then I should successfully use the save changes button

  Scenario: User Verify Cancel Button on Popup
    Given I am logged in on the doctor's dashboard page
    When I fill in the required personal data fields
    And I click the cancel button on the popup
    Then I should successfully cancel the changes and close the save changes popup

  Scenario: User Verify Alert for Data Saved Successfully
    Given I am logged in on the doctor's dashboard page
    When I fill in the required personal data fields
    And I click the save changes button
    Then I should see an alert confirming that the data has been successfully saved

  Scenario: User Close Successfully Saved Data Popup
    Given I am logged in on the doctor's dashboard page
    When I fill in the required personal data fields
    And I click the save changes button
    And I click the x icon on the personal data page popup
    Then I should successfully close the popup indicating saved data

  Scenario: User Return to Previous Profile Edit Data
    Given I am logged in on the doctor's dashboard page
    When I navigate to the personal data section
    And I click the back button
    Then I should successfully return to the previous profile edit data page
