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

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/img_lihat detail_iconNavbar'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/a_Pengalaman'))

WebUI.setText(findTestObject('Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Nama Perusahaan_namaPerusahaan_1'), 
    'PT MEDIA KARTA')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Jabatan di Perusahaan_jabatan'), 
    'CEO')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Awal Bekerja_awalBekerja'), 
    '2021')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Akhir Bekerja_akhirBekerja'), 
    '2016')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Alamat Perusahaan_alamatPerusahaan'), 
    'JL SUKA SUKA ANAS')

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Alamat Perusahaan_flexCheckDefault'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Tambah Data'))

WebUI.setText(findTestObject('Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Nama Perusahaan_namaPerusahaan_1'), 
    'PT MEDIA APAPUN')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Jabatan di Perusahaan_jabatan_1'), 
    'Sekretaris')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Awal Bekerja_awalBekerja_1'), 
    '2004')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Akhir Bekerja_akhirBekerja_1'), 
    '2024')

WebUI.setText(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/input_Alamat Perusahaan_alamatPerusahaan_1'), 
    'JL SUKA SUKA QE')

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/div_Apakah anda yakin ingin menyimpan perub_00dc3a'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Batal'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Simpan Perubahan'))

WebUI.click(findTestObject('Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/Button Simpan perubahan POP UP'))

WebUI.takeElementScreenshot(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/div_Allert_Data berhasil disimpan'))

WebUI.click(findTestObject('Object Repository/Dokter-ProfilePengalaman/Page_EmphatiCare Doctor/button_Close_Data berhasil disimpan_btn-close'))

WebUI.closeBrowser()

