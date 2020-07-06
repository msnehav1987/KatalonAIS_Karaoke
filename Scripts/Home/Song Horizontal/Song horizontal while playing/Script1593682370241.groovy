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

Mobile.startApplication('C:\\Users\\WISDOMVAST\\Katalon Studio\\AIS_Karaoke\\androidapp\\karaoke_v2_stg_4.3.7_(60).apk', 
    false)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Karaoke/Home/Song Horizontal/Khuen Tee Daw Layout'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Home/Song Horizontal/Khuen Tee Daw Text'), 'คืนที่ดาวเต็มฟ้า')

Mobile.pressBack()

Mobile.tap(findTestObject('Karaoke/Home/Song Horizontal/Khuen Tee Daw Layout'), 0)

Mobile.verifyElementText(findTestObject('Karaoke/Home/Song Horizontal/Play modal text'), 'เล่น')

Mobile.closeApplication()

