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

//Ouvrire le navigateur 
WebUI.openBrowser('')

//Se rendre sur le site d'amazone
WebUI.navigateToUrl('https://www.amazon.fr/')

//Cliquer sur le bouton continuer sans accépter les cookies
WebUI.click(findTestObject('Object Repository/Page_Amazon.fr  livres, DVD, jeux vido, mus_928905/a_Continuer sans accepter'))

//Vérifier que l'élément bonjour est visible   à droite du logo
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Amazon.fr  livres, DVD, jeux vido, mus_928905/a_Bonjour                                  _230811'))

//Vérifier la pprésence du texte "Bonjour" à droite du logo
WebUI.verifyElementText(findTestObject('Object Repository/Page_Amazon.fr  livres, DVD, jeux vido, mus_928905/span_Bonjour'), 
    'Bonjour')

//Vérifier la pprésence du texte "Entrez votre adresse" à droite du logo
WebUI.verifyElementText(findTestObject('Object Repository/Page_Amazon.fr  livres, DVD, jeux vido, mus_928905/span_Entrez votre adresse'), 
    'Entrez votre adresse')

//Renvoyer le nombre d'élément dans la liste déroulante
WebUI.getNumberOfTotalOption(findTestObject('Page_Amazon.fr_champ_recherche_bouton_liste/select_Toutes_nos_catgories_liste_deroulante'))

//Cliquer sur la liste déroulante
WebUI.click(findTestObject('Page_Amazon.fr_champ_recherche_bouton_liste/select_Toutes_nos_catgories_liste_deroulante'))

//Choisir la valeur "Animalerie" dans la liste déroulante
WebUI.selectOptionByValue(findTestObject('Page_Amazon.fr_champ_recherche_bouton_liste/select_Toutes_nos_catgories_liste_deroulante'), 
    'search-alias=pets', false)

//Renseigner le champ de recherche, vérifier si le champ de recherche est actif ou grisé
WebUI.setText(findTestObject('Page_Amazon.fr_champ_recherche_bouton_liste/input_Toutes_nos_catgories_champ_de_recherche'), 'chat')

//cliquer sur le bouton rechercher "la loupe"
WebUI.click(findTestObject('Page_Amazon.fr_champ_recherche_bouton_liste/input_Toutes nos catgories_button_recherche'))

//Fermer la page
WebUI.closeBrowser()