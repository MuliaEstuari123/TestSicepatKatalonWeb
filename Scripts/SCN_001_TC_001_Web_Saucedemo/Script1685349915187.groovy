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

//deklare variable
String Username = 'standard_user'

String Password = 'secret_sauce'

String Browser = 'https://www.saucedemo.com/'

String FirstName = 'alea'

String LastName = 'alifa'

String PostalCode = '11798'

WebUI.openBrowser(Browser)

WebUI.maximizeWindow()



if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/input_Username'),5)) {
	
	
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Username'),Username)
	
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Password'), Password)
	WebUI.delay(1)
	WebUI.takeScreenshot()
	
	WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Login'))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	
} else {
	
	WS.comment("Object not found")
}




if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/text_harga_barang_backpack'),5)) {
	
	
    WebUI.click(findTestObject('Object Repository/Page_Swag Labs/text_Sauce_Labs_Backpack'))
	
	WebUI.takeScreenshot()
	
	
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/text_harga_barang_validate'),5)) {
		
		
	  WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Add_to_cart'))
	  WebUI.delay(1)
	  WebUI.takeScreenshot()
	  
	  WebUI.click(findTestObject('Object Repository/Page_Swag Labs/icon_Add_to_chart'))
	  WebUI.delay(1)
	  WebUI.takeScreenshot()
	  
	  
	 WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Checkout'))
	 WebUI.takeScreenshot()
	 
	 
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_FirstName'),FirstName)
	 
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_LastName'),LastName)
	 
	WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_PostalCode'),PostalCode)
	WebUI.delay(1)
	 WebUI.takeScreenshot()
	 
	WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Continue'))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	
	
	WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Finish'))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	 
	} else {
		
		WS.comment("Object not found")
	}
	
	
} else {
	
	WS.comment("Object not found")
}


WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_SideBar_Menu'))


WebUI.click(findTestObject('Object Repository/Page_Swag Labs/btn_Logout'))


WebUI.closeBrowser()


	
	














