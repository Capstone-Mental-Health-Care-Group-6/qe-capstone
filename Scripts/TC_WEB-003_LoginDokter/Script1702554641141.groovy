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

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/')

WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Daftar Sekarang'))

WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masukkan Email Anda_email'), 'Dokter6@gmail.com')

WebUI.setText(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_password'), 'Dokter@1')

WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/input_Masuk_checkbox me-2'))

WebUI.click(findTestObject('Object Repository/Dokter-LoginDoctor/button_Masuk'))

WebUI.closeBrowser()

