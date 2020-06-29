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

WebUI.navigateToUrl('https://www.sehatq.com/daftar/email')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Web Register/Page_Register/input_Nama Lengkap_name'), 'Indra Firmansyah')

WebUI.setText(findTestObject('Object Repository/Web Register/Page_Register/input_Email_email'), 'indra.firmansyah.id@gamil.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web Register/Page_Register/input_show password_password'), 'ZG5hcU6kO+LyqJ+Bkrg6GA==')

WebUI.click(findTestObject('Object Repository/Web Register/Page_Register/span_Saya telah menyetujui SehatQ'))

not_run: WebUI.click(findTestObject('Object Repository/Web Register/Page_Register/button_Continue'))

WebUI.closeBrowser()

