import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.youtube.com/')

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Music'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Home'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Sports'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Home'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Movies'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Page_YouTube(Firefox)/yt-formatted-string_Gaming'))

WebUI.delay(0.5)

WebUI.closeBrowser()

