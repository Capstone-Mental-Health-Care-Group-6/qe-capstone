@ProfilePengalaman
Feature: Pengalaman
  As a user
  I want to access and edit my work experience on the doctor's dashboard
  So I can update my professional history

	@Valid-data
  Scenario Outline: User Verify Edit Experience
    Given I am logged in on the doctor's dashboard page
    When I navigate to the work experience section
    And I fill in the company name <Company Name>, position <Position>, start working <Start Date>, end working <End Date>, and company address <Company Address>
    And I click the save changes button
    Then I should see a successful message confirming the changes are saved in the doctor's work experience data

    Examples:
      | Company Name        | Position     | Start Date | End Date      | Company Address                      |
      | Rs. Mitra Medika    | HRD          | 2015       | masih bekerja | Jl. S. Parman No 236, Petisah Tengah |

  @SaveChanges-button1
  Scenario: User Verify Save Changes Button on Work Experience Page
    Given I am logged in on the doctor's dashboard page
    When I navigate to the work experience section
    And I fill in the required work experience fields
    And I click the save changes button
    Then I should successfully use the save changes button

	@SaveChanges-button2
  Scenario: User Verify Save Changes Button on Popup
    Given I am logged in on the doctor's dashboard page
    When I fill in the required work experience fields
    And I click the save changes button on the popup
    Then I should successfully use the save changes button

	@SaveChanges-button2
  Scenario: User Verify Cancel Button on Popup
    Given I am logged in on the doctor's dashboard page
    When I fill in the required work experience fields
    And I click the cancel button on the popup
    Then I should successfully cancel the changes and close the save changes popup
	
	@Allert-success
  Scenario: User Verify Alert for Data Saved Successfully
    Given I am logged in on the doctor's dashboard page
    When I fill in the required work experience fields
    And I click the save changes button
    Then I should see an alert confirming that the data has been successfully saved

	@AddData-button
  Scenario: User Verifies the Add Data Button on the Work Experience Page
    Given I am logged in on the doctor's dashboard page
    When I navigate to the work experience section
    And I click the Add Data button
    Then I should have successfully added a new work experience field
