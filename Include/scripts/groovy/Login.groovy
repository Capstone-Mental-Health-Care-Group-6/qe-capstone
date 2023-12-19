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

	//Login-ValidCredentials//
	@Given("I want to log in with valid email and password")
	def inputEmailPassword() {
		Mobile.startApplication('C:\\javaproject\\Capstone - QE\\app-release-1 (1).apk', true)
		Mobile.tap(findTestObject('Object Repository/LoginFeature-spy/button_skips_onBoarding'), 0)
		Mobile.tap(findTestObject('Object Repository/LoginFeature-spy/button_next_onBoarding'), 0)
	}

	@When("I enter the (.*) and (.*)")
	def interEmailPassword(String name, String password) {
		Mobile.setText(findTestObject('Object Repository/LoginFeature-spy/Field_email_login'), 'user@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/LoginFeature-spy/Field_email_password'), 'user12345', 0)
		Mobile.tap(findTestObject('Object Repository/LoginFeature-spy/button_Login'), 0)
	}

	@Then("I should be logged in to the application")
	def I_should_be_logged_in_to_the_application() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/LoginFeature-spy/Logo_emphatiCare'), 0)
		Mobile.closeApplication()
	}

	//Login-InvalidCredentials//

	//RegisterLink//

	//GoogleButton//



}