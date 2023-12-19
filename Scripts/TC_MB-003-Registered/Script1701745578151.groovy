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

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release (6).apk', true)

// Onboarding - Anda mungkin perlu menambahkan wait atau pengecekan agar elemen terlihat sebelum melakukan aksi
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Onboarding/page_login-android.widget.ImageView'), 0)

Mobile.tap(findTestObject('LoginFeature-spy/link daftar-android.view.View'), 0)

//register

Mobile.setText(findTestObject('RegisterFeature/field email register-android.widget.EditText'), 'laras1@gmail.com', ConditionType.EQUALS)

Mobile.setText(findTestObject('RegisterFeature/field password register-android.widget.EditText'), 'laras1A', 0)

Mobile.setText(findTestObject('RegisterFeature/field confirm password register-android.widget.EditText'), 'laras1A', 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.Button'), 0)

// profile filling

Mobile.closeApplication()

