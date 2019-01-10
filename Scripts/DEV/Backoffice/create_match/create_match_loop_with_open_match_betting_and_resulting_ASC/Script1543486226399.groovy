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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.util.Random as Random


    CustomKeywords.'mj.loginBackofficeStaging.login'()
	
for (loop = 1; loop <= 160; loop++) {
    //Create open match
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

    WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_farm'), Meron_Farm)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_breed'), Meron_Breed)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/meron_details/input_meron_weight'), Meron_Weight)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_name'), Wala_Name)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_farm'), Wala_Farm)

    WebUI.setText(findTestObject('Backoffice/match_mgmt/wala_details/input_wala_breed'), Wala_Breed)

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

    //Betting random 4x	
    for (loop = 1; loop <= 4; loop++) {
        CustomKeywords.'mj.loginFrontend.login'()

        WebUI.delay(1)

        WebUI.verifyElementVisible(findTestObject('Frontend/Betting/span_Logout'))

        tempBalance = WebUI.getText(findTestObject('Frontend/Betting/span_balance'))

        balance = tempBalance.replace(',', '')

        float balance = Float.valueOf(balance)

        arenaPresent = WebUI.verifyElementPresent(findTestObject('Frontend/Betting/button_arena_ASC'), 1)

        matchPresent = WebUI.verifyElementPresent(findTestObject('Frontend/Betting/strong_match_details_ASC'), 1, FailureHandling.OPTIONAL)

        WebDriver driver = DriverFactory.getWebDriver()

        if (((balance > 100) && arenaPresent) && matchPresent) {
            List<WebElement> marketOdds

            for (i = 1; i < 5; i++) {
                WebElement button = driver.findElement(By.xpath(('//*[@id="betslip-b72aa2a2-ca07-493a-b359-78971ebeb395-container"]/div[1]/div[' + 
                        i) + ']'))

                List<WebElement> marketOdds = button.getAttribute('color')
            }
            
            System.out.println(marketOdds)

            Random rand = new Random()

            int randomOdds = rand.nextInt(marketOdds.size())

            marketOdds.get(randomOdds).click()

            WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'))

            WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/button_Clear'))

            WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'))

            int randBet = rand.nextInt(100) * 1000

            WebUI.setText(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'), randBet)

            WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/button_Bet'))
        } else {
            WebUI.click(findTestObject('Frontend/Betting/button_arena_ASC'))

            List<WebElement> marketOdds

            for (i = 1; i < 5; i++) {
                WebElement button = driver.findElement(By.xpath(('//*[@id="betslip-b72aa2a2-ca07-493a-b359-78971ebeb395-container"]/div[1]/div[' + 
                        i) + ']'))

                List<WebElement> marketOdds = button.getAttribute('color')

                System.out.println(marketOdds)

                Random rand = new Random()

                int randomOdds = rand.nextInt(marketOdds.size())

                marketOdds.get(randomOdds).click()

                WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'))

                WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/button_Clear'))

                WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'))

                int randBet = rand.nextInt(100) * 1000

                WebUI.setText(findTestObject('Frontend/Betting/Bet Amount Field/input_bet_amount_field'), randBet)

                WebUI.click(findTestObject('Frontend/Betting/Bet Amount Field/button_Bet'))
            }
        }
    }
    
	CustomKeywords.'mj.loginBackofficeStaging.login'()
	
    WebUI.mouseOver(findTestObject('Backoffice/headers/span_betting'))

    WebUI.click(findTestObject('Backoffice/headers/span_match'))

    WebUI.verifyElementVisible(findTestObject('Backoffice/match_mgmt/button_create_match'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/span_select_match_dropdown'))

    WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/input__select2_dropdown'))

    WebUI.setText(findTestObject('Backoffice/match_mgmt/match_table/input__select2_dropdown'), Arena_Acronym)

    WebUI.selectOptionByLabel(findTestObject('Backoffice/match_mgmt/match_table/select_match_status_dropdown'), 'open', 
        false)
	
    WebUI.click(findTestObject('Backoffice/match_mgmt/match_table/td_open_match'))
	
	WebUI.switchToWindowIndex(1)

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
	
	WebUI.delay(2)
	
	WebUI.closeWindowIndex(1)
	
	WebUI.switchToWindowIndex(0)

	WebUI.delay(1)
}

