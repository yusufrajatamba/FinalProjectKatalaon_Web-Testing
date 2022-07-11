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

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/USER ACOUNT/VerifyAcoount/Kotakoki/Register Now'))

WebUI.setText(findTestObject('Register Now/Username'), 'UntukVerify')

WebUI.setText(findTestObject('Register Now/E-mail Address'), 'untukverify@verify.com')

WebUI.setText(findTestObject('Register Now/Phone Number'), '087766554433')

WebUI.setEncryptedText(findTestObject('Register Now/Password'), 'laaKfMRZqEfSNk8/nMUA2Q==')

WebUI.setEncryptedText(findTestObject('Register Now/Confirm Password'), 'laaKfMRZqEfSNk8/nMUA2Q==')

WebUI.setText(findTestObject('Register Now/Address'), 'Verify')

WebUI.click(findTestObject('Register Now/input'))

WebUI.verifyElementPresent(findTestObject('Page_UntukVerify  Kotakoki/a_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Page_UntukVerify  Kotakoki/username'), 'untukverify')

WebUI.verifyElementPresent(findTestObject('UntukVerify/Account details'), 0)

WebUI.verifyElementText(findTestObject('Page_UntukVerify  Kotakoki/username'), 'Verify')

