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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sehatq.com/login/email')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_Login/input_Email_email'), 'indrafsyah@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Update Profile/Page_Login/input_show password_password'), 'ZG5hcU6kO+LyqJ+Bkrg6GA==')

WebUI.click(findTestObject('Object Repository/Update Profile/Page_Login/button_Continue'))

WebUI.click(findTestObject('Object Repository/Update Profile/Page_SehatQ  Portal Informasi Terbaru Seputar Coronavirus/i_Profil_sc-bZQynM gOtVVW'))

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input__address'), 
    'Jakarta Indonesia')

WebUI.setText(findTestObject('Object Repository/Update Profile/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/input__phone'), 
    '087771717105')

WebUI.click(findTestObject('Object Repository/Update Profile/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/button_Simpan'))

WebUI.closeBrowser()

