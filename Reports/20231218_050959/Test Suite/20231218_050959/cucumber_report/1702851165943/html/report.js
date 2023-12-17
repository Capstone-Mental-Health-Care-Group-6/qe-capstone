$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laras/OneDrive/Documents/Studi Independen/Altera/Capstone Project/WebsiteTest/Include/features/Dokter/Dokter-LandingPageDokter.feature");
formatter.feature({
  "name": "Landing Page Dokter",
  "description": "  As a user\n  I want to access the landing page\n  So that I can register to become a counselor",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LandingPageDokter"
    }
  ]
});
formatter.scenario({
  "name": "Verify Home button on Navbar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LandingPageDokter"
    }
  ]
});
formatter.step({
  "name": "I navigate to EmphatiCare landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageDokter.navigateLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify button and scroll all the navigation hyperlinks",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageDokter.verifyButtonHyprelinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the correct navigation hyperlinks",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageDokter.redirectNavigationHyperlinks()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Register Now button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LandingPageDokter"
    }
  ]
});
formatter.step({
  "name": "I navigate to EmphatiCare landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageDokter.navigateLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the register now button",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageDokter.clickRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the registration page",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingPageDokter.redirectRegistration()"
});
formatter.result({
  "status": "passed"
});
});