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



class LandingPageDokter {

	@Given("I navigate to EmphatiCare landing page")
	def navigateLandingPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/')
		WebUI.maximizeWindow()
	}

	@When("I verify button and scroll all the navigation hyperlinks")
	def verifyButtonHyprelinks() {
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/a_Home'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/a_Service'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/a_About Us'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/a_Register'))
		WebUI.delay(3)
		WebUI.takeScreenshot()
		
		WebUI.scrollToPosition(0, 1000)
		
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/a_Gabung Sebagai Konselor'))
	}

	@When("I click the register now button")
	def clickRegister() {
//		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/button_Download Sekarang'))
//		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/button_Daftar Sebagai Konselor'))
	}

	@Then("I should be redirected to the correct navigation hyperlinks")
	def redirectNavigationHyperlinks() {
		WebUI.closeBrowser()
	}

	@Then("I should be redirected to the registration page")
	def redirectRegistration() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/LandingPageDoctor/Page_EmphatiCare Doctor/button_Daftar'), 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}
}