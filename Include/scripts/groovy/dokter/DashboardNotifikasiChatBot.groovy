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



class DashboardNotifikasiChatBot {

	@Given("I logged in and was on the dashboard page")
	def navigateDashboardPage() {
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

	@When("I click the sidebar menu")
	def clickSidebarMenu() {

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Chat'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Transaksi'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Pencairan Saldo'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Konten'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Dashboard'))
		WebUI.delay(2)
	}

	@When("I check the icons in the navbar")
	def clickIconNavbar() {
		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/img_via_notif-icon'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))
		WebUI.delay(2)
	}

	@When("I click the chatbot button")
	def clickChatbotButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/div_Lihat Detail_bg-white px-3 py-3 d-flex _c5ac12'))
		WebUI.delay(2)
	}

	@And("I select and click the chat button")
	def clickSelectChattButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/button_Mengatasi Depresi'))
		WebUI.refresh()
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/button_Mengatasi Gangguan Kecemasan'))
		WebUI.refresh()
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/button_Mengatasi Kegilaan'))
		WebUI.refresh()
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/button_Mengatasi Stress'))
		WebUI.takeScreenshot()
		WebUI.delay(3)
	}

	@And("I click the return button")
	def clickReturnDashboardButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/Page_EmphatiCare Doctor/svg'))
		WebUI.delay(2)
	}

	@Then("I should verify the functionality and correctness of the links")
	def redirectFunctionalityLinks() {
		WebUI.closeBrowser()
	}

	@Then("I should verify the visibility and correctness of the notification icons")
	def verifyIconNotification() {
		WebUI.closeBrowser()
	}

	@Then("I should provide information for Chatbot")
	def verifyInformationChatbot() {
		WebUI.closeBrowser()
	}

	@Then("I should be redirected to the dashboard page")
	def redirectDashboard() {
		WebUI.closeBrowser()
	}
}