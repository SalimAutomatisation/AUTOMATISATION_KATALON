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
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_Droite_Recherche/div_Bonjour_Identifiez-vous_Compte_listes_Retours_et_commandes_0_Panier'), 
    0)

//Verifier l'affichage du bloc 1 "bonjour identifiez vous'
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'), 
    0)

//Vérifier l'affichage du texte 1 "Bonjou_Identifiez-vous _Compte et listes" dans le bloc 1'
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_1_Droite_Recherche_Texte1/a_Bonjou_Identifiez-vous _Compte et listes'), 
    0)

//Vérifier l'affichage du bloc 2 à droite du bouton de recherche " Retour et commande"
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc2_Droite_Recherche/a_Retours_commandes'), 0)

//Vérifier l'affichage des texteS dans le bloc 2
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_2_Droite_Recherche_Texte2/span_Bonjour_Identifiez-vous'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_2_Droite_Recherche_Texte2/span_commandes'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc3_Droite_Recherche/a_0_Panier'), 0)

//Vérifier les texts affichés dans le bloc 3
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_3_Droite_Recherche_Texte1/span_et commandes_nav-cart-icon nav-sprite'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_3_Droite_Recherche_Texte2/span_Panier'), 0)

//Fermer la page
WebUI.closeBrowser()

