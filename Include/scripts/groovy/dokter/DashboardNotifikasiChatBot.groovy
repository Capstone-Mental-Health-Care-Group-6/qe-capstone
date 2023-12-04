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
	}

	@When("I click the sidebar menu")
	def clickSidebarMenu() {
	}

	@When("I check the icons in the navbar")
	def clickIconNavbar() {
	}

	@When("I click the chatbot button")
	def clickChatbotButton() {
	}

	@And("I click the send button")
	def clickSendtButton() {
	}

	@And("I select and click the chat button")
	def clickSelectChattButton() {
	}

	@And("I click the yet button")
	def clickYetButton() {
	}

	@And("I click the Done button")
	def clickDoneButton() {
	}

	@And("I click the return button")
	def clickReturnDashboardButton() {
	}

	@And("I click the attachment button")
	def clickAttachmentButton() {
	}

	@Then("I should verify the functionality and correctness of the links")
	def redirectFunctionalityLinks() {
	}

	@Then("I should verify the visibility and correctness of the notification icons")
	def verifyIconNotification() {
	}

	@Then("I should send message with the chatbot successfully")
	def verifySendMessageChatbot() {
	}

	@Then("I should provide information for Chatbot")
	def verifyInformationChatbot() {
	}

	@Then("I should be redirected to the dashboard page")
	def redirectDashboard() {
	}

	@Then("I should provide options for attachments Chatbot")
	def verifyoptionsAttachments() {
	}
}