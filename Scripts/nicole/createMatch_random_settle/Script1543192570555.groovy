import org.openqa.selenium.Keys as Keys
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

CustomKeywords.'mjpack.loginBackoffice.getLogin'()
WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_match'), 3)

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_betting'))

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_match'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createMatch_or/button_createMatch'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_createMatch'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createMatch_or/text_addMatch'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/dropdown_selectArena'))

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_selectArena'), ArenaName_Acronym)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ucf88_or/backoffice/createMatch_or/input_selectArena'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_meron'), MeronName)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_wala'), WalaName)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_farm_meron'), MeronFarm)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_farm_wala'), WalaFarm)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_breed_meron'), MeronBreed)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_breed_wala'), WalaBreed)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_weight_meron'), MeronWeight)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_weight_wala'), WalaWeight)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_submitMatch'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/link_Clickmatch'))

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_openMatch'))

WebUI.waitForElementVisible(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'), 1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'))

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)


/*-------------------------------------------------------------------------------------------------*/

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> buttonText

for (int i = 1; i < 5; i++) {
	WebElement button = driver.findElement(By.xpath('//*[@id="resultContainer"]/div[2]/button['+i+']'))
	List<WebElement> buttonText = button.getText()
}

System.out.println(buttonText)

Random rand = new Random()
int randomButton = rand.nextInt(buttonText.size())
buttonText.get(randomButton).click()


/* Find and click on a random product
List<WebElement> allProducts = driver.findElements(By.xpath("//*[@id='endecaResultsWrapper']/div[3]"));
Random rand = new Random();
int randomProduct = rand.nextInt(allProducts.size());
allProducts.get(randomProduct).click();
*/

