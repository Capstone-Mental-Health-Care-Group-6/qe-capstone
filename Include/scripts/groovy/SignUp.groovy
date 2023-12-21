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



class SignUp {

	// User Signup with Valid Credentials

	@Given("User opens the Sign Up login page")
	def UserOpensSignUp() {
		Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-6.apk', true)
		Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)
		Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)
	}

	@When("User clicks the registered link")
	def UserClickLink() {
		Mobile.tap(findTestObject('RegisterFeature/link register - android.view.View'), 0)
	}

	@And("User fills (.*) in email field")
	def UserFillsEmail(String email) {
		Mobile.tap(findTestObject('RegisterFeature/tap field email - android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field email - android.widget.EditText'), email, 0)
		Mobile.hideKeyboard()
	}

	@And("User fills (.*) in password field")
	def UserFillsPassword(String password) {
		Mobile.tap(findTestObject('RegisterFeature/tap field pw - android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field pw - android.widget.EditText'), password, 0)
		Mobile.hideKeyboard()
	}

	@And("User clicks eye icon in password field")
	def ClickEyePassword() {
		Mobile.tap(findTestObject('RegisterFeature/eye pw - android.widget.Button'), 0)
	}


	@And("User fills (.*) in confirm password field")
	def UserFillsConfirmPassword(String confirmPassword) {
		Mobile.tap(findTestObject('RegisterFeature/tap - field confirm pw android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field confirm pw - android.widget.EditText'), confirmPassword, 0)
		Mobile.hideKeyboard()
	}

	@And("User clicks eye icon in confirm password field")
	def ClickEyeIcon() {
		Mobile.tap(findTestObject('RegisterFeature/eye confirm pw - android.widget.Button'), 0)
	}

	@And("User ticks the checkbox terms and Conditions")
	def UserTicksTheCheckbox() {
		Mobile.tap(findTestObject('RegisterFeature/checkbox - android.widget.CheckBox'), 0)
	}

	@And("User clicks register button")
	def RegisterButton() {
		Mobile.tap(findTestObject('RegisterFeature/button daftar - android.widget.Button'), 0)
	}

	@Then("User goes directly to the token page and filling profile page")
	def DirectlyFillingProfilePage() {
		Mobile.tap(findTestObject('ProfileFilling/View profile filling'), 0)

		Mobile.closeApplication()
	}



	// User verifies profile filling
	@Given("I want to profile filling after register")
	def WantToProfileFilling() {
		Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-6.apk', true)
		Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)
		Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)
		Mobile.tap(findTestObject('RegisterFeature/link register - android.view.View'), 0)
		Mobile.tap(findTestObject('RegisterFeature/tap field email - android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field email - android.widget.EditText'), 'laras1@gmail.com')
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('RegisterFeature/tap field pw - android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field pw - android.widget.EditText'), 'laras1%A')
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('RegisterFeature/eye pw - android.widget.Button'), 0)
		Mobile.tap(findTestObject('RegisterFeature/tap - field confirm pw android.widget.EditText'), 0)
		Mobile.sendKeys(findTestObject('RegisterFeature/field confirm pw - android.widget.EditText'), 'laras1%A')
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('RegisterFeature/eye confirm pw - android.widget.Button'), 0)
		Mobile.tap(findTestObject('RegisterFeature/checkbox - android.widget.CheckBox'), 0)
		Mobile.tap(findTestObject('RegisterFeature/button daftar - android.widget.Button'), 0)
	}


	@When("I fills (.*) in fullname field and click next button")
	def FullNameField(String fullname) {
		Mobile.tap(findTestObject('ProfileFilling/tap field nama lengkap'), 0)
		Mobile.sendKeys(findTestObject('ProfileFilling/field nama lengkap'), fullname, 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('ProfileFilling/button selanjutnya nama lengkap'), 0)
	}

	@And("I fill (.*) in no phone field and click next button")
	def NoPhoneField(String nophone) {
		Mobile.tap(findTestObject('ProfileFilling/tap field nomor ponsel'), 0)
		Mobile.sendKeys(findTestObject('ProfileFilling/field nomor ponsel -1'), nophone, 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('ProfileFilling/button selanjutnya nomor ponsel'), 0)
	}

	@And("I fill bithday in birthday field and click next button")
	def BithdayField() {
		Mobile.tap(findTestObject('ProfileFilling/icon kalender'), 0)
		Mobile.tap(findTestObject('ProfileFilling/button OK calender'), 0)
		Mobile.tap(findTestObject('ProfileFilling/button selanjutnya tanggal lahir'), 0)
	}

	@And("I click the gender button and click next button")
	def GenderButton() {
		Mobile.tap(findTestObject('ProfileFilling/laki laki'), 0)
		Mobile.tap(findTestObject('ProfileFilling/perempuan'), 0)
		Mobile.tap(findTestObject('ProfileFilling/button selanjutnya gender'), 0)
	}

	@And("I click ok for succesfully profile filling")
	def SuccessfullyProfileFilling() {
		Mobile.tap(findTestObject('ProfileFilling/notifikasi OK Profile filling'), 0)
	}

	@Then("I should be logged in to the login page")
	def ToTheLoginPage() {
		Mobile.tap(findTestObject('RegisterFeature/view login page'), 0)

		Mobile.closeApplication()
	}


	// User verify the function of the Login link
	@Given("User open the Sign Up login page")
	def OpenTheSignUp() {
		Mobile.tap(findTestObject('RegisterFeature/view register page'), 0)
	}

	@When("User clicks login link")
	def LoginLink() {
		Mobile.tap(findTestObject('ProfileFilling/link login'), 0)
	}

	@Then("Users go directly to the Login page")
	def GoDireclyLogin() {
		Mobile.tap(findTestObject('RegisterFeature/view login page'), 0)

		Mobile.closeApplication()
	}

	// User verify the function of the Terms and Conditions link
	@When("User clicks Terms and Conditions link")
	def ClickTermsAndCondition() {
		Mobile.tap(findTestObject('RegisterFeature/link syarat dan ketentuan'), 0)
	}

	@Then("Users go directly to the Terms and Conditions page")
	def TermsAndConditionsPage() {
		Mobile.tap(findTestObject('RegisterFeature/view syarat dan ketentuan'), 0)

		Mobile.closeApplication()
	}


}