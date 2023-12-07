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



class LogoutDokter {
	@Given("the user clicks profile")
	def givenUserClicksProfile() {
		// Add code to simulate clicking the profile link
	}

	@When("the user clicks the Logout button")
	def whenUserClicksLogoutButton() {
		// Add code to simulate clicking the Logout button
	}

	@When("the user clicks the exit button on the pop-up permissions")
	def whenUserClicksExitButton() {
		// Add code to simulate clicking the exit button on the pop-up permissions
	}

	@Then("the user should be logged out and redirected to the home page")
	def thenUserShouldBeLoggedOut() {
		// Add verification code for successful logout and redirection to the home page
	}

	@When("the user clicks the cancel button on the pop-up permissions")
	def whenUserClicksCancelButton() {
		// Add code to simulate clicking the cancel button on the pop-up permissions
	}

	@Then("the user should remain on the profile page")
	def thenUserShouldRemainOnProfilePage() {
		// Add verification code to ensure the user remains on the profile page
	}

	@When("the user clicks the x button on the pop-up permissions")
	def whenUserClicksXButton() {
		// Add code to simulate clicking the "x" button on the pop-up permissions
	}

	@Then("the user should be canceling logout")
	def thenUserShouldBeCancelingLogout() {
		// Add verification code for the user canceling logout
	}
}