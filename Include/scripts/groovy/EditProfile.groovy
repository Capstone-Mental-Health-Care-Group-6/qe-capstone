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



class EditProfile {
	// [Positive] User Edits Profile
	@Given("on Edit Profile Page")
	def navigateToEditProfilePage() {
				Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-6.apk',
		true)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/android.widget.Button'), 0)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/android.widget.Button (1)'), 0)

		Mobile.tap(findTestObject('LoginTestLaras/android.widget.EditText (1)'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/android.widget.EditText (2)'), 'laras1@gmail.com')

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/android.widget.EditText (3)'), 0)

		Mobile.sendKeys(findTestObject('LoginTestLaras/android.widget.EditText (4)'), 'laras1')

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

		Mobile.delay(5)
		
		//tap menu profile
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.view.View'), 0)
	}

	@When("select Edit Profile")
	def selectEditProfileOption() {
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.EditText'), 0)
		Mobile.setText(findTestObject('Object Repository/EditProfile/android.widget.EditText'), 'qe cantik', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.CheckBox'), 0)
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.CheckBox (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.EditText (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.Button'), 0)
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.EditText (2)'), 0)
		Mobile.setText(findTestObject('Object Repository/EditProfile/android.widget.EditText (1)'), '082323884972', 0)
		Mobile.hideKeyboard()
<<<<<<< HEAD
=======

>>>>>>> 4f5431713db0070d34adb85bd8a099b47a6085a6
	}

	@Then("receive successful data change notification")
	def verifySuccessfulDataChangeNotification() {
		Mobile.tap(findTestObject('Object Repository/EditProfile/android.widget.Button (1)'), 0)

		Mobile.closeApplication()
	}

	//	// [Positive] User Changes Password
	//	@When("select Change Password")
	//	def selectChangePasswordOption() {
	//	}
	//
	//	@Then("receive successful password change notification")
	//	def verifySuccessfulPasswordChangeNotification() {
	//	}
	//
	//	// [Positive] User Views About Us
	//	@Then("I navigate to the correct page")
	//	def verifyNavigationToCorrectPage() {
	//	}
	//
	//	@When("I select Privacy")
	//	def selectZ() {
	//	}
	//
	//	@When("I select About Us")
	//	def selectA() {
	//	}
	//
	//	@When("I select Terms and Conditions")
	//	def selectB() {
	//	}
	//
	//	@When("I select Logout")
	//	def selectC() {
	//	}
	//
	//	@When("I select Delete Account")
	//	def selectD() {
	//	}
}