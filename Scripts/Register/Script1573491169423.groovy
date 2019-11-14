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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.apkFolderPath, true)

Mobile.verifyElementText(findTestObject('Object Repository/Greeting/lblSelamatDatang'), 'Selamat Datang!')

Mobile.swipe(800, 1000, 200, 1000)

Mobile.swipe(800, 1000, 200, 1000)

Mobile.swipe(800, 1000, 200, 1000)

Mobile.tap(findTestObject('Object Repository/Greeting/btnDaftar'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Register/lblBuatAkun'), 'Buat Akun')

Mobile.tap(findTestObject('Register/tbxTanggalLahir'), 0)

Mobile.tap(findTestObject('Object Repository/Register/Birthday/btnOK'), 0)

Mobile.setText(findTestObject('Object Repository/Register/tbxNoHP'), '81808098969', 0)

Mobile.setText(findTestObject('Object Repository/Register/tbxPIN'), '1234', 0)

Mobile.setText(findTestObject('Object Repository/Register/tbxKonfirmasiPIN'), '1234', 0)

Mobile.tap(findTestObject('Object Repository/Register/btnLanjutkan'), 0)

Mobile.delay(GlobalVariable.l_delay)

Mobile.verifyElementText(findTestObject('Object Repository/Agreement/lblPTHome'), 'PT Home Credit Indonesia     ̶   Ketentuan Penggunaan Aplikasi Seluler')

//while (Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Agreement/btnAgree'), 'enabled', 'false', 5)) {
while (Mobile.getAttribute(findTestObject('Object Repository/Agreement/btnAgree'), 'enabled', GlobalVariable.l_delay) == 'false') {
    Mobile.swipe(500, 1500, 500, 500)
}

Mobile.tap(findTestObject('Object Repository/Agreement/btnAgree'), 0)