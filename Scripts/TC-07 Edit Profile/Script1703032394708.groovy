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

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Button - Mulai Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Email'), 'dhevadayatvitoindraj@mail.ugm.ac.id', 
    0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Password'), 'test', 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.TextView - Edit Profile'), 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Email (1)'), 'dheva@mail.com', 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Nama Lengkap'), 'depp', 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Titel Depan'), 'S', 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Titel Belakang'), 'M', 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - No. STR'), '00000123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Spinner - Jenis Kelamin'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.EditText - No. Telephone'), 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - No. Telephone'), '12345678', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Alamat'), 'Jakal', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Spinner - Spesialisasi'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Spinner - Laki-laki'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.EditText - Almamater'), 0)

Mobile.setText(findTestObject('Object Repository/TC-07/android.widget.EditText - Almamater (1)'), 'Harvard', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('1')

Mobile.scrollToText('2')

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.view.View - 29'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC-07/android.widget.Button - Simpan'), 0)


Mobile.closeApplication()

