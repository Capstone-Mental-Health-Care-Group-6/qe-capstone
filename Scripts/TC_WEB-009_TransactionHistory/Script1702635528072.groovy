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

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Nama Beth FlatleyJenis Kelamin Laki-Lak_bf405b'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Terima'))

WebUI.verifyAlertPresent(0)

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/Allert_div_Menerima Pembayaran Dari Pasien'))

WebUI.verifyElementVisible(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/div_Kami percaya Anda akan memberikan layan_1e86ef'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_Oke'))

WebUI.click(findTestObject('Object Repository/Dokter-ManagePasient/Page_EmphatiCare Doctor/button_X_popup reject pasient'))

