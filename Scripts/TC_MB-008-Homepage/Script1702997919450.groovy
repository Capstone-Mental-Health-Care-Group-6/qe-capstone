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

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-paling terbaru.apk', true)

// Onboarding
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

// login
Mobile.setText(findTestObject('null'), 'laras1@gmail.com', 
    0)

Mobile.setText(findTestObject('null'), 'laras1', 0)

Mobile.tap(findTestObject('null'), 0)
Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button buat janji - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button konseling  - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button riwayat - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button menu profile - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - icon notifikasi atau loceng-android.widget.Button'), 0)

Mobile.tap(findTestObject('Homepage/home page - link lihat semua rekomendadi artikel-android.view.View'), 0)

Mobile.tap(findTestObject('Homepage/home page - icon previous notification page-android.widget.Button'), 0)

Mobile.tap(findTestObject('Homepage/home page - rekomendasi artikel kanan atas - android.widget.ImageView'), 0)

