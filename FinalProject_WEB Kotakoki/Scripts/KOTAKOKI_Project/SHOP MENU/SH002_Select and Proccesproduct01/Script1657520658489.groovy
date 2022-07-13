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

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Welcome/Shop'))

WebUI.verifyElementPresent(findTestObject('Page_Products  Kotakoki/NewAlbum'), 5)

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Page_Products  Kotakoki/img'))

WebUI.verifyElementText(findTestObject('Page_Album  Kotakoki/bdi_Rp15.000'), 'Rp15.000')

WebUI.setText(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Page_Album/quantity'), '2')

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Page_Album  Kotakoki/a_Description'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Page_Album  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/SHOP1/Page_Album  Kotakoki/viewcart'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/Shop3/Page_Cart/checkout'))

