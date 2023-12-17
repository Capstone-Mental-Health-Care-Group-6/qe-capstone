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

// User Verify Chat Menu Page Display
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/a_Chat'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhir'))

WebUI.closeBrowser()

// User Verify Active Patient Chat Page View
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/a_Chat'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Pasien aktif'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Rojakonline Susah TidurAkhiri ChatHapus Chat'))

WebUI.closeBrowser()

// User Verify Ended Chat Page Display
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/span_Chat'))

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Berakhir'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Sesi Konsultasi Telah Berakhir'))

WebUI.closeBrowser()

// Ends Chat Session Button
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/span_Chat (1)'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Pasien aktif'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button chat direct to room chat'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Show More Room chat'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button_Akhiri Chat'))

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhirJokobapak saya hami_718af3'))

WebUI.takeElementScreenshot(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/element akhir chat -end'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Sesi Konsultasi Telah Berakhir (1)'))

WebUI.closeBrowser()

// Chat delete button 
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/span_Chat (1)'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/h5_Pasien aktif'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button chat direct to room chat'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/Show More Room chat'))

WebUI.takeElementScreenshot(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/menu show more'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button_Hapus Chat'))

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/div_Pasien aktifBerakhirJokobapak saya hami_718af3'))

WebUI.closeBrowser()

// User Verify Article Links in Chat Rooms => belom bisa ke direct
// User Verify Send Button in Chat Room
WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/a_Chat'))

WebUI.setText(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/input - field massage'), 
    'saya mengerti, adalah kata kata topeng untuk senjata menenangkan')

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button file, img, emoticon'))

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/img_Smileys  People___EmojiPicker__ epr-emoji-img'))

WebUI.click(findTestObject('Object Repository/Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/input - field massage'))

WebUI.click(findTestObject('Dokter-ChatVideoCallViaZoom/Page_EmphatiCare Doctor/button send massage'))

WebUI.closeBrowser()

