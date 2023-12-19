@Onboarding
Feature: Emphati Care App Onboarding
  As a user
  I want to successfully navigate through the onboarding process
  So I can start using the Emphati Care app

@UserNavigates
  Scenario Outline: User Navigates through Onboarding Steps
    Given I want to go to my dashboard
    When I went through the onboarding page
    Then I should redirect to my dashboard

    #Examples: 
      #| scenario_description              | action_performed                         | verification_status             |
      #| User successfully opened the app  | open the Emphati Care app                | see the onboarding page         |
      #| User clicks skip onboarding     	| click the skip button on onboarding page | be redirected to the Login page |
      #| User clicks next onboarding     	| click the next button on onboarding page | be redirected to the Login page |