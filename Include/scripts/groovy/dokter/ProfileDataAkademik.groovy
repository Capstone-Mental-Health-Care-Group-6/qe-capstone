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



class ProfileDataAkademik {
	@Given("I already logged in dashboard dokter")
	def givenUserIsOnDashboardPage() {
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
	}

	@When("I go to profile")
	def goprofilew() {
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/icon-profile'))
	}
	@And("I Click data academic")
	def clickdaka() {
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/a_Data Akademik'))
	}

	@And("I fill in the asal universitas, jenjang pendidikan, tahun masuk universitas, tahun tamat universitas")
	def ifilldapge() {
		WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Asal Universitas_asalUniversitas'), 'universitas')
		WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Tahun Masuk Universitas_tahunMasuk'), '2020')
		WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Jenjang Pendidikan_jenjangPendidikan'), 's1')
		WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Tahun Tamat Universitas_tahunTamat'), '2024')
	}

	@And("I clicked the save changes button")
	def svbtn() {
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
	}

	@Then("I see pop up data succesfully saved")
	def dtsuccesfullysave() {
		
	}

	@And("I click the cancel button on the popup academic data")
	def clickcancels() {
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))
		WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Batal'))
	}

	@Then("I successfully canceled changes and close the save changes popup")
	def canclchgs() {
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
		
	}

	
}