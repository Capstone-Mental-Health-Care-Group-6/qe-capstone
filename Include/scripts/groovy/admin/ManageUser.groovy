package admin
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



class ManageUser {
	// Background
	@Given("User is on the dashboard")
	def userIsOnDashboard() {
		// Add code to navigate to the dashboard
	}

	// Scenario: View User Details
	@When("User opens the menu {string}")
	def userOpensMenu(String menu) {
		// Add code to open the specified menu
	}

	@And("User clicks the action button on the user data")
	def userClicksActionButton() {
		// Add code to click the action button on user data
	}

	@And("User chooses {string}")
	def userChoosesAction(String action) {
		// Add code to choose the specified action
	}

	@Then("User should see the details of the selected user account")
	def userShouldSeeUserDetails() {
		// Add assertions or verifications for user details
	}

	// Scenario: Deactivate Account
	@When("User clicks the {string} button to deactivate the account")
	def userClicksButtonToDeactivateAccount(String button) {
		// Add code to click the specified button to deactivate the account
	}

	@Then("User should see a confirmation message for deactivating the account")
	def userShouldSeeConfirmationMessageForDeactivation() {
		// Add assertions or verifications for the displayed confirmation message
	}

	// Scenario: Cancel Deactivate Account
	@When("User clicks the {string} button to cancel deactivating the account")
	def userClicksButtonToCancelDeactivation(String button) {
		// Add code to click the specified button to cancel deactivating the account
	}

	@Then("User should remain on the user details page without deactivating the account")
	def userShouldRemainOnUserDetailsPage() {
		// Add assertions or verifications for remaining on the user details page
	}

	// Scenario: Activate Account
	@When("User clicks the {string} button to activate the account")
	def userClicksButtonToActivateAccount(String button) {
		// Add code to click the specified button to activate the account
	}

	@Then("User should see a confirmation message for activating the account")
	def userShouldSeeConfirmationMessageForActivation() {
		// Add assertions or verifications for the displayed confirmation message
	}

	// Scenario: Cancel Activate Account
	@When("User clicks the {string} button to cancel activating the account")
	def userClicksButtonToCancelActivation(String button) {
		// Add code to click the specified button to cancel activating the account
	}

	@Then("User should remain on the user details page without activating the account")
	def userShouldRemainOnUserDetailsPageWithoutActivation() {
		// Add assertions or verifications for remaining on the user details page without activating the account
	}

	// Scenario: Deactivate Account from User Profile
	@When("User clicks the user profile on the user list data")
	def userClicksUserProfileOnUserList() {
		// Add code to click the user profile on the user list data
	}

	@And("User clicks the deactivate account button")
	def userClicksDeactivateAccountButton() {
		// Add code to click the deactivate account button
	}

	// Reusing the steps for deactivating an account

	// Scenario: Cancel Deactivate Account from User Profile
	@When("User clicks the {string} button to cancel deactivating the account from user profile")
	def userClicksButtonToCancelDeactivationFromUserProfile(String button) {
		// Add code to click the specified button to cancel deactivating the account from user profile
	}

	// Reusing the steps for canceling deactivation

	// Scenario: Search User Data
	@When("User clicks the search field")
	def userClicksSearchField() {
		// Add code to click the search field
	}

	@And("User fills and inputs the search field to search data")
	def userFillsAndInputsSearchField() {
		// Add code to fill and input the search field
	}

	@Then("User should see the search results based on the entered criteria")
	def userShouldSeeSearchResults() {
		// Add assertions or verifications for the displayed search results
	}

	// Scenario: Navigate to Next Page
	@When("User clicks the next button")
	def userClicksNextButton() {
		// Add code to click the next button
	}

	@Then("User should navigate to the next page of user data")
	def userShouldNavigateToNextPage() {
		// Add assertions or verifications for navigating to the next page
	}

	// Scenario: Navigate to Previous Page
	@When("User clicks the prev button")
	def userClicksPrevButton() {
		// Add code to click the prev button
	}

	@Then("User should navigate to the previous page of user data")
	def userShouldNavigateToPreviousPage() {
		// Add assertions or verifications for navigating to the previous page
	}
}