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

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Chat'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Transaksi'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Pencairan Saldo'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Konten'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/div_Lihat Detail_bg-white px-3 py-3 d-flex _c5ac12'))

WebUI.setText(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/input_Mengatasi Kegilaan_message'), 'Mengatasi Kegilaan')

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/button_Mengatasi Kegilaan_btn border-0'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/button_Sudah'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/button_Belum_btn dropdown-toggle border-0'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/button_Belum_btn dropdown-toggle border-0'))

WebUI.click(findTestObject('Object Repository/Dokter-DashboardNotifikasiChatbot/svg'))

