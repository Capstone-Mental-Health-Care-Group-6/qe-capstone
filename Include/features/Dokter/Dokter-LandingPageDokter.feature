@LandingPageDokter
Feature: Landing Page Dokter
  As a user
  I want to access the landing page
  So that I can register to become a counselor

  Scenario: Verify Home button on Navbar
    Given I navigate to EmphatiCare landing page
    When I click the home button on the navbar
    Then I should be redirected to the home page

  Scenario: Verify Service button on Navbar
    Given I navigate to EmphatiCare landing page
    When I click the service button on the navbar
    Then I should be redirected to the service page

  Scenario: Verify About Us button on Navbar
    Given I navigate to EmphatiCare landing page
    When I click the about us button on the navbar
    Then I should be redirected to the about us page

  Scenario: Verify Register Now button on Navbar
    Given I navigate to EmphatiCare landing page
    When I click the register now button on the navbar
    Then I should be redirected to the registration page

  Scenario: Verify Register as Counselor button on Navbar
    Given I navigate to EmphatiCare landing page
    When I click the register as counselor button on the navbar
    Then I should be redirected to the counselor registration page

  Scenario: Verify Register Now button on Joining Requirements
    Given I navigate to EmphatiCare landing page
    When I click the register now button on joining requirements
    Then I should be redirected to the registration page for joining requirements

  Scenario: Verify Join Link as Counselor in Footer
    Given I navigate to EmphatiCare landing page
    When I click the join link as a counselor in the footer
    Then I should be redirected to the counselor registration page
