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

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/register-dokter')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Ingat saya_username'), 'doktor')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 'testdoktor@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Password harus terdiri dari minimal 8_1e27b4'), 
    'KgnNhXmhf2aH/UqJ/9M4jA==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Kata Sandi Tidak Sesuai_confirmPassword'), 
    'KgnNhXmhf2aH/UqJ/9M4jA==')

WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/input_Ingat saya_checkbox me-2'))

WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/button_Daftar'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/register-dokter')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_username'), 
    'doktor')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 
    'testdoktor@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Password harus terdiri dari minimal 8_1e27b4'), 
    'KgnNhXmhf2aH/UqJ/9M4jA==')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Kata Sandi Tidak Sesuai_confirmPassword'), 
    'KgnNhXmhf2aH/UqJ/9M4jA==')

WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_checkbox me-2'))

WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_Daftar'))




WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/register-dokter')

WebUI.click(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_username'))

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Ingat saya_username'), 
    '')

WebUI.setText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Password harus terdiri dari minimal 8_1e27b4'), 
    '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Kata Sandi Tidak Sesuai_confirmPassword'), 
    '9NLz+4tGZcQ=')

