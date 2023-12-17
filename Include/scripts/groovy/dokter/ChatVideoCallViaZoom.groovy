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



class ChatVideoCallViaZoom {

// Background:
	@Given ("I am logged in and on the chat menu page")
	def LoggedInAndTheChatMenu () {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard/')
		WebUI.maximizeWindow()
		
	}
	
// User Verify Chat Menu Page Display
    @When ("I open the chat menu page")
	def IOpenTheChatMenu() {
		WebUI.refresh()
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/a_Chat'))
		WebUI.takeScreenshot()
	}
	
// User Verify Active Patient Chat Page View
    @When ("I click on an active patient chat Chat Page View")
	def OnAnActivePatientChatPage() {
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Pasien aktif'))
		WebUI.takeScreenshot()
		}
	
// Scenario: User Verify Ended Chat Page Display
    @When ("I navigate to the ended chat page")
	def INavigateToTheEndedChatPage() {
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhirJokobapak saya hami_718af3'))
		WebUI.takeElementScreenshot(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/element akhir chat -end'))
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Sesi Konsultasi Telah Berakhir (1)'))
		WebUI.takeScreenshot()
	}
	
// Step @When follow the skenario:	
// User Verify More Button Functionality in Active Patient Chat Content
// User Verify Send Button in Chat Room
// User Verify Article Links in Chat Rooms
// User Verify Ends Chat Session Button Functionality
// User Verify Chat Delete Button Functionality
// User Verify Functionality of the Gmeet Button in the Chat Room
	
    @When ("I click on an active patient chat")
	def IclickOnAnActivePatient() {
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Pasien aktif'))
		WebUI.refresh()
		WebUI.takeScreenshot()
	}
	
	
	
	@And ("I click the Show More button")
	def ShowMoreBotton() {
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Show More Room chat'))
		WebUI.takeScreenshot()
	}
	
	@And ("I click the Ends Chat Session Button")
	def EndChatSession() {
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Show More Room chat'))
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button_Akhiri Chat'))
		WebUI.takeScreenshot()
	}
	
	@And ("I click the Chat Delete button")
	def ChatDelete() {
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Show More Room chat'))
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button_Hapus Chat'))
		WebUI.takeScreenshot()
	}
	
	@And ("I click the Send button")
	def IClickTheSendButton() {
		WebUI.setText(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/input - field massage'),
			'saya mengerti, adalah kata kata topeng untuk senjata menenangkan')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button file, img, emoticon'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/img_Smileys  People___EmojiPicker__ epr-emoji-img'))
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/input - field massage'))
		WebUI.takeScreenshot()
	}
	
//	@And ("I click on an article link")
//	def IClickOnAnArticleLink() {
//		
//	}
	
//	@And ("I click the gmeet button")
//	def ClickTheZoomButton() {
//		WebUI.delay(2)
//		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Button gmeet-zoom'))
//		WebUI.takeScreenshot()
//	}
//	
//	
	
	
	@Then ("I should see the active patient chat display")
	def IShouldSeeTheActivePatientChatDisplay() {
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhir'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	}
	
	@Then ("I should see the contents of the active patient chat")
	def ShouldSeeTheContentsOfTheActivePatientChata() {
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Rojakonline Susah TidurAkhiri ChatHapus Chat'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
		
	}
	
	@Then ("I should see the contents of the ended chat")
	def SeeTheContentofTheEndedChat() {
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Sesi Konsultasi Telah Berakhir'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
		
	}
	
	@Then ("I successfully display more actions for the chat")
	def SuccessfullyDisplayMoreAction() {
		WebUI.takeElementScreenshot(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/menu show more'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	}
	
	@Then ("I successfully End chat session")
	def SuccessfullyEndChat() {
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhirJokobapak saya hami_718af3'))
		WebUI.takeElementScreenshot(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/element akhir chat -end'))
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Sesi Konsultasi Telah Berakhir (1)'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
		
		
	}
	
	@Then ("I successfully delete chat")
	def SuccessfullyDeleteChat() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhirJokobapak saya hami_718af3'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	} 
	
	
	@Then ("I successfully send a message")
	def ISuccesfullySendAMessage() {
		WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button send massage'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	}
	
//	@Then ("I should be redirected to the article page")
//	def RedirectedToTheArticlePage() {
//		
//	}
	
//	@Then ("I should be successfully redirected to the new page gmeet app")
//	def SuccessfullyRedirectedToTheNewPage() {
//		
//	}

	
}




