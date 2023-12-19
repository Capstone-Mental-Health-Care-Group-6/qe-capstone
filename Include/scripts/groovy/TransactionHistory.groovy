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



class TransactionHistory {
	// Scenario: View Transaction History
	@Given("I on dashboard menu")
	def navigateToDashboardMenuForTransactionHistory() {
	}
	
	@When("I taps on the menu transaction history")
	def tapOnTransactionHistoryMenu() {
	}
	
	@Then("I successfully sees the transaction history display")
	def verifyTransactionHistoryDisplay() {
	}
	
	// Scenario: Provide Ratings and Feedback after Counseling
	@Given("I navigate on transaction history menu")
	def navigateToTransactionHistoryMenuForFeedback() {
	}
	
	@When("I provides ratings and feedback")
	def provideRatingsAndFeedback() {
	}
	
	@Then("I successfully sends ratings and feedback")
	def verifySuccessfulRatingsAndFeedbackSubmission() {
	}
	
	// Scenario: Provide Ratings with Blank Feedback after Counseling
	@When("I provides ratings and feedback")
	def provideRatingsAndBlankFeedback() {
	}
	
	@Then("I fails to submit ratings and feedback")
	def verifyFailedSubmissionOfRatingsAndBlankFeedback() {
	}
	
	// Scenario: Cancel Giving Ratings and Feedback
	@When("I clicks the X button")
	def clickXButtonForCancelFeedback() {
	}
	
	@Then("I successfully cancels giving ratings and feedback")
	def verifySuccessfulCancellationOfFeedback() {
	}
	
	// Scenario: Verify Details button on Order History
	@When("I taps the Detail button")
	def tapOnDetailButtonForOrderHistory() {
	}
	
	@Then("I is redirected to the order details page")
	def verifyRedirectionToOrderDetailsPage() {
	}
	
	// Scenario: Verify Give a Rating button on Order History
	@When("I taps the give a rating button")
	def tapOnGiveRatingButtonForOrderHistory() {
	}
	
	@Then("I is redirected to the order details page")
	def verifyRedirectionToOrderDetailsPageForRatingButton() {
	}
	
	// Scenario: Verify Leave a Review button on Order History
	@When("I taps the leave a review button")
	def tapOnLeaveReviewButtonForOrderHistory() {
	}
	
	@Then("I successfully sees the popup for giving ratings and feedback")
	def verifyPopupForRatingAndFeedback() {
	}
	
	// Scenario: Verify Message Icon on Order History
	@When("I taps the message icon")
	def tapOnMessageIconForOrderHistory() {
	}
	
	@Then("I is redirected to the history chat rooms")
	def verifyRedirectionToChatRoomsForMessageIcon() {
	}
	
	// Scenario: Verify Previous Icon on Chat History
	@When("I taps the previous icon")
	def tapOnPreviousIconForChatHistory() {
	}
	
	@Then("I successfully returns to the history page")
	def verifyReturnToHistoryPageForChatHistoryIcon() {
	}
	
	// Scenario: Verify Buy Again button on Order History
	@When("I taps the buy again button")
	def tapOnBuyAgainButtonForOrderHistory() {
	}
	
	@Then("I successfully returns to the Make an Appointment page")
	def verifyReturnToMakeAppointmentPageForBuyAgainButton() {
	}
	
	// Scenario: Verify Previous Icon on Order History
	@When("I taps the previous icon on order")
	def tapOnPreviousIconForOrderHistory() {
	}
	
	@Then("I successfully returns to the order history page")
	def verifyReturnToOrderHistoryPageForPreviousIcon() {
	}
}