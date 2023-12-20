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

Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-6.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/LoginTestLaras/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/LoginTestLaras/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('LoginTestLaras/android.widget.EditText (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/LoginTestLaras/android.widget.EditText (2)'), 'laras1@gmail.com')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('LoginTestLaras/android.widget.EditText (3)'), 0)

Mobile.sendKeys(findTestObject('LoginTestLaras/android.widget.EditText (4)'), 'laras1')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('LoginTestLaras/android.widget.Button-Login'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('BuatJanji_PilihTopik/android.widget.ImageView-buatjanji'), 0)

//Mobile.tap(findTestObject('BuatJanji_PilihTopik/android.view.View-readmore'), 0)
//
//Mobile.tap(findTestObject('BuatJanji_PilihTopik/android.view.View-xbutonreadmore'), 0)
Mobile.tap(findTestObject('BuatJanji_PilihTopik/android.widget.Button-startnow'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/BuatJanji_PilihTopik/android.widget.RadioButton (8)'), 0)

Mobile.tap(findTestObject('BuatJanji_PilihTopik/android.widget.Button-btchoosetopik'), 0)

Mobile.closeApplication()

