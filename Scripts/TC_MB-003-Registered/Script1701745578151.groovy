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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-paling terbaru.apk', true)

// Onboarding
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.tap(findTestObject('null'), 0)

//register
Mobile.tap(findTestObject('RegisterFeature/email-android.widget.EditText'), 5)

Mobile.sendKeys(findTestObject('RegisterFeature/email-android.widget.EditText'), 'laras1@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.tap(findTestObject('RegisterFeature/pw-android.widget.EditText'), 5)

Mobile.sendKeys(findTestObject('RegisterFeature/pw-android.widget.EditText'), 'laras1A%', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RegisterFeature/eye pw-android.widget.Button'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('RegisterFeature/confim pw-android.widget.EditText'), 5)

Mobile.sendKeys(findTestObject('RegisterFeature/confim pw-android.widget.EditText'), 'laras1A%', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('RegisterFeature/eye confim pw-android.widget.Button'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('RegisterFeature/link syarat dkk-android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('RegisterFeature/button daftar-android.widget.Button'), 0)

// profile filling
Mobile.closeApplication()

