Feature: profile filling Functionality
  As a user of Emphatic Care
  I want to navigate through the profile filling
  So I can access various sections and functionalities

  Scenario: User navigates through the profile filling
    Given I want to profile filling
    When I input profile fillling
    And I fills <full name > in name field and click next button
    And I fills <no phone> in no phone field and click next button
    And I fills <birthday> in birthday field and click next button
    And I click the gender button and click next button
    And I click ok for succesfully profile filling
    Then I should be logged in to the the login page
