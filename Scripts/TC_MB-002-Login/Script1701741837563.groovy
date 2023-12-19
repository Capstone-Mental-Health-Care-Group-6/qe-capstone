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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
Mobile.startApplication('C:\\Users\\Anastasya\\Downloads\\app-release-paling terbaru.apk', true)
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.startApplication('C:\\Users\\laras\\OneDrive\\Documents\\Studi Independen\\Altera\\Capstone Project\\app-release-5.apk', 
    true)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5

// Onboarding
Mobile.tap(findTestObject('Object Repository/Onboarding/Button lewati_on boarding'), 0)

Mobile.tap(findTestObject('Object Repository/Onboarding/button selanjutnya_on boarding'), 0)

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
Mobile.setText(findTestObject('Object Repository/LoginFeature-spy/try 1/try 2/android.widget.EditText (3)'), 'laras1@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/LoginFeature-spy/try 1/try 2/android.widget.EditText (5)'), 'laras1', 0)
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5
=======
Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextEmail'), 'laras1@gmail.com', 0)

Mobile.setText(findTestObject('LoginFeature-spy/test/android.widget.EditTextPW'), 'laras1', 0)
>>>>>>> 395525bc990639c9ec81403abbef2960a43b8da5

Mobile.tap(findTestObject('Object Repository/LoginFeature-spy/try 1/try 2/android.widget.Button'), 0)

Mobile.closeApplication()

