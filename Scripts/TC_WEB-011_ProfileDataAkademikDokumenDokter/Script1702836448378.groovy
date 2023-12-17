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

WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Masukkan Email Anda_email'), 
    'Doctor6@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Kata sandi kurang dari 8 karakter_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/a_Data Akademik'))

WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Asal Universitas_asalUniversitas'), 
    'universitas')

WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Tahun Masuk Universitas_tahunMasuk'), 
    '2020')

WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Jenjang Pendidikan_jenjangPendidikan'), 
    's1')

WebUI.setText(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/input_Tahun Tamat Universitas_tahunTamat'), 
    '2024')

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Batal'))

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.click(findTestObject('Object Repository/Dokter-DataAkademikDokumen/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

