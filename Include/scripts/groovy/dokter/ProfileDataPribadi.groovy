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



class ProfileDataPribadi {


	@Given("I am logged in on the doctor's dashboard page")
	def givenLoggedIntoDashboard() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')
		WebUI.maximizeWindow()
	}

	@When("I navigate to the personal data section")
	def whenNavigateToPersonalDataSection() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/a_Data Pribadi'))
		WebUI.takeScreenshot()
	}

	@And("I fill in the personal data")
	def andFillInPersonalData() {
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nama Lengkap_namaLengkap'),
				'Anastasya')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Email_email'), 'anastasya@gmail.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_NIK_nik'), '20019101555628')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_No Handphone_noHandphone'),
				'0895901046763')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Provinsi_provinsi'),
				'Jawa Timur')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/select_Jenis KelaminLaki-lakiPerempuan'),
				'Perempuan', true)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_KotaKabupaten_kotaKabupaten'),
				'Surabaya')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor STR_str'),
				'1111903836473333')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor SIP_noSip'),
				'00092638893641111')
		WebUI.takeScreenshot()
	}

	@When("I fill in the required personal data fields")
	def andFillRequiredPersonalDataFields() {
		// belum bisa karena get foto dan tanggal lahir!!
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nama Lengkap_namaLengkap'),
				'Anastasya')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Email_email'), 'anastasya@gmail.com')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_NIK_nik'), '20019101555628')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_No Handphone_noHandphone'),
				'0895901046763')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Provinsi_provinsi'),
				'Jawa Timur')
		WebUI.takeScreenshot()
		WebUI.selectOptionByValue(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/select_Jenis KelaminLaki-lakiPerempuan'),
				'Perempuan', true)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_KotaKabupaten_kotaKabupaten'),
				'Surabaya')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor STR_str'),
				'1111903836473333')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor SIP_noSip'),
				'00092638893641111')
		WebUI.takeScreenshot()
	}

	@And("I click the save changes button")
	def andClickSaveChangesButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan_1'))
		WebUI.takeScreenshot()
	}


	@And("I click the save changes button on the popup")
	def andClickSaveChangesButtonOnPopup() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan_1'))
	}

	@And("I click the cancel button on the popup")
	def andClickCancelButtonOnPopup() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Batal'))
		WebUI.takeScreenshot()
	}

	@And("I should see an alert confirming that the data has been successfully saved")
	def andSeeAlertDataSuccessfullySaved() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan_1'))
		WebUI.takeScreenshot()
	}

	@And("I click the x icon on the personal data page popup")
	def andClickXIconOnPopup() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan_1'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Data berhasil disimpan_btn-close'))
		WebUI.takeScreenshot()
	}

	@And ("I click the back button")
	def BackButton() {
		WebUI.click(findTestObject('Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button previous'))
		WebUI.takeScreenshot()
	}


	@Then("I should see a successful message indicating the changes are saved in the doctor's personal data")
	def thenSeeSuccessfulMessage() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/div_Data berhasil disimpan'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}

	@Then("I should successfully use the save changes button")
	def thenSuccessfullyUseSaveChangesButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/div_Data berhasil disimpan'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}

	@Then("I should successfully cancel the changes and close the save changes popup")
	def thenSuccessfullyCancelChangesAndClosePopup() {
		WebUI.click(findTestObject('Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/verify cancel botton pop up'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}

	@Then("I should successfully close the popup indicating saved data")
	def thenSuccessfullyClosePopup() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/div_Data berhasil disimpan'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}

	@Then("I should successfully return to the previous profile edit data page")
	def thenSuccessfullyReturnToPreviousPage() {
		WebUI.takeElementScreenshot(findTestObject('Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/profil page'))
		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}
}