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
		Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-6.apk',
				true)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/next - android.widget.Button'), 0)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/selanjutnya - android.widget.Button (1)'), 0)
	}

	@When("I enter the (.*) and (.*)")
	def interEmailPassword(String name, String password) {

		Mobile.tap(findTestObject('LoginTestLaras/field tap 1 - android.widget.EditText (1)'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/field email - android.widget.EditText (2)'), name)

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/field tap 2 - android.widget.EditText (3)'), 0)

		Mobile.sendKeys(findTestObject('LoginTestLaras/field pw - android.widget.EditText (4)'), password)

		Mobile.hideKeyboard()

	}

	@Then("I should be logged in to the application")
	def I_should_be_logged_in_to_the_application() {
		Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

		Mobile.delay(2)
	}

	//Login-InvalidCredentials//
	@When("I enter the invalid (.*) and invalid (.*)")
	def interInvalidEmailPassword(String email_user, String password_user) {

		Mobile.tap(findTestObject('LoginTestLaras/field tap 1 - android.widget.EditText (1)'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/field email - android.widget.EditText (2)'), email_user)

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/field tap 2 - android.widget.EditText (3)'), 0)

		Mobile.sendKeys(findTestObject('LoginTestLaras/field pw - android.widget.EditText (4)'), password_user)

		Mobile.hideKeyboard()
	}

	@Then("I should see an error message and stay on the login page")
	def stayLogin() {
		Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

		Mobile.delay(2)
	}

	//RegisterLink//
	@Given("I want to verify register link")
	def verifyRegisterLink() {
		Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-6.apk',
				true)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/next - android.widget.Button'), 0)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/selanjutnya - android.widget.Button (1)'), 0)
	}

	@When("I click the register link")
	def clickRegisterLink() {
		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/android.view.View-registersfixup'), 0)
	}

	@Then("I should be directed to the registration page")
	def verifyRedirectToRegistrationPage() {
		//		Mobile.verifyElementVisible(findTestObject('Object Repository/LoginTestLaras/android.view.View (1)'), 0)
		Mobile.delay(2)
		Mobile.closeApplication()
	}

}