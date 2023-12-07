@ProfileDokumen
Feature: Document
As a user i want to fill dokument
for information

Scenario: Update Document on Dashboard
    Given the user is on the dashboard page
    When the user clicks personal data
    Then the user should be on the personal data page

    When the user fills in the full name
    And the user fills in the email
    And the user fills in the NIK
    And the user fills in the cellphone number, date of birth, city or district, and gender
    And the user clicks the save changes button
    Then the personal data should be successfully updated