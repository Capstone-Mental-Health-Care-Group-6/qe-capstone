@LandingPageDokter
Feature: Landing Page Dokter
  As a user
  I want to access the landing page
  So that I can register to become a counselor

  #Include Home, Service, About Us, Join Link as Counselor in Footer
  Scenario: Verify Home button on Navbar
    Given I navigate to EmphatiCare landing page
    When I verify button and scroll all the navigation hyperlinks
    Then I should be redirected to the correct navigation hyperlinks

  #Include Register now button on the navbar, Register as Counselor button, Register Now button on Joining Requirements
  Scenario: Verify Register Now button
    Given I navigate to EmphatiCare landing page
    When I click the register now button
    Then I should be redirected to the registration page
	#=====================FIX=====================