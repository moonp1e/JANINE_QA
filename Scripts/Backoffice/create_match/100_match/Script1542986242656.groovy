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

//CustomKeywords.'mj.loginBackoffice.login'()
for (loop = 1; loop <= 5; loop++) {
    WebUI.mouseOver(findTestObject('Backoffice/headers/span_betting'))

    WebUI.click(findTestObject('Backoffice/headers/span_match'))

    WebUI.delay(2)

    WebUI.verifyElementPresent(findTestObject('Backoffice/match_mgmt/input_submit_match'), 2)

    WebUI.click(findTestObject('Backoffice/match_mgmt/button_create_match'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Backoffice/match_mgmt/span_select_arena_name'))

    WebUI.setText(findTestObject('Backoffice/match_mgmt/input__select2-search__arena_name'), Acronym)
	
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

    WebUI.delay(1)
}

List<WebElement> buttonText = []

for (int i = 1; i < 5; i++) {
	WebElement button = driver.findElement(By.xpath('//*[@id="resultContainer"]/div[2]/button['+i+']'))
	buttonText = button.getText()
}

/* Find and click on a random product
List<WebElement> allProducts = driver.findElements(By.xpath("//*[@id='endecaResultsWrapper']/div[3]"));
Random rand = new Random();
int randomProduct = rand.nextInt(allProducts.size());
allProducts.get(randomProduct).click();
*/
println(buttonText)

Random rand = new Random()
int randomButton = rand.nextInt(buttonText.size())
buttonText.get(randomButton).click()