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



class EditProfileLogout {

	@Given("I am logged in")
	def navigateLoginPage() {
	}

	@When("I edit my profile with valid information and close the success pop-up")
	def editProfileWithValidInfo() {
	}

	@Then("I should see a success message")
	def successMessage() {
	}

	@When("I edit my profile with a blank name")
	def editProfileWithBlankName() {
	}

	@Then("I should see an error message")
	def errorMessage() {
	}

	@When("I edit my profile with a blank email")
	def editProfileWithBlankEmail() {
	}

	@When("I edit my profile with a blank old password")
	def editProfileWithBlankOldPassword() {
	}

	@When("I edit my profile with a blank new password")
	def editProfileWithBlankNewPassword() {
	}

	@When("I log out and confirm")
	def logOutAndConfirm() {
	}

	@Then("I should be successfully logged out")
	def successfullyLoggedOut() {
	}

	@When("I log out and cancel")
	def logOutAndCancel() {
	}

	@Then("I should remain logged in")
	def remainLoggedIn() {
	}
}
