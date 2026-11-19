import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.digitaldine-in.online/menu/b489cf07-e19d-4d28-ab33-3cbf5871f5e1?table=2')

WebUI.setText(findTestObject('Page_Digital Dine-In  Smart QR Restaurant Ordering/input_Enter your name'), 'NAVEEN')

WebUI.setText(findTestObject('Page_Digital Dine-In  Smart QR Restaurant Ordering/input_10 digit mobile number'), '8977777777')

WebUI.click(findTestObject('Page_Digital Dine-In  Smart QR Restaurant Ordering/button_Browse Menu'))

WebUI.verifyElementPresent(findTestObject('Page_Digital Dine-In  Smart QR Restaurant Ordering/h3_Veg Biryani'), 10)

WebUI.closeBrowser()

