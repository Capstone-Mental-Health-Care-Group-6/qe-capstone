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

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-6.apk', true)

Mobile.tap(findTestObject('Object Repository/LoginTestLaras/next - android.widget.Button'), 0)

// login
Mobile.tap(findTestObject('Object Repository/LoginTestLaras/selanjutnya - android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('LoginTestLaras/field tap 1 - android.widget.EditText (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/field email - android.widget.EditText (2)'), 'laras1@gmail.com')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('LoginTestLaras/field tap 2 - android.widget.EditText (3)'), 0)

Mobile.sendKeys(findTestObject('LoginTestLaras/field pw - android.widget.EditText (4)'), 'laras1')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

WebUI.delay(5)

// homepage
Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button buat janji - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button konseling  - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button riwayat - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button menu profile - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/home page - button menu beranda - android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/notifikasi lonceng'), 0)

Mobile.tap(findTestObject('Homepage/previous notification homepage-android.widget.Button'), 0)

Mobile.tap(findTestObject('Homepage/chatbot icon - android.view.View'), 0)

Mobile.tap(findTestObject('Homepage/previous chatbot-android.widget.Button'), 0)

Mobile.tap(findTestObject('Homepage/ARTIKEL KIRI ATAS -android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Homepage/previous artikel'), 0)

Mobile.tap(findTestObject('Homepage/lihat semua rekoemndasi artikel - android.view.View'), 0)

Mobile.closeApplication()

