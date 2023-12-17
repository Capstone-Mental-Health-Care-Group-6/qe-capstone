#@DashboardAdmin
#Feature: Dashboard
  #As a user
  #I want to access the dashboard
  #So I can manage various aspects of the platform
#
  #@SignUp
  #Scenario: User Navigates to the Dashboard
    #Given I am a registered user
    #When I log in with valid credentials
    #Then I should be redirected to the dashboard
#
# COMMENT : Kalau verify redirect link lebih baik gak gunaain examples, ini biasanya untuk inputan aja
  #@DashboardLinksNavbar
  #Scenario Outline: User Verify Sidebar Menu Links on the Dashboard
    #Given I am logged in and on the dashboard page
    #When I click on <link> in the sidebar menu
    #Then I should be directed to the <link> page
#
    #Examples: 
      #| link                |
      #| Dashboard           |
      #| Manage User         |
      #| User Transactions   |
      #| Counseling Packages |
      #| Manage Doctor       |
      #| Doctor Funds        |
      #| Manage Articles     |
#
#	@NotificationIcon
  #Scenario: User Verify Notification Icons in the Navbar
    #Given I am a registered user
    #And I am logged in and on the dashboard page
    #When I click on the Notification icon in the navbar
    #Then the User Notification pages should be accessible correctly
#	
#	@ProfileIcon
  #Scenario: User Verify Profile Icons in the Navbar
    #Given I am a registered user
    #And I am logged in and on the dashboard page
    #When I click on the Profile icon in the navbar
    #Then the User profile pages should be accessible correctly
