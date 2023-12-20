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



class BuatJanjiKonseling {

	// [Positive] User explore counseling flow
	@Given("I am in make an appointment menu")
	def navigateToMakeAppointmentMenu() {
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
		
		WebUI.delay(5)
	}

	@When("I click Read more")
	def clickReadMoreButton() {
		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.view.View'), 0)
	}

	@Then("I am redirected to counseling flow page")
	def verifyRedirectToCounselingFlowPage() {
		Mobile.closeApplication()
	}

	// [Positive] User select counseling topics

	@When("I click Start now and select")
	def clickStartNowAndSelectTopic() {
		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.Button'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (1)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (2)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (3)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (4)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (5)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (6)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (7)'), 0)

		Mobile.tap(findTestObject('Object Repository/BuatJanjiKonseling/android.widget.RadioButton (8)'), 0)
	}

	@Then("I am redirected to package and bundle selection page")
	def verifyRedirectToPackageAndBundleSelectionPage() {
		Mobile.closeApplication()
	}
<<<<<<< HEAD
=======

	// [I choose the instant bundle in the introductory package]
	// @CounselingChoosePackage
	// Scenario: Choose Instant Bundle in Introductory Package
	@Given("I am on the instant package and bundle select page")
	def navigateToInstantPackageAndBundlePage() {
	}

	@When("I click the instant package menu")
	def clickInstantPackageMenu() {
	}

	@Then("I am directed to the correct page")
	def verifyDirectedToCorrectPage() {
	}

	//	# [I choose the premium bundle in the introductory package]
	//	# Scenario: Choose Premium Bundle in Introductory Package

	@When("I click the premium package menu")
	def clickPremiumPackageMenu() {
	}

	//	# [I return to the package and bundle selection page from the page select psychologist]
	//	# Scenario: Return to Package and Bundle Selection Page
	@And("I return to page package and bundle selection page")
	def returnToPackageAndBundleSelectionPage() {
	}

	//	# [I choose a psychologist to start the chat]
	//	# Scenario: Choose Psychologist to Start the Chat
	@And("I select and click start chat with doctor")
	def selectAndClickStartChatWithDoctor() {
	}

	//	# [I return to the select psychologist page from the psychologist profile details page]
	//	# Scenario: Return to Select Psychologist Page
	@When("I click the button to return to the previous page")
	def clickButtonToReturnToPreviousPage() {
	}

	//	# [I choose psychologists to see other people's reviews]
	//	# Scenario: Choose Psychologists to See Reviews

	@And("I click the next and previous arrows to see other user reviews")
	def clickNextAndPreviousArrows() {
	}

	//	# [I select available psychology schedules]
	//	# Scenario: Select Available Psychology Schedules
	@And("I select and click available psychology schedules and start the chat")
	def selectAndClickAvailablePsychologySchedulesAndStartChat() {
	}

	//	# [I choose a manual and automatic payment method]
	//	# Scenario: Choose a Manual and Automatic Payment Method
	@And("I verify radio button Manual Transfer BCA, Mandiri, BNI and Payment Gateway, BCA, BRI, BNI, Gopay, QRIS for method payment")
	def verifyRadioButtonForPaymentMethod() {
	}

	@And("I click the payment method using Gopay, complete the payment approval checklist, and click pay now")
	def clickPaymentMethodUsingGopay() {
	}

	//		# [I do not check payment approval]
	//		# Scenario: User do not check payment approval
	@And("I click the payment method using Gopay, didn't complete the payment approval checklist, and click pay now")
	def clickPaymentMethodAndIncompleteChecklist() {
	}

	//		# [I return to the psychologist's profile page from the select payment method page]
	//		# Scenario: Return to Psychologist's Profile Page from Payment Page

	@And("I click return to the psychologist's profile page")
	def clickReturnToPsychologistProfilePage() {
	}

	//		# [I verify dropdown button for payment instructions for manual payments]
	//		# Scenario: Verify Dropdown button for Payment Instructions

	@And("I click drop down button for e-wallet payment instructions")
	def clickDropDownButtonForEWalletPaymentInstructions() {
	}

	@And("I click drop down button for bank transfer payment instructions")
	def clickDropDownButtonForBankTransferPaymentInstructions() {
	}

	@Then("User successfully sees the payment instructions")
	def verifyPaymentInstructions() {
	}

	//		# [I make payments manually by uploading proof of transfer]
	//		# Scenario: Make Manual Payments by Uploading Proof of Transfer

	@And("I select the file and confirm the payment")
	def selectFileAndConfirmPayment() {
	}

>>>>>>> 0b03099b915b281788af88b96a1a6d985e5e0180
}
