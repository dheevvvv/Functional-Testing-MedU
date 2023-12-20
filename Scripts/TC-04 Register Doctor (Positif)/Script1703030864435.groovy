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

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.Button - Mulai Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.TextView - Buat Akun'), 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Email'), 'dhevadayatvitoindraj@mail.ugm.ac.id', 
    0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Nama Lengkap'), 'Dheva Dayat Vito Indrajaka', 
    0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Titel Depan'), 'Prof', 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Titel Belakang'), 'Phd', 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - No. STR'), '447133', 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.EditText - No. Telephone'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.Spinner - Jenis Kelamin'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.EditText - No. Telephone'), 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - No. Telephone'), '08123456789', 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Alamat'), 'kaliurang', 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Tempat Praktek'), 'RSA UGM', 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.TextView - Lanjut'), 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Almamater'), 'Universitas Gadjah Mada', 
    0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.TextView - 2023'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.TextView - 2024'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.view.View - 22'), 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Object Repository/TC-04/android.widget.EditText - Confirm Password'), 'test123', 0)

Mobile.tap(findTestObject('Object Repository/TC-04/android.widget.Button - Daftar'), 0)

Mobile.closeApplication()

