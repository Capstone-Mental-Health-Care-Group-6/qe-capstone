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



class ProfileDocumentDokter {
	@Given("the user is on the dashboard page")
	def givenUserIsOnDashboardPage() {
		// Add code to navigate to the dashboard page
	}

	@When("the user clicks personal data")
	def whenUserClicksPersonalData() {
		// Add code to simulate clicking the personal data link
	}

	@Then("the user should be on the personal data page")
	def thenUserShouldBeOnPersonalDataPage() {
		// Add verification code to ensure the user is on the personal data page
	}

	@When("the user fills in the full name")
	def whenUserFillsInFullName() {
		// Add code to fill in the full name field
	}

	@When("the user fills in the email")
	def whenUserFillsInEmail() {
		// Add code to fill in the email field
	}

	@When("the user fills in the NIK")
	def whenUserFillsInNIK() {
		// Add code to fill in the NIK field
	}

	@When("the user fills in the cellphone number, date of birth, city or district, and gender")
	def whenUserFillsInPersonalDetails() {
		// Add code to fill in the cellphone number, date of birth, city/district, and gender fields
	}

	@When("the user clicks the save changes button")
	def whenUserClicksSaveChangesButtonForPersonalData() {
		// Add code to simulate clicking the save changes button for personal data
	}

	@Then("the personal data should be successfully updated")
	def thenPersonalDataShouldBeSuccessfullyUpdated() {
		// Add verification code for successful update of personal data
	}
}