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

//Ouvrir le navigateur -- precondition
WebUI.openBrowser('')

// etapes à reproduire 
//Accéder à la page du site web
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

//saisir le user 
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

//Saisir le mdp
WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

//Cliquer sur le bouton se connceter
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

//Cliquer sur le bouton Add ajouter 
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add'))

//Renseiger le champ first NAME
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_firstName'), 'SALIM ')

//renseigner le champ midle name
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_middleName'), 'TEST')

//reseigner le champ laste name
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_lastName'), 'TEST SALIM')

//cliquer sur le bouton Enregistrer 
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up _928ffb'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/oxd-input oxd-input--active'),'1')
