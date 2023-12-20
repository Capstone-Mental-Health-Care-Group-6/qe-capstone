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

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release (6).apk', true)

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release (6).apk', true)

// Onboarding - Anda mungkin perlu menambahkan wait atau pengecekan agar elemen terlihat sebelum melakukan aksi
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Onboarding/page_login-android.widget.ImageView'), 0)

Mobile.tap(findTestObject('null'), 0)

//register
Mobile.setText(findTestObject('null'), 'laras1@gmail.com', ConditionType.EQUALS)

Mobile.setText(findTestObject('null'), 'laras1A', 0)

Mobile.setText(findTestObject('null'), 'laras1A', 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

// profile filling
Mobile.setText(findTestObject('ProfileFilling/profile filling-field nama-android.widget.EditText'), 'laras maharani', 0)

Mobile.tap(findTestObject('ProfileFilling/profile filling-button selanjutnya-nama-android.widget.Button'), 0)

Mobile.setText(findTestObject('ProfileFilling/profile filling-field no ponsel-android.widget.EditText'), '0895891937028', 
    0)

Mobile.tap(findTestObject('ProfileFilling/profile filling-icon kalender-tanggal lahir-android.view.View'), 0)

Mobile.tap(findTestObject('ProfileFilling/profile filling-button selanjutnya-tanggal lahir-android.widget.Button'), 0)

Mobile.tap(findTestObject('ProfileFilling/profile filling-button jenis kelamin-fimale-android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('ProfileFilling/profile filling-notification successfully-button OK-android.widget.Button'), 0)

Mobile.verifyElementVisible(findTestObject('ProfileFilling/profile filling-notification successfully-android.view.View'), 
    0)

Mobile.verifyElementVisible(findTestObject('ProfileFilling/view login page android.widget.ImageView'), 0)

