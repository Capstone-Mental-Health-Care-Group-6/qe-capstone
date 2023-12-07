package admin
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



class Login {

	@Given("User is already at the login page")
	def userIsAtLoginPage() {
		// Add code to navigate to the login page
	}

	@Given("User already has an admin account")
	def userHasAdminAccount() {
		// Add code to ensure that an admin account exists
	}

	@When("User fills valid name and email")
	def uservalidEmail() {
		// Add code to fill valid name and email
	}

	@When("User fills valid password")
	def userValidPassword() {
		// Add code to fill valid password
	}

	@When("User clicks the login button")
	def userClicksLoginButton() {
		// Add code to perform the login action
	}

	@Then("User should be logged in successfully")
	def userShouldBeLoggedInSuccessfully() {
		// Add assertions or verifications for successful login
		// For example, check if the user is redirected to the home page
	}
	@When("User fills valid name but invalid email")
	def userFillsValidNameInvalidEmail() {
		// Add code to fill valid name and invalid email
	}

	@Then("User should see an error message for invalid email")
	def userShouldSeeErrorMessageForInvalidEmail() {
		// Add assertions or verifications for the displayed error message
	}

	@When("User fills valid name and email")
	def userFillValidNameAndEmail() {
		// Add code to fill valid name and email
	}

	@When("User fills invalid password")
	def userFillsInvalidPassword() {
		// Add code to fill invalid password
	}

	@Then("User should see an error message for invalid password")
	def userShouldSeeErrorMessageForInvalidPassword() {
		// Add assertions or verifications for the displayed error message
	}

	@When("User leaves the name, email, and password empty")
	def userLeavesEmptyFields() {
		// Add code to leave all fields empty
	}

	@Then("User should see an error message for empty fields")
	def userShouldSeeErrorMessageForEmptyFields() {
		// Add assertions or verifications for the displayed error message
	}

	@When("User leaves the name field empty")
	def userLeavesEmptyNameField() {
		// Add code to leave the name field empty
	}

	@When("User fills valid email and password")
	def userFillsValidEmailAndPassword() {
		// Add code to fill valid email and password
	}

	@Then("User should see an error message for the empty name field")
	def userShouldSeeErrorMessageForEmptyNameField() {
		// Add assertions or verifications for the displayed error message
	}

	@When("User fills valid name but leaves the email field empty")
	def userFillsValidNameLeavesEmptyEmailField() {
		// Add code to fill valid name but leave the email field empty
	}

	@When("User fills valid password")
	def userFillsValidPassword() {
		// Add code to fill valid password
	}

	@Then("User should see an error message for the empty email field")
	def userShouldSeeErrorMessageForEmptyEmailField() {
		// Add assertions or verifications for the displayed error message
	}

	@When("User fills valid name and email")
	def userValidNameAndEmail() {
		// Add code to fill valid name and email
	}

	@When("User leaves the password field empty")
	def userLeavesEmptyPasswordField() {
		// Add code to leave the password field empty
	}

	@Then("User should see an error message for the empty password field")
	def userShouldSeeErrorMessageForEmptyPasswordField() {
		// Add assertions or verifications for the displayed error message
	}
}