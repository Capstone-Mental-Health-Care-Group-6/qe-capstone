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


// Include:
// User Verify the Patient Details Pop-up Display
// User Verify the Accept Button on the Patient Details Pop-up
// User Verify the Ok Button on the Accept Patient Pop-up
// 

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Beth FlatleyJenis Kelamin Laki-Lak_bf405b'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Oke'))

WebUI.closeBrowser()

// Include :
// User Verify Buttons in Patient's Rejection Information
// User Verify the Function of the Reject Button on the Patient Details Pop-up
// User Verify the Reject Button on the Popup Reject the Patient
// 

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Overbooking (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Keterbatasan Waktu (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Dokter Ada Kegiatan Mendadak (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Alasan Lain (1)'))

WebUI.setText(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/textarea_Tuliskan alasan Penolakan_floating_7b3480 (1)'), 
    'problem internal')

WebUI.click(findTestObject('Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Antrian Pasien Berhasil ditolak. Inform_a7e3b6 (1)'))

WebUI.closeBrowser()

// Include:
// User Verify the x Icon on the Popup Accept the Patient

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Beth FlatleyJenis Kelamin Laki-Lak_bf405b'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_p_Kami percaya Anda akan memberikan layanan_55cd57'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_X_- accept patient pop up'))

WebUI.closeBrowser()

// User Verify the x Icon on the Popup Reject the Patient

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Tolak (1)'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_X_popup reject pasient'))

WebUI.closeBrowser()

