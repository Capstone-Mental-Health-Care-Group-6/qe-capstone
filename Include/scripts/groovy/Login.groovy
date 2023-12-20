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

	@Given("I want to log in")
	def inputEmailPassword() {
		Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
		Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 10)

		Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 10)
	}

	@When("I enter the (.*) and (.*)")
	def interEmailPassword(String name, String password) {
		Mobile.setText(findTestObject('LoginFeature/test/android.widget.EditTextEmail'), name, 0)
		Mobile.setText(findTestObject('LoginFeature/test/android.widget.EditTextPW'), password, 0)
		Mobile.tap(findTestObject('Object Repository/LoginFeature/try 1/try 2/android.widget.Button'), 0)
	}


	//Login-InvalidCredentials//
	@When("I enter the invalid (.*) and invalid (.*)")
	def interInvalidEmailPassword(String name, String password) {
		Mobile.setText(findTestObject('LoginFeature/test/android.widget.EditTextEmail'), name, 0)
		Mobile.setText(findTestObject('LoginFeature/test/android.widget.EditTextPW'), password, 0)
		Mobile.tap(findTestObject('Object Repository/LoginFeature/try 1/try 2/android.widget.Button'), 0)
	}

	@Then("I should see an error message and stay on the login page")
	def stayLogin() {
		Mobile.closeApplication()
	}

	//RegisterLink//
	@When("I click the register link")
	def clickRegisterLink() {
	}

	@Then("I should be directed to the registration page")
	def verifyRedirectToRegistrationPage() {
	}
}