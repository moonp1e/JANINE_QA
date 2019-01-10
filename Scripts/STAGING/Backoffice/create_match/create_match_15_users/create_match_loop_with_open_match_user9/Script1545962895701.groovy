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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://staging-admin.ucf88.com/login')

WebUI.setText(findTestObject('Backoffice/login_page/input_username'), 'admin9')

WebUI.setEncryptedText(findTestObject('Backoffice/login_page/input_password'), 'CSt51UwWECc=')

WebUI.click(findTestObject('Backoffice/login_page/button_login'))

WebUI.mouseOver(findTestObject('Backoffice/headers/span_betting'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Backoffice/headers/span_match'), 2)

WebUI.click(findTestObject('Backoffice/headers/span_match'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Backoffice/match_mgmt/button_create_match'), 2)

WebUI.click(findTestObject('Backoffice/match_mgmt/button_create_match'))

WebUI.delay(1)

WebUI.click(findTestObject('Backoffice/match_mgmt/span_select_arena_name'))

WebUI.setText(findTestObject('Backoffice/match_mgmt/input__select2-search__arena_name'), Arena_Acronym)

WebUI.sendKeys(findTestObject('Backoffice/match_mgmt/input__select2-search__arena_name'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_name'), Meron_Name)

WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_weight'), Meron_Weight)

WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_name'), Wala_Name)

WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_weight'), Wala_Weight)

WebUI.click(findTestObject('Backoffice/match_mgmt/input_submit_match'))

WebUI.click(findTestObject('Backoffice/match_mgmt/span_link_match'))

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.click(findTestObject('Backoffice/match_mgmt/open_match/button_open_match'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Backoffice/match_mgmt/settlement/button_finished_yes_i_agree'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('Backoffice/match_mgmt/settlement/button_finished_yes_i_agree'))

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('Backoffice/match_mgmt/button_create_match'), 2)

WebUI.delay(1)

for (loop = 1; loop <= 19; loop++) {
    WebUI.click(findTestObject('Backoffice/match_mgmt/button_create_match'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Backoffice/match_mgmt/span_select_arena_name'))

    WebUI.setText(findTestObject('Backoffice/match_mgmt/input__select2-search__arena_name'), Arena_Acronym)

    WebUI.sendKeys(findTestObject('Backoffice/match_mgmt/input__select2-search__arena_name'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_name'), Meron_Name)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_weight'), Meron_Weight)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_name'), Wala_Name)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_weight'), Wala_Weight)

    WebUI.click(findTestObject('Backoffice/match_mgmt/input_submit_match'))

    WebUI.delay(1)
}

