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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//ouvrire le page amazone
WebUI.openBrowser('https://www.amazon.fr/')

//agrandir la page
WebUI.maximizeWindow()

//Cliquer sur le bouton pour accépter les cookies
WebUI.click(findTestObject('Page_cookies/Page_Amazon.fr  livres, DVD, jeux vido/input_Politique de confidentialit_accept'))

WebUI.setText(findTestObject('Page_Amazon.fr  livres, DVD, jeux vido, musique, high-tech, informatique, jouets,/input_Toutes nos catgories_field-keywords'), 
    'chaussures hommes')

WebUI.click(findTestObject('Page_Amazon.fr  livres, DVD, jeux vido, musique, high-tech, informatique, jouets,/input_Toutes nos catgories_nav-search-submit-button'))

