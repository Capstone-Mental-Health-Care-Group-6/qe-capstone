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



class ChatBotAI {
	//	# [Positive] Chat AI Interaction
	@Given("on HomePage, I click the robot icon")
	def clickRobotIcon() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.widget.Button'), 0)
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.widget.Button (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.widget.EditText'), 0)
		Mobile.setText(findTestObject('Object Repository/Chatbot/android.widget.EditText'), 'laras1@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/Chatbot/android.widget.EditText (1)'), 'laras1', 0)
		Mobile.hideKeyboard()
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.widget.Button (2)'), 0)
		Mobile.tap(findTestObject('Object Repository/Chatbot/android.view.View'), 0)

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
		Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-6.apk',
						true)
		
		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/next - android.widget.Button'), 0)
		
		Mobile.tap(findTestObject('Object Repository/LoginTestLaras/selanjutnya - android.widget.Button (1)'), 0)
		
		Mobile.tap(findTestObject('LoginTestLaras/field tap 1 - android.widget.EditText (1)'), 0)
		
		Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/field email - android.widget.EditText (2)'), 'laras1@gmail.com')
		
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('LoginTestLaras/field tap 2 - android.widget.EditText (3)'), 0)
		
		Mobile.sendKeys(findTestObject('LoginTestLaras/field pw - android.widget.EditText (4)'), 'laras1')
		
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)
		
		Mobile.delay(5)
		//CLick AI icon
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View-iconchatbot'), 0)
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

	@When("I choose an option")
	def chooseOption() {
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View-depresi'), 0)
		Mobile.delay(10)

	}

	@Then("I receive a reply from AI")
	def verifyReplyFromAI() {
		Mobile.closeApplication()
	}

	//	# [Positive] return back to
	@When("I click return back to homepage")
	def startConversationWithOption() {
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.widget.Button-returnback'), 0)

	}

	@Then("I successfully back to homepage")
	def verifyChatStartAndReplyFromAI() {
		Mobile.delay(2)
		Mobile.closeApplication()
	}


}