$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laras/OneDrive/Documents/Studi Independen/Altera/Capstone Project/WebsiteTest/Include/features/Dokter/Dokter-DashboardNotifikasiChatBot.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  As a user\n  I want to access my dashboard\n  So that I can view menu dashboard",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DashboardNotifikasi"
    }
  ]
});
formatter.scenario({
  "name": "Verify Links in the Sidebar Menu",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DashboardNotifikasi"
    }
  ]
});
formatter.step({
  "name": "I logged in and was on the dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.navigateDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the sidebar menu",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickSidebarMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify the functionality and correctness of the links",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.redirectFunctionalityLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Icons in the Navbar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DashboardNotifikasi"
    }
  ]
});
formatter.step({
  "name": "I logged in and was on the dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.navigateDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the icons in the navbar",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickIconNavbar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify the visibility and correctness of the notification icons",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.verifyIconNotification()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Verifies Chat button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DashboardNotifikasi"
    }
  ]
});
formatter.step({
  "name": "I logged in and was on the dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.navigateDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the chatbot button",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickChatbotButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select and click the chat button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickSelectChattButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should provide information for Chatbot",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.verifyInformationChatbot()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Returns to the Dashboard Page from the Chatbot Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DashboardNotifikasi"
    }
  ]
});
formatter.step({
  "name": "I logged in and was on the dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.navigateDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the chatbot button",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickChatbotButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the return button",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.clickReturnDashboardButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardNotifikasiChatBot.redirectDashboard()"
});
formatter.result({
  "status": "passed"
});
});