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

//Ouvrir la navigateur et verifier le navigateur 
WebUI.openBrowser('https://www.amazon.fr/')
Link=WebUI.getUrl()
WebUI.verifyMatch(Link, 'https://www.amazon.fr/', false)
WebUI.maximizeWindow()
//Cliquer sur le bouton Accépter des cokiees 
WebUI.click(findTestObject('Page_cookies/Page_Amazon.fr  livres, DVD, jeux vido/input_Politique de confidentialit_accept'))

//cliquer sur le bouton Toute pour affihcer la liste déroulante 
WebUI.click(findTestObject('Page_Amazon.fr_Sous_Menu_Liste_Toutes/a_Toutes'))

//Verifier l'affichage des éléments affichés dans la liste Toute
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Tendence/div_tendances_Texte'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Tendence/div_tendances_Texte'), 'Tendances')

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Tendence/a_Baromtre des ventes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Tendence/a_Baromtre des ventes'), 'Baromètre des ventes')

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Tendence/a_Dernires Nouveauts'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Tendence/a_Dernires Nouveauts'), 'Dernières Nouveautés')

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Tendence/a_Meilleures ventes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Tendence/a_Meilleures ventes'), 'Meilleures ventes')


