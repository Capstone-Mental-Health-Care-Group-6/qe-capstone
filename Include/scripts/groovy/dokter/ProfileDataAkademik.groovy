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



class ProfileDataAkademik {
	@Given("the user is on the dashboard Data Akademik page")
	def givenUserIsOnDashboardPage() {
		// Add code to navigate to the dashboard page
	}

	@When("the user clicks academic data")
	def whenUserClicksAcademicData() {
		// Add code to simulate clicking the academic data link
	}

	@Then("the user should be on the academic data page")
	def thenUserShouldBeOnAcademicDataPage() {
		// Add verification code to ensure the user is on the academic data page
	}

	@When("the user fills in the university field")
	def whenUserFillsInUniversityField() {
		// Add code to fill in the university field
	}

	@And("the user fills in the major and level of education")
	def whenUserFillsInMajorAndLevel() {
		// Add code to fill in the major and level of education fields
	}

	@And("the user fills in the doctor field")
	def whenUserFillsInDoctorField() {
		// Add code to fill in the doctor field
	}

	@And("the user fills in the year of entry and year of university graduation")
	def whenUserFillsInYearOfEntryAndGraduation() {
		// Add code to fill in the year of entry and year of university graduation fields
	}

	@And("the user clicks the save changes button data akademik")
	def whenUserClicksSaveChangesButton() {
		// Add code to simulate clicking the save changes button
	}

	@Then("the academic data should be successfully updated")
	def thenAcademicDataShouldBeSuccessfullyUpdated() {
		// Add verification code for successful update of academic data
	}
}