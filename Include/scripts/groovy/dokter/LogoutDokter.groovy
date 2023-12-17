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
	@Given("I already login")
	def login() {
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')
	WebUI.maximizeWindow()
	WebUI.delay(2)
	WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), 'Doctor6@gmail.com')
	WebUI.delay(2)

	WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), 'password')
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Masuk'))
	WebUI.delay(2)
	}

	@When("I clicks the logout button")
	def whenUserClicksLogoutButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-Logout/Page_EmphatiCare Doctor/button_Logout'))
	}

	@And("I clicks the exit button on the pop-up permissions")
	def whenUserClicksExitButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-Logout/Page_EmphatiCare Doctor/div_KonfirmasiYakin ingin keluar dari halam_c1d389'))
		WebUI.click(findTestObject('Object Repository/Dokter-Logout/Page_EmphatiCare Doctor/button_Keluar'))
	}

	@Then("I should be logged out and redirected to the login page")
	def thenUserShouldBeLoggedOut() {
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')
	}
	
	@And("I am clicks the cancel button on the pop-up permissions")
	def cancellogout() {
		WebUI.click(findTestObject('Object Repository/Dokter-Logout/Page_EmphatiCare Doctor/div_KonfirmasiYakin ingin keluar dari halam_c1d389'))
		WebUI.click(findTestObject('Object Repository/Dokter-Logout/Page_EmphatiCare Doctor/button_Tidak'))
		
	}
	@Then("I am should remain on the dashboard page")
	def gtppage() {
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')
		
	}
}