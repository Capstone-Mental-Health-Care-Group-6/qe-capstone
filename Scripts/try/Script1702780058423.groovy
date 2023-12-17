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

// Chat delete button 
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/a_Data Pribadi'))

WebUI.uploadFile(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/h5_Upload Your Profile'), 
    'C:\\Users\\Anastasya\\thumbnail.jpg')

WebUI.click(findTestObject('Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button previous'))

WebUI.closeBrowser()

WebUI.takeElementScreenshot(findTestObject('Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/profil page'))

