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

		Mobile.delay(3)

		//CLick AI icon
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View-iconchatbot'), 0)
	}

	@When("I choose an option")
	def chooseOption() {
<<<<<<< HEAD
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.widget.Button (2)'), 0)
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View'), 0)
=======
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View-ggkecemasan'), 0)
		Mobile.delay(10)

>>>>>>> 4f5431713db0070d34adb85bd8a099b47a6085a6
	}

	@Then("I receive a reply from AI")
	def verifyReplyFromAI() {
<<<<<<< HEAD

		Mobile.tap(findTestObject('Object Repository/Chatbott/android.view.View (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.widget.Button (3)'), 0)
=======
		Mobile.closeApplication()
>>>>>>> 4f5431713db0070d34adb85bd8a099b47a6085a6
	}

	//	# [Positive] return back to homepage
	@When("I click return back to homepage")
	def startConversationWithOption() {
		Mobile.tap(findTestObject('Object Repository/Chatbott/android.widget.Button-returnback'), 0)
	}

	@Then("I successfully back to homepage")
	def verifyChatStartAndReplyFromAI() {
		Mobile.delay(2)
		Mobile.closeApplication()
	}

	//	# [Positive] Chatbot CS Interaction
	@When("I input a question, choose an option")
	def inputQuestionAndChooseOption() {
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.widget.Button (2)'), 0)
		
	}

	@Then("I receive a reply from Customer Support")
	def verifyReplyFromCustomerSupport() {
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.widget.ImageView'), 0)
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.view.View'), 0)
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.view.View (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.view.View (2)'), 0)
		Mobile.tap(findTestObject('Object Repository/ChatCS/android.widget.Button (3)'), 0)
	}
}