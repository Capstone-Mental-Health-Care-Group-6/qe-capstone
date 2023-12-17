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



class ManagePasient {

	// Background:
	@Given("I have logged in and am on the dashboard page")
	def OnTheDashboardPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')
		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), 'Doctor6@gmail.com')
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), 'password')
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Masuk'))
		WebUI.delay(2)
	}

	@When("I click the View Details button on the patient list row")
	def DetailsbuttonOnThePatientListNow() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail'))
		WebUI.takeScreenshot()
	}

	// User Verify the Accept Button on the Patient Details Pop-up
	@And("I see an Accept button on the pop-up view")
	def ISeeAnAcceptButtonOnThePopUpView() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))
		WebUI.takeScreenshot()
	}

	// User Verify the Ok Button on the Accept Patient Pop-up
	@And ("I click the Ok button on the pop-up view")
	def IClickTheOkButtonOnThePopUpView() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))
		WebUI.delay(2)
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Oke'))
		WebUI.takeScreenshot()
	}

	// User Verify the x Icon on the Popup Accept the Patient
	@And ("I click x on the pop-up to accept the patient")
	def IClickXOnThePopUpToTheAccepttThePatient() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Beth FlatleyJenis Kelamin Laki-Lak_bf405b'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_X_- accept patient pop up'))
		WebUI.takeScreenshot()
	}

	// User Verify the Function of the Reject Button on the Patient Details Pop-up
	@And ("I see a Reject button on the pop-up view")
	def ISeeARejectButtonOnThePopUpView() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))
		WebUI.takeScreenshot()
	}

	// Include Limited Time button, The doctor has urgent activities button, Other Reason
	// User Verify Overbooking Buttons in Patient's Rejection Information

	@And ("I click the Reject button on the pop-up view")
	def ClickRejectButtonThePopUpView() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))
		WebUI.takeScreenshot()
	}

	// Include Limited Time button, The doctor has urgent activities button, Other Reason
	@And ("I click the overbooking button on the pop-up view")
	def ButtonOnThePopUpView() {

		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Overbooking (1)'))
		WebUI.delay(2)
		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Keterbatasan Waktu (1)'))
		WebUI.delay(2)
		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Dokter Ada Kegiatan Mendadak (1)'))
		WebUI.delay(2)
		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Alasan Lain (1)'))
		WebUI.delay(2)
		WebUI.takeScreenshot()

		WebUI.setText(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/textarea_Tuliskan alasan Penolakan_floating_7b3480 (1)'),
				'problem internal')
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	// User Verify the Reject Button on the Popup Reject the Patient
	@And ("I click the Reject button")
	def Rejectbutton() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Overbooking (1)'))
		WebUI.click(findTestObject('Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}

	// User Verify the x Icon on the Popup Reject the Patient
	@And ("I click x on the pop-up to reject the patient")
	def XOnThePopUpToRejectThePatient() {
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail (1)'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_X_popup reject pasient'))
		WebUI.delay(2)
		WebUI.takeScreenshot()
	}


	// User Verify the Patient Details Pop-up Display
	@Then ("I should see a pop-up appear with accurate patient detail information")
	def IShouldSeePopUpAppearWithAccuratePatientDetailInformation() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Tracey DenesikJenis Kelamin Laki-L_a32157'))
		//WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Beth FlatleyJenis Kelamin Laki-Lak_bf405b'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then ("I should successfully use the accept button")
	def IShouldSuccessfullyUseTheAcceptButton() {
		WebUI.delay(2)
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Oke'))
		WebUI.closeBrowser()
	}

	@Then ("the patient should be successfully admitted")
	def ThePatientShoulbeSuccessfullyAdmitted() {
		WebUI.delay(2)
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))
		WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Oke'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then ("I should successfully close the pop-up with the x icon")
	def CloseThePopUpWithTheXIcon() {
		WebUI.delay(2)
		WebUI.takeElementScreenshot(findTestObject('Dokter-ManagePasient/Page_EmphatiCare Doctor/laporan_mingguan'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then ("I should successfully use the reject button")
	def IShouldSuccessfullyUseTheRejectButton () {
		WebUI.takeElementScreenshot(findTestObject('Dokter-ManagePasient/Page_EmphatiCare Doctor/allert next button reject popup'))
		WebUI.takeScreenshot()
		WebUI.closeBrowser()
	}

	@Then ("I should successfully use the overbooking button")
	def SuccessfullyUse() {
		WebUI.click(findTestObject('Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak'))

		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Antrian Pasien Berhasil ditolak. Inform_a7e3b6 (1)'))
		WebUI.takeScreenshot()
		WebUI.delay(2)
		WebUI.closeBrowser()
	}

	@Then ("I should see a pop-up appear with rejected patient information")
	def SeeAPopUpAppearWithRejectedPatient() {
		WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Antrian Pasien Berhasil ditolak. Inform_a7e3b6 (1)'))
		WebUI.closeBrowser()
	}

}