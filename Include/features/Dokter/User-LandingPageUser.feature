@LandingPageUser
Feature: Landing Page User
  As a user
  I want to access the landing page user
  So I can verify the various parts and features of EmphatiC treatment for mental health support

Background:
    Given I navigate to the EmphatiCare landing page
    
  #Include Home, Service, About Us,  
  Scenario: Verify Home button on Navbar
    When I verify button all the navigation hyperlinks
    Then I should be redirected to the page according to the hyperlink

  #Include Next link on About Us page, Join as Counselor link on Footer
  Scenario: Verify Next and Previous icon in carousel on About Us page
    When I click next and previous icons in the carousel
    Then I should successfully swipe through the content
