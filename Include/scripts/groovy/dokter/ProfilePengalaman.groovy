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



class ProfilePengalaman {
	
	@Given("I login on the doctor's dashboard page")
	def ILoginOnTheDoctorsDashboardPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')
		WebUI.maximizeWindow()
	}
	
// User Verify Edit Experience
    @When("I navigate to the work experience section")
	def ToTheWorkExperienceSection() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/a_Pengalaman'))
		WebUI.takeScreenshot()
	}
	
	
	@And("I fill in the company name")
	def IFillInTheCompanyName() {
		WebUI.setText(findTestObject('Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Nama Perusahaan_namaPerusahaan_1'),
			'PT MEDIA KARTA')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Jabatan di Perusahaan_jabatan'),
			'CEO')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Awal Bekerja_awalBekerja'),
			'2021')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Akhir Bekerja_akhirBekerja'),
			'2016')
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Alamat Perusahaan_alamatPerusahaan'),
			'JL SUKA SUKA ANAS')
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Alamat Perusahaan_flexCheckDefault'))
		WebUI.takeScreenshot()
	}
	
	@And ("I click the Add Data button")
	def AddDataButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Tambah Data'))
		WebUI.takeScreenshot()
	}
	
	@Then ("I click the save changes button on the work experience")
	def SaveChangesButton() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.takeScreenshot()
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/div_Apakah anda yakin ingin menyimpan perub_00dc3a'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Batal'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/Button Simpan perubahan POP UP'))
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/div_Allert_Data berhasil disimpan'))
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Close_Data berhasil disimpan_btn-close'))
		
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	}
	
	@Then ("I should have successfully added a new work experience field")
	def SuccessfullyAddedNewWorkExperienceField() {
		WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.takeScreenshot()
		
		WebUI.closeBrowser()
	}
}