import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'mj.loginBackofficeStaging.login'()

WebUI.mouseOver(findTestObject('Backoffice/headers/span_betting'))

WebUI.click(findTestObject('Backoffice/headers/span_arena'))

WebUI.click(findTestObject('Backoffice/arena_mgmt/button_create_arena'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Backoffice/arena_mgmt/input_arena_name'), Arena_Name)

WebUI.setText(findTestObject('Backoffice/arena_mgmt/input_event_name'), Event_Name)

WebUI.setText(findTestObject('Backoffice/arena_mgmt/input_acronym'), Acronym)

WebUI.setText(findTestObject('Backoffice/arena_mgmt/input_profit_margin'), Profit_Margin)

WebUI.click(findTestObject('Backoffice/arena_mgmt/input_submit'))

