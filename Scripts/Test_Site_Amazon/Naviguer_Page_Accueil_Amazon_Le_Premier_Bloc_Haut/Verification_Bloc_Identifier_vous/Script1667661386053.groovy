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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Précondition Ouvrir le navigateur 
WebUI.openBrowser('https://www.amazon.fr/')
link=WebUI.getUrl()
WebUI.verifyMatch(link, 'https://www.amazon.fr/', true)
//Etapes à reproduire 
//1 - Cliquer sur le bouton ne pas accépter les cookies
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))

//2- Passerla souris sur le bouton comptes et listes 
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))

//3- Vérifier l'affichage du bloc compte et listes 
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_All_Elementrs/div_Identifiez-vous_All_Elements'), 0)

//4- Vérifier l'affichage du bloc identifiez vous 
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous/div_Identifiez-vousNouveau_client_Commencer ici'), 
    0)

//4-1 -Vérifier le détail du bloc "Identifiez vous" , le bouton Identifiez vous, vérifier son existance et si c'est un bouton cliquable
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/span_Identifiez-vous'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/span_Identifiez-vous'))

//4-1-1 cliquer sur bouton "Identifiez vous"
WebUI.click(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/span_Identifiez-vous'))

//4-1-2 Retour en arriere, la page précédente
WebUI.back()

//4-1-3 Cliquer sur le bouton ne pas accépter les cookies
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))

WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))

//4-2 Vérifier la présence tu texte "Nouveau client ? Commencer ici.", et vérifier que seulement le texte"commencer ici qui forme un lien 
//4-2-1 Verifier la prsenece de tous le texte Nouveau client ? Commencer ici."
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/div_Nouveau_client _Commencer ici'), 
    0)

//4-2-2 vérifier que seulement le texte"commencer ici qui forme un lien cliquable
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/a_Commencer_ici'))

WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Bloc_Identifiez-Vous_Detail/div_Nouveau_client _Commencer ici'), 
    'Nouveau client ? Commencer ici.')
 
//5- Vérifier l'affichage de la partie "Votre comptes"
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))

WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Partie_Votre_Compte/div_Votre_compteVotre'), 0)

//Vérifier le texte votre compte, 
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_votres_compte_Detail_Texte/div_Votre compte'), 'Votre compte')

//6 - Vérifier les éléments qui sont dans la liste votre compte 
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Votre_Compte/span_Votre compte'), 0)

//6-1 Vérifier que c'est un élément cliquable --lien votre compte
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Votre_Compte/span_Votre compte'))
WebUI.click(findTestObject('Page_Amazon.fr_Votre_Compte/span_Votre compte'))
WebUI.back()

//6- 2 Vérifier les éléments qui sont dans la liste votre compte-- Vos commandes
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos commandes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos commandes'), 'Vos commandes')
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos commandes'))
WebUI.click(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos commandes'))
WebUI.back()

//6-3 Vérifier les éléments qui sont dans la liste votre compte-- Vos recommandation
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos recommandations'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos recommandations'), 'Vos recommandations')
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos recommandations'))
WebUI.click(findTestObject('Page_Amazon.fr_Votre_Compte/span_Vos recommandations'))
WebUI.back()

//6-4 Vérifier les éléments qui sont dans la liste votre compte-- Vos livraison Programme
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Votre_Compte/a_Vos Livraisons Programmes'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Votre_Compte/a_Vos Livraisons Programmes'), 'Vos Livraisons Programmées')
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Votre_Compte/a_Vos Livraisons Programmes'))
WebUI.click(findTestObject('Page_Amazon.fr_Votre_Compte/a_Vos Livraisons Programmes'))
WebUI.back()

//7 Vérifier les éléments qui sont dans la liste DE VOS ENVIES--
//7-1 verifier le texte liste de vos envie 
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/div_Vos listes denvies'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/div_Vos listes denvies'), "Vos listes d'envies")

//verfifier le lien decouvrez votre style
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Dcouvrez votre style'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Dcouvrez votre style'), 'Découvrez votre style')
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Dcouvrez votre style'))
WebUI.click(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Dcouvrez votre style'))
WebUI.back()

//Verifier le lien liste de mariage
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste de mariage'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste de mariage'), 'Liste de mariage')
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste de mariage'))
WebUI.click(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste de mariage'))
WebUI.back()

//verifier le lien liste d'envies universelle
WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
WebUI.mouseOver(findTestObject('Page_Amazon.fr_Bloc1_Droite_Recherche/a_Bonjour, Identifiez-vous  Compte et listes'))
WebUI.verifyElementPresent(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste denvies universelle'), 0)
WebUI.verifyElementText(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste denvies universelle'), "Liste d'envies universelle")
WebUI.verifyElementClickable(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste denvies universelle'))
WebUI.click(findTestObject('Page_Amazon.fr_Liste_De_Vos_Envies/a_Liste denvies universelle'))
WebUI.back()


