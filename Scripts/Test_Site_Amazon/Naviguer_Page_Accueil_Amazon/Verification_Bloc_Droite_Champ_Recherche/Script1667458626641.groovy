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

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.amazon.fr/')

WebUI.click(findTestObject('Page_cookies/Page_Amazon.fr  livres, DVD, jeux vido/input_Politique de confidentialit_accept'))

//Verifier l'affichage des bloc à droite du bouton de recherche'
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_Droite_Recherche/div_Bonjour_Identifiez-vous_Compte_listes_Retours_et_commandes_0_Panier'), 0)

//Verifier l'affichage du bloc 1 "bonjour identifiez vous'
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'), 0)