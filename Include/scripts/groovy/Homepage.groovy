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



class Homepage {
	
	// Scenario: User navigates the Emphatic Care
	@Given("I launch the Emphatic Care mobile app")
	def launchEmphaticCareApp() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-6.apk', true)

		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/next - android.widget.Button'), 0)

		// login
		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/selanjutnya - android.widget.Button (1)'), 0)

		Mobile.tap(findTestObject('LoginTestLaras/field tap 1 - android.widget.EditText (1)'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/field email - android.widget.EditText (2)'), 'laras1@gmail.com')

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/field tap 2 - android.widget.EditText (3)'), 0)

		Mobile.sendKeys(findTestObject('LoginTestLaras/field pw - android.widget.EditText (4)'), 'laras1')

		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

		WebUI.delay(5)
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
	}

	@When("I tap on the menu menu")
	def tapOnDashboardMenu() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)

		Mobile.tap(findTestObject('Homepage/home page - button buat janji - android.widget.ImageView'), 0)

		Mobile.tap(findTestObject('Homepage/home page - button konseling  - android.widget.ImageView'), 0)

		Mobile.tap(findTestObject('Homepage/home page - button riwayat - android.widget.ImageView'), 0)

		Mobile.tap(findTestObject('Homepage/home page - button menu profile - android.widget.ImageView'), 0)

		Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToDashboardPage() {
//		Mobile.closeApplication()
//	}
=======
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
	}

	@Then("I successfully access the page page")
	def verifyAccessToDashboardPage() {
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc

	// Scenario: User navigates the Emphatic Care home menu
	@When("I tap on the home menu")
	def tapOnHomeMenu() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToHomePage() {
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care appointment menu
	@When("I tap on the appointment menu")
	def tapOnAppointmentMenu() {
		Mobile.tap(findTestObject('Homepage/home page - button buat janji - android.widget.ImageView'), 0)

	}

//	@Then("I successfully access the page page")
//	def verifyAccessToAppointmentPage() {
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care counseling menu
	@When("I tap on the counseling menu")
	def tapOnCounselingMenu() {
		Mobile.tap(findTestObject('Homepage/home page - button konseling  - android.widget.ImageView'), 0)
	}
//
//	@Then("I successfully access the page page")
//	def verifyAccessToCounselingPage() {
//		Mobile.closeApplication()
//	}
=======
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
	}

	// Scenario: User navigates the Emphatic Care appointment menu
	@When("I tap on the appointment menu")
	def tapOnAppointmentMenu() {
	}

	// Scenario: User navigates the Emphatic Care counseling menu
	@When("I tap on the counseling menu")
	def tapOnCounselingMenu() {
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc

	// Scenario: User navigates the Emphatic Care history menu
	@When("I tap on the history menu")
	def tapOnHistoryMenu() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Mobile.tap(findTestObject('Homepage/home page - button riwayat - android.widget.ImageView'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToHistoryPage() {
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care profile menu
	@When("I tap on the profile menu")
	def tapOnProfileMenu() {
		Mobile.tap(findTestObject('Homepage/home page - button menu profile - android.widget.ImageView'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToProfilePage() {
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care notification menu
	@When("I tap on the notification menu")
	def tapOnNotificationMenu() {
		Mobile.tap(findTestObject('Homepage/notifikasi lonceng'), 0)
	}


	@Then("I successfully access the page page")
	def verifyAccessToNotificationPage() {
		Mobile.closeApplication()
	}

	// Scenario: User navigates the Emphatic Care chatbot menu
	@When("I tap on the chatbot menu")
	def tapOnChatbotMenu() {
		Mobile.tap(findTestObject('Homepage/chatbot icon - android.view.View'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToChatbotPage() {
//		Mobile.tap(findTestObject('Homepage/previous chatbot-android.widget.Button'), 0)
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care see all link
	@When("I tap on the see all link")
	def tapOnSeeAllLink() {
		Mobile.tap(findTestObject('Homepage/lihat semua rekoemndasi artikel - android.view.View'), 0)
	}

//	@Then("I successfully access the page page")
//	def verifyAccessToSeeAllPage() {
//		Mobile.closeApplication()
//	}

	// Scenario: User navigates the Emphatic Care article link
	@When("I tap on the article link")
	def tapOnArticleLink() {
		Mobile.tap(findTestObject('Homepage/ARTIKEL KIRI ATAS -android.widget.ImageView'), 0)

	}

//	@Then("I successfully access the page page")
//	def verifyAccessToArticlePage() {
//		Mobile.tap(findTestObject('Homepage/previous artikel'), 0)
//		Mobile.closeApplication()
//	}
=======
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
	}

	// Scenario: User navigates the Emphatic Care profile menu
	@When("I tap on the profile menu")
	def tapOnProfileMenu() {
	}

	// Scenario: User navigates the Emphatic Care notification menu
	@When("I tap on the notification menu")
	def tapOnNotificationMenu() {
	}

	// Scenario: User navigates the Emphatic Care see all link
	@When("I tap on the see all link")
	def tapOnSeeAllLink() {
	}

	// Scenario: User navigates the Emphatic Care article link
	@When("I tap on the article link")
	def tapOnArticleLink() {
	}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
=======
>>>>>>> 74fcb2064ed930535376523b9988f4755aa4a2cc
}