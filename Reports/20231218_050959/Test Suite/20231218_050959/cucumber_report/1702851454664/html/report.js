$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laras/OneDrive/Documents/Studi Independen/Altera/Capstone Project/WebsiteTest/Include/features/Dokter/Dokter-ProfilePengalaman.feature");
formatter.feature({
  "name": "Pengalaman",
  "description": "  As a user\n  I want to access and edit my work experience on the doctor\u0027s dashboard\n  So I can update my professional history",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ProfilePengalaman"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I login on the doctor\u0027s dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfilePengalaman.ILoginOnTheDoctorsDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Verify Edit Experience",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ProfilePengalaman"
    }
  ]
});
formatter.step({
  "name": "I navigate to the work experience section",
  "keyword": "When "
});
formatter.match({
  "location": "ProfilePengalaman.ToTheWorkExperienceSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in the company name",
  "keyword": "And "
});
formatter.match({
  "location": "ProfilePengalaman.IFillInTheCompanyName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the save changes button on the work experience",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfilePengalaman.SaveChangesButton()"
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
  "name": "I login on the doctor\u0027s dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfilePengalaman.ILoginOnTheDoctorsDashboardPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Verifies the Add Data Button on the Work Experience Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ProfilePengalaman"
    }
  ]
});
formatter.step({
  "name": "I navigate to the work experience section",
  "keyword": "When "
});
formatter.match({
  "location": "ProfilePengalaman.ToTheWorkExperienceSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Add Data button",
  "keyword": "And "
});
formatter.match({
  "location": "ProfilePengalaman.AddDataButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should have successfully added a new work experience field",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfilePengalaman.SuccessfullyAddedNewWorkExperienceField()"
});
formatter.result({
  "status": "passed"
});
});