#@ManagePasien
#Feature: Manage pasien
  #As a user
  #I want to access the manage pasien page
  #So I can view and perform actions on patient details
#
  #Background: 
    #Given I have logged in and am on the dashboard page
    #When I click the View Details button on the patient list row
#
  #Scenario: User Verify the Patient Details Pop-up Display
    #Then I should see a pop-up appear with accurate patient detail information
#
  #Scenario: User Verify the Accept Button on the Patient Details Pop-up
    #And I see an Accept button on the pop-up view
    #Then I should successfully use the accept button
#
  #Scenario: User Verify the Ok Button on the Accept Patient Pop-up
    #And I click the Ok button on the pop-up view
    #Then the patient should be successfully admitted
#
  #Scenario: User Verify the x Icon on the Popup Accept the Patient
    #And I click x on the pop-up to accept the patient
    #Then I should successfully close the pop-up with the x icon
#
  #Scenario: User Verify the Function of the Reject Button on the Patient Details Pop-up
    #And I see a Reject button on the pop-up view
    #Then I should successfully use the reject button
#
  #Include Limited Time button, The doctor has urgent activities button, Other Reason
  #Scenario: User Verify Overbooking Buttons in Patient's Rejection Information
    #And I click the Reject button on the pop-up view
    #And I click the overbooking button on the pop-up view
    #Then I should successfully use the overbooking button
#
  #Scenario: User Verify the Reject Button on the Popup Reject the Patient
    #And I click the Reject button 
    #Then I should see a pop-up appear with rejected patient information
#
  #Scenario: User Verify the x Icon on the Popup Reject the Patient
    #And I click x on the pop-up to reject the patient
    #Then I should successfully close the pop-up with the x icon
