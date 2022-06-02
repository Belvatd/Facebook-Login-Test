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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Facebook  log in or sign up/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_email'), 
    'beandblues')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    'LB9taMP+1zjbSV87n1zMIQ==')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/div_Invalid username or password_u_0_c_T7'))

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/div_Invalid username or password_u_0_c_T7'))

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/button_Log In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    'X4aFWEfDkZaegbQttTuVDB9F062HXyO4')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_email'), 
    'beandblues01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    'c+UYhN6IsjbQNt+YXzrLiw==')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_email'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    'X4aFWEfDkZaegbQttTuVDB9F062HXyO4')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_email'), 
    'beandblues01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/input_Invalid username or password_pass'), 
    'X4aFWEfDkZZmxKdV7ZIAg8UoqJkDmG1L')

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/div_Invalid username or password__55r1 _1kbt'))

WebUI.click(findTestObject('Object Repository/Facebook login invalid/Page_Log in to Facebook/button_Log In'))

WebUI.closeBrowser()

