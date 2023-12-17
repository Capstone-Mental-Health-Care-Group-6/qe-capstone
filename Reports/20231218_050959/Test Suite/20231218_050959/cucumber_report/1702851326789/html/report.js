$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laras/OneDrive/Documents/Studi Independen/Altera/Capstone Project/WebsiteTest/Include/features/Dokter/User-LandingPageUser.feature");
formatter.feature({
  "name": "Landing Page User",
  "description": "  As a user\n  I want to access the landing page user\n  So I can verify the various parts and features of EmphatiC treatment for mental health support",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LandingPageUser"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to the EmphatiCare landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageUser.navigatetotheEmpatiCarelandingpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Home button on Navbar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LandingPageUser"
    }
  ]
});
formatter.step({
  "name": "I verify button all the navigation hyperlinks",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageUser.verifybuttonallthenavigation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the page according to the hyperlink",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageUser.redirectToPageAccordingToTheHyperlink()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to the EmphatiCare landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageUser.navigatetotheEmpatiCarelandingpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Next and Previous icon in carousel on About Us page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LandingPageUser"
    }
  ]
});
formatter.step({
  "name": "I click next and previous icons in the carousel",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageUser.NextAndPreviousIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should successfully swipe through the content",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageUser.successfullyswipe()"
});
formatter.result({
  "status": "passed"
});
});