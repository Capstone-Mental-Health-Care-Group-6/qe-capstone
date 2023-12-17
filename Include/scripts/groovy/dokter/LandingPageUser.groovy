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



class LandingPageUser {

	@Given("I navigate to the EmphatiCare landing page")
	def navigatetotheEmpatiCarelandingpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare.vercel.app/')
		WebUI.maximizeWindow()
	}


	@When("I verify button all the navigation hyperlinks")
	def verifybuttonallthenavigation() {
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/a_Home'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/a_Services'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/a_About Us'))
		WebUI.takeScreenshot()

		WebUI.scrollToPosition(0, 1000)
	}


	@When("I click next and previous icons in the carousel")
	def NextAndPreviousIcon() {
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/a_About Us'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/button_Lainnya_splide__arrow splide__arrow--prev'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/button_Lainnya_splide__arrow splide__arrow--prev'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/button_Selanjutnya'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare/a_Gabung Sebagai Konselor'))
		WebUI.takeScreenshot()

		WebUI.scrollToPosition(0, 1000)
	}

	@Then("I should be redirected to the page according to the hyperlink")
	def redirectToPageAccordingToTheHyperlink() {
		WebUI.closeBrowser()
	}

	@Then("I should successfully swipe through the content")
	def successfullyswipe() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/User-LandingPageUser/Page_EmphatiCare Doctor/p_Kamu Seorang Konselor  dan Ingin Menjadi _3f7921'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}
}