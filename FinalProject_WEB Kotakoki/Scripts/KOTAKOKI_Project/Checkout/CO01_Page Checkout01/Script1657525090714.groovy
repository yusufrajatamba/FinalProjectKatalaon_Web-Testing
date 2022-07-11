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

WebUI.setText(findTestObject('KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/first_name'), 'Yusuf ')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/last_name'), 'Tamba')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/company'), 'BTDP')

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/Indonesia'))

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/address'), 'Jalan Curug garden')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/address_2'), 'No B3/40')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/city'), 'BSD')

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/span_Banten'))

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/postcode'), '20000')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/phone'), '082276471331')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/email'), 'yusuf.tamba@bfi.co.id')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/comments'), 'Mohon di Packing dengan baik')

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/TEST MODE'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/Checkout/checkout01/Page_Checkout/Place order'))

