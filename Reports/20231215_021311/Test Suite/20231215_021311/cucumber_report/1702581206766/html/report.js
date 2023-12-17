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
  "name": "I input \u003cusername\u003e and \u003cpassword\u003e",
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
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Dokter6@gmail.com",
        "Dokter@1"
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
  "name": "I input Dokter6@gmail.com and Dokter@1",
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
  "name": "I input invalid \u003cusername1\u003e and invalid \u003cpassword1\u003e",
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
        "username1",
        "password1"
      ]
    },
    {
      "cells": [
        "Dokter6@gmail.com",
        "xxx"
      ]
    },
    {
      "cells": [
        "lalala",
        "Dokter@1"
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
  "name": "I input invalid Dokter6@gmail.com and invalid xxx",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"I input invalid Dokter6@gmail.com and invalid xxx\" matches more than one step definition:\n  \"I input (.*) and (.*)\" in LoginDokter.inputEmailPassword(String,String)\n  \"I input invalid (.*) and invalid (.*)\" in LoginDokter.inputBlankEmailPassword(String,String)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:89)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:43)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:152)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:197)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:217)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1702581095926.run(Script1702581095926.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1702581191982.run(TempTestSuite1702581191982.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "skipped"
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
  "name": "I input invalid lalala and invalid Dokter@1",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"I input invalid lalala and invalid Dokter@1\" matches more than one step definition:\n  \"I input (.*) and (.*)\" in LoginDokter.inputEmailPassword(String,String)\n  \"I input invalid (.*) and invalid (.*)\" in LoginDokter.inputBlankEmailPassword(String,String)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:89)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:43)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:152)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:197)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:217)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1702581095926.run(Script1702581095926.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1702581191982.run(TempTestSuite1702581191982.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "skipped"
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
  "name": "I input invalid lalala and invalid xxx",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"I input invalid lalala and invalid xxx\" matches more than one step definition:\n  \"I input (.*) and (.*)\" in LoginDokter.inputEmailPassword(String,String)\n  \"I input invalid (.*) and invalid (.*)\" in LoginDokter.inputBlankEmailPassword(String,String)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:89)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:43)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:152)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:197)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:217)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1702581095926.run(Script1702581095926.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1702581191982.run(TempTestSuite1702581191982.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "skipped"
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
  "name": "I input blank \u003cusername2\u003e and blank \u003cpassword2\u003e",
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
        "username2",
        "password2"
      ]
    },
    {
      "cells": [
        "",
        "Dokter@1"
      ]
    },
    {
      "cells": [
        "Dokter6@gmail.com",
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
  "name": "I input blank  and blank Dokter@1",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"I input blank  and blank Dokter@1\" matches more than one step definition:\n  \"I input (.*) and (.*)\" in LoginDokter.inputEmailPassword(String,String)\n  \"I input blank (.*) and blank (.*)\" in LoginDokter.inputInvalidEmailPassword(String,String)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:89)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:43)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:152)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:197)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:217)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1702581095926.run(Script1702581095926.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1702581191982.run(TempTestSuite1702581191982.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "skipped"
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
  "name": "I input blank Dokter6@gmail.com and blank ",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runtime.AmbiguousStepDefinitionsException: \"I input blank Dokter6@gmail.com and blank \" matches more than one step definition:\n  \"I input (.*) and (.*)\" in LoginDokter.inputEmailPassword(String,String)\n  \"I input blank (.*) and blank (.*)\" in LoginDokter.inputInvalidEmailPassword(String,String)\n\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:89)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:43)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:136)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:108)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:98)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\r\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:264)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1034)\r\n\tat groovy.lang.Closure.call(Closure.java:420)\r\n\tat groovy.lang.Closure.call(Closure.java:414)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:75)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:69)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:152)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:75)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallStatic(CallSiteArray.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:197)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callStatic(AbstractCallSite.java:217)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:248)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:128)\r\n\tat Script1702581095926.run(Script1702581095926.groovy:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:448)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:439)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:418)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:410)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:285)\r\n\tat com.kms.katalon.core.common.CommonExecutor.accessTestCaseMainPhase(CommonExecutor.java:65)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:148)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:106)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:187)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:144)\r\n\tat TempTestSuite1702581191982.run(TempTestSuite1702581191982.groovy:36)\r\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\r\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:496)\r\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:597)\r\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:329)\r\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:315)\r\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:134)\r\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:114)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:116)\r\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:138)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDokter.clickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Error message showed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDokter.errorMessage()"
});
formatter.result({
  "status": "skipped"
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