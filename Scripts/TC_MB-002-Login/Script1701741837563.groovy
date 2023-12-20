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

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-paling terbaru.apk', true, FailureHandling.CONTINUE_ON_FAILURE)

// Onboarding
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0, FailureHandling.CONTINUE_ON_FAILURE)

// tap
Mobile.tap(findTestObject('LoginFeature/get element terbaru/login-field email'), 5)

Mobile.sendKeys(findTestObject('LoginFeature/get element terbaru/login-field email'), 'laras1@gmail.com', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

// tap
Mobile.tap(findTestObject('LoginFeature/get element terbaru/login-field pw'), 5)

Mobile.sendKeys(findTestObject('LoginFeature/get element terbaru/login-field pw'), 'laras1A%', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('LoginFeature/get element terbaru/login-eye icon pw'), 0)

Mobile.tap(findTestObject('LoginFeature/get element terbaru/login-button login'), 3)

Mobile.closeApplication()

