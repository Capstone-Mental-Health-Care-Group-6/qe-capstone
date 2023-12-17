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

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/login-dokter')

WebUI.setText(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 
    'Doctor6@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Kata sandi kurang dari 8 karakter_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/input_Masuk_checkbox me-2'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/a_Konten'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/div_Lihat ArtikelEdit ArtikelHapus Artikel'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/svg'))

WebUI.doubleClick(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_1'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_1'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/div_Hapus Artikel_p-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/li_10'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/svg_Hapus Artikel_p-icon p-dropdown-trigger_950f3b'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/li_25'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/div_Pending'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_Pending_nav-link'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_Edit Artikel'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/a_Konten'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/div_Lihat ArtikelEdit ArtikelHapus Artikel'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/div_Lihat ArtikelEdit ArtikelHapus Artikel'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/svg'))

WebUI.click(findTestObject('Object Repository/Dokter-ManageArtikel/Page_EmphatiCare Doctor/Page_EmphatiCare Doctor/button_Lihat Artikel'))

