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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html')

WebUI.selectOptionByIndex(findTestObject('Page_DropDown jQuery UI/Drop_Down select'), 1)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Page_DropDown jQuery UI/Drop_Down select'), 'Monday', false)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_DropDown jQuery UI/Drop_Down select'), 'Friday', false)

WebUI.delay(5)

WebUI.selectAllOption(findTestObject('Page_DropDown jQuery UI/Multi_Select'))

WebUI.delay(5)

WebUI.deselectAllOption(findTestObject('Page_DropDown jQuery UI/Multi_Select'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Page_DropDown jQuery UI/Multi_Select'), '1-2')

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Page_DropDown jQuery UI/Multi_Select'), 'Texas', false)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_DropDown jQuery UI/Multi_Select'), 'New Yok', false)

WebUI.delay(5)

WebUI.closeBrowser()

