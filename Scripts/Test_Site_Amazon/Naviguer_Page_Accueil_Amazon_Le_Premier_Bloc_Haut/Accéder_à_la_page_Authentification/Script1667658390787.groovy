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

//agrandir la page 
WebUI.maximizeWindow()

//Cliquer sur le bouton pour ne pas accépter les cookies
//WebUI.click(findTestObject('Page_Amazon.fr_cookies_sans_accepter/a_Continuer sans accepter'))
//https://www.amazon.fr/ = WebUI.getWindowTitle()
//VERIFIER le lien de site 
//Verifier le logo d'amazone
//Fermer la page
WebUI.closeBrowser()

