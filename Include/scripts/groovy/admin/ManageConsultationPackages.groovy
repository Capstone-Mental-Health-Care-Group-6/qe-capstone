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



class ManageConsultationPackages {

	@Given("I am logged in and on the consultation packages page")
	def navigateToConsultationPackagesPage() {
	}

	@When("I add a premium counseling package with valid data")
	def addPremiumCounselingPackage() {
	}

	@When("I attempt to add a premium counseling package and cancel")
	def cancelAddPremiumCounselingPackage() {
	}

	@When("I attempt to add a premium counseling package and close the pop-up")
	def closePopupOnAddPremiumCounselingPackage() {
	}

	@Then("the pop-up should be closed successfully")
	def popupClosedSuccessfullyOnAddPremiumCounselingPackage() {
	}

	@When("I edit a premium counseling package with valid data")
	def editPremiumCounselingPackage() {
	}

	@Then("I should see a success message EditPremiumCounselingPackage")
	def successMessageEditPremiumCounselingPackage() {
	}

	@When("I attempt to edit a premium counseling package and cancel")
	def cancelEditPremiumCounselingPackage() {
	}

	@When("I attempt to edit a premium counseling package and close the pop-up")
	def closePopupOnEditPremiumCounselingPackage() {
	}

	@When("I delete a premium counseling package")
	def deletePremiumCounselingPackage() {
	}

	@Then("I should see a success message add premium counseling packages")
	def successMessageDeletePremiumCounselingPackage() {
	}

	@When("I attempt to delete a premium counseling package and cancel")
	def cancelDeletePremiumCounselingPackage() {
	}

	@Then("the operation should be canceled successfully")
	def operationCanceledSuccessfullyOnDeletePremiumCounselingPackage() {
	}
}
