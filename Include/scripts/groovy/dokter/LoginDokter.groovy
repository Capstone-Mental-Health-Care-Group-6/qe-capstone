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



class LoginDokter {

	//	 ===Positive-Login===
	@Given("I navigate to login page")
	def navigateLogin() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')
		WebUI.maximizeWindow()

		WebUI.delay(2)
	}

	@When("I input (.*) and (.*)")
	def inputEmailPassword(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), email)
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), password)
		WebUI.delay(2)
	}

	@Then("I click login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_checkbox me-2'))

		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Masuk'))
		WebUI.delay(2)
	}

	@And("I navigate to dashboard")
	def navigateDashboard() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-LoginDoctor/img'), 30)
		WebUI.delay(2)
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	//	 ===Positive-by-google===
	@When("I click button login by Google")
	def clickLoginGoogle() {
		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/div_Google'))
		WebUI.delay(2)
	}

	@Then("I navigate to choose my Google account")
	def navigateGoogleAccount() {
		WebUI.closeBrowser()
	}

	@And("Error message showed")
	def errorMessage() {
		WebUI.closeBrowser()
	}

	//	 ===Positive-Forgot-Password===
	@When("I click button forgot password")
	def clickLoginButtonForgotPW() {
		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/a_Forgot Password'))
		WebUI.delay(2)
	}

	@Then("I navigate to reset password page")
	def navigateLoginResetPW() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-LoginDoctor/h2_Atur Ulang Kata Sandi Anda'), 30)
		WebUI.takeScreenshot()
		WebUI.delay(2)

		WebUI.closeBrowser()
	}

	//	 ===Positive-Verify-RegistButton===

	@When("I click button regist")
	def clickLoginButtonRegist() {
		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/a_Daftar'))
		WebUI.delay(2)
	}

	@Then("I navigate to regist page")
	def navigateLoginRegistPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-LoginDoctor/button_Daftar'), 30)
		WebUI.takeScreenshot()
		WebUI.delay(2)

		WebUI.closeBrowser()
	}

}