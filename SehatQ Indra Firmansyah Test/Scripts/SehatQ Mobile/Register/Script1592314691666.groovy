import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\user\\Desktop\\SehatQ Doctor Consultation Online Appointment_v1.1.0.com.apk', true)

Mobile.tap(findTestObject('Mobile Register/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.TextView0 - Login'), 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.TextView0 - Log in dengan Email'), 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.TextView0 - Belum terdaftar Sign up di sini'), 0)

Mobile.setText(findTestObject('Mobile Register/android.widget.EditText0 - Type your full name'), 'Indra Firmansyah', 0)

Mobile.setText(findTestObject('Mobile Register/android.widget.EditText0 - exampleexample.com'), 'bystepstep62@gmail.com', 
    0)

Mobile.setText(findTestObject('Mobile Register/android.widget.EditText0 - Minimum 6 karakter'), 'Indra123.', 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.CheckBox0'), 0)

Mobile.tap(findTestObject('Mobile Register/android.widget.Button0 - Lanjutkan'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

