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

Mobile.startApplication('C:\\Users\\Dheva\\Documents\\MedUnnes-V1.1-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.Button - Mulai Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.TextView - Buat Akun'), 0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - NIK'), '3209109090909', 0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Email'), 'dhevadayatvito.ddv@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Nama Lengkap'), 'Dheva Dayat vito', 0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Alamat'), 'Frankurt,jerman', 0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - No. Telephone'), '082130804198', 0)

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.Spinner - Jenis Kelamin'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Berat Badan'), '50', 0)

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Tinggi Badan'), '167', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/TC-13/android.widget.EditText - Password'), 'test123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/TC-13/android.widget.Button - Daftar'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/TC-13/android.widget.TextView - Masuk sebagai Pasien'), 0)

Mobile.closeApplication()

