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

<<<<<<< HEAD
Mobile.startApplication('C:\\javaproject\\Capstone - QE\\app-release-1 (1).apk', true)

Mobile.tap(findTestObject('Object Repository/LoginFeature/button_skips_onBoarding'), 0)

Mobile.tap(findTestObject('Object Repository/LoginFeature/button_next_onBoarding'), 0)

Mobile.tap(findTestObject('LoginFeature/Link_Registered'), 0)

Mobile.setText(findTestObject('Object Repository/RegisterFeature/field_email'), 'user@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/RegisterFeature/field_password_register'), 'user12345', 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/Icon_eye_password_1'), 0)

Mobile.setText(findTestObject('RegisterFeature/field_konfirmasi_password'), 'user12345', 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/Icon_eye_password_2'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/Button_register'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/CheckBox_Registed'), 0)

Mobile.getText(findTestObject('Object Repository/RegisterFeature/Link_syarat_dan_ketentuan'), 0)

Mobile.closeApplication()

Mobile.verifyElementText(findTestObject('Object Repository/RegisterFeature/Alert email'), '')

=======
>>>>>>> 7ded8fe51544ef21114b9bac63c096249c1c8e18
