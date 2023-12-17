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



class TransactionHistory {

	@Given("I am on the transaction history page")
	def navigateTransactionHistoryPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')
		WebUI.maximizeWindow()
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), 'Doctor6@gmail.com')
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), 'password')
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Masuk'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Transaksi'))
		WebUI.delay(2)
	}

	@When("I search for transaction history")
	def searchTransactions() {
		WebUI.refresh()
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'B-1702404844')

		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/td_B-1702404844 (1)'), 10)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		//WebUI.takeScreenshot()
		//WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'nurul fauziah')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/span_nurul fauziah'), 10)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), '13')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/span_13 Des 2023'), 10)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)

		//		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'Premium')
		//
		//		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/span_Paket Premium'), 10)
		//		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		//		WebUI.takeScreenshot()
		//		WebUI.delay(2)
		//		WebUI.refresh()
		//		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), '270000')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/td_270000'), 10)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'bca')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/a_bca'), 10)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.refresh()
		WebUI.delay(2)
	}

	@When("I search for transaction history with no existing data")
	def searchTransactionsNoData() {

		WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'XXX')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/h2_Tidak dapat menemukan data'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.refresh()
	}

	@When("I click filter data based on transaction ID")
	def clickFilterData() {
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/button_Urut Berdasarakan ID'))
	}

	@When("I navigate to view the next transaction data")
	def clickNextTransactions() {
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/svg_manual_p-icon p-paginator-icon'))
	}

	@When("I navigate to view the previous transaction data")
	def clickPrevTransactions() {
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/svg_manual_p-icon p-paginator-icon'))
	}

	@When("I view the details of a transaction")
	def clickDetailTransactions() {
		WebUI.refresh()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/a_bca'))
		WebUI.delay(2)
	}

	@When("I navigate back to the transaction history page")
	def returnTransactions() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))
		WebUI.delay(2)
	}

	@Then("I shoucld see relevant transaction records")
	def transactionRecords() {
		WebUI.closeBrowser()
	}

	@Then("I should see a message indicating no data found")
	def noDataTransactions() {
		WebUI.closeBrowser()
	}

	@Then("I should see filtered transaction records")
	def filteredTransactions() {
		WebUI.closeBrowser()
	}

	@Then("I should see the details of the next transaction")
	def nextDataTransactions() {
		WebUI.closeBrowser()
	}

	@Then("I should see the details of the previous transaction")
	def prevDataTransactions() {
		WebUI.closeBrowser()
	}

	@Then("I should see detailed information about the transaction")
	def detailTransactions() {
		WebUI.closeBrowser()
	}

	@Then("I should be on the transaction history page")
	def navigateTransactionsPage() {
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Dokter-TransactionHistory/a_Transaksi (1)'), 10)
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.closeBrowser()
	}
}