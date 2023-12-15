import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/transaksi')

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'EPT')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/td_EPTG2226LOGK'), 0)

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'Orang Lain')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/div_Orang Lain'), 0)

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), '25 Sep')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/td_25 Sep 2023'), 0)

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'Paket Instan')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/td_Paket Instan'), 0)

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), '120.000')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/td_Rp 120.000'), 0)

WebUI.setText(findTestObject('Object Repository/Dokter-TransactionHistory/input_Riwayat Transaksi_search__input'), 'BCA')

WebUI.verifyElementPresent(findTestObject('Dokter-TransactionHistory/a_BCA'), 0)

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/button_Urut Berdasarakan ID'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/div_BCA_p-dropdown-trigger_1'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/li_10'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/div_BCA_p-dropdown-trigger_1'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/li_15'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/div_BCA_p-dropdown-trigger_1'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/li_5'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/td_OVO'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/a_Detail Transaksi'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/a_BCA_1'))

WebUI.click(findTestObject('Object Repository/Dokter-TransactionHistory/a_Detail Transaksi'))

WebUI.doubleClick(findTestObject('Object Repository/Dokter-TransactionHistory/svg_BCA_p-icon p-paginator-icon_1'))

WebUI.doubleClick(findTestObject('Object Repository/Dokter-TransactionHistory/svg_BCA_p-icon p-paginator-icon'))

WebUI.closeBrowser()

