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



class Articles {
	// Scenario: View Article Details
	@Given("I on the Home page menu")
	def navigateToHomePageMenu() {
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
		
	}

	@When("I tap on an article")
	def tapOnArticle() {
		Mobile.tap(findTestObject('Homepage/lihat semua rekoemndasi artikel - android.view.View'), 0)
	}

	@Then("I enter the article details page")
	def verifyEnterArticleDetailsPage() {
		
		Mobile.tap(findTestObject('Artikel/artikel paling atas (1)'), 0)
		
		Mobile.tap(findTestObject('Artikel/previous detail artikel'), 0)
		
		Mobile.closeApplication()
	}
//
////	// Scenario: Use Search Field
//	@Then("I successfully use the search field")
//	def verifySuccessfulSearch() {
//		Mobile.tap(findTestObject('Artikel/search button'), 0)
//		Mobile.tap(findTestObject('Artikel/search button di page artikel'), 0)
//		Mobile.closeApplication()
//	}
//
//	// Scenario: Search with Invalid Keywords
//	@When("I search for keywords")
//	def searchForInvalidKeywords() {
//	}
//
//	@Then("I don't find the expected search results")
//	def verifyInvalidSearchResults() {
//	}

	// Scenario: Navigate to Previous Page
	@When("I tap the previous button")
	def tapOnPreviousButton() {
		Mobile.tap(findTestObject('Homepage/lihat semua rekoemndasi artikel - android.view.View'), 0)
		
		Mobile.tap(findTestObject('Artikel/artikel paling atas (1)'), 0)

	}

	@Then("I view the previous homepage from the article selection page")
	def verifyReturnToPreviousHomepage() {
		
		Mobile.closeApplication()
	}

//	// Scenario: Use Keyword Category button
//	@When("I tap the button category button")
//	def tapOnKeywordCategoryButton() {
//	}
//
//	@Then("I successfully search for articles using keywords")
//	def verifySearchForArticlesWithKeywords() {
//	}

	// Scenario: Return from Article Details
	@When("I tap the previous button from article details")
	def tapOnPreviousButtonFromArticleDetails() {
		Mobile.tap(findTestObject('Artikel/previous detail artikel'), 0)
	}

	@Then("I return to the previous article selection page")
	def verifyReturnToPreviousArticleSelectionPage() {
		Mobile.tap(findTestObject('Artikel/previous artikel'), 0)
		
		Mobile.closeApplication()
	}

}