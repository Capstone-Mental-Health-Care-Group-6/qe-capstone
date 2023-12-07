package admin
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



class ManageDoctor {

	@Given("I am on the manage doctor page")
	def navigateManageDoctorPage() {
	}

	@Given("I am on the dashboard doctor page")
	def navigateDashboardforManageDoctorPage() {
	}

	@When("I click the doctor profile on the doctor list data")
	def clickDoctorProfile() {
	}

	@When("I click the doctor profile action button on the doctor list data")
	def clickDoctorProfileListData() {
	}

	@When("I click the Next button from the list data doctor")
	def clickNextButtonManageDoctor() {
	}

	@When("I click the Previous button from the list data doctor")
	def clickPrevButtonManageDoctor() {
	}

	@When("I input the keyword to search")
	def clickKeySearch() {
	}

	@When("I click the button filter")
	def clickButtonFilterManageDoctor() {
	}

	@When("I click on the doctor's application card")
	def clickDoctorApplicationCard() {
	}

	@When("I click on the notification")
	def clickNotificationManageDoctor() {
	}

	@When("I input the keyword to search data doctor application")
	def inputKeyDataDoctorApplication() {
	}

	@When("I open the menu and click on Manage Doctor")
	def openMenuonManageDoctor() {
	}

	@When("I input a keyword that doesn't exist in the doctor data")
	def inputKeyDoesntExist() {
	}

	@And("I click the Deactivate Account button")
	def clickDeactivateAccount() {
	}

	@And("I click the cancel button to deactivate the account")
	def clickCancelDeactivate() {
	}

	@And("I click the detail information doctor")
	def clickDetailInfo() {
	}

	@And("I click the Tooltip Info button")
	def clickTooltipInfo() {
	}

	@And("I click the Deactivate Account button table")
	def clickDeactiveAccountonTable() {
	}

	@And("I click the View Account Details button")
	def clickViewAccountDetails() {
	}

	@And("I click to accept the doctor's request")
	def clickAcceptDoctorRequest() {
	}

	@And("I click cancel in the alert to cancel the doctor's request")
	def clickCancelAlertRequest() {
	}

	@And("I click the filter data")
	def clickFilterManageDoctorApplicationCard() {
	}

	@And("I click the Reject Payment button")
	def clickRejectPayment() {
	}

	@And("I click the cancel button")
	def clickCancelDoctorApplicationCard() {
	}

	@Then("I should successfully receive the appropriate results")
	def successManageDoctor() {
	}
}