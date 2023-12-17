@Signupdokter
Feature: User Registration on Doctor's Sign Up Page
As a user i want to acces the app 
so i want to sign up for acces app



@positive
	Scenario: User succesfully signup as a Doctor
    Given I am is on the Sign Up page Doctor
    When I fills in the username, email, password, confirm password Doctors 
    And I Click sign up button Doctor page
    Then I directed to dashboard Doctors page
    
#	 Examples: 
      #| username     |email						| password |	|confirmpassword|
      #| dokteruser	 |dokter@gmail.com	| pw123    |	|pw123				 	|
      #
 @negative
	Scenario: User unsuccesfully signup as a Doctor
    Given I am is on the Signing Up page Doctor
    When I emptying username, email, password, confirm password Doctors 
    Then I should see error message
    
   #Examples: 
      #| username    |email							| password |	|confirmpassword|
      #| 						 |									| 				 |	|							 	|
      #
      
   #@negative
#	Scenario Outline: User unsuccesfully signup as a Doctor
    #Given I am is on the Signing page Doctor
    #When I fill  <username>, <email>, <password> and emptying <confirmpassword> Doctors 
    #And I clicking signing up button Doctor pages
    #Then I see error message confirm password must fill
    #
#	 Examples: 
      #| username    |email							| password |	|confirmpassword|
      #| dokteruser	 |dokter@gmail.com	| pw123    |	|							 	|
    


