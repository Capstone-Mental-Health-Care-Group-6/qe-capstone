import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Homepage {
	// Scenario: User navigates the Emphatic Care
  @Given("I launch the Emphatic Care mobile app")
  def launchEmphaticCareApp() {
  }
  
  @When("I tap on the menu menu")
  def tapOnDashboardMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToDashboardPage() {
  }
  
  // Scenario: User navigates the Emphatic Care home menu
  @When("I tap on the home menu")
  def tapOnHomeMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToHomePage() {
  }
  
  // Scenario: User navigates the Emphatic Care appointment menu
  @When("I tap on the appointment menu")
  def tapOnAppointmentMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToAppointmentPage() {
  }
  
  // Scenario: User navigates the Emphatic Care counseling menu
  @When("I tap on the counseling menu")
  def tapOnCounselingMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToCounselingPage() {
  }
  
  // Scenario: User navigates the Emphatic Care history menu
  @When("I tap on the history menu")
  def tapOnHistoryMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToHistoryPage() {
  }
  
  // Scenario: User navigates the Emphatic Care profile menu
  @When("I tap on the profile menu")
  def tapOnProfileMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToProfilePage() {
  }
  
  // Scenario: User navigates the Emphatic Care notification menu
  @When("I tap on the notification menu")
  def tapOnNotificationMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToNotificationPage() {
  }
  
  // Scenario: User navigates the Emphatic Care chatbot menu
  @When("I tap on the notification menu")
  def tapOnChatbotMenu() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToChatbotPage() {
  }
  
  // Scenario: User navigates the Emphatic Care see all link
  @When("I tap on the see all link")
  def tapOnSeeAllLink() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToSeeAllPage() {
  }
  
  // Scenario: User navigates the Emphatic Care article link
  @When("I tap on the article link")
  def tapOnArticleLink() {
  }
  
  @Then("I successfully access the page page")
  def verifyAccessToArticlePage() {
  }
}