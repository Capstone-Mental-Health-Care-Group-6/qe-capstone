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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release (6).apk', true)

// Onboarding - Anda mungkin perlu menambahkan wait atau pengecekan agar elemen terlihat sebelum melakukan aksi
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Onboarding/page_login-android.widget.ImageView'), 0)

Mobile.tap(findTestObject('LoginFeature-spy/link daftar-android.view.View'), 0)

// Tap field email
Mobile.tap(findTestObject('RegisterFeature/field email register-android.widget.EditText'), 0)

Mobile.delay(1 // Tambahkan delay jika diperlukan
	)

Mobile.setText(findTestObject('RegisterFeature/field email register-android.widget.EditText'), 'laras1@gmail.com', ConditionType.EQUALS)

// Lakukan tindakan pada password dan elemen berikutnya seperti yang Anda lakukan sebelumnya
Mobile.tap(findTestObject('RegisterFeature/field password register-android.widget.EditText'), 0)

Mobile.setText(findTestObject('RegisterFeature/field password register-android.widget.EditText'), 'laras1A', 0)

Mobile.tap(findTestObject('RegisterFeature/field confirm password register-android.widget.EditText'), 0)

Mobile.setText(findTestObject('RegisterFeature/field confirm password register-android.widget.EditText'), 'laras1A', 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.Button'), 0)

Mobile.closeApplication()

=======
>>>>>>> 1c1bae5b2384b2d7e900ca7cabcd52ea8b49ca82
<<<<<<< HEAD
=======
>>>>>>> 1c1bae5b2384b2d7e900ca7cabcd52ea8b49ca82
=======
>>>>>>> 1c1bae5b2384b2d7e900ca7cabcd52ea8b49ca82
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
