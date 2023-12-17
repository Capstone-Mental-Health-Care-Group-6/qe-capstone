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



class Signup {
	@Given("I am is on the Sign Up page Doctor")
	def signuppage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/register-dokter')
		WebUI.maximizeWindow()
	}
	@When("I fills in the username, email, password, confirm password Doctors")
	def filling() {
		WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Ingat saya_username'), 'doktor')
		WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 'testdoktor@gmail.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Password harus terdiri dari minimal 8_1e27b4'),
				'KgnNhXmhf2aH/UqJ/9M4jA==')
		WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Kata Sandi Tidak Sesuai_confirmPassword'),
				'KgnNhXmhf2aH/UqJ/9M4jA==')
	}
	@And("I Click sign up button Doctor page")
	def butnsign() {
		WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/button_Daftar'))
	}
	@Then("I directed to dashboard Doctors page")
	def godasboardP() {
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')
		WebUI.closeBrowser()
	}


	@Given("I am is on the Signing Up page Doctor")
	def sign() {
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/register-dokter')
	}

	@When("I emptying username, email, password, confirm password Doctors")
	def emptying() {
		WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_username'))

		WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_username'),
				'')

		WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'),
				'')

		WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Password harus terdiri dari minimal 8_1e27b4'),
				'9NLz+4tGZcQ=')

		WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Kata Sandi Tidak Sesuai_confirmPassword'),
				'9NLz+4tGZcQ=')
	}
	@Then("I should see error message")
	def error() {
		WebUI.closeBrowser()
	}
}