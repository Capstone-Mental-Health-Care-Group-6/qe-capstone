@LandingPageUser
Feature: Landing Page User
  As a user
  I want to access the landing page user
  So I can verify the various parts and features of EmphatiC treatment for mental health support

  Scenario: Verify Home button on Navbar
    Given I navigate to the EmphatiCare landing page
    When I click the home button on the navbar
    Then I should be redirected to the home page

  Scenario: Verify Service button on Navbar
    Given I navigate to the EmphatiCare landing page
    When I click the service button on the navbar
    Then I should be redirected to the service section page

  Scenario: Verify About Us button on Navbar
    Given I navigate to the EmphatiCare landing page
    When I click the about us button on the navbar
    Then I should be redirected to the about us section page

  Scenario: Verify Download Now button on Navbar
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the navbar
    Then I should be redirected to the registration page

  Scenario: Verify Download Now button on Home
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the home page
    Then I should be redirected to the new app download page

  Scenario: Verify Download Now button on About Us
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the about us page
    Then I should be redirected to the new app download page

  Scenario: Verify Next and Previous icon in carousel on About Us page
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the navbar
    And I click next and previous icons in the carousel
    Then I should successfully swipe through the content

  Scenario: Verify Next link on About Us page
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the navbar
    And I click the next link
    Then I should successfully navigate using the next link

  Scenario: Verify Join as Counselor link on Footer
    Given I navigate to the EmphatiCare landing page
    When I click the download now button on the navbar
    And I click the join as a counselor link
    Then I should be redirected to the landing page for counselors
