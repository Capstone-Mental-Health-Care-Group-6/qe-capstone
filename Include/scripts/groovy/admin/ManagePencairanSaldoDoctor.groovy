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



class ManagePencairanSaldoDoctor {
	@Given("User is at the {Manage Pencairan Dana Dokter} page")
def userIsAtPage(pageName) {
    // Code to navigate to the specified page
}

@When("User clicks the {string} button")
def userClicksButton(buttonName) {
    // Code to click the specified button
}

@When("User clicks one of the lists at the table of Pencairan Dana Dokter")
def userClicksListAtTable() {
    // Code to click one of the lists at the table of Pencairan Dana Dokter
}

@When("User clicks and chooses {string}")
def userClicksAndChoosesStatus(status) {
    // Code to click and choose the specified status
}

@Then("User should be navigated to the {string} page")
def userShouldBeNavigatedToPage(pageName) {
    // Code to verify the navigation to the specified page
}

@Then("User should see detailed information about the selected Pencairan Dana Dokter")
def userShouldSeeDetailedInformation() {
    // Code to verify the display of detailed information
}

@Then("User should see the status of the selected Pencairan Dana Dokter set to {string}")
def userShouldSeeStatusSetTo(status) {
    // Code to verify the status set to the specified value
}
}