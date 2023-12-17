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



class ManagePencairanSaldo {
	@Given("I Already login to manage withdraw")
	def mngwdrw() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')
		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), 'Doctor6@gmail.com')

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), 'password')
	}
	@When("I clicked side button pencairan saldo")
	def btnsld() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/a_Pencairan Saldo'))
	}
	@Then("I succesfully go to manage withdraw page")
	def mngwdrpg() {
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/saldo')	
	}
	
	@When("I clicked button pencairan saldo")
	def clickbtnps() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/div_Tarik Saldo'))
	}
	
	@Then("I  should see pop up form pencairan saldo")
	def popupps() {
//		WebUI.click(findTestObject('modal-body p-5 d-flex flex-column')	
	}
	
	@And("I fill metode pembayaran metode, nama penerima namapenerima, nomor rekening norekening, nominal penarikan nominal")
	def fillcairsld() {
		WebUI.setText(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/input_Pencairan Saldo_namaPenerima'), 'yanti')
		WebUI.setText(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/input_Pencairan Saldo_namaPenerima_1'), '02929202008')
		WebUI.selectOptionByValue(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/select_Pilih Nominal PenarikanRp 50.000-,Rp_e97ad7'), 'Rp 50.000-,', true)
	}
	@And("I click cairkan dana button")
	def cairbtnsld() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/button_Cairkan Dana'))
	}
	@Then ("I should see pop up notification pencairan saldo di proses")
	def popuroses() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePencairanSaldo/Page_EmphatiCare Doctor/div_selamat Pencairan Dana Telah Diproses'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}
}
