$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laras/OneDrive/Documents/Studi Independen/Altera/Capstone Project/WebsiteTest/Include/features/Dokter/Dokter-Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user\n  I want to login with my registered account\n  So that I can manage my account",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginPageDokter"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Positive-Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I input \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Doctor6@gmail.com",
        "password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Positive-Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input Doctor6@gmail.com and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.navigateDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Negative-input-invalid"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I input \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Doctor6@gmail.com",
        "xxx"
      ]
    },
    {
      "cells": [
        "lalala",
        "password"
      ]
    },
    {
      "cells": [
        "lalala",
        "xxx"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Negative-input-invalid"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input Doctor6@gmail.com and xxx",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Negative-input-invalid"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input lalala and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Negative-input-invalid"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input lalala and xxx",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with blank data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Negative-input-blank"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I input \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "",
        "password"
      ]
    },
    {
      "cells": [
        "Doctor6@gmail.com",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with blank data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Negative-input-blank"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input  and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with blank data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Negative-input-blank"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input Doctor6@gmail.com and ",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.inputEmailPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Google account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Positive-by-google"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button login by Google",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.clickLoginGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to choose my Google account",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.navigateGoogleAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Forgot Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Positive-Forgot-Password"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button forgot password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.clickLoginButtonForgotPW()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.navigateLoginResetPW()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Regist",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginPageDokter"
    },
    {
      "name": "@Positive-Verify-RegistButton"
    }
  ]
});
formatter.step({
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginDokter.navigateLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click button regist",
  "keyword": "When "
});
formatter.match({
  "location": "LoginDokter.clickLoginButtonRegist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to regist page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.navigateLoginRegistPage()"
});
formatter.result({
  "status": "passed"
});
});