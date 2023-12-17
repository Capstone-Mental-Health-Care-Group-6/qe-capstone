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

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/a_Data Pribadi'))

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nama Lengkap_namaLengkap'), 
    'Anastasya')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Email_email'), 'anastasya@gmail.com')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_NIK_nik'), '20019101555628')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_No Handphone_noHandphone'), 
    '0895901046763')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Provinsi_provinsi'), 
    'Jawa Timur')

WebUI.selectOptionByValue(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/select_Jenis KelaminLaki-lakiPerempuan'), 
    'Perempuan', true)

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_KotaKabupaten_kotaKabupaten'), 
    'Surabaya')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor STR_str'), 
    '1111903836473333')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/input_Nomor SIP_noSip'), 
    '00092638893641111')

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Batal'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Simpan Perubahan_1'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/div_Data berhasil disimpan'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Data berhasil disimpan_btn-close'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://empathicare-dokter.vercel.app/dokter/dashboard')

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/a_Data Pribadi'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/button_Kembali'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfileDataPribadi/Page_EmphatiCare Doctor/page profil'))

WebUI.closeBrowser()

