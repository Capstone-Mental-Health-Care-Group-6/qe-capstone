Feature: Dashboard Functionality
  As a user of Emphatic Care
  I want to navigate through the dashboard
  So I can access various sections and functionalities

  @tag1
  Scenario Outline: User navigates through the Emphatic Care dashboard
    Given User launches the Emphatic Care mobile app
    When User taps on the "<menu>" menu
    Then User successfully accesses the "<page>" page

    Examples: 
      | menu         | page             |
      | Beranda      | homepage display |
      | Beranda      | home menu        |
      | Beranda      | appointment menu |
      | Beranda      | counseling menu  |
      | Beranda      | history menu     |
      | Beranda      | profile menu     |
      | Beranda      | notification icon|
      | Beranda      | chatbot icon     |
      | Beranda      | see all link     |
      | Beranda      | article link     |
