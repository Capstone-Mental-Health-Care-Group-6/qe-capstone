package dokter
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



class ManagePencairanSaldo {
	//	@Given("User is on the {string} page")
	//	def userIsOnPage(pageName) {
	//		// Code to navigate to the specified page
	//	}
	//
	//	@When("User clicks the {string} button")
	//	def userClickedButton(buttonName) {
	//		// Code to click the specified button
	//	}
	//
	//	@And("User chooses and clicks a withdrawal method")
	//	def userChoosesAndClicksWithdrawalMethod() {
	//		// Code to choose and click a withdrawal method
	//	}
	//
	//	@And("User fills in the {string} and {string}")
	//	def userFillsInFields(fieldName1, fieldName2) {
	//		// Code to fill in the specified fields
	//	}
	//
	//	@And("User chooses a nominal amount")
	//	def userChoosesNominalAmount() {
	//		// Code to choose a nominal amount
	//	}
	//
	//	@And("User clicks the {string} button")
	//	def userClicksButton(buttonName) {
	//		// Code to click the specified button
	//	}
	//
	//	@Then("User should successfully withdraw the funds")
	//	def userShouldSuccessfullyWithdrawFunds() {
	//		// Code to verify successful withdrawal
	//	}
	//
	//	@Then("User should see an error message about the empty {string}")
	//	def userSeeErrorMessageAboutEmptyField(fieldName) {
	//		// Code to verify the error message for an empty field
	//	}
	//
	//	@And("User clicks the {string} button")
	//	def userClickingButton(buttonName) {
	//		// Code to click the specified button
	//	}
	//
	//	@Then("User should see an error message about the empty {string}")
	//	def userShouldSeeErrorMessageAboutEmptyField(fieldName) {
	//		// Code to verify the error message for an empty field
	//	}
	//
	//	@And("User clicks the {string} button")
	//	def userClicButton(buttonName) {
	//		// Code to click the specified button
	//	}
	//
	//	@Then("User should see an error message about the empty {string} and {string}")
	//	def userShouldSeeErrorMessageAboutEmptyFields(fieldName1, fieldName2) {
	//		// Code to verify the error message for empty fields
	//	}
	//
	//	@And("User clicks the {string} button")
	//	def userClikButton(buttonName) {
	//		// Code to click the specified button
	//	}
	//
	//	@Then("User should cancel the withdrawal process")
	//	def userShouldCancelWithdrawalProcess() {
	//		// Code to verify the cancellation of the withdrawal process
	//	}
}