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

// on boarding 
Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-6.apk', true)

Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.tap(findTestObject('RegisterFeature/link register - android.view.View'), 0)

Mobile.tap(findTestObject('RegisterFeature/tap field email - android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('RegisterFeature/field email - android.widget.EditText'), 'laras1@gmail.com')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RegisterFeature/tap field pw - android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('RegisterFeature/field pw - android.widget.EditText'), 'laras1%A')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RegisterFeature/eye pw - android.widget.Button'), 0)

Mobile.tap(findTestObject('RegisterFeature/tap - field confirm pw android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('RegisterFeature/field confirm pw - android.widget.EditText'), 'laras1%A')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RegisterFeature/eye confirm pw - android.widget.Button'), 0)

Mobile.tap(findTestObject('RegisterFeature/checkbox - android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('RegisterFeature/button daftar - android.widget.Button'), 0)

// Profile filling
Mobile.tap(findTestObject('ProfileFilling/tap field nama lengkap'), 0)

Mobile.sendKeys(findTestObject('ProfileFilling/field nama lengkap'), 'Laras maharani')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ProfileFilling/button selanjutnya nama lengkap'), 0)

Mobile.tap(findTestObject('ProfileFilling/tap field nomor ponsel'), 0)

Mobile.sendKeys(findTestObject('ProfileFilling/field nomor ponsel -1'), '08967090134526')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('ProfileFilling/button selanjutnya nomor ponsel'), 0)

Mobile.tap(findTestObject('ProfileFilling/icon kalender'), 0)

Mobile.tap(findTestObject('ProfileFilling/button OK calender'), 0)

Mobile.tap(findTestObject('ProfileFilling/button selanjutnya tanggal lahir'), 0)

Mobile.tap(findTestObject('ProfileFilling/laki laki'), 0)

Mobile.tap(findTestObject('ProfileFilling/perempuan'), 0)

Mobile.tap(findTestObject('ProfileFilling/button selanjutnya gender'), 0)

Mobile.tap(findTestObject('ProfileFilling/notifikasi OK Profile filling'), 0)

Mobile.tap(findTestObject('RegisterFeature/view login page'), 0)

Mobile.closeApplication()

