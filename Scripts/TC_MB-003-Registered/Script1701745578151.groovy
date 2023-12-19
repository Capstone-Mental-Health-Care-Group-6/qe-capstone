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
<<<<<<< HEAD
Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release (6).apk', true)

// Onboarding - Anda mungkin perlu menambahkan wait atau pengecekan agar elemen terlihat sebelum melakukan aksi
=======
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)

// Onboarding
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

Mobile.tap(findTestObject('LoginFeature-spy/link daftar-android.view.View'), 0)

<<<<<<< HEAD
//register
=======
// Tap field email
Mobile.tap(findTestObject('RegisterFeature/field email register-android.widget.EditText'), 0)

Mobile.delay(1 // Tambahkan delay jika diperlukan
    )
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5

Mobile.setText(findTestObject('RegisterFeature/field email register-android.widget.EditText'), 'laras1@gmail.com', ConditionType.EQUALS)

Mobile.setText(findTestObject('RegisterFeature/field password register-android.widget.EditText'), 'laras1A', 0)

Mobile.setText(findTestObject('RegisterFeature/field confirm password register-android.widget.EditText'), 'laras1A', 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterFeature/try 1/android.widget.Button'), 0)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
// profile filling

=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
Mobile.closeApplication()

