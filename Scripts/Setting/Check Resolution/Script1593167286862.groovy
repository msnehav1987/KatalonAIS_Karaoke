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

Mobile.startApplication('C:\\Users\\WISDOMVAST\\Downloads\\karaoke_v2_stg_4.3.7_(60).apk', false)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Karaoke/Setting/Profile Button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Language/Setting Button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/1080p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 1080p'), '1080p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/720p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 720p'), '720p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/480p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 480p'), '480p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/360p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 360p'), '360p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/240p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 240p'), '240p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/144p button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text 144p'), '144p')

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/Resolution Next'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/auto button'), 0)

Mobile.tap(findTestObject('Karaoke/Setting/Resolution/confirm resolution'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Setting/Resolution/Text auto'), 'auto')

Mobile.closeApplication()

