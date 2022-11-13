import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

//Verifier le lien de la page
//reuprer le lien et donner un nom à la variable
link = WebUI.getUrl()
//comparer le lien recuprer (nom de la variabke) avec le lieln actule qu'on saisie manuellement
WebUI.verifyMatch(link, 'https://www.amazon.fr/', true)

//Cliquer sur le bouton Sans accepter cokiees 
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.maximizeWindow()
//verifier les lbloc sous menus 
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu/div_window.navmet.t_ALL_Element'), 0)

//verifier les détail de sous menu Amazon Basics/Audible;dernire nouveauté, Ebooks

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Amazon Basics'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Amazon Basics'), 'Amazon Basics')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Audible'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Audible'), 'Audible')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Dernires Nouveauts'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Dernires Nouveauts'), 'Dernières Nouveautés')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Ebooks Kindle'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Ebooks Kindle'), 'Ebooks Kindle')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_High-Tech'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_High-Tech'), 'High-Tech')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Listes de Souhaits_nav-imageHref'), 0)
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Livres'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Livres'), 'Livres')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Meilleures ventes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Meilleures ventes'), 'Meilleures ventes')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Musique'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Musique'), 'Musique')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Service Client'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Service Client'), 'Service Client')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Toutes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Toutes'), 'Toutes')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Ventes Flash'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/a_Ventes Flash'), 'Ventes Flash')
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/span_Prime'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Sous_Menu_Element_Detail/span_Prime'), 'Prime')


