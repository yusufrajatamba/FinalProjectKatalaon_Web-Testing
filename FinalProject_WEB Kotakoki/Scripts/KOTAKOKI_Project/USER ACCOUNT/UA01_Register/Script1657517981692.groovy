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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Page_welcome/Register Now'))

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/Username'), 'YusufRaja')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/E-mail'), 'yusuf.tamba@bfi.co.id')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/Phone Number'), '082276471331')

WebUI.setEncryptedText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/Password'), 
    'MIpFiyjEeVAFBlIfgXFAhA==')

WebUI.setEncryptedText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/Confirm'), 
    'MIpFiyjEeVAFBlIfgXFAhA==')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/input_Address'), 'Jalan Curug Garden')

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/Register/Page_Register/input'))

