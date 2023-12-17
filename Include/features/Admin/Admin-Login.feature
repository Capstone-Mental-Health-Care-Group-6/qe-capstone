@LoginAdmin
Feature: As a user i want to login
So i can acces the website page


@positive
  Scenario Outline: Successful Login
   Given I on login page admin
   When I enter valid <email>, and <password>
   And I click Login button as admin
   Then I redirect to dashboard as admin
   
       Examples: 
      | email              			| password   |
      | admintestingg@gmail.com | Admin123	 |
    
#@negative
#	 Scenario Outline: unsuccesfully login empty form
   #Given I on login page admin
   #When I emptying <email>, and <password>
   #Then I should see notify form login must filled
   #
       #Examples: 
      #| email   | password   |
      #| 				| 					 |