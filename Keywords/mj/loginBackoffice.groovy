package mj

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class loginBackoffice {

	@Keyword
	public void login(){

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('http://dev-admin.ucf88.com/login')

		WebUI.setText(findTestObject('Backoffice/login_page/input_username'), 'janine')

		WebUI.setEncryptedText(findTestObject('Backoffice/login_page/input_password'), 'CSt51UwWECc=')

		WebUI.click(findTestObject('Backoffice/login_page/button_login'))
	}
}
