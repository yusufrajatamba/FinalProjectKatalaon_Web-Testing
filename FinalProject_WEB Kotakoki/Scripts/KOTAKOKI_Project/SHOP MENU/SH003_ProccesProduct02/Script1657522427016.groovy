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

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/Shop2/Website/span_Shop'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/Shop2/Page_Products/a_On Sale'))

WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/Shop2/Page_Products/img'))

test = WebUI.verifyElementPresent(findTestObject('KOTAKOKI_Project/SHOP/Shop2/Page_Belt/bdi_Rp55'), 5)

if (test == true) {
    WebUI.click(findTestObject('Object Repository/KOTAKOKI_Project/SHOP/Shop2/Page_Belt/a_Description'))

    WebUI.setText(findTestObject('KOTAKOKI_Project/SHOP/Shop2/Page_Belt/quantity'), '3')

    WebUI.click(findTestObject('KOTAKOKI_Project/SHOP/Shop2/Page_Belt/button_Add to cart'))

    WebUI.click(findTestObject('KOTAKOKI_Project/SHOP/Shop2/Page_Belt/viewcart'))

    WebUI.click(findTestObject('KOTAKOKI_Project/SHOP/Shop3/Page_Cart/checkout'))
} else {
    WebUI.closeBrowser()
}

