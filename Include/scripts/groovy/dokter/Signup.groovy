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
	//	@Given("the user is on the Sign Up page for Doctor")
	//	def givenUserIsOnDoctorSignUpPage() {}
	//
	//	@When("the user fills in the email")
	//	def whenUserFillsInEmail(String email) {
	//		println email
	//	}
	//
	//	@Then("the email field should be populated with the provided email")
	//	def thenEmailFieldShouldBePopulated() {}
	//
	//	@When("the user fills in the password")
	//	def whenUserFillsInPassword(String password) {
	//		println password
	//	}
	//
	//	@Then("the password field should be populated with the provided password")
	//	def thenPasswordFieldShouldBePopulated() {}
	//
	//	@When("the user fills in the confirm password")
	//	def whenUserFillsInConfirmPassword(String cpassword) {
	//		println cpassword
	//	}
	//
	//	@Then("the confirm password field should be populated with the provided confirm password")
	//	def thenConfirmPasswordFieldShouldBePopulated() {}
	//
	//	@When("the user clicks the register button")
	//	def whenUserClicksRegisterButton() {}
	//
	//	@Then("the registration process should be initiated")
	//	def thenRegistrationProcessShouldBeInitiated() {
	//	}
	//
	//	@When("the user empties the registration form")
	//	def whenUseremptyregform() {}
	//
	//	@Then("the email field should be empty")
	//	def theEmailEmpty() {
	//	}
	//
	//	@And("the password field should be empty")
	//	def passworempty() {
	//	}
	//
	//	@And("the confirm password field should be empty")
	//	def confirmpwempty() {
	//	}
}