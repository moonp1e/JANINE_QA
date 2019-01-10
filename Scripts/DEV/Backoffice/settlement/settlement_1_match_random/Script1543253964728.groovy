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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.mouseOver(findTestObject('Backoffice/headers/span_betting'))

WebUI.click(findTestObject('Backoffice/headers/span_match'))

WebUI.verifyElementVisible(findTestObject('Backoffice/match_mgmt/button_create_match'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/span_select_match_dropdown'))

WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/input__select2_dropdown'))

WebUI.setText(findTestObject('Backoffice/match_mgmt/match_table/input__select2_dropdown'), Arena_Acronym)

WebUI.selectOptionByLabel(findTestObject('Backoffice/match_mgmt/match_table/select_match_status_dropdown'), 'open', false)

WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/td_open_match'))

WebUI.click(findTestObject('Backoffice/match_mgmt/settlement/button_finished'))

WebUI.click(findTestObject('Backoffice/match_mgmt/settlement/button_finished_yes_i_agree'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> buttonText

for (int i = 1; i < 5; i++) {
    WebElement button = driver.findElement(By.xpath(('//*[@id="resultContainer"]/div[2]/button[' + i) + ']'))

    List<WebElement> buttonText = button.getText()
}

System.out.println(buttonText)

Random rand = new Random()

int randomButton = rand.nextInt(buttonText.size())

buttonText.get(randomButton).click()

WebUI.click(findTestObject('Backoffice/match_mgmt/settlement/button_approve'))

WebUI.click(findTestObject('Backoffice/match_mgmt/settlement/button_finished_yes_i_agree'))

